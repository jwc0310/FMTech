import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.social.collexions.impl.share.CreateCollexionView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.media.ui.RoundedMediaView;
import java.util.ArrayList;

final class hoy
  extends hqf
{
  private final LayoutInflater a;
  
  public hoy(hou paramhou, Context paramContext)
  {
    super(paramContext);
    this.a = LayoutInflater.from(paramContext);
    hqg localhqg1 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg8 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg8, 0, this.aO);
      this.aN = arrayOfhqg8;
    }
    hqg[] arrayOfhqg1 = this.aN;
    int i = this.aO;
    this.aO = (i + 1);
    arrayOfhqg1[i] = localhqg1;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg2 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg7 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg7, 0, this.aO);
      this.aN = arrayOfhqg7;
    }
    hqg[] arrayOfhqg2 = this.aN;
    int j = this.aO;
    this.aO = (j + 1);
    arrayOfhqg2[j] = localhqg2;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg3 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg6 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg6, 0, this.aO);
      this.aN = arrayOfhqg6;
    }
    hqg[] arrayOfhqg3 = this.aN;
    int k = this.aO;
    this.aO = (k + 1);
    arrayOfhqg3[k] = localhqg3;
    this.aP = false;
    notifyDataSetChanged();
    hqg localhqg4 = new hqg(false, false);
    if (this.aO >= this.aN.length)
    {
      hqg[] arrayOfhqg5 = new hqg[2 + this.aO];
      System.arraycopy(this.aN, 0, arrayOfhqg5, 0, this.aO);
      this.aN = arrayOfhqg5;
    }
    hqg[] arrayOfhqg4 = this.aN;
    int m = this.aO;
    this.aO = (m + 1);
    arrayOfhqg4[m] = localhqg4;
    this.aP = false;
    notifyDataSetChanged();
  }
  
  private static void a(View paramView, gnb paramgnb)
  {
    int i = 0;
    int j = paramgnb.c.length;
    if (j > 0)
    {
      localArrayList = new ArrayList(j);
      if (i < j)
      {
        localjgs = paramgnb.c[i];
        if ((localjgs.c == 9) || (localjgs.c == 8)) {
          efj.a(paramView, new gxq(pjn.p));
        }
      }
    }
    while (paramgnb.e.length <= 0)
    {
      ArrayList localArrayList;
      for (;;)
      {
        jgs localjgs;
        return;
        localArrayList.add(localjgs.a);
        i++;
      }
      efj.a(paramView, new kut(pjn.n, (String[])localArrayList.toArray(new String[localArrayList.size()])));
      return;
    }
    efj.a(paramView, new kuu(pjn.o, paramgnb.e[0].a));
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Illegal partition for fetching item view type.");
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 3;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Illegal partition for creating new view.");
    case 0: 
    case 1: 
      return this.a.inflate(aau.zG, paramViewGroup, false);
    case 2: 
      CreateCollexionView localCreateCollexionView = (CreateCollexionView)this.a.inflate(aau.zz, paramViewGroup, false);
      localCreateCollexionView.c = false;
      hou localhou2 = this.b;
      int j = ehr.bv;
      localCreateCollexionView.setContentDescription(localhou2.g().getString(j));
      hou.a(this.b, localCreateCollexionView);
      return localCreateCollexionView;
    }
    View localView = this.a.inflate(aau.zA, paramViewGroup, false);
    hou localhou1 = this.b;
    int i = ehr.bw;
    localView.setContentDescription(localhou1.g().getString(i));
    hou.a(this.b, localView);
    return localView;
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    boolean bool;
    RoundedMediaView localRoundedMediaView;
    ImageView localImageView2;
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Illegal partition to bind data with existing view.");
    case 0: 
      String str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_id"));
      String str4 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_name"));
      if (paramCursor.getInt(paramCursor.getColumnIndexOrThrow("sharing_target_group_type")) == 2)
      {
        bool = true;
        paramView.setTag(new hps(str3, str4, bool));
        if (TextUtils.equals(str3, this.b.c)) {
          this.b.a.setSelection(paramCursor.getPosition());
        }
        ((TextView)paramView.findViewById(efj.JM)).setText(paramCursor.getString(paramCursor.getColumnIndexOrThrow("cxn_name")));
        localRoundedMediaView = (RoundedMediaView)paramView.findViewById(efj.JP);
        localImageView2 = (ImageView)paramView.findViewById(efj.JL);
        int i1 = ehr.bp;
        Bitmap localBitmap = BitmapFactory.decodeResource(localRoundedMediaView.getContext().getResources(), i1);
        if (localBitmap == null) {
          localBitmap = (Bitmap)MediaView.j.b();
        }
        localRoundedMediaView.C = localBitmap;
        localRoundedMediaView.b(true);
        String str5 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("cover_photo_url"));
        if (str5 == null) {
          break label343;
        }
        localRoundedMediaView.a(ipf.a(this.b.bn, str5, ipm.a));
        localImageView2.setBackgroundColor(0);
        localRoundedMediaView.setVisibility(0);
        localImageView2.setVisibility(8);
        paramView.setOnClickListener(new gxn(this.b));
        efj.a(paramView, new kuu(pjn.o, str3));
      }
    case 2: 
    case 1: 
      label343:
      byte[] arrayOfByte;
      do
      {
        return;
        bool = false;
        break;
        localRoundedMediaView.a(null);
        int i2 = paramCursor.getColumnIndexOrThrow("color");
        if (paramCursor.isNull(i2)) {}
        for (int i3 = aw.aC;; i3 = paramCursor.getInt(i2))
        {
          ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
          localShapeDrawable.getPaint().setColor(i3);
          localImageView2.setBackgroundDrawable(localShapeDrawable);
          localRoundedMediaView.setVisibility(8);
          localImageView2.setVisibility(0);
          break;
        }
        arrayOfByte = paramCursor.getBlob(0);
      } while (arrayOfByte == null);
      gnb localgnb = gnl.a(arrayOfByte);
      String str1 = localgnb.a(this.b.bn);
      paramView.setTag(localgnb);
      a(paramView, localgnb);
      ((TextView)paramView.findViewById(efj.JM)).setText(str1);
      ImageView localImageView1 = (ImageView)paramView.findViewById(efj.JL);
      String str2 = "";
      int i = localgnb.c.length;
      int j = 0;
      jgs localjgs;
      if (i > 0)
      {
        localjgs = localgnb.c[0];
        if (localjgs.c != 9) {
          break label671;
        }
        j = ehr.br;
      }
      for (;;)
      {
        if ((j == 0) && (localgnb.e.length > 0))
        {
          j = ehr.bp;
          hou localhou2 = this.b;
          int m = ehr.bO;
          str2 = localhou2.g().getString(m);
        }
        hou localhou1 = this.b;
        int k = ehr.bL;
        Object[] arrayOfObject = { str2, str1 };
        paramView.setContentDescription(localhou1.g().getString(k, arrayOfObject));
        localImageView1.setImageResource(j);
        localImageView1.setVisibility(0);
        paramView.setOnClickListener(new gxn(this.b));
        return;
        label671:
        if (localjgs.c == 8)
        {
          j = ehr.bo;
        }
        else if (localjgs.c == 7)
        {
          j = ehr.bm;
        }
        else
        {
          j = ehr.bn;
          hou localhou3 = this.b;
          int n = ehr.bN;
          str2 = localhou3.g().getString(n);
        }
      }
    }
    efj.a(paramView, new kuu(pjn.l, this.b.b));
    paramView.setOnClickListener(new gxn(this.b));
  }
  
  public final int getViewTypeCount()
  {
    return 4;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hoy
 * JD-Core Version:    0.7.0.1
 */