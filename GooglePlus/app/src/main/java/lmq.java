import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;

final class lmq
  implements hge
{
  public final void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt, qop paramqop)
  {
    if ((paramqop.d.b != null) && (paramqop.d.b.a != null) && (paramqop.d.b.a.b(qdo.a) != null))
    {
      paramSpannableStringBuilder.append(((qdo)paramqop.d.b.a.b(qdo.a)).c);
      int i = paramSpannableStringBuilder.length();
      paramSpannableStringBuilder.setSpan(new StyleSpan(1), paramInt, i, 33);
      return;
    }
    efj.d().a(paramSpannableStringBuilder, paramInt, paramqop);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmq
 * JD-Core Version:    0.7.0.1
 */