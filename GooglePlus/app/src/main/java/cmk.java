import android.view.View;

final class cmk
  extends cmt
{
  private cmm a;
  
  public cmk(cmj paramcmj, View paramView, cmm paramcmm)
  {
    super(paramcmj, paramView, "");
    this.a = paramcmm;
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    cmm localcmm = this.a;
    localcmm.onCheckedChanged(localcmm.b, localcmm.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmk
 * JD-Core Version:    0.7.0.1
 */