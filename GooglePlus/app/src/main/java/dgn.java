import android.text.SpannableStringBuilder;

final class dgn
  implements hge
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qop paramqop)
  {
    paramSpannableStringBuilder.append(paramqop.b);
    int i = paramSpannableStringBuilder.length();
    paramSpannableStringBuilder.setSpan(new dgo(this, paramqop.d.a), paramInt, i, 33);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgn
 * JD-Core Version:    0.7.0.1
 */