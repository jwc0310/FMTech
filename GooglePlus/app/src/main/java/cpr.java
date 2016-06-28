import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.plus.views.AlbumColumnGridItemView;

final class cpr
  extends hqi
{
  private final LayoutInflater f;
  
  public cpr(Context paramContext)
  {
    super(paramContext, null);
    this.f = LayoutInflater.from(paramContext);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.f.inflate(efj.wG, null);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    AlbumColumnGridItemView localAlbumColumnGridItemView = (AlbumColumnGridItemView)paramView.findViewById(aaw.lD);
    TextView localTextView1 = (TextView)paramView.findViewById(aaw.kt);
    TextView localTextView2 = (TextView)paramView.findViewById(aaw.ct);
    TextView localTextView3 = (TextView)paramView.findViewById(aaw.cj);
    TextView localTextView4 = (TextView)paramView.findViewById(aaw.hU);
    View localView = paramView.findViewById(aaw.jJ);
    long l1 = paramCursor.getLong(0);
    long l2 = paramCursor.getLong(1);
    int i = paramCursor.getInt(3);
    String str1 = paramCursor.getString(2);
    int j = paramCursor.getInt(4);
    int k = paramCursor.getInt(5);
    int m = paramCursor.getInt(6);
    long l3 = paramCursor.getLong(7);
    long l4 = paramCursor.getLong(8);
    long l5 = paramCursor.getLong(9);
    int n;
    int i1;
    label195:
    label242:
    int i14;
    int i3;
    label311:
    String str2;
    label388:
    String str3;
    label460:
    String str4;
    label672:
    int i4;
    label689:
    int i5;
    label700:
    int i6;
    label713:
    int i7;
    label733:
    int i13;
    label781:
    int i8;
    label812:
    int i9;
    label834:
    int i10;
    if (hcx.a(this.d.getContentResolver(), Uri.parse(str1)) > 0L)
    {
      n = 1;
      if (m == 0) {
        break label889;
      }
      i1 = m;
      paramView.setTag(aaw.ld, str1);
      paramView.setTag(aaw.lb, Long.valueOf(l2));
      paramView.setTag(aaw.lq, Integer.valueOf(i1));
      if (i != -1) {
        break label896;
      }
      paramView.setTag(aaw.li, null);
      if (n == 0) {
        break label946;
      }
      i14 = aau.jR;
      localAlbumColumnGridItemView.a(ipf.a(paramContext, Uri.parse(str1), ipm.a));
      localAlbumColumnGridItemView.setTag(aaw.ld, str1);
      localAlbumColumnGridItemView.setOnClickListener(new cps(this));
      if (j != 300) {
        break label911;
      }
      localAlbumColumnGridItemView.setBackgroundColor(-65536);
      i3 = i14;
      Context localContext1 = this.d;
      Object[] arrayOfObject1 = new Object[2];
      switch (j)
      {
      default: 
        str2 = this.d.getString(aau.jX);
        arrayOfObject1[0] = str2;
        switch (m)
        {
        default: 
          str3 = this.d.getString(aau.jP);
          arrayOfObject1[1] = str3;
          localTextView1.setText(localContext1.getString(i3, arrayOfObject1).toUpperCase());
          switch (k)
          {
          case 2: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          case 17: 
          case 18: 
          case 19: 
          case 24: 
          case 25: 
          case 26: 
          case 27: 
          case 28: 
          case 29: 
          default: 
            str4 = this.d.getString(aau.ku);
            localTextView2.setText(str4);
            if (j == 100)
            {
              i4 = 1;
              if (j != 200) {
                break label1498;
              }
              i5 = 1;
              if ((i4 == 0) && (i5 == 0)) {
                break label1504;
              }
              i6 = 1;
              if ((n == 0) || (i6 == 0) || (l5 == 0L)) {
                break label1510;
              }
              i7 = 1;
              if (i7 != 0)
              {
                Context localContext2 = this.d;
                int i12 = aau.jK;
                Object[] arrayOfObject2 = new Object[2];
                arrayOfObject2[0] = Long.valueOf(l5);
                if ((l5 != 0L) && (l4 != 0L)) {
                  break label1516;
                }
                i13 = 0;
                arrayOfObject2[1] = Integer.valueOf(i13);
                localTextView4.setText(localContext2.getString(i12, arrayOfObject2));
              }
              if (i7 == 0) {
                break label1542;
              }
              i8 = 0;
              localTextView4.setVisibility(i8);
              if ((n == 0) || (l3 <= 0L)) {
                break label1549;
              }
              i9 = 1;
              if (i9 != 0) {
                localTextView3.setText(DateFormat.format("MMM dd, yyyy h:mmaa", l3));
              }
              if (i9 == 0) {
                break label1555;
              }
              i10 = 0;
              label859:
              localTextView3.setVisibility(i10);
              if (n == 0) {
                break label1562;
              }
            }
            break;
          }
          break;
        }
        break;
      }
    }
    label896:
    label911:
    label1555:
    label1562:
    for (int i11 = 8;; i11 = 0)
    {
      localView.setVisibility(i11);
      return;
      n = 0;
      break;
      label889:
      i1 = 10;
      break label195;
      paramView.setTag(aaw.li, Long.valueOf(l1));
      break label242;
      if (j == 400)
      {
        localAlbumColumnGridItemView.setBackgroundColor(-16711936);
        i3 = i14;
        break label311;
      }
      localAlbumColumnGridItemView.setBackgroundDrawable(null);
      i3 = i14;
      break label311;
      label946:
      int i2 = aau.jW;
      localAlbumColumnGridItemView.a(null);
      localAlbumColumnGridItemView.setOnClickListener(null);
      localAlbumColumnGridItemView.setBackgroundDrawable(null);
      i3 = i2;
      break label311;
      if (k == 1)
      {
        str2 = this.d.getString(aau.jZ);
        break label388;
      }
      str2 = this.d.getString(aau.jU);
      break label388;
      str2 = this.d.getString(aau.jV);
      break label388;
      str2 = this.d.getString(aau.jS);
      break label388;
      str2 = this.d.getString(aau.jY);
      break label388;
      str2 = this.d.getString(aau.jT);
      break label388;
      str3 = this.d.getString(aau.jL);
      break label460;
      str3 = this.d.getString(aau.jM);
      break label460;
      str3 = this.d.getString(aau.jN);
      break label460;
      str3 = this.d.getString(aau.jO);
      break label460;
      str3 = this.d.getString(aau.jQ);
      break label460;
      str4 = this.d.getString(aau.kr);
      break label672;
      str4 = this.d.getString(aau.kh);
      break label672;
      str4 = this.d.getString(aau.kq);
      break label672;
      str4 = this.d.getString(aau.ks);
      break label672;
      str4 = this.d.getString(aau.kn);
      break label672;
      str4 = this.d.getString(aau.kv);
      break label672;
      str4 = this.d.getString(aau.kc);
      break label672;
      str4 = this.d.getString(aau.ka);
      break label672;
      str4 = this.d.getString(aau.kx);
      break label672;
      str4 = this.d.getString(aau.kw);
      break label672;
      str4 = this.d.getString(aau.kp);
      break label672;
      str4 = this.d.getString(aau.km);
      break label672;
      str4 = this.d.getString(aau.kk);
      break label672;
      str4 = this.d.getString(aau.ko);
      break label672;
      str4 = this.d.getString(aau.kf);
      break label672;
      str4 = this.d.getString(aau.ke);
      break label672;
      str4 = this.d.getString(aau.ki);
      break label672;
      str4 = this.d.getString(aau.kd);
      break label672;
      str4 = this.d.getString(aau.kl);
      break label672;
      str4 = this.d.getString(aau.kj);
      break label672;
      str4 = this.d.getString(aau.kg);
      break label672;
      str4 = this.d.getString(aau.kt);
      break label672;
      str4 = this.d.getString(aau.kb);
      break label672;
      i4 = 0;
      break label689;
      label1498:
      i5 = 0;
      break label700;
      label1504:
      i6 = 0;
      break label713;
      label1510:
      i7 = 0;
      break label733;
      label1516:
      i13 = Math.min((int)Math.round(100.0D * ((float)l4 / (float)l5)), 100);
      break label781;
      i8 = 8;
      break label812;
      i9 = 0;
      break label834;
      i10 = 8;
      break label859;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpr
 * JD-Core Version:    0.7.0.1
 */