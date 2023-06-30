package cn.xiaoxpai.xml;

public class XmlSelectProperties {
    /*
      <select id="selectBlogWithPosts" resultMap="BlogResultMap">
        select
            b.id as blog_id, b.title as blog_title,
            p.id as post_id, p.body as post_body
        from blog b
        left join post p on b.id = p.blog_id
        where b.id = #{id}
    </select>

    select:解释：select元素用于定义一个查询语句，它有两个属性，id和resultMap，id用于指定查询语句的名字，resultMap用于指定查询结果的映射关系。
            1.1 id  指定查询语句的名字，它的值是一个字符串，表示查询语句的名字。
            1.2 parameterMap  指定查询语句的参数映射关系，它的值是一个字符串，表示参数映射的名字。
            1.3 parameterType 指定查询语句的参数类型，它的值是一个字符串，表示参数类型的全限定名。
            1.4 resultMap 指定查询结果的映射关系，它的值是一个字符串，表示结果映射的名字。
            1.5 resultType 指定查询结果的类型，它的值是一个字符串，表示结果类型的全限定名。
            1.6 resultSetType (FORWARD_ONLY | SCROLL_INSENSITIVE | SCROLL_SENSITIVE | DEFAULT)
                指定查询的结果集类型，它的值是一个字符串，可选值有FORWARD_ONLY、SCROLL_SENSITIVE和SCROLL_INSENSITIVE，默认值是FORWARD_ONLY。
            1.7 statementType (STATEMENT|PREPARED|CALLABLE)
                指定查询的语句类型，它的值是一个字符串，可选值有STATEMENT、PREPARED和CALLABLE，默认值是PREPARED。
            1.8 fetchSize 指定查询的返回行数，它的值是一个整数，表示返回行数。
            1.9 timeout 指定查询的超时时间，它的值是一个整数，表示超时时间，单位是毫秒。
            1.10 flushCache (true|false) 指定是否刷新缓存，它的值是一个布尔值，可选值有true和false，默认值是true。
            1.11 useCache (true|false) 指定是否使用缓存，它的值是一个布尔值，可选值有true和false，默认值是true。
            1.12 databaseId 指定数据库厂商的标识，它的值是一个字符串，表示数据库厂商的标识。
            1.13 lang 指定查询语句的语言，它的值是一个字符串，表示查询语句的语言。
            1.14 resultOrdered (true|false) 指定查询结果是否排序，它的值是一个布尔值，可选值有true和false，默认值是true。
            1.15 resultSets 指定查询的结果集，它的值是一个字符串，表示结果集的名字。

    foreach:解释 foreach元素用于定义一个foreach循环，它有两个属性，collection和item，collection用于指定集合对象，item用于指定集合元素的别名。
            1.collection 指定集合对象，它的值是一个OGNL表达式，表示集合对象。
            2.item 指定集合元素的别名，它的值是一个字符串，表示集合元素的别名。
            3.index 指定集合元素的索引，它的值是一个字符串，表示集合元素的索引。
            4.open 指定循环体的开始符号，它的值是一个字符串，表示循环体的开始符号。
            5.close 指定循环体的结束符号，它的值是一个字符串，表示循环体的结束符号。
            6.separator 指定循环体的分隔符，它的值是一个字符串，表示循环体的分隔符。
   */
}