import android.view.View;
import android.widget.AdapterView;

final class cmn
  extends cmz
{
  private int a;
  private cmm b;
  
  cmn(cmj paramcmj, int paramInt, cmm paramcmm)
  {
    super(paramcmj, paramInt);
    this.a = paramInt;
    this.b = paramcmm;
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    cmm localcmm = this.b;
    localcmm.onCheckedChanged(localcmm.b, localcmm.a);
    if (paramInt != this.a)
    {
      this.a = paramInt;
      this.c.a(this.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmn
 * JD-Core Version:    0.7.0.1
 */