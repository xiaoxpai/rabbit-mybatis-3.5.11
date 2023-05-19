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
package org.apache.ibatis.domain.blog.mappers;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.domain.blog.Author;
import org.apache.ibatis.session.ResultHandler;

public interface AuthorMapper {

  /**
   * 查询所有作者
   * @return List<Author> List集合
   */
  List<Author> selectAllAuthors();

  /**
   * 查询所有作者
   * @return Set<Author> Set集合
   */
  Set<Author> selectAllAuthorsSet();

  /**
   * 查询所有作者
   * @return Vector<Author> Vector集合
   */
  Vector<Author> selectAllAuthorsVector();

  /**
   * 查询所有作者
   * @return LinkedList<Author> LinkedList集合
   */
  LinkedList<Author> selectAllAuthorsLinkedList();

  /**
   * 查询所有作者
   * @return Author[]  数组
   */
  Author[] selectAllAuthorsArray();

  void selectAllAuthors(ResultHandler handler);

  /**
   * 查询作者单条记录
   * @param id 主键id
   * @return Author 单条记录
   */
  Author selectAuthor(int id);

  /**
   * 查询作者
   * @param id 主键id
   * @return LinkedHashMap<String, Object>  map集合
   */
  LinkedHashMap<String, Object> selectAuthorLinkedHashMap(int id);

  void selectAuthor(int id, ResultHandler handler);

  @Select("select")
  void selectAuthor2(int id, ResultHandler handler);

  /**
   * 插入作者单条记录
   * @param author  Author
   */
  void insertAuthor(Author author);

  /**
   * 删除作者单条记录
   * @param id 主键id
   * @return int 删除的记录数
   */
  int deleteAuthor(int id);

  /**
   * 更新作者单条记录
   * @param author Author
   * @return int 更新的记录数
   */
  int updateAuthor(Author author);

}
