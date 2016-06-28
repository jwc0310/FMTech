import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentInfo;
import android.print.PrintDocumentInfo.Builder;

final class jn
  extends PrintDocumentAdapter
{
  AsyncTask<Uri, Boolean, Bitmap> a;
  Bitmap b = null;
  private PrintAttributes f;
  
  jn(jl paramjl, String paramString, Uri paramUri, jq paramjq, int paramInt) {}
  
  final void a()
  {
    synchronized (this.e.c)
    {
      if (this.e.b != null)
      {
        this.e.b.requestCancelDecode();
        this.e.b = null;
      }
      return;
    }
  }
  
  public final void onFinish()
  {
    super.onFinish();
    a();
    if (this.a != null) {
      this.a.cancel(true);
    }
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
  }
  
  public final void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
  {
    int i = 1;
    this.f = paramPrintAttributes2;
    if (paramCancellationSignal.isCanceled())
    {
      paramLayoutResultCallback.onLayoutCancelled();
      return;
    }
    if (this.b != null)
    {
      PrintDocumentInfo localPrintDocumentInfo = new PrintDocumentInfo.Builder(this.c).setContentType(i).setPageCount(i).build();
      if (!paramPrintAttributes2.equals(paramPrintAttributes1)) {}
      for (;;)
      {
        paramLayoutResultCallback.onLayoutFinished(localPrintDocumentInfo, i);
        return;
        int j = 0;
      }
    }
    this.a = new jo(this, paramCancellationSignal, paramPrintAttributes2, paramPrintAttributes1, paramLayoutResultCallback).execute(new Uri[0]);
  }
  
  /* Error */
  public final void onWrite(android.print.PageRange[] paramArrayOfPageRange, android.os.ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    // Byte code:
    //   0: new 127	android/print/pdf/PrintedPdfDocument
    //   3: dup
    //   4: aload_0
    //   5: getfield 25	jn:e	Ljl;
    //   8: getfield 130	jl:a	Landroid/content/Context;
    //   11: aload_0
    //   12: getfield 73	jn:f	Landroid/print/PrintAttributes;
    //   15: invokespecial 133	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //   18: astore 5
    //   20: aload_0
    //   21: getfield 25	jn:e	Ljl;
    //   24: aload_0
    //   25: getfield 38	jn:b	Landroid/graphics/Bitmap;
    //   28: aload_0
    //   29: getfield 73	jn:f	Landroid/print/PrintAttributes;
    //   32: invokevirtual 137	android/print/PrintAttributes:getColorMode	()I
    //   35: invokestatic 140	jl:a	(Ljl;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   38: astore 6
    //   40: aload 5
    //   42: iconst_1
    //   43: invokevirtual 144	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
    //   46: astore 9
    //   48: new 146	android/graphics/RectF
    //   51: dup
    //   52: aload 9
    //   54: invokevirtual 152	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //   57: invokevirtual 158	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
    //   60: invokespecial 161	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   63: astore 10
    //   65: aload_0
    //   66: getfield 25	jn:e	Ljl;
    //   69: aload_0
    //   70: getfield 38	jn:b	Landroid/graphics/Bitmap;
    //   73: invokevirtual 164	android/graphics/Bitmap:getWidth	()I
    //   76: aload_0
    //   77: getfield 38	jn:b	Landroid/graphics/Bitmap;
    //   80: invokevirtual 167	android/graphics/Bitmap:getHeight	()I
    //   83: aload 10
    //   85: aload_0
    //   86: getfield 33	jn:h	I
    //   89: invokestatic 170	jl:a	(Ljl;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
    //   92: astore 11
    //   94: aload 9
    //   96: invokevirtual 174	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
    //   99: aload 6
    //   101: aload 11
    //   103: aconst_null
    //   104: invokevirtual 180	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    //   107: aload 5
    //   109: aload 9
    //   111: invokevirtual 184	android/print/pdf/PrintedPdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
    //   114: aload 5
    //   116: new 186	java/io/FileOutputStream
    //   119: dup
    //   120: aload_2
    //   121: invokevirtual 192	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   124: invokespecial 195	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   127: invokevirtual 199	android/print/pdf/PrintedPdfDocument:writeTo	(Ljava/io/OutputStream;)V
    //   130: iconst_1
    //   131: anewarray 201	android/print/PageRange
    //   134: astore 15
    //   136: aload 15
    //   138: iconst_0
    //   139: getstatic 205	android/print/PageRange:ALL_PAGES	Landroid/print/PageRange;
    //   142: aastore
    //   143: aload 4
    //   145: aload 15
    //   147: invokevirtual 211	android/print/PrintDocumentAdapter$WriteResultCallback:onWriteFinished	([Landroid/print/PageRange;)V
    //   150: aload 5
    //   152: invokevirtual 214	android/print/pdf/PrintedPdfDocument:close	()V
    //   155: aload_2
    //   156: ifnull +7 -> 163
    //   159: aload_2
    //   160: invokevirtual 215	android/os/ParcelFileDescriptor:close	()V
    //   163: aload 6
    //   165: aload_0
    //   166: getfield 38	jn:b	Landroid/graphics/Bitmap;
    //   169: if_acmpeq +8 -> 177
    //   172: aload 6
    //   174: invokevirtual 69	android/graphics/Bitmap:recycle	()V
    //   177: return
    //   178: astore 12
    //   180: ldc 217
    //   182: ldc 219
    //   184: aload 12
    //   186: invokestatic 224	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   189: pop
    //   190: aload 4
    //   192: aconst_null
    //   193: invokevirtual 228	android/print/PrintDocumentAdapter$WriteResultCallback:onWriteFailed	(Ljava/lang/CharSequence;)V
    //   196: goto -46 -> 150
    //   199: astore 7
    //   201: aload 5
    //   203: invokevirtual 214	android/print/pdf/PrintedPdfDocument:close	()V
    //   206: aload_2
    //   207: ifnull +7 -> 214
    //   210: aload_2
    //   211: invokevirtual 215	android/os/ParcelFileDescriptor:close	()V
    //   214: aload 6
    //   216: aload_0
    //   217: getfield 38	jn:b	Landroid/graphics/Bitmap;
    //   220: if_acmpeq +8 -> 228
    //   223: aload 6
    //   225: invokevirtual 69	android/graphics/Bitmap:recycle	()V
    //   228: aload 7
    //   230: athrow
    //   231: astore 14
    //   233: goto -70 -> 163
    //   236: astore 8
    //   238: goto -24 -> 214
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	241	0	this	jn
    //   0	241	1	paramArrayOfPageRange	android.print.PageRange[]
    //   0	241	2	paramParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   0	241	3	paramCancellationSignal	CancellationSignal
    //   0	241	4	paramWriteResultCallback	android.print.PrintDocumentAdapter.WriteResultCallback
    //   18	184	5	localPrintedPdfDocument	android.print.pdf.PrintedPdfDocument
    //   38	186	6	localBitmap	Bitmap
    //   199	30	7	localObject	Object
    //   236	1	8	localIOException1	java.io.IOException
    //   46	64	9	localPage	android.graphics.pdf.PdfDocument.Page
    //   63	21	10	localRectF	android.graphics.RectF
    //   92	10	11	localMatrix	android.graphics.Matrix
    //   178	7	12	localIOException2	java.io.IOException
    //   231	1	14	localIOException3	java.io.IOException
    //   134	12	15	arrayOfPageRange	android.print.PageRange[]
    // Exception table:
    //   from	to	target	type
    //   114	150	178	java/io/IOException
    //   40	114	199	finally
    //   114	150	199	finally
    //   180	196	199	finally
    //   159	163	231	java/io/IOException
    //   210	214	236	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jn
 * JD-Core Version:    0.7.0.1
 */