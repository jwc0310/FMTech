import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public final class cae
  extends bj
{
  dwx Z;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    for (Object localObject = f();; localObject = new ContextThemeWrapper(f(), 16973835))
    {
      LinearLayout localLinearLayout = new LinearLayout((Context)localObject);
      dwe localdwe = new dwe((Context)localObject);
      localdwe.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localdwe.a(false);
      bk localbk = this.n;
      localdwe.a(this.Z, (dwb)localbk, false);
      ScrollView localScrollView = new ScrollView((Context)localObject);
      localScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localScrollView.addView(localdwe);
      localLinearLayout.addView(localScrollView);
      localLinearLayout.setBackgroundResource(17170443);
      return localLinearLayout;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    a(1, this.a);
    dwx localdwx;
    String str1;
    String str3;
    String str4;
    String str6;
    label108:
    String str7;
    String str9;
    label149:
    String str10;
    String str12;
    label190:
    String str13;
    String str14;
    if (paramBundle != null)
    {
      this.Z = new dwx();
      localdwx = this.Z;
      if (paramBundle != null)
      {
        str1 = String.valueOf("eventupdate");
        String str2 = String.valueOf(".timestamp");
        if (str2.length() == 0) {
          break label242;
        }
        str3 = str1.concat(str2);
        localdwx.d = paramBundle.getLong(str3);
        str4 = String.valueOf("eventupdate");
        String str5 = String.valueOf(".ownername");
        if (str5.length() == 0) {
          break label255;
        }
        str6 = str4.concat(str5);
        localdwx.a = paramBundle.getString(str6);
        str7 = String.valueOf("eventupdate");
        String str8 = String.valueOf(".gaiaid");
        if (str8.length() == 0) {
          break label269;
        }
        str9 = str7.concat(str8);
        localdwx.b = paramBundle.getString(str9);
        str10 = String.valueOf("eventupdate");
        String str11 = String.valueOf(".avatarurl");
        if (str11.length() == 0) {
          break label283;
        }
        str12 = str10.concat(str11);
        localdwx.c = paramBundle.getString(str12);
        str13 = String.valueOf("eventupdate");
        str14 = String.valueOf(".comment");
        if (str14.length() == 0) {
          break label297;
        }
      }
    }
    label269:
    label283:
    label297:
    for (String str15 = str13.concat(str14);; str15 = new String(str13))
    {
      localdwx.e = paramBundle.getString(str15);
      return;
      label242:
      str3 = new String(str1);
      break;
      label255:
      str6 = new String(str4);
      break label108;
      str9 = new String(str7);
      break label149;
      str12 = new String(str10);
      break label190;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    dwx localdwx = this.Z;
    String str1;
    String str3;
    String str4;
    String str6;
    label79:
    String str7;
    String str9;
    label120:
    String str10;
    String str12;
    label161:
    String str13;
    String str14;
    if (paramBundle != null)
    {
      str1 = String.valueOf("eventupdate");
      String str2 = String.valueOf(".timestamp");
      if (str2.length() == 0) {
        break label218;
      }
      str3 = str1.concat(str2);
      paramBundle.putLong(str3, localdwx.d);
      str4 = String.valueOf("eventupdate");
      String str5 = String.valueOf(".ownername");
      if (str5.length() == 0) {
        break label231;
      }
      str6 = str4.concat(str5);
      paramBundle.putString(str6, localdwx.a);
      str7 = String.valueOf("eventupdate");
      String str8 = String.valueOf(".gaiaid");
      if (str8.length() == 0) {
        break label245;
      }
      str9 = str7.concat(str8);
      paramBundle.putString(str9, localdwx.b);
      str10 = String.valueOf("eventupdate");
      String str11 = String.valueOf(".avatarurl");
      if (str11.length() == 0) {
        break label259;
      }
      str12 = str10.concat(str11);
      paramBundle.putString(str12, localdwx.c);
      str13 = String.valueOf("eventupdate");
      str14 = String.valueOf(".comment");
      if (str14.length() == 0) {
        break label273;
      }
    }
    label259:
    label273:
    for (String str15 = str13.concat(str14);; str15 = new String(str13))
    {
      paramBundle.putString(str15, localdwx.e);
      super.e(paramBundle);
      return;
      label218:
      str3 = new String(str1);
      break;
      label231:
      str6 = new String(str4);
      break label79;
      label245:
      str9 = new String(str7);
      break label120;
      str12 = new String(str10);
      break label161;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cae
 * JD-Core Version:    0.7.0.1
 */