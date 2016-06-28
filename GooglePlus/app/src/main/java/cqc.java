import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.audiofx.Virtualizer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class cqc
  extends bzo
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, View.OnClickListener
{
  VideoView Z;
  Uri a;
  boolean aa;
  boolean ab;
  Runnable ac = new cqd(this);
  private Intent ad;
  private String ae;
  private int af = 0;
  private int ag;
  private boolean ah;
  private boolean ai;
  private Virtualizer aj;
  private maj ak;
  private boolean al;
  private kpb am;
  Uri b;
  boolean c;
  MediaController d;
  
  private final void y()
  {
    String str = this.a.getScheme();
    if (("https".equalsIgnoreCase(str)) || ("http".equalsIgnoreCase(str)) || ("rtsp".equalsIgnoreCase(str)))
    {
      this.aa = true;
      return;
    }
    this.aa = false;
  }
  
  protected final boolean A()
  {
    if ((this.af == 2) || (this.af == 3)) {}
    for (int i = 1;; i = 0)
    {
      boolean bool1;
      if ((i != 0) && (!this.ab))
      {
        boolean bool2 = this.aa;
        bool1 = false;
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.wI);
    this.d = new cqf(this, f());
    View localView2 = localView1.findViewById(aaw.mk);
    localView2.setOnClickListener(this);
    this.d.setAnchorView(localView2);
    this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.Z = ((VideoView)localView1.findViewById(aaw.ml));
    this.Z.setMediaController(this.d);
    this.Z.setOnPreparedListener(this);
    this.Z.setOnCompletionListener(this);
    this.Z.setOnErrorListener(this);
    v();
    if ((paramBundle != null) && (this.a != null))
    {
      this.Z.start();
      this.Z.suspend();
      this.ah = true;
    }
    a(localView1, aau.lN);
    int j;
    if (this.ad.getBooleanExtra("virtualize", false))
    {
      if (Build.VERSION.SDK_INT < 18) {
        break label259;
      }
      j = 1;
      if (j != 0)
      {
        int k = this.Z.getAudioSessionId();
        if (k != 0)
        {
          this.aj = new Virtualizer(0, k);
          this.aj.setEnabled(true);
        }
      }
    }
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        localView1.setOnSystemUiVisibilityChangeListener(new cqe(this));
      }
      return localView1;
      label259:
      j = 0;
      break;
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ad = paramActivity.getIntent();
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ojy[] arrayOfojy;
    label145:
    int m;
    label265:
    int n;
    label399:
    label413:
    int i2;
    int i3;
    label429:
    int i5;
    int i6;
    int i7;
    if (paramBundle == null) {
      if (this.ad.hasExtra("video_data")) {
        for (;;)
        {
          try
          {
            byte[] arrayOfByte = this.ad.getByteArrayExtra("video_data");
            ojx localojx = (ojx)qat.b(new ojx(), arrayOfByte, 0, arrayOfByte.length);
            arrayOfojy = localojx.c;
            if ((arrayOfojy != null) && (arrayOfojy.length != 0)) {
              continue;
            }
            this.af = localojx.b;
            if (Log.isLoggable("VideoViewFragment", 4))
            {
              String str1 = String.valueOf(this.a);
              int j = this.af;
              new StringBuilder(39 + String.valueOf(str1).length()).append("Video stream uri: ").append(str1).append(", status: ").append(j);
            }
          }
          catch (qas localqas)
          {
            int i;
            int k;
            String str2;
            Log.e("VideoViewFragment", "Unable to parse Video from byte array.", localqas);
            continue;
            localFile = iph.a(f(), localojy1.c);
            if (localFile == null) {
              break label816;
            }
          }
          this.ai = this.ad.getBooleanExtra("android.intent.extra.finishOnCompletion", true);
          i = ((git)mbb.a(this.bn, git.class)).c();
          if (((giz)mbb.a(this.bn, giz.class)).c(i)) {
            this.al = ((hyi)mbb.a(this.bn, hyi.class)).b(bwb.I, i);
          }
          if (this.al) {
            this.am = ((kpb)mbb.a(this.bn, kpb.class));
          }
          return;
          this.ae = null;
          k = arrayOfojy.length;
          m = 0;
          if (m < k)
          {
            ojy localojy1 = arrayOfojy[m];
            if (TextUtils.isEmpty(localojy1.c)) {
              break label816;
            }
            Uri localUri = Uri.parse(localojy1.c);
            str2 = localUri.getScheme();
            if (("content".equals(str2)) || ("file".equals(str2)))
            {
              this.a = localUri;
              continue;
            }
            File localFile;
            this.ae = localFile.getPath();
            this.a = localUri;
            if (iph.a(this.ae)) {
              break label810;
            }
            n = 1;
            if (localojy1.b.intValue() <= 640) {
              break label814;
            }
            if (n == 0)
            {
              int i1 = arrayOfojy.length;
              i2 = 0;
              i3 = 0;
              if (i2 < i1)
              {
                ojy localojy2 = arrayOfojy[i2];
                int i4 = localojy2.a.intValue();
                if ((!mar.a.get(i4)) || (TextUtils.isEmpty(localojy2.c))) {
                  break;
                }
                i5 = localojy2.b.intValue();
                if ((i5 > 640) || (i5 <= i3)) {
                  break;
                }
                this.b = Uri.parse(localojy2.c);
                break label800;
              }
            }
            if (this.ae != null) {
              continue;
            }
            i6 = arrayOfojy.length;
            i7 = 0;
          }
        }
      }
    }
    int i10;
    for (int i8 = 0;; i8 = i10)
    {
      if (i7 < i6)
      {
        ojy localojy3 = arrayOfojy[i7];
        int i9 = localojy3.a.intValue();
        if ((mar.a.get(i9)) && (!TextUtils.isEmpty(localojy3.c)))
        {
          i10 = localojy3.b.intValue();
          if ((i10 > 640) && (i10 > i8))
          {
            this.a = Uri.parse(localojy3.c);
            break label822;
          }
        }
      }
      else
      {
        if (this.a == null)
        {
          this.a = this.b;
          this.b = null;
        }
        if (this.b == null) {
          break;
        }
        if (!((ixf)mbb.a(f(), ixf.class)).b()) {}
        for (boolean bool = true;; bool = false)
        {
          this.c = bool;
          break;
        }
        this.a = this.ad.getData();
        this.af = 2;
        break label145;
        this.a = ((Uri)paramBundle.getParcelable("uri"));
        this.ae = paramBundle.getString("cacheFile");
        this.af = paramBundle.getInt("status");
        this.ag = paramBundle.getInt("position", 0);
        this.c = paramBundle.getBoolean("play_sd");
        this.b = ((Uri)paramBundle.getParcelable("sd_uri"));
        break label145;
      }
      i10 = i8;
      break label822;
      i5 = i3;
      break label800;
      n = 0;
      break label413;
      label800:
      i2++;
      i3 = i5;
      break label429;
      label810:
      n = 0;
      break label399;
      label814:
      break;
      label816:
      m++;
      break label265;
      label822:
      i7++;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("position", this.ag);
    paramBundle.putParcelable("uri", this.a);
    paramBundle.putString("cacheFile", this.ae);
    paramBundle.putInt("status", this.af);
    paramBundle.putBoolean("play_sd", this.c);
    paramBundle.putParcelable("sd_uri", this.b);
  }
  
  final void e(View paramView)
  {
    if ((this.af == 2) || (this.af == 3)) {}
    for (int i = 1; this.aa; i = 0)
    {
      a(paramView);
      return;
    }
    if ((i != 0) && (!this.ab))
    {
      d(paramView);
      return;
    }
    c(paramView);
  }
  
  public final void m()
  {
    super.m();
    if (this.ah)
    {
      this.Z.seekTo(this.ag);
      this.Z.resume();
      y();
      e(this.N);
      return;
    }
    View localView = this.N;
    if ((this.af == 2) || (this.af == 3)) {
      if (this.a != null)
      {
        y();
        this.Z.start();
      }
    }
    for (;;)
    {
      e(localView);
      return;
      this.ab = true;
      a(localView, aau.vB);
      continue;
      if (this.af == 0) {
        a(localView, aau.vC);
      } else {
        a(localView, aau.lN);
      }
    }
  }
  
  public final void n()
  {
    int i = 2000;
    super.n();
    if ((this.Z != null) && (this.a != null))
    {
      this.ag = this.Z.getCurrentPosition();
      if (this.ag <= i) {
        break label64;
      }
    }
    for (;;)
    {
      this.ag -= i;
      this.Z.suspend();
      this.ah = true;
      return;
      label64:
      i = this.ag;
    }
  }
  
  public final void o()
  {
    if (this.aj != null)
    {
      this.aj.release();
      this.aj = null;
    }
    w();
    super.o();
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView.getId() == aaw.mk) && (!this.d.isShowing())) {
      x();
    }
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    if (this.ai) {
      f().finish();
    }
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    this.ab = true;
    this.aa = false;
    View localView = this.N;
    if (localView != null)
    {
      a(localView, aau.vB);
      e(localView);
    }
    return true;
  }
  
  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    }
    for (;;)
    {
      View localView = this.N;
      if (localView != null) {
        e(localView);
      }
      return true;
      this.aa = true;
      this.ab = false;
      continue;
      this.aa = false;
      this.ab = false;
      continue;
      this.aa = false;
      this.ab = true;
    }
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    this.aa = false;
    paramMediaPlayer.setOnInfoListener(this);
    View localView = this.N;
    if (localView != null) {
      e(localView);
    }
  }
  
  public final gya r_()
  {
    return gya.ag;
  }
  
  final void v()
  {
    Object localObject = null;
    if (this.al)
    {
      Uri localUri3;
      if ((this.a != null) && (this.b != null) && (this.c)) {
        localUri3 = this.b;
      }
      for (;;)
      {
        this.ak = maj.a(f(), (String)localObject, localUri3);
        try
        {
          Uri localUri4 = this.ak.a();
          this.Z.setVideoURI(localUri4);
          return;
        }
        catch (IOException localIOException2)
        {
          String str;
          kpb.a(this.am.a, localIOException2, "Video Proxy Exception");
          return;
        }
        str = this.ae;
        if (str == null)
        {
          localUri3 = this.a;
          localObject = str;
        }
        else if (iph.a(str))
        {
          localUri3 = this.a;
          localObject = str;
        }
        else
        {
          localObject = str;
          localUri3 = null;
        }
      }
    }
    if ((this.a != null) && (this.b != null) && (this.c))
    {
      this.Z.setVideoURI(this.b);
      return;
    }
    if (this.ae != null)
    {
      boolean bool = iph.a(this.ae);
      Uri localUri1 = null;
      if (bool) {
        localUri1 = this.a;
      }
      this.ak = maj.a(f(), this.ae, localUri1);
      try
      {
        Uri localUri2 = this.ak.a();
        this.Z.setVideoURI(localUri2);
        return;
      }
      catch (IOException localIOException1)
      {
        Log.e("VideoViewFragment", "Couldn't start video server", localIOException1);
        this.Z.setVideoURI(this.a);
        return;
      }
    }
    this.Z.setVideoURI(this.a);
  }
  
  final void w()
  {
    this.Z.stopPlayback();
    maj localmaj;
    if (this.ak != null)
    {
      localmaj = this.ak;
      if (localmaj.b != null) {
        localmaj.b.shutdownNow();
      }
      if (localmaj.a == null) {}
    }
    try
    {
      localmaj.a.close();
      if (localmaj.f != null) {
        localmaj.f.cancel(true);
      }
      if (localmaj.g != null) {
        localmaj.g.cancel(true);
      }
      localmaj.e = null;
      this.ak = null;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.e("VideoServer", "Error while closing the socket", localIOException);
      }
    }
  }
  
  public final void x()
  {
    if (!this.d.isShowing())
    {
      lwo.a(f(), true);
      return;
    }
    Runnable localRunnable = this.ac;
    efj.m().postDelayed(localRunnable, 100L);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqc
 * JD-Core Version:    0.7.0.1
 */