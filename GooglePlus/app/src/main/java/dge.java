import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;

public abstract class dge
  implements lxx
{
  public final int a;
  public final Context b;
  
  public dge(Context paramContext, int paramInt)
  {
    this.b = paramContext;
    this.a = paramInt;
  }
  
  public static void a(View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = 0;
      int j = localViewGroup.getChildCount();
      while (i < j)
      {
        a(localViewGroup.getChildAt(i));
        i++;
      }
    }
    if ((paramView instanceof loi)) {
      ((loi)paramView).ax_();
    }
  }
  
  public static void b(View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = 0;
      int j = localViewGroup.getChildCount();
      while (i < j)
      {
        b(localViewGroup.getChildAt(i));
        i++;
      }
    }
    if ((paramView instanceof loi)) {
      ((loi)paramView).aw_();
    }
  }
  
  public abstract void a();
  
  public void a(URLSpan paramURLSpan) {}
  
  public final void a(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(524288);
    localIntent.setData(Uri.parse(paramString));
    localIntent.setPackage("com.android.vending");
    if (this.b.getPackageManager().resolveActivity(localIntent, 0) == null) {
      localIntent.setPackage(null);
    }
    this.b.startActivity(localIntent);
  }
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void a(String paramString1, String paramString2, String paramString3, int paramInt);
  
  public abstract void a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public final void a(lmg paramlmg)
  {
    Uri.Builder localBuilder = Uri.parse("http://maps.google.com/maps").buildUpon();
    localBuilder.appendQueryParameter("lci", "com.google.latitudepublicupdates");
    if (paramlmg.f)
    {
      double d3 = paramlmg.d / 10000000.0D;
      double d4 = paramlmg.e / 10000000.0D;
      localBuilder.appendQueryParameter("ll", 49 + d3 + "," + d4);
    }
    String str1 = paramlmg.g;
    int i;
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      i = 1;
      if (i != 0) {
        localBuilder.appendQueryParameter("cid", str1);
      }
      str2 = paramlmg.a(this.b);
      if ((i != 0) || (!paramlmg.f)) {
        break label260;
      }
      double d1 = paramlmg.d / 10000000.0D;
      double d2 = paramlmg.e / 10000000.0D;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(d1).append(',').append(d2);
      if (!TextUtils.isEmpty(str2)) {
        localStringBuilder.append('(').append(str2).append(')');
      }
      localBuilder.appendQueryParameter("q", localStringBuilder.toString());
    }
    for (;;)
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", localBuilder.build());
      localIntent.addFlags(524288);
      this.b.startActivity(localIntent);
      return;
      i = 0;
      break;
      label260:
      if (!TextUtils.isEmpty(str2)) {
        localBuilder.appendQueryParameter("q", str2);
      }
    }
  }
  
  public final void b(String paramString1, String paramString2)
  {
    this.b.startActivity(efj.a(this.b, this.a, paramString1, paramString2, 0, null, -2147483648, null, false, 1));
  }
  
  public abstract void b(String paramString1, String paramString2, String paramString3, int paramInt);
  
  public final void c(String paramString1, String paramString2)
  {
    Intent localIntent = ((kyp)mbb.a(this.b, kyp.class)).a(this.a, paramString1, paramString2);
    this.b.startActivity(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dge
 * JD-Core Version:    0.7.0.1
 */