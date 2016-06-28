import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

public abstract class ehi<T>
  implements efm, Iterable<T>
{
  public final DataHolder a;
  
  public ehi(DataHolder paramDataHolder)
  {
    this.a = paramDataHolder;
    if (this.a != null) {
      this.a.h = this;
    }
  }
  
  public ehi(DataHolder paramDataHolder, byte paramByte)
  {
    this(paramDataHolder);
  }
  
  public abstract T a(int paramInt);
  
  public void a()
  {
    if (this.a != null) {
      this.a.c();
    }
  }
  
  public int c()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.g;
  }
  
  @Deprecated
  public void d()
  {
    a();
  }
  
  public Bundle e()
  {
    return this.a.f;
  }
  
  public Iterator<T> iterator()
  {
    return new ehm(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehi
 * JD-Core Version:    0.7.0.1
 */