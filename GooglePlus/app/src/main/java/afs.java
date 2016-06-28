import android.view.View;

public abstract class afs
{
  public final agh a;
  int b = -2147483648;
  
  private afs(agh paramagh)
  {
    this.a = paramagh;
  }
  
  public static afs a(agh paramagh, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("invalid orientation");
    case 0: 
      return new aft(paramagh);
    }
    return new afu(paramagh);
  }
  
  public final int a()
  {
    if (-2147483648 == this.b) {
      return 0;
    }
    return e() - this.b;
  }
  
  public abstract int a(View paramView);
  
  public abstract void a(int paramInt);
  
  public abstract int b();
  
  public abstract int b(View paramView);
  
  public abstract int c();
  
  public abstract int c(View paramView);
  
  public abstract int d();
  
  public abstract int d(View paramView);
  
  public abstract int e();
  
  public abstract int f();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afs
 * JD-Core Version:    0.7.0.1
 */