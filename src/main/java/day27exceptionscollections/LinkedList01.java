package day27exceptionscollections;


import java.util.LinkedList;


/*
        Collections are for storing multiple data in the same data type.
        Collections are flexible in length.
        Collections have many useful methods.

        There are 3 main Collections: i)List ==> a)ArrayList:Successful in "search operations" but not good at "adding" and "removing" == When you need a collection to update existing elements mostly, you need to use ArrayList.
                                                 b)LinkedList:Successful in "adding" and "removing" not good at "search operations" == When you need a collection to add new elements and remove existing elements mostly, you need to use LinkedList.
                                      ii)Queue ==> a)PriorityQueue  b)Deque
                                      iii)Set ==> a)HashSet  b)LinkedHashSet  c)TreeSet
    */
public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Ali");

        System.out.println(visitors); // [Tom, Jane, Mary, Carl, Ali]

        visitors.addLast("Mahmut"); //specific method her zaman daha hızlı çalışır. Onu kullan.(add yerine addLast var burda)
        System.out.println(visitors);//[Tom, Jane, Mary, Carl, Ali, Mahmut]

        visitors.addFirst("Chris");
        System.out.println(visitors); //[Chris, Tom, Jane, Mary, Carl, Ali, Mahmut]



        LinkedList<String> kids = new LinkedList<>();
        kids.add("Abc");
        kids.add("Xyz");

        visitors.addAll(kids);
        System.out.println(visitors);//[Chris, Tom, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.add(2,"Miami"); //Normally LinkedList does not use "indexes", Java displays it as index to make usage easy for us.
        System.out.println(visitors); //[Chris, Tom, Miami, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.addAll(6,kids);
        System.out.println(visitors); //[Chris, Tom, Miami, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove(2);
        System.out.println(visitors); //[Chris, Tom, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove("Abc"); //remove() method removes the "first occurence" of the object
        System.out.println(visitors); //[Chris, Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.removeFirst();
        System.out.println(visitors); //[Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove();
        System.out.println(visitors); //[Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.removeFirstOccurrence("Xyz");
        System.out.println(visitors);//[Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.removeLast();
        System.out.println(visitors); //[Jane, Mary, Carl, Ali, Mahmut, Abc]

        //Example 1: Change all names start with "A" to "*****"

        for ( String w:visitors){
            if (w.startsWith("A")){
                visitors.set(visitors.indexOf(w),"*****");
            }
            System.out.println(visitors);
        }

        //Example 2: If the number of characters is more than 4, remove them from the LinkedList
        //Interview Question

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Jane");
        names.add("Mary");
        names.add("Mahmut");
        names.add("Ali");
        names.add("Emily");

        for(int i =0; i<names.size(); i++){

            if(names.get(i).length()>4){
                names.remove(names.get(i));
                i--;                  // since removing one element we should decrease the index
                // while the indexes will change after every iteration
            }
        }
        System.out.println(names); //[Tom, Jane, Mary, Ali]






    }

}
