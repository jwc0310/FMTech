import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentInfo;
import android.print.PrintDocumentInfo.Builder;

final class jm
  extends PrintDocumentAdapter
{
  private PrintAttributes a;
  
  jm(jl paramjl, String paramString, Bitmap paramBitmap, int paramInt, jq paramjq) {}
  
  public final void onFinish() {}
  
  public final void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
  {
    int i = 1;
    this.a = paramPrintAttributes2;
    PrintDocumentInfo localPrintDocumentInfo = new PrintDocumentInfo.Builder(this.b).setContentType(i).setPageCount(i).build();
    if (!paramPrintAttributes2.equals(paramPrintAttributes1)) {}
    for (;;)
    {
      paramLayoutResultCallback.onLayoutFinished(localPrintDocumentInfo, i);
      return;
      int j = 0;
    }
  }
  
  /* Error */
  public final void onWrite(android.print.PageRange[] paramArrayOfPageRange, android.os.ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    // Byte code:
    //   0: new 70	android/print/pdf/PrintedPdfDocument
    //   3: dup
    //   4: aload_0
    //   5: getfield 20	jm:f	Ljl;
    //   8: getfield 75	jl:a	Landroid/content/Context;
    //   11: aload_0
    //   12: getfield 36	jm:a	Landroid/print/PrintAttributes;
    //   15: invokespecial 78	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //   18: astore 5
    //   20: aload_0
    //   21: getfield 20	jm:f	Ljl;
    //   24: aload_0
    //   25: getfield 24	jm:c	Landroid/graphics/Bitmap;
    //   28: aload_0
    //   29: getfield 36	jm:a	Landroid/print/PrintAttributes;
    //   32: invokevirtual 82	android/print/PrintAttributes:getColorMode	()I
    //   35: invokestatic 85	jl:a	(Ljl;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   38: astore 6
    //   40: aload 5
    //   42: iconst_1
    //   43: invokevirtual 89	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
    //   46: astore 9
    //   48: new 91	android/graphics/RectF
    //   51: dup
    //   52: aload 9
    //   54: invokevirtual 97	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //   57: invokevirtual 103	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
    //   60: invokespecial 106	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   63: astore 10
    //   65: aload_0
    //   66: getfield 20	jm:f	Ljl;
    //   69: aload 6
    //   71: invokevirtual 111	android/graphics/Bitmap:getWidth	()I
    //   74: aload 6
    //   76: invokevirtual 114	android/graphics/Bitmap:getHeight	()I
    //   79: aload 10
    //   81: aload_0
    //   82: getfield 26	jm:d	I
    //   85: invokestatic 117	jl:a	(Ljl;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
    //   88: astore 11
    //   90: aload 9
    //   92: invokevirtual 121	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
    //   95: aload 6
    //   97: aload 11
    //   99: aconst_null
    //   100: invokevirtual 127	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    //   103: aload 5
    //   105: aload 9
    //   107: invokevirtual 131	android/print/pdf/PrintedPdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
    //   110: aload 5
    //   112: new 133	java/io/FileOutputStream
    //   115: dup
    //   116: aload_2
    //   117: invokevirtual 139	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   120: invokespecial 142	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   123: invokevirtual 146	android/print/pdf/PrintedPdfDocument:writeTo	(Ljava/io/OutputStream;)V
    //   126: iconst_1
    //   127: anewarray 148	android/print/PageRange
    //   130: astore 15
    //   132: aload 15
    //   134: iconst_0
    //   135: getstatic 152	android/print/PageRange:ALL_PAGES	Landroid/print/PageRange;
    //   138: aastore
    //   139: aload 4
    //   141: aload 15
    //   143: invokevirtual 158	android/print/PrintDocumentAdapter$WriteResultCallback:onWriteFinished	([Landroid/print/PageRange;)V
    //   146: aload 5
    //   148: invokevirtual 161	android/print/pdf/PrintedPdfDocument:close	()V
    //   151: aload_2
    //   152: ifnull +7 -> 159
    //   155: aload_2
    //   156: invokevirtual 162	android/os/ParcelFileDescriptor:close	()V
    //   159: aload 6
    //   161: aload_0
    //   162: getfield 24	jm:c	Landroid/graphics/Bitmap;
    //   165: if_acmpeq +8 -> 173
    //   168: aload 6
    //   170: invokevirtual 165	android/graphics/Bitmap:recycle	()V
    //   173: return
    //   174: astore 12
    //   176: ldc 167
    //   178: ldc 169
    //   180: aload 12
    //   182: invokestatic 174	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   185: pop
    //   186: aload 4
    //   188: aconst_null
    //   189: invokevirtual 178	android/print/PrintDocumentAdapter$WriteResultCallback:onWriteFailed	(Ljava/lang/CharSequence;)V
    //   192: goto -46 -> 146
    //   195: astore 7
    //   197: aload 5
    //   199: invokevirtual 161	android/print/pdf/PrintedPdfDocument:close	()V
    //   202: aload_2
    //   203: ifnull +7 -> 210
    //   206: aload_2
    //   207: invokevirtual 162	android/os/ParcelFileDescriptor:close	()V
    //   210: aload 6
    //   212: aload_0
    //   213: getfield 24	jm:c	Landroid/graphics/Bitmap;
    //   216: if_acmpeq +8 -> 224
    //   219: aload 6
    //   221: invokevirtual 165	android/graphics/Bitmap:recycle	()V
    //   224: aload 7
    //   226: athrow
    //   227: astore 14
    //   229: goto -70 -> 159
    //   232: astore 8
    //   234: goto -24 -> 210
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	jm
    //   0	237	1	paramArrayOfPageRange	android.print.PageRange[]
    //   0	237	2	paramParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   0	237	3	paramCancellationSignal	CancellationSignal
    //   0	237	4	paramWriteResultCallback	android.print.PrintDocumentAdapter.WriteResultCallback
    //   18	180	5	localPrintedPdfDocument	android.print.pdf.PrintedPdfDocument
    //   38	182	6	localBitmap	Bitmap
    //   195	30	7	localObject	java.lang.Object
    //   232	1	8	localIOException1	java.io.IOException
    //   46	60	9	localPage	android.graphics.pdf.PdfDocument.Page
    //   63	17	10	localRectF	android.graphics.RectF
    //   88	10	11	localMatrix	android.graphics.Matrix
    //   174	7	12	localIOException2	java.io.IOException
    //   227	1	14	localIOException3	java.io.IOException
    //   130	12	15	arrayOfPageRange	android.print.PageRange[]
    // Exception table:
    //   from	to	target	type
    //   110	146	174	java/io/IOException
    //   40	110	195	finally
    //   110	146	195	finally
    //   176	192	195	finally
    //   155	159	227	java/io/IOException
    //   206	210	232	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jm
 * JD-Core Version:    0.7.0.1
 */