import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;
import java.util.ArrayList;

public final class isb
  extends ra
{
  public isb(MediaPickerFragment paramMediaPickerFragment, Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  private static int d(Cursor paramCursor)
  {
    long l = paramCursor.getLong(0);
    if (l == -101L) {
      return 0;
    }
    if (l == -102L) {
      return 2;
    }
    return 1;
  }
  
  @TargetApi(14)
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    switch (d(paramCursor))
    {
    case 1: 
    default: 
      irm localirm = new irm(paramContext);
      localirm.H = true;
      localirm.invalidate();
      localirm.s = 2;
      localirm.a(this.f.g().getDrawable(ehr.cL));
      localirm.r = efj.b(this.f.g());
      localirm.setContentDescription(this.f.g().getString(da.u));
      return localirm;
    case 2: 
      return localLayoutInflater.inflate(efj.PT, paramViewGroup, false);
    }
    return localLayoutInflater.inflate(efj.PU, paramViewGroup, false);
  }
  
  @TargetApi(18)
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i;
    int j;
    label90:
    Uri localUri1;
    label101:
    ipm localipm1;
    label145:
    irn localirn;
    irm localirm;
    String str2;
    ipm localipm2;
    int k;
    switch (d(paramCursor))
    {
    case 1: 
    default: 
      String str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("_id"));
      long l = 1000L * paramCursor.getLong(paramCursor.getColumnIndexOrThrow("date_added"));
      if (!this.f.a(1))
      {
        i = 1;
        if (i != 0) {
          break label370;
        }
        j = 1;
        if (j != 1) {
          break label390;
        }
        localUri1 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Uri localUri2 = Uri.withAppendedPath(localUri1, str1);
        switch (j)
        {
        case 2: 
        default: 
          localipm1 = ipm.a;
          localirn = new irn(paramContext, localUri2, localipm1);
          localirm = (irm)paramView;
          localirm.a(localirn.e());
          localirm.a(this.f.b.a.contains(localirn));
          localirm.setTag(localirn);
          if (l > 0L)
          {
            str2 = DateUtils.formatDateTime(paramContext, l, 20);
            localipm2 = localirn.e().e;
            if (localipm2 != ipm.b) {
              break label414;
            }
            k = da.z;
          }
          break;
        }
      }
      break;
    }
    for (;;)
    {
      String str3 = paramView.getResources().getString(k, new Object[] { str2 });
      localirm.setContentDescription(str3);
      localirn.a(str3);
      localirm.setOnClickListener(new isc(this, paramContext));
      localirm.setOnLongClickListener(new isd(this));
      for (;;)
      {
        paramView.setClickable(true);
        paramView.setFocusable(true);
        paramView.setBackgroundColor(paramContext.getResources().getColor(efj.PG));
        return;
        paramView.setOnClickListener(new ise(this));
        continue;
        paramView.setOnClickListener(new isf(this));
      }
      i = 0;
      break;
      label370:
      j = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("media_type"));
      break label90;
      label390:
      localUri1 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
      break label101;
      localipm1 = ipm.a;
      break label145;
      localipm1 = ipm.b;
      break label145;
      label414:
      if (localipm2 == ipm.d) {
        k = da.o;
      } else if (localipm2 == ipm.c) {
        k = da.t;
      } else {
        k = da.v;
      }
    }
  }
  
  /* Error */
  final boolean a(Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	isb:f	Lcom/google/android/libraries/social/mediapicker/MediaPickerFragment;
    //   4: getfield 38	com/google/android/libraries/social/mediapicker/MediaPickerFragment:bn	Lmbf;
    //   7: invokevirtual 348	mbf:getContentResolver	()Landroid/content/ContentResolver;
    //   10: aload_1
    //   11: invokevirtual 354	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   14: astore 8
    //   16: aload 8
    //   18: ifnull +8 -> 26
    //   21: aload 8
    //   23: invokevirtual 359	java/io/InputStream:close	()V
    //   26: iconst_1
    //   27: ireturn
    //   28: astore 9
    //   30: ldc 75
    //   32: ldc_w 361
    //   35: aload 9
    //   37: invokestatic 364	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   40: pop
    //   41: goto -15 -> 26
    //   44: astore 5
    //   46: iconst_0
    //   47: ifeq +7 -> 54
    //   50: aconst_null
    //   51: invokevirtual 359	java/io/InputStream:close	()V
    //   54: iconst_0
    //   55: ireturn
    //   56: astore 6
    //   58: ldc 75
    //   60: ldc_w 361
    //   63: aload 6
    //   65: invokestatic 364	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   68: pop
    //   69: goto -15 -> 54
    //   72: astore_2
    //   73: iconst_0
    //   74: ifeq +7 -> 81
    //   77: aconst_null
    //   78: invokevirtual 359	java/io/InputStream:close	()V
    //   81: aload_2
    //   82: athrow
    //   83: astore_3
    //   84: ldc 75
    //   86: ldc_w 361
    //   89: aload_3
    //   90: invokestatic 364	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   93: pop
    //   94: goto -13 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	isb
    //   0	97	1	paramUri	Uri
    //   72	10	2	localObject	Object
    //   83	7	3	localIOException1	java.io.IOException
    //   44	1	5	localFileNotFoundException	java.io.FileNotFoundException
    //   56	8	6	localIOException2	java.io.IOException
    //   14	8	8	localInputStream	java.io.InputStream
    //   28	8	9	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   21	26	28	java/io/IOException
    //   0	16	44	java/io/FileNotFoundException
    //   50	54	56	java/io/IOException
    //   0	16	72	finally
    //   77	81	83	java/io/IOException
  }
  
  public final int getItemViewType(int paramInt)
  {
    this.c.moveToPosition(paramInt);
    return d(this.c);
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isb
 * JD-Core Version:    0.7.0.1
 */