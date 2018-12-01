public interface QueueInter {
  //字符放入函数
  void put(char ch) throws QueueFullException;
  //字符取出函数
  char get() throws QueueEmptyException;
  //此接口非常简单，仅包含两种方法。 每个类的实现QueueInter都需要实现这些方法
}