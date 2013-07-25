package scalikejdbc

package object async {

  implicit def makeSQLToOptionAsync[A, E <: WithExtractor](sql: SQLToOption[A, E]): AsyncSQLToOption[A, E] = {
    new AsyncSQLToOption[A, E](sql)
  }

  implicit def makeSQLToTraversableAsync[A, E <: WithExtractor](sql: SQLToTraversable[A, E]): AsyncSQLToTraversable[A, E] = {
    new AsyncSQLToTraversable[A, E](sql)
  }

  implicit def makeSQLToList[A, E <: WithExtractor](sql: SQLToList[A, E]): AsyncSQLToList[A, E] = {
    new AsyncSQLToList[A, E](sql)
  }

}