import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import com.google.android.libraries.social.squares.listitem.SquareInvitationView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public final class lej
{
  public static final String[] a = { "square_id", "square_name", "photo_url", "post_visibility", "member_count", "membership_status", "unread_count", "inviter_gaia_id", "inviter_name", "inviter_photo_url", "invitation_dismissed", "is_member", "list_category", "suggestion_id", "restricted_domain", "joinability", "facepile" };
  final Context b;
  private final kxe c;
  
  public lej(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((kxe)mbb.a(paramContext, lgb.class));
  }
  
  public static void a(SquareInvitationView paramSquareInvitationView, Cursor paramCursor)
  {
    String str1 = paramCursor.getString(paramCursor.getColumnIndex("square_name"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndex("photo_url"));
    String str3 = paramCursor.getString(paramCursor.getColumnIndex("square_id"));
    String str4 = paramCursor.getString(paramCursor.getColumnIndex("inviter_name"));
    int i = paramCursor.getInt(paramCursor.getColumnIndex("post_visibility"));
    String str5 = paramCursor.getString(paramCursor.getColumnIndex("restricted_domain"));
    paramSquareInvitationView.g = str3;
    efj.a(paramSquareInvitationView, new kuw(pjo.t, paramSquareInvitationView.g));
    efj.a(paramSquareInvitationView.e, new kuw(pjo.a, paramSquareInvitationView.g));
    efj.a(paramSquareInvitationView.f, new gxq(pjo.S));
    gxn localgxn = new gxn(paramSquareInvitationView);
    paramSquareInvitationView.setOnClickListener(localgxn);
    paramSquareInvitationView.e.setOnClickListener(localgxn);
    paramSquareInvitationView.f.setOnClickListener(localgxn);
    int j;
    label241:
    int k;
    label255:
    String str6;
    label294:
    int m;
    label322:
    TextView localTextView3;
    if (!TextUtils.isEmpty(str2))
    {
      paramSquareInvitationView.d.a(ipf.a(paramSquareInvitationView.getContext(), str2, ipm.a));
      paramSquareInvitationView.b.setText(str1);
      paramSquareInvitationView.a();
      if (TextUtils.isEmpty(str4)) {
        break label399;
      }
      j = 1;
      TextView localTextView1 = paramSquareInvitationView.c;
      if (j == 0) {
        break label405;
      }
      k = 0;
      localTextView1.setVisibility(k);
      TextView localTextView2 = paramSquareInvitationView.c;
      if (j == 0) {
        break label411;
      }
      str6 = paramSquareInvitationView.getContext().getString(aaw.qp, new Object[] { str4 });
      localTextView2.setText(str6);
      paramSquareInvitationView.a();
      paramSquareInvitationView.i = i;
      if (TextUtils.isEmpty(str5)) {
        break label417;
      }
      m = 1;
      localTextView3 = paramSquareInvitationView.b;
      if (m == 0) {
        break label423;
      }
    }
    label399:
    label405:
    label411:
    label417:
    label423:
    for (int n = efj.XN;; n = 0)
    {
      efj.a(localTextView3, 0, 0, n, 0);
      String str7 = null;
      if (m != 0) {
        str7 = paramSquareInvitationView.getContext().getString(aaw.qo, new Object[] { str5 });
      }
      paramSquareInvitationView.h = str7;
      paramSquareInvitationView.a();
      return;
      paramSquareInvitationView.d.a(null);
      break;
      j = 0;
      break label241;
      k = 4;
      break label255;
      str6 = null;
      break label294;
      m = 0;
      break label322;
    }
  }
  
  public static Object[] a(Cursor paramCursor, int paramInt, String[] paramArrayOfString)
  {
    paramCursor.moveToPosition(paramInt);
    Object[] arrayOfObject = new Object[paramArrayOfString.length];
    Arrays.fill(arrayOfObject, null);
    int i = paramCursor.getColumnIndex("_id");
    if (i >= 0) {
      arrayOfObject[i] = paramCursor.getString(i);
    }
    int j = paramCursor.getColumnIndex("square_id");
    if (j >= 0) {
      arrayOfObject[j] = paramCursor.getString(j);
    }
    int k = paramCursor.getColumnIndex("square_name");
    if (k >= 0) {
      arrayOfObject[k] = paramCursor.getString(k);
    }
    int m = paramCursor.getColumnIndex("photo_url");
    if (m >= 0) {
      arrayOfObject[m] = paramCursor.getString(m);
    }
    int n = paramCursor.getColumnIndex("post_visibility");
    if (n >= 0) {
      arrayOfObject[n] = paramCursor.getString(n);
    }
    int i1 = paramCursor.getColumnIndex("member_count");
    if (i1 >= 0) {
      arrayOfObject[i1] = paramCursor.getString(i1);
    }
    int i2 = paramCursor.getColumnIndex("membership_status");
    if (i2 >= 0) {
      arrayOfObject[i2] = paramCursor.getString(i2);
    }
    int i3 = paramCursor.getColumnIndex("joinability");
    if (i3 >= 0) {
      arrayOfObject[i3] = paramCursor.getString(i3);
    }
    return arrayOfObject;
  }
  
  public final void a(int paramInt, SpaceListItemView paramSpaceListItemView, Cursor paramCursor, led paramled)
  {
    String str1 = paramCursor.getString(paramCursor.getColumnIndex("square_name"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndex("photo_url"));
    String str3 = paramCursor.getString(paramCursor.getColumnIndex("square_id"));
    int i = paramCursor.getColumnIndex("suggestion_id");
    String str4;
    int j;
    int m;
    int n;
    label142:
    String str5;
    label159:
    int i1;
    label185:
    String str6;
    int i5;
    label410:
    String str8;
    label429:
    String str9;
    label438:
    int i6;
    label465:
    String str10;
    label498:
    kxg localkxg;
    String str11;
    label544:
    int i8;
    label554:
    int i14;
    label575:
    String str12;
    String str13;
    label615:
    int i11;
    kuo localkuo;
    kuw localkuw;
    boolean bool;
    label843:
    gxr localgxr1;
    gxr localgxr2;
    if (i >= 0)
    {
      str4 = paramCursor.getString(i);
      j = paramCursor.getInt(paramCursor.getColumnIndex("member_count"));
      int k = paramCursor.getInt(paramCursor.getColumnIndex("membership_status"));
      m = paramCursor.getInt(paramCursor.getColumnIndex("unread_count"));
      if (paramCursor.getInt(paramCursor.getColumnIndex("post_visibility")) != 1) {
        break label970;
      }
      n = 1;
      if (n == 0) {
        break label976;
      }
      str5 = this.b.getString(aaw.qm);
      if ((n == 0) || (k == 2) || (k == 1) || (k == 3)) {
        break label982;
      }
      i1 = 1;
      str6 = NumberFormat.getIntegerInstance().format(j);
      String str7 = this.b.getResources().getQuantityString(aaw.qf, j, new Object[] { str6 });
      StringBuilder localStringBuilder1 = new StringBuilder();
      if (n != 0) {
        localStringBuilder1.append(str5);
      }
      if ((n != 0) && (i1 == 0)) {
        localStringBuilder1.append(" - ");
      }
      if (i1 == 0) {
        localStringBuilder1.append(str7);
      }
      paramSpaceListItemView.l = str3;
      paramSpaceListItemView.a(str1);
      paramSpaceListItemView.d(localStringBuilder1.toString());
      paramSpaceListItemView.b(str2);
      Resources localResources1 = this.b.getResources();
      int i2 = localResources1.getColor(da.al);
      paramSpaceListItemView.setBackgroundColor(localResources1.getColor(da.ak));
      int i3 = localResources1.getColor(da.aj);
      paramSpaceListItemView.a.setTextColor(i3);
      int i4 = localResources1.getColor(da.ai);
      paramSpaceListItemView.b.setTextColor(i4);
      paramSpaceListItemView.d.setTextColor(i2);
      paramSpaceListItemView.i.getBackground().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
      if (m <= 0) {
        break label988;
      }
      i5 = 1;
      if (m <= 99) {
        break label994;
      }
      str8 = this.b.getString(aaw.qu);
      if (i5 == 0) {
        break label1016;
      }
      str9 = str8;
      paramSpaceListItemView.i.setText(str9);
      TextView localTextView = paramSpaceListItemView.i;
      if (!TextUtils.isEmpty(str9)) {
        break label1022;
      }
      i6 = 8;
      localTextView.setVisibility(i6);
      if (i5 == 0) {
        break label1028;
      }
      str10 = localResources1.getQuantityString(aaw.qi, m, new Object[] { str8 });
      localkxg = efj.e(k, paramCursor.getInt(paramCursor.getColumnIndex("joinability")));
      int i7 = paramCursor.getColumnIndex("restricted_domain");
      if (i7 < 0) {
        break label1034;
      }
      str11 = paramCursor.getString(i7);
      if (paramInt != len.a) {
        break label1040;
      }
      i8 = 1;
      if (i1 == 0) {
        break label1054;
      }
      Context localContext2 = this.b;
      if (i8 == 0) {
        break label1046;
      }
      i14 = aaw.qv;
      str12 = localContext2.getString(i14, new Object[] { str1 });
      if (!TextUtils.isEmpty(str11)) {
        break label1109;
      }
      efj.a(paramSpaceListItemView.b, 0, 0, 0, 0);
      str13 = null;
      StringBuilder localStringBuilder2 = new StringBuilder();
      efj.a(localStringBuilder2, new CharSequence[] { str12, str13, str5, str10 });
      paramSpaceListItemView.k = localStringBuilder2;
      paramSpaceListItemView.b();
      paramSpaceListItemView.a(null);
      if (kyo.a(this.b, ((git)mbb.a(paramSpaceListItemView.getContext(), git.class)).c()))
      {
        int i13 = paramCursor.getColumnIndex("facepile");
        if (i13 >= 0)
        {
          byte[] arrayOfByte = paramCursor.getBlob(i13);
          if (arrayOfByte != null)
          {
            List localList = mab.d(arrayOfByte);
            if (localList.size() > 0) {
              paramSpaceListItemView.a((String[])localList.toArray(new String[localList.size()]));
            }
          }
        }
      }
      i11 = paramCursor.getInt(paramCursor.getColumnIndex("post_visibility"));
      int i12 = paramCursor.getPosition();
      gxt localgxt = pjo.D;
      Integer localInteger = Integer.valueOf(i12);
      localkuo = new kuo(localgxt, str4, localInteger);
      localkuw = new kuw(pjo.E, str3);
      if (TextUtils.isEmpty(str4)) {
        break label1150;
      }
      bool = true;
      localgxr1 = new gxr();
      localgxr1.b.add(localkuw);
      if (bool) {
        localgxr1.b.add(localkuo);
      }
      Context localContext1 = this.b;
      if (paramSpaceListItemView.getParent() != null) {
        break label1156;
      }
      localgxr2 = localgxr1.a(paramSpaceListItemView.getContext());
      label907:
      new gwz(-1, localgxr2).b(localContext1);
      if ((k != 1) && (k != 2)) {
        break label1173;
      }
      paramSpaceListItemView.c(null);
    }
    for (;;)
    {
      paramSpaceListItemView.setOnClickListener(new lel(this, localkuw, bool, localkuo, paramled, str3, str4));
      return;
      str4 = null;
      break;
      label970:
      n = 0;
      break label142;
      label976:
      str5 = null;
      break label159;
      label982:
      i1 = 0;
      break label185;
      label988:
      i5 = 0;
      break label410;
      label994:
      str8 = 11 + m;
      break label429;
      label1016:
      str9 = null;
      break label438;
      label1022:
      i6 = 0;
      break label465;
      label1028:
      str10 = null;
      break label498;
      label1034:
      str11 = null;
      break label544;
      label1040:
      i8 = 0;
      break label554;
      label1046:
      i14 = aaw.qw;
      break label575;
      label1054:
      Resources localResources2 = this.b.getResources();
      if (i8 != 0) {}
      for (int i9 = aaw.qg;; i9 = aaw.qh)
      {
        str12 = localResources2.getQuantityString(i9, j, new Object[] { str1, str6 });
        break;
      }
      label1109:
      int i10 = efj.XN;
      efj.a(paramSpaceListItemView.b, i10, 0, 0, 0);
      str13 = this.b.getString(aaw.qo, new Object[] { str11 });
      break label615;
      label1150:
      bool = false;
      break label843;
      label1156:
      localgxr2 = localgxr1.a((View)paramSpaceListItemView.getParent());
      break label907;
      label1173:
      paramSpaceListItemView.c(this.b.getString(this.c.a(localkxg)));
      paramSpaceListItemView.d.setOnClickListener(new lek(this, localkxg, str3, localkuw, bool, localkuo, paramled, i11));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lej
 * JD-Core Version:    0.7.0.1
 */