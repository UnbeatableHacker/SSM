#1. 介绍
1. 操作持久层
2. 半自动化
3. ORM框架

#2. 环境搭建
第一步：导入mybatis的jar包（mybatis.jar、mysql-connector-java.jar）
第二步：书写mybatis主配置文件（mybatis.xml，配置driver、url、username等）
第三步：书写局部配置文件（xxx.xml，书写sql语句），将局部配置文件与主配置文件关联
第四步：启动框架，测试

	主配置文件：  
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE configuration
	PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
	"http://mybatis.org/dtd/mybatis-3-config.dtd">
	<configuration>
		<!-- default:用来告诉mybatis框架在操作数据库时使用哪种数据库配置 -->
		<environments default="mysql">
			<!-- 配置mysql环境 -->	
			<environment id="mysql" >
				<!-- 配置事务 -->
				<transactionManager type="JDBC">
				</transactionManager>
				<!-- 数据源：driver、url、username、password -->
				<dataSource type="POOLED">
					<property name="driver" value="com.mysql.jdbc.Driver"></property>
					<property name="url" value="jdbc:mysql:///"></property>
					<property name="url" value="root"></property>
					<property name="password" value="root"></property>
				</dataSource>
			</environment>
		</environments>
	</configuration>

	局部配置文件：
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE mapper
	PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
	"http://mybatis.org/dtd/mybatis-3-mapper.dtd">
	<mapper namespace="对应类的全路径">
		<!-- resultType只能指定某一条记录的保存类型 -->
		<select id="全路径中对应的一个方法名" resultType="">
			sql语句
		</select>
		<update id=""></update>
		<delete id=""></delete>
		<insert id=""></insert>
	</mapper>

	测试-使用mybatis：
	//先得到SqlSessionFactoryBuilder，再得到SQLSessionFactory，再得到SqlSession：
	//1.得到SqlSessionFactoryBuilder
	SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder()
	//2.将mybatis.xml编程inputStream流
	InputStream ins = Resources.getResourceAsStream("mybatis.xml");
	//3.得到SqlSessionFactory
	SqlSessionFactory factory = ssfb.build(ins);
	//4.得到SqlSession
	SqlSession session = factory.openSession();
	//5.调用局部配置文件中的sql语句
	session.selectList("局部配置中的namespace名.id名") 

#3. 数据操作
1. 将代码中重复出现的内容(得到SqlSession)封装
	
		SqlSession session = null;
		@Before		//Before只能用在Junit中，即@Test，不需要抽成工具类
		public void init() throws IOException{
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder（）
			InputStream ins = Resources.getResourceAsStream("mybatis.xml")
			SqlSessionFactory factory = ssfb.build(ins);
			session = factory.openSession();
		}

2. 为实体类取别名
再主配置文件中操作标签，与environments同级，并再configuration的第一行

		<typeAliases>
			<typeAias type="某一个类的全路径" alias="别名">
		</typeAlias>

##查询
查询时，局部配置文件的返回值是一条记录的类型，可以是map，也可以是JavaBean(resourceType的值为类的全路径或别名)

1. 一个参数查询

		public void selectById(){
			session.selectOne("方法全路径"，参数【若参数是数字则加类型，如23L表示long类型的23】);
		}
		----------------------------------------
		<select id="" resultType="" parameterType="参数类型">
			select * from caipin where id=#{0}
		<select>

2. 多个参数查询

		<:"&lt;"
		>:"&gt;"

		public void select(){
			session.selectOne("方法全路径"，参数【若参数是数字则加类型，如23L表示long类型的23】);
		}
		----------------------------------------
		<select id="" resultType="" parameterType="map">
			select * from caipin where id=#{key}
		<select>

##增删改
1. 局部配置文件中没有resultType参数
2. impl中执行sql后要**提交事务**，session.commit



##Mybatis中$和#取值的区别(面试题)
1. #可以防止sql注入
2. #获取参数，默认当作字符串处理

##sql标签和include标签
1. sql标签：将公共字段抽取出来

		<sql id="">
			字段名
		</sql>

2. include标签：将sql标签的内容引入

		<include refid="" />

最终效果：
		
	<sql id="ziduanming">
		字段名
	</sql>
	<select id="">
		select <include refid="ziduanming">
		from caipin
	</select

##ORM术语详解（面试题）
ORM：对象关系映射，将表中的数据记录映射到实体类对象中。

##动态查询sql*
1. 使用if标签，注意：在if标签内去参数不用#
		
		<select id="dymanicSelect" resultType="Map" parameterType="Map">
			select * from computers where 1=1
			<if test="brand!=null"> and brand=#{brand}</if>
			<if test="memory!=null"> and memory=#{memory}</if>
			<if test="system!=null"> and system=#{system}</if>
			<if test="price!=null"> and price &lt; #{price}</if>
			<if test="cpu!=null"> and cpu=#{cpu}</if>
		</select>

2. 使用<where><if>标签，<where>标签可以去掉多余的and

		<select id="dymanicSelect" resultType="Map" parameterType="Map">
			select * from computers
			<where>
				<if test="brand!=null"> and brand=#{brand}</if>
				<if test="memory!=null"> and memory=#{memory}</if>
				<if test="system!=null"> and system=#{system}</if>
				<if test="price!=null"> and price &lt; #{price}</if>
				<if test="cpu!=null"> and cpu=#{cpu}</if>
			</where>
		</select>

###其他标签
1. <choose><when><otherwise>
2. <set>：动态修改

##动态修改sql*
	
	<update>
		update computers
		<set>
			<if t
		</set>
	</update>

#4. 关联关系
只能通过JavaBean关联
##一对一关联
	
	<!-- 处理一对一关系 -->
	<resultMap type="cn.java.entity.Husband" id="Hus">
		<!-- 
			result标签：用来描述一个实体类中的属性
				property属性：实体类属性名
				javaType属性：该实体类属性对应的java类型
				column属性：数据库中的字段名
				jdbcType属性：数据库中的字段类型
		 -->
		<result property="husbandId" javaType="Long" column="husbandId"/>
		<result property="husName" javaType="String" column="husName"/>
		<result property="gender" javaType="String" column="gender"/>
		<result property="husAge" javaType="Integer" column="husAge"/>
		<result property="wifeId" javaType="Long" column="wifeId"/>
		<!-- 
			association标签：用来描述另外一个JavaBean对象
				property属性：实体类属性名
				javaType属性：指定实体类的的具体路径
				column属性：数据库中的字段名
				jdbcType属性：数据库中的字段类型
		 -->
		<association property="wife" javaType="cn.java.entity.Wife">
			<result property="wifeId" javaType="Long" column="wifeId"/>
			<result property="wifeName" javaType="String" column="wifeName"/>
			<result property="sex" javaType="String" column="sex"/>
			<result property="wifeAge" javaType="Integer" column="wifeAge"/>
		</association>
	</resultMap>
##一对多关联

#5. 其他标签
##foreach标签
1. list传参：

		public void delectMore() {
	        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
	        int delete = session.delete("cn.java.dao.impl.ComputerImpl.delectMore", asList);
	        session.commit();
	        System.out.println(delete);
	    }
	
		<delete id="delectMore" parameterType="list">
			delete from computers where id in 
			<foreach collection="list" item="temp" open="(" separator="," close=")">
				#{temp}
			</foreach>
		</delete>

2. 数组传参

		@Test
    	public void delectMore2() {
        	int[] attr = { 5, 6, 7 };
        	// String[] attr = {'5','6','7'};也可以
        	int delete = session.delete("cn.java.dao.impl.ComputerImpl.delectMore2", attr);
        	session.commit();
        	System.out.println(delete);
   	 	}

		<delete id="delectMore2" parameterType="ArrayList">
			delete from computers where id in
			<foreach collection="array" item="temp" open="(" separator="," close=")">
				#{temp}
			</foreach>
		</delete>

##trim标签
动态sql

		<select id="dynamicSelect" parameterType="Map" resultType="Map">
		 select * from computers
		 <trim prefix="where" prefixOverrides="and">
		 	<if test="brand!=null and brand!=''"> and brand=#{brand}</if>
		 	<if test="memory!=null and memory!=''"> and memory=#{memory}</if>
		 	<if test="system!=null and system!=''"> and system=#{system}</if>
		 	<if test="price!=null and price!=''"> and price &lt; #{price}</if>
		 	<if test="cpu!=null and cpu!=''"> and cpu=#{cpu}</if>
		 </trim>
		</select>

#6. 逆向工程
1. 逆向工程：可以快速帮助程序员创建Javabean、mybatis局部配置文件等的一种工具

2. 配置：Java全栈工程师特训班 -》 Mybatis -》 倒数第二集

#7. 添加数据时返回主键值
1. 通过实体类返回主键值：

		<insert id="insertCom" parameterType="cn.java.entity.Computer" keyProperty="id" useGeneratedKeys="true">[最后两个参数表示：插入数据后，将产生的主键值保存到实体的id属性中]	
			insert into computers	(brand,memory,system,price,cpu)
			values (#{brand},#{memory},#{system},#{price},#	{cpu})
		</insert>

2. 通过map返回主键值：

		<insert id="insertCom2" parameterType="Map" keyProperty="id" useGeneratedKeys="true">
			insert into computers(brand,memory,system,price,cpu)
			values (#{brand},#{memory},#{system},#{price},#{cpu})
		</insert>

#8. Mybatis框架提示模板
Java全栈工程师特训班 -》 Mybatis -》 第二集

#9. 插件p6sqy
p6sqy用于在控制台显示sql语句
Java全栈工程师特训班 -》 Mybatis -》 第六集