package cn.xiaoxpai.xml;

public class XmlInsertProperties {
    /*
        <insert id="batchInsert">
        insert into bind_apply_db_info
        (form_id, db_id)
        values
        <foreach collection="list" item="item" separator=",">
            (#{item.formId}, #{item.dbId})
        </foreach>
    </insert>

  insert:解释 insert元素用于定义一个插入语句，它有两个属性，id和parameterMap，id用于指定插入语句的名字，parameterMap用于指定插入语句的参数映射关系。
1.id 指定插入语句的名字，它的值是一个字符串，表示插入语句的名字。
2.parameterMap 指定插入语句的参数映射关系，它的值是一个字符串，表示参数映射的名字。
3.parameterType  指定插入语句的参数类型，它的值是一个字符串，表示参数类型的全限定名。
4.timeout 指定插入语句的超时时间，它的值是一个整数，表示超时时间，单位是毫秒。
5.flushCache (true|false)  指定是否刷新缓存，它的值是一个布尔值，可选值有true和false，默认值是true。
6.statementType (STATEMENT|PREPARED|CALLABLE) 指定插入的语句类型，它的值是一个字符串，可选值有STATEMENT、PREPARED和CALLABLE，默认值是PREPARED。
7.keyProperty 指定插入语句的主键属性，它的值是一个字符串，表示主键属性的名字。
8.useGeneratedKeys (true|false)   指定是否使用自动生成的主键，它的值是一个布尔值，可选值有true和false，默认值是false。
9.keyColumn  指定插入语句的主键列，它的值是一个字符串，表示主键列的名字。
10.databaseId  指定数据库厂商的标识，它的值是一个字符串，表示数据库厂商的标识。
11.lang  指定插入语句的语言，它的值是一个字符串，表示插入语句的语言，可选值有OCL、XML和JAVA，默认值是JAVA。

   foreach:解释 foreach元素用于定义一个foreach循环，它有两个属性，collection和item，collection用于指定集合对象，item用于指定集合元素的别名。
1.collection 指定集合对象，它的值是一个OGNL表达式，表示集合对象。
2.item 指定集合元素的别名，它的值是一个字符串，表示集合元素的别名。
3.index 指定集合元素的索引，它的值是一个字符串，表示集合元素的索引。
4.open 指定循环体的开始符号，它的值是一个字符串，表示循环体的开始符号。
5.close 指定循环体的结束符号，它的值是一个字符串，表示循环体的结束符号。
6.separator 指定循环体的分隔符，它的值是一个字符串，表示循环体的分隔符。

 */
}