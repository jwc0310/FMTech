import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;

final class chf
  implements llj
{
  chf(cgr paramcgr) {}
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString4, Spanned paramSpanned)
  {
    String str = this.a.b.f().b("gaia_id");
    Resources localResources = this.a.bn.getResources();
    boolean bool1 = TextUtils.equals(str, paramString1);
    boolean bool2 = TextUtils.equals(str, this.a.Z);
    ArrayList localArrayList1 = new ArrayList(5);
    ArrayList localArrayList2 = new ArrayList(5);
    int i;
    int i2;
    label120:
    int i1;
    label199:
    label238:
    int m;
    label292:
    String[] arrayOfString;
    if ((this.a.ab != null) && (this.a.ab.i))
    {
      i = 1;
      if ((!paramBoolean2) && (!paramBoolean3))
      {
        if (!paramBoolean1) {
          break label609;
        }
        i2 = aau.ug;
        localArrayList1.add(localResources.getString(i2));
        localArrayList2.add(Integer.valueOf(37));
      }
      if (!bool1) {
        break label617;
      }
      localArrayList1.add(localResources.getString(aau.ue));
      localArrayList2.add(Integer.valueOf(38));
      localArrayList1.add(localResources.getString(aau.uc));
      localArrayList2.add(Integer.valueOf(84));
      if (!paramBoolean2)
      {
        if ((!bool2) && (!bool1))
        {
          int n = this.a.an;
          if ((n != 2) && (n != 1)) {
            break label830;
          }
          i1 = 1;
          if (i1 == 0) {}
        }
        else
        {
          localArrayList1.add(localResources.getString(aau.ud));
          localArrayList2.add(Integer.valueOf(33));
        }
        int k = this.a.an;
        if ((k != 2) && (k != 1)) {
          break label836;
        }
        m = 1;
        if ((m != 0) && (!bool1))
        {
          localArrayList1.add(localResources.getString(aau.ua));
          localArrayList2.add(Integer.valueOf(82));
        }
        if ((paramString3 != null) && (paramInt > 0))
        {
          localArrayList1.add(localResources.getString(aau.uf));
          localArrayList2.add(Integer.valueOf(64));
        }
      }
      if (paramBoolean4)
      {
        if (i == 0) {
          break label842;
        }
        localArrayList1.add(localResources.getString(aau.ul));
        localArrayList2.add(Integer.valueOf(66));
      }
      label397:
      if (efj.B(this.a.bn))
      {
        localArrayList1.add(localResources.getString(aau.tZ));
        localArrayList2.add(Integer.valueOf(96));
      }
      arrayOfString = new String[localArrayList1.size()];
      localArrayList1.toArray(arrayOfString);
      if (!paramBoolean2) {
        break label870;
      }
    }
    label609:
    label870:
    for (int j = aau.uv;; j = aau.uo)
    {
      lut locallut = lut.a(localResources.getString(j), arrayOfString);
      locallut.n = this.a;
      locallut.p = 0;
      locallut.m.putIntegerArrayList("comment_action", localArrayList2);
      locallut.m.putString("comment_id", paramString4);
      locallut.m.putByteArray("comment_content", lwh.a(paramSpanned));
      locallut.m.putString("plus_one_id", paramString3);
      locallut.m.putBoolean("plus_one_by_me", paramBoolean1);
      locallut.m.putInt("plus_one_count", paramInt);
      locallut.m.putString("comment_author_id", paramString1);
      locallut.m.putString("comment_author_name", paramString2);
      locallut.a(this.a.x, "delete_comment");
      return;
      i = 0;
      break;
      i2 = aau.uh;
      break label120;
      label617:
      if (paramBoolean2)
      {
        localArrayList1.add(localResources.getString(aau.uk));
        localArrayList2.add(Integer.valueOf(40));
        localArrayList1.add(localResources.getString(aau.un));
        localArrayList2.add(Integer.valueOf(35));
        if ((!bool2) || (paramBoolean3)) {
          break label199;
        }
        localArrayList1.add(localResources.getString(aau.ub, new Object[] { paramString2 }));
        localArrayList2.add(Integer.valueOf(49));
        break label199;
      }
      if (paramBoolean3) {
        break label199;
      }
      if (this.a.aG)
      {
        localArrayList1.add(localResources.getString(aau.ui));
        localArrayList2.add(Integer.valueOf(39));
      }
      localArrayList1.add(localResources.getString(aau.uc));
      localArrayList2.add(Integer.valueOf(84));
      localArrayList1.add(localResources.getString(aau.uj));
      if (bool2)
      {
        localArrayList2.add(Integer.valueOf(36));
        break label199;
      }
      localArrayList2.add(Integer.valueOf(34));
      break label199;
      i1 = 0;
      break label238;
      m = 0;
      break label292;
      localArrayList1.add(localResources.getString(aau.um));
      localArrayList2.add(Integer.valueOf(65));
      break label397;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     chf
 * JD-Core Version:    0.7.0.1
 */