import android.content.ContentResolver;
import android.content.Context;

public final class cqb
  extends hqe<hcg>
  implements jer<hba>
{
  private final fv d = new fv(this);
  private final hce e;
  
  public cqb(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.e = new hce(paramContext, paramInt, null);
  }
  
  protected final boolean o()
  {
    ContentResolver localContentResolver = this.l.getContentResolver();
    localContentResolver.registerContentObserver(hbu.b, false, this.d);
    localContentResolver.registerContentObserver(hbu.a(this.l), false, this.d);
    localContentResolver.registerContentObserver(hbu.b(this.l), false, this.d);
    ((hba)mbb.a(this.l, hba.class)).a.a(this, false);
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.d);
    ((hba)mbb.a(this.l, hba.class)).a.a(this);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqb
 * JD-Core Version:    0.7.0.1
 */