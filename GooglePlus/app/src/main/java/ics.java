import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.List;

public final class ics
{
  public final icv a;
  
  ics(icv paramicv)
  {
    this.a = paramicv;
  }
  
  public final CharSequence a(rbr paramrbr)
  {
    int i = 1;
    int j = 0;
    if ((0x1 & paramrbr.a) == i) {}
    while (i == 0)
    {
      return null;
      i = 0;
    }
    icx localicx1;
    icv localicv1;
    qpg localqpg;
    icv localicv2;
    if (paramrbr.c() == rbt.a)
    {
      localicx1 = (icx)this.a.e.a();
      localicv1 = this.a;
      localqpg = paramrbr.b();
      localicv2 = this.a;
      if (0 != 0) {
        break label178;
      }
    }
    icx localicx2;
    icx localicx3;
    icx localicx4;
    icx localicx5;
    label178:
    for (Object localObject = (icx)localicv2.c.a();; localObject = new icw(localicv2, null))
    {
      localicx2 = (icx)this.a.f.a();
      localicx3 = (icx)localicv1.a.a();
      localicx4 = (icx)localicv1.b.a();
      localicx5 = (icx)localicv1.g.a();
      if (localqpg != null) {
        break label193;
      }
      return null;
      localicx1 = (icx)this.a.d.a();
      break;
    }
    label193:
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int k = localqpg.a.size();
    if (j < k)
    {
      qpa localqpa = (qpa)localqpg.a.get(j);
      int m = localSpannableStringBuilder.length();
      qpe localqpe = localqpa.o();
      if ((localqpe == qpe.c) && (localqpa.q() != null) && (localObject != null)) {
        ((icx)localObject).a(localSpannableStringBuilder, m, localqpa);
      }
      for (;;)
      {
        if ((localqpa.p() != null) && (localicx5 != null)) {
          localicx5.a(localSpannableStringBuilder, m, localqpa);
        }
        j++;
        break;
        if ((localqpe == qpe.d) && (localicx1 != null)) {
          localicx1.a(localSpannableStringBuilder, m, localqpa);
        } else if ((localqpe == qpe.e) && (localqpa.s() != null) && (localicx2 != null) && (!TextUtils.isEmpty(localqpa.s().a))) {
          localicx2.a(localSpannableStringBuilder, m, localqpa);
        } else if ((localqpe == qpe.b) && (localicx3 != null)) {
          localicx3.a(localSpannableStringBuilder, m, localqpa);
        } else if (localicx4 != null) {
          localicx4.a(localSpannableStringBuilder, m, localqpa);
        }
      }
    }
    return localSpannableStringBuilder;
  }
  
  public final String b(rbr paramrbr)
  {
    CharSequence localCharSequence = a(paramrbr);
    if (localCharSequence != null) {
      return localCharSequence.toString();
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ics
 * JD-Core Version:    0.7.0.1
 */