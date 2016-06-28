import java.util.ArrayList;

final class hzi
  implements Runnable
{
  hzi(hzh paramhzh) {}
  
  public final void run()
  {
    hzh localhzh = this.a;
    int i = localhzh.b.size();
    for (int j = 0; j < i; j++) {
      ((hyg)localhzh.b.get(j)).g();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzi
 * JD-Core Version:    0.7.0.1
 */