package exercise2
import scala.annotation.tailrec


/** Реализуйте функции для решения следующих задач.
  * Примечание: Попытайтесь сделать все функции с хвостовой рекурсией, используйте аннотацию для подстверждения.
  * рекурсия будет хвостовой если:
  *   1. рекурсия реализуется в одном направлении
  *   2. вызов рекурсивной функции будет последней операцией перед возвратом
  */
object RecursiveFunctions {
  // a) Напишите функцию которая записывает в обратном порядке список:

  def reverse[A](list: List[A]): List[A] = {
    def rev(a: A, l: List[A]): List[A]= Cons(a,l)
    @tailrec
    def loop(rem: List[A], as:List[A]): List[A] = rem match {
      case Cons(head, tail) => loop(tail, rev(head,as))
      case Nil() => as
    }

    loop(list, Nil())
  }

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testReverse[A](list: List[A]): List[A] = reverse(list)

  /* b) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def map[A, B](list: List[A])(f: A => B): List[B]
   */


  def map[A, B](list: List[A])(f: A => B): List[B]={
    @tailrec
    def loop(rem: List[A], as:List[B], f: A => B): List[B] = rem match {
      case Cons(head, tail) =>loop(tail, Cons(f(head),as),f)
      case Nil() => reverse(as)
    }

    loop(list, Nil(),f)
  }

  // используйте функцию из пункта  (b) здесь, не изменяйте сигнатуру
  def testMap[A, B](list: List[A], f: A => B): List[B] = map(list)(f)

  /* c) Напишите функцию, которая присоединяет один список к другому:
   *        def append[A](l: List[A], r: List[A]): List[A]
   */

  def append[A](l: List[A], r: List[A]): List[A]={
    @tailrec
    def loop(ll: List[A], rr:List[A], as:List[A]): List[A] = ll match {
      case Cons(head, tail) => loop(tail,rr, Cons(head,as))
      case Nil() => rr match {
        case Cons(head, tail) => loop(ll,tail, Cons(head,as))
        case Nil() => reverse(as)
      }
    }

    loop(l,r, Nil())
  }

  // используйте функцию из пункта  (c) здесь, не изменяйте сигнатуру
  def testAppend[A](l: List[A], r: List[A]): List[A] = append(l,r)

  /* d) Напишите функцию, которая применяет функцию к каждому значению списка:
   *        def flatMap[A, B](list: List[A])(f: A => List[B]): List[B]
   *
   *    она получает функцию, которая создает новый List[B] для каждого элемента типа A в
   *    списке. Поэтому вы создаете List[List[B]].
   */

  def flatMap[A, B](list: List[A])(f: A => List[B]): List[B]={
    @tailrec
    def loop(rem: List[A], as:List[B], f: A => List[B]): List[B] = {
      rem match {
        case Cons(head, tail) => as match {
          case Cons(ahead, ateil)=> loop(tail,append(as,f(head)),f)
          case Nil()=> loop(tail,f(head),f)
        }
        case Nil() => as
      }
    }
    loop(list, Nil() ,f)
  }

  // используйте функцию из пункта  (d) здесь, не изменяйте сигнатуру
  def testFlatMap[A, B](list: List[A], f: A => List[B]): List[B] = flatMap(list)(f)

  /* e) Вопрос: Возможно ли написать функцию с хвостовой рекурсией для `Tree`s? Если нет, почему? */
}
