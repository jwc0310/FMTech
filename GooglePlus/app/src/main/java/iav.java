import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class iav<K, V>
  extends WeakReference<V>
{
  K a;
  
  public iav(K paramK, V paramV, ReferenceQueue<V> paramReferenceQueue)
  {
    super(paramV, paramReferenceQueue);
    this.a = paramK;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iav
 * JD-Core Version:    0.7.0.1
 */