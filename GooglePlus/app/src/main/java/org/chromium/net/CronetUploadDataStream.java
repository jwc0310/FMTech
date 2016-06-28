package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import rif;
import rig;
import rih;

@JNINamespace
public final class CronetUploadDataStream
  implements UploadDataSink
{
  public final UploadDataProvider a;
  public ByteBuffer b = null;
  public final Object c = new Object();
  public long d = 0L;
  public boolean e = false;
  public boolean f = false;
  private final Executor g;
  private final long h;
  private CronetUrlRequest i;
  private final Runnable j = new rif(this);
  private boolean k = false;
  
  public CronetUploadDataStream(UploadDataProvider paramUploadDataProvider, Executor paramExecutor)
  {
    this.g = paramExecutor;
    this.a = paramUploadDataProvider;
    this.h = this.a.a();
  }
  
  private final void a(Runnable paramRunnable)
  {
    try
    {
      this.g.execute(paramRunnable);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      this.i.a(localRejectedExecutionException);
    }
  }
  
  private final void b()
  {
    synchronized (this.c)
    {
      if (this.e)
      {
        this.k = true;
        return;
      }
      if (this.d == 0L) {
        return;
      }
    }
    nativeDestroyAdapter(this.d);
    this.d = 0L;
  }
  
  private final void c()
  {
    synchronized (this.c)
    {
      if (this.e) {
        throw new IllegalStateException("Method should not be called when read has not completed.");
      }
    }
    if (this.k) {
      b();
    }
  }
  
  private final native long nativeAttachUploadDataToRequest(long paramLong1, long paramLong2);
  
  private final native long nativeCreateAdapterForTesting();
  
  private final native long nativeCreateUploadDataStreamForTesting(long paramLong1, long paramLong2);
  
  private static native void nativeDestroyAdapter(long paramLong);
  
  @NativeClassQualifiedName
  private final native void nativeOnReadSucceeded(long paramLong, int paramInt, boolean paramBoolean);
  
  @NativeClassQualifiedName
  private final native void nativeOnRewindSucceeded(long paramLong);
  
  public final void a()
  {
    synchronized (this.c)
    {
      if (!this.f) {
        throw new IllegalStateException("Non-existent rewind succeeded.");
      }
    }
    this.f = false;
    if (this.d == 0L) {
      return;
    }
    nativeOnRewindSucceeded(this.d);
  }
  
  final void a(CronetUrlRequest paramCronetUrlRequest, long paramLong)
  {
    this.i = paramCronetUrlRequest;
    this.d = nativeAttachUploadDataToRequest(paramLong, this.h);
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (!this.e) {
        throw new IllegalStateException("Non-existent read succeeded.");
      }
    }
    int m = this.b.position();
    this.b = null;
    this.e = false;
    c();
    if (this.d == 0L) {
      return;
    }
    nativeOnReadSucceeded(this.d, m, false);
  }
  
  @CalledByNative
  final void onUploadDataStreamDestroyed()
  {
    a(new rih(this));
  }
  
  @CalledByNative
  final void readData(ByteBuffer paramByteBuffer)
  {
    this.b = paramByteBuffer;
    a(this.j);
  }
  
  @CalledByNative
  final void rewind()
  {
    a(new rig(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.CronetUploadDataStream
 * JD-Core Version:    0.7.0.1
 */