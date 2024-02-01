/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.foreach;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface Mapper {

  User getUser(User user);

  int countByUserList(List<User> users);

  int countByBestFriend(List<User> users);

  String selectWithNullItemCheck(List<User> users);

  int typoInItemProperty(List<User> users);

  /**
   * 通过 select 标签定义了一条 SQL 查询语句，用于查询 users 数据表中符合特定条件的记录数。该查询语句包含一个参数：ids，它是一个列表。
   * 在 select 标签内部，使用 foreach 标签遍历 ids 列表，每次取出一个元素，即 id。
   * 在第一个 foreach 标签内部又嵌套了另一个 foreach 标签，用于处理第二个参数：ids2，同时生成 IN 子句所需的元素，即 #{id}。
   * 使用 or 条件拼接第三个参数 id，如果该参数存在。
   * 最终将查询结果存入 _int 类型的结果对象中。
   * @param id
   * @param ids
   * @param ids2
   * @return
   */
  int itemVariableConflict(@Param("id") Integer id, @Param("ids") List<Integer> ids, @Param("ids2") List<Integer> ids2);

  int indexVariableConflict(@Param("idx") Integer id, @Param("idxs") List<Integer> ids, @Param("idxs2") List<Integer> ids2);

  int countUserWithNullableIsOmit(User user);

  int countUserWithNullableIsTrue(User user);

  int countUserWithNullableIsFalse(User user);

  /**
   * 批量删除
   */
  int batchDelete(@Param("ids") List<Integer> ids);
}
