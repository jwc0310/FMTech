import android.text.SpannableStringBuilder;

public final class icw
  implements icx
{
  public icw(icv paramicv, lxx paramlxx) {}
  
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qpa paramqpa)
  {
    paramSpannableStringBuilder.append(paramqpa.a);
    int i = paramSpannableStringBuilder.length();
    paramSpannableStringBuilder.setSpan(new lxw(paramqpa.q().a, this.a), paramInt, i, 33);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     icw
 * JD-Core Version:    0.7.0.1
 */