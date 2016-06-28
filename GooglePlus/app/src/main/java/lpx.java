import com.google.android.libraries.social.stream.legacy.views.StreamGridView;

public final class lpx
  implements Runnable
{
  public boolean a;
  
  public lpx(StreamGridView paramStreamGridView) {}
  
  public final void run()
  {
    StreamGridView localStreamGridView1 = this.b;
    int i = nj.a.m(localStreamGridView1);
    StreamGridView localStreamGridView2 = this.b;
    nj.a.c(localStreamGridView2, 1);
    this.b.sendAccessibilityEvent(4096);
    StreamGridView localStreamGridView3 = this.b;
    nj.a.c(localStreamGridView3, i);
    this.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpx
 * JD-Core Version:    0.7.0.1
 */