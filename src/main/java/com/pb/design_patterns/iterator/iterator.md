Iterator模式，可以将遍历和实现分离开。例如：
while(it.hasNext()){
   Book book = (Book)it.next();
   System.out.println(book.getName());
}
这里的while并不依赖BookShelf的实现。