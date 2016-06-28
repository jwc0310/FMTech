import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.plus.phone.CirclesMembershipActivity;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class ciy
  extends cjx
  implements gzi
{
  public static final hyf a = new hyf("debug.plus.enable_save_interest", "false", "f1873483", hym.b);
  boolean Z;
  private cjb aa;
  private boolean ab;
  private final cw<otd> at;
  private final guf au;
  private final gug av;
  cjc b;
  osm[] c;
  int d;
  
  public ciy()
  {
    gxl localgxl = new gxl(pju.e);
    this.bo.a(gxs.class, localgxl);
    new gxj(this.bp, (byte)0);
    this.aa = new cjb(this.bp);
    this.d = -1;
    this.at = new ciz(this);
    this.au = new cja(this);
    gug localgug = new gug(this.bp, (byte)0);
    this.bo.a(gug.class, localgug);
    this.av = localgug.a(aaw.iB, this.au);
  }
  
  private static ArrayList<String> a(oso paramoso)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramoso == null) || (paramoso.a == null) || (paramoso.a.c == null)) {}
    for (;;)
    {
      return localArrayList;
      osf[] arrayOfosf = paramoso.a.c;
      int i = arrayOfosf.length;
      for (int j = 0; j < i; j++) {
        localArrayList.add(arrayOfosf[j].a.b);
      }
    }
  }
  
  private final void a(osm paramosm, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    int i = this.am.c();
    ArrayList localArrayList = new ArrayList();
    int j = Math.min(paramosm.c.length, 6);
    for (int k = 0; k < j; k++)
    {
      oso localoso = paramosm.c[k];
      localArrayList.add(new bkc(jjf.a(localoso.a.a.c), localoso.a.b.a));
    }
    bnk localbnk = new bnk(this.bn, i, localArrayList, E(), paramArrayList1, paramArrayList2);
    this.ap.b(localbnk);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      bkc localbkc = (bkc)localIterator.next();
      hvk localhvk = new hvk(44, null, null);
      this.an = new hvj(this.bn, (gxx)this.bo.a(gxx.class), localbkc.a, paramArrayList1, paramArrayList2, localhvk);
    }
  }
  
  private final boolean a(osm paramosm)
  {
    cjb localcjb1 = this.aa;
    int i = paramosm.a;
    boolean bool;
    if (localcjb1.a.containsKey(Integer.valueOf(i)))
    {
      cjb localcjb4 = this.aa;
      Integer localInteger2 = Integer.valueOf(paramosm.a);
      int i5 = ((ArrayList)localcjb4.a.get(localInteger2)).size();
      bool = false;
      if (i5 > 0) {
        bool = true;
      }
      return bool;
    }
    String str = brn.a(this.bn, this.af, false);
    if (str == null)
    {
      cjb localcjb2 = this.aa;
      int i1 = paramosm.a;
      ArrayList localArrayList;
      if (localcjb2.a.containsKey(Integer.valueOf(i1)))
      {
        cjb localcjb3 = this.aa;
        Integer localInteger1 = Integer.valueOf(paramosm.a);
        localArrayList = (ArrayList)localcjb3.a.get(localInteger1);
      }
      for (;;)
      {
        int i4 = localArrayList.size();
        bool = false;
        if (i4 <= 0) {
          break;
        }
        return true;
        oso[] arrayOfoso = paramosm.c;
        if (arrayOfoso.length == 0)
        {
          localArrayList = (ArrayList)Collections.EMPTY_LIST;
        }
        else
        {
          localArrayList = a(arrayOfoso[0]);
          int i2 = arrayOfoso.length;
          for (int i3 = 0; i3 < i2; i3++)
          {
            oso localoso2 = arrayOfoso[i3];
            if (localoso2 != null) {
              localArrayList.retainAll(a(localoso2));
            }
          }
        }
      }
    }
    int j = 0;
    label244:
    int n;
    if (j < Math.min(paramosm.c.length, 6))
    {
      oso localoso1 = paramosm.c[j];
      if (localoso1.a.c == null) {
        break label348;
      }
      osf[] arrayOfosf = localoso1.a.c;
      int m = arrayOfosf.length;
      n = 0;
      label297:
      if (n >= m) {
        break label348;
      }
      if (!arrayOfosf[n].a.b.equals(str)) {}
    }
    label348:
    for (int k = 1;; k = 0)
    {
      bool = false;
      if (k == 0) {
        break;
      }
      j++;
      break label244;
      n++;
      break label297;
      return true;
    }
  }
  
  private final void c(int paramInt)
  {
    if (!this.aq.a()) {
      this.bn.startActivity(this.aq.b());
    }
    Bundle localBundle;
    do
    {
      return;
      localBundle = new Bundle();
      localBundle.putInt("index", paramInt);
    } while (h(localBundle));
    String str = brn.a(this.bn, this.af, false);
    int i;
    if ((this.af == null) || (this.af.getCount() == 0))
    {
      i = 1;
      if (i == 0) {
        break label167;
      }
    }
    label167:
    for (int j = 3;; j = 4)
    {
      new kpu(j).b(this.bn);
      if (i == 0) {
        break label173;
      }
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
      localBuilder.setMessage(aau.uH);
      localBuilder.setCancelable(false);
      localBuilder.setPositiveButton(aau.mg, null);
      localBuilder.create().show();
      return;
      i = 0;
      break;
    }
    label173:
    if (str == null)
    {
      int k = this.am.c();
      gug localgug = this.av;
      int m = aaw.iB;
      Intent localIntent = new Intent(f(), CirclesMembershipActivity.class);
      localIntent.putExtra("account_id", k);
      localIntent.putExtra("category_index", paramInt);
      localIntent.putExtra("empty_selection_allowed", false);
      localgug.a(m, localIntent);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(str);
    a(paramInt, localArrayList);
  }
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.at);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(105);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  public final void I()
  {
    int i = 0;
    if ((this.c == null) || (!this.ab)) {
      return;
    }
    cjb localcjb = this.aa;
    osm[] arrayOfosm = this.c;
    localcjb.b = arrayOfosm;
    for (int j = 0; j < arrayOfosm.length; j++) {
      localcjb.c.put(arrayOfosm[j].a, j);
    }
    cjc localcjc = this.b;
    localcjc.b = this.c;
    localcjc.a = localcjc.c.bn.getResources().getIntArray(efj.iW);
    TypedArray localTypedArray = localcjc.c.bn.getResources().obtainTypedArray(efj.iW);
    localcjc.a = new int[localTypedArray.length()];
    while (i < localTypedArray.length())
    {
      localcjc.a[i] = localTypedArray.getResourceId(i, efj.jV);
      i++;
    }
    localTypedArray.recycle();
    this.b.notifyDataSetChanged();
    this.ac.a();
    J();
  }
  
  public final int R_()
  {
    return 44;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    b(localView);
    a(this.b);
    return localView;
  }
  
  protected final hgh a(int paramInt1, int paramInt2)
  {
    return new hvk(44, null, null);
  }
  
  final void a(int paramInt, ArrayList<String> paramArrayList)
  {
    osm localosm = this.c[paramInt];
    cjb localcjb = this.aa;
    Integer localInteger = Integer.valueOf(localosm.a);
    localcjb.a.put(localInteger, paramArrayList);
    this.b.notifyDataSetChanged();
    a(localosm, paramArrayList, null);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.d = paramBundle.getInt("last_rendered_card");
    }
    this.b = new cjc(this);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("first_circle_add".equals(paramString))
    {
      c(paramBundle.getInt("index"));
      return;
    }
    super.a(paramBundle, paramString);
  }
  
  public final void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    super.a(paramfu, paramCursor);
    switch (paramfu.i)
    {
    default: 
      return;
    }
    if ((paramCursor == null) || (paramCursor.getCount() == 0)) {}
    for (int i = 1;; i = 2)
    {
      this.ab = true;
      new kpu(i).b(this.bn);
      I();
      return;
    }
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    int i = aau.hL;
    paramgpr.a(g().getString(i));
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    super.a(paramString, paramhae, paramhaa);
    if ("GroupModifyCircleMembershipsTask".equals(paramString))
    {
      int i;
      cjb localcjb;
      Iterator localIterator;
      if (paramhae.b != 200)
      {
        i = 1;
        if (i != 0)
        {
          localcjb = this.aa;
          localIterator = localcjb.a.entrySet().iterator();
        }
      }
      else
      {
        label56:
        label203:
        label209:
        label213:
        for (;;)
        {
          if (!localIterator.hasNext()) {
            break label215;
          }
          int j = ((Integer)((Map.Entry)localIterator.next()).getKey()).intValue();
          int k = localcjb.c.get(j, -1);
          osm localosm;
          label117:
          int n;
          if (k >= 0)
          {
            localosm = localcjb.b[k];
            oso[] arrayOfoso = localosm.c;
            int m = arrayOfoso.length;
            n = 0;
            if (n >= m) {
              break label209;
            }
            String str = jjf.a(arrayOfoso[n].a.a.c);
            if (!localcjb.d.a(str)) {
              break label203;
            }
          }
          for (int i1 = 1;; i1 = 0)
          {
            if (i1 != 0) {
              break label213;
            }
            localIterator.remove();
            break label56;
            i = 0;
            break;
            localosm = null;
            break label117;
            n++;
            break label132;
          }
        }
        label132:
        label215:
        this.b.notifyDataSetChanged();
      }
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    git localgit = (git)this.bo.a(git.class);
    this.Z = ((hul)this.bo.a(hul.class)).a(localgit.c());
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putSerializable("last_rendered_card", Integer.valueOf(this.d));
  }
  
  public final void n()
  {
    super.n();
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    osm localosm2;
    Object localObject;
    if (i == aaw.mn)
    {
      int k = ((Integer)paramView.getTag(aaw.hk)).intValue();
      int m = ((Integer)paramView.getTag(aaw.hh)).intValue();
      String str4 = (String)paramView.getTag(aaw.hi);
      int n = this.am.c();
      bp localbp2 = f();
      localosm2 = this.c[k];
      cjb localcjb2 = this.aa;
      int i1 = localosm2.a;
      boolean bool = localcjb2.a.containsKey(Integer.valueOf(i1));
      localObject = null;
      if (bool)
      {
        cjb localcjb3 = this.aa;
        Integer localInteger2 = Integer.valueOf(localosm2.a);
        int i2 = ((ArrayList)localcjb3.a.get(localInteger2)).size();
        localObject = null;
        if (i2 != 0) {}
      }
      else
      {
        Intent localIntent = efj.a(localbp2, n, m, str4);
        localIntent.putExtra("following_preview_ids", (Serializable)localObject);
        a(localIntent);
      }
    }
    int j;
    String str3;
    do
    {
      return;
      localObject = new ArrayList();
      oso[] arrayOfoso = localosm2.c;
      int i3 = arrayOfoso.length;
      for (int i4 = 0; i4 < i3; i4++) {
        ((ArrayList)localObject).add(arrayOfoso[i4].a.a.c);
      }
      break;
      if (i != aaw.dE) {
        break label418;
      }
      j = ((Integer)((CirclesButton)paramView).getTag(aaw.hk)).intValue();
      bp localbp1 = f();
      if (this.af == null)
      {
        Toast.makeText(localbp1, aau.uV, 0).show();
        return;
      }
      if (!a(this.c[j]))
      {
        c(j);
        return;
      }
      str3 = brn.a(this.bn, this.af, false);
    } while (str3 == null);
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(str3);
    osm localosm1 = this.c[j];
    cjb localcjb1 = this.aa;
    Integer localInteger1 = Integer.valueOf(localosm1.a);
    ArrayList localArrayList2 = new ArrayList();
    localcjb1.a.put(localInteger1, localArrayList2);
    this.b.notifyDataSetChanged();
    a(localosm1, null, localArrayList1);
    return;
    label418:
    if ((paramView instanceof AvatarView))
    {
      AvatarView localAvatarView = (AvatarView)paramView;
      String str2;
      if (localAvatarView.a == null) {
        str2 = null;
      }
      for (;;)
      {
        a(str2, localAvatarView.b, null, 44, new hvo(localAvatarView.h, localAvatarView.i));
        return;
        String str1 = String.valueOf(localAvatarView.a);
        if (str1.length() != 0) {
          str2 = "g:".concat(str1);
        } else {
          str2 = new String("g:");
        }
      }
    }
    super.onClick(paramView);
  }
  
  public final void p_()
  {
    super.p_();
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.at);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ciy
 * JD-Core Version:    0.7.0.1
 */