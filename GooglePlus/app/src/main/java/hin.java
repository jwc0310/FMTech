import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.Button;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.spaces.SpaceListItemView;

public final class hin
  implements hha
{
  private final Context a;
  
  public hin(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt1, SpaceListItemView paramSpaceListItemView, Cursor paramCursor, int paramInt2, hgz paramhgz)
  {
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(paramInt2);
    String str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_name"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_display_name"));
    int i = paramCursor.getColumnIndexOrThrow("color");
    int j;
    boolean bool;
    int k;
    Integer localInteger;
    label152:
    String str5;
    Resources localResources2;
    String str8;
    label347:
    label353:
    String str6;
    label379:
    gxe localgxe;
    if (!paramCursor.isNull(i))
    {
      j = paramCursor.getInt(i);
      String str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cover_photo_url"));
      bool = localgjb.b("gaia_id").equals(paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_gaia_id")));
      k = paramCursor.getColumnIndexOrThrow("follow_state");
      if (!paramCursor.isNull(k)) {
        break label562;
      }
      localInteger = null;
      paramSpaceListItemView.a(str1);
      paramSpaceListItemView.setBackgroundColor(j);
      paramSpaceListItemView.b(str3);
      int m = aau.zn;
      MediaView localMediaView = paramSpaceListItemView.c;
      Bitmap localBitmap = BitmapFactory.decodeResource(localMediaView.getContext().getResources(), m);
      if (localBitmap == null) {
        localBitmap = (Bitmap)MediaView.j.b();
      }
      localMediaView.C = localBitmap;
      paramSpaceListItemView.c.b(true);
      String str4 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("owner_photo_url"));
      if (!TextUtils.isEmpty(str4)) {
        paramSpaceListItemView.a(new String[] { str4 });
      }
      str5 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_id"));
      if (!bool) {
        break label631;
      }
      int i2 = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("visibility_type"));
      localResources2 = this.a.getResources();
      switch (i2)
      {
      default: 
        str8 = null;
        paramSpaceListItemView.d(str8);
        int n = paramCursor.getColumnIndex("suggestion_id");
        if (n != -1)
        {
          str6 = paramCursor.getString(n);
          localgxe = (gxe)mbb.a(paramSpaceListItemView.getContext(), gxe.class);
          if (TextUtils.isEmpty(str6)) {
            break label646;
          }
          efj.a(paramSpaceListItemView, new kuo(pjn.R, str6));
        }
        break;
      }
    }
    for (;;)
    {
      localgxe.a(paramSpaceListItemView);
      if (paramhgz != null) {
        paramSpaceListItemView.setOnClickListener(new gxn(new hio(this, paramhgz, str5, str1)));
      }
      if ((!bool) && (localInteger != null) && (localInteger.intValue() != 0)) {
        break label666;
      }
      paramSpaceListItemView.c(null);
      gxn localgxn = new gxn(new hip(this, str5, localInteger, paramhgz));
      paramSpaceListItemView.d.setOnClickListener(localgxn);
      if (paramInt1 != hhb.a)
      {
        paramSpaceListItemView.k = this.a.getString(aaw.on, new Object[] { str1 });
        paramSpaceListItemView.b();
      }
      return;
      j = this.a.getResources().getColor(eyg.Q);
      break;
      label562:
      localInteger = Integer.valueOf(paramCursor.getInt(k));
      break label152;
      str8 = localgjb.b("domain_name");
      break label347;
      str8 = localResources2.getString(aaw.oC);
      break label347;
      str8 = localResources2.getString(aaw.oB);
      break label347;
      str8 = localResources2.getString(aaw.oA);
      break label347;
      label631:
      paramSpaceListItemView.d(str2);
      break label353;
      str6 = null;
      break label379;
      label646:
      efj.a(paramSpaceListItemView, new kuu(pjn.c, str5));
    }
    label666:
    int i1;
    label687:
    Resources localResources1;
    String str7;
    if ((localInteger.intValue() == 4) || (localInteger.intValue() == 5))
    {
      i1 = 1;
      localResources1 = this.a.getResources();
      if (i1 == 0) {
        break label757;
      }
      str7 = localResources1.getString(aaw.om);
      label711:
      paramSpaceListItemView.c(str7);
      if (i1 == 0) {
        break label770;
      }
    }
    label770:
    for (gxt localgxt = pjn.ad;; localgxt = pjn.F)
    {
      gxq localgxq = new gxq(localgxt);
      efj.a(paramSpaceListItemView.d, localgxq);
      break;
      i1 = 0;
      break label687;
      label757:
      str7 = localResources1.getString(aaw.ok);
      break label711;
    }
  }
  
  public final void a(SpaceListItemView paramSpaceListItemView, Cursor paramCursor, int paramInt, hgz paramhgz)
  {
    a(hhb.a, paramSpaceListItemView, paramCursor, paramInt, paramhgz);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hin
 * JD-Core Version:    0.7.0.1
 */