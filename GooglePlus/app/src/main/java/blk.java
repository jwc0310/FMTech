import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.HttpUrlRequest;

public final class blk
  extends kbw
{
  private static final File c = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
  private static final Pattern f = Pattern.compile("attachment;\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1\\s*$", 2);
  public String a;
  public File b;
  private File d;
  private String e;
  
  public blk(Context paramContext, kcg paramkcg, String paramString)
  {
    super(paramContext, paramkcg, "GET", new kda(paramContext, paramkcg.a), paramString, null);
  }
  
  private static String b(String paramString)
  {
    if (!new File(c, paramString).exists()) {
      return paramString;
    }
    String[] arrayOfString = TextUtils.split(paramString, "\\.");
    if (arrayOfString.length == 0) {
      return null;
    }
    arrayOfString[0] = String.valueOf(arrayOfString[0]).concat(" (%d)");
    String str = TextUtils.join(".", arrayOfString);
    for (int i = 1;; i++)
    {
      if (i > 99) {
        break label106;
      }
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      paramString = String.format(str, arrayOfObject);
      if (!new File(c, paramString).exists()) {
        break;
      }
    }
    label106:
    return null;
  }
  
  private static String e(String paramString)
  {
    try
    {
      Matcher localMatcher = f.matcher(paramString);
      if (localMatcher.find())
      {
        String str = localMatcher.group(2);
        return str;
      }
    }
    catch (IllegalStateException localIllegalStateException) {}
    return null;
  }
  
  protected final void B_()
  {
    String str = b("gplus-media-download.tmp");
    if ((c.exists()) || (c.mkdirs()))
    {
      this.d = new File(c, str);
      if (this.d != null)
      {
        this.s = new RandomAccessFile(this.d, "rw").getChannel();
        return;
      }
    }
    throw new IOException("Unable to create temp file");
  }
  
  public final void a(ByteBuffer paramByteBuffer, String paramString)
  {
    c(null, "[media download]");
    this.a = paramString;
    String str1 = this.e;
    String str2 = this.a;
    String str3 = c();
    String str13;
    int j;
    String str14;
    label262:
    String str15;
    String str4;
    if (str1 != null) {
      if (str1 != null)
      {
        str13 = e(str1);
        if (str13 != null)
        {
          int i1 = 1 + str13.lastIndexOf('/');
          if (i1 > 0) {
            str13 = str13.substring(i1);
          }
        }
        if (TextUtils.isEmpty(str13))
        {
          String str20 = Uri.decode(str3);
          if (str20 != null)
          {
            int m = str20.indexOf('?');
            if (m > 0) {
              str20 = str20.substring(0, m);
            }
            if (!str20.endsWith("/"))
            {
              int n = 1 + str20.lastIndexOf('/');
              if (n > 0) {
                str13 = str20.substring(n);
              }
            }
          }
        }
        if (TextUtils.isEmpty(str13)) {
          str13 = "downloadfile";
        }
        j = str13.lastIndexOf('.');
        if (j < 0)
        {
          str14 = null;
          if (str2 != null)
          {
            str14 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
            if (str14 != null)
            {
              String str17 = String.valueOf(str14);
              if (str17.length() == 0) {
                break label612;
              }
              str14 = ".".concat(str17);
            }
          }
          if (str14 == null)
          {
            if ((str2 == null) || (!str2.toLowerCase().startsWith("text/"))) {
              break label634;
            }
            if (str2.equalsIgnoreCase("text/html")) {
              str14 = ".html";
            }
          }
          else
          {
            str15 = String.valueOf(str13);
            String str16 = String.valueOf(str14);
            if (str16.length() == 0) {
              break label798;
            }
            str4 = str15.concat(str16);
          }
        }
      }
    }
    for (;;)
    {
      label293:
      String str6;
      label379:
      String str7;
      String str8;
      if ((TextUtils.isEmpty(str4)) || (iqz.a(str3)))
      {
        Date localDate = new Date(System.currentTimeMillis());
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(this.j.getString(aau.fi));
        String str5 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
        if (str5 == null) {
          break label826;
        }
        String str12 = String.valueOf(str5);
        if (str12.length() == 0) {
          break label812;
        }
        str6 = ".".concat(str12);
        str7 = String.valueOf(localSimpleDateFormat.format(localDate));
        str8 = String.valueOf(str6);
        if (str8.length() == 0) {
          break label834;
        }
      }
      label784:
      label798:
      label812:
      label826:
      label834:
      for (str4 = str7.concat(str8);; str4 = new String(str7))
      {
        String str9 = b(str4);
        if (!TextUtils.isEmpty(str9))
        {
          this.b = new File(c, str9);
          if (paramString.equalsIgnoreCase("text/html"))
          {
            int i = str9.lastIndexOf('.');
            if (i >= 0) {
              this.a = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str9.substring(i + 1));
            }
          }
          if (Log.isLoggable("HttpOperation", 3))
          {
            String str10 = String.valueOf(this.d.getName());
            String str11 = String.valueOf(this.b.getName());
            new StringBuilder(13 + String.valueOf(str10).length() + String.valueOf(str11).length()).append("Renaming ").append(str10).append(" to ").append(str11);
          }
        }
        if ((this.b != null) && (this.d.renameTo(this.b))) {
          break label848;
        }
        this.d.delete();
        throw new IOException("Unable to rename temp file");
        label612:
        str14 = new String(".");
        break;
        str14 = ".txt";
        break label262;
        label634:
        str14 = ".bin";
        break label262;
        str14 = null;
        String str19;
        if (str2 != null)
        {
          int k = str13.lastIndexOf('.');
          String str18 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str13.substring(k + 1));
          str14 = null;
          if (str18 != null)
          {
            boolean bool1 = str18.equalsIgnoreCase(str2);
            str14 = null;
            if (!bool1)
            {
              boolean bool2 = str2.equalsIgnoreCase("text/html");
              str14 = null;
              if (!bool2)
              {
                str14 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
                if (str14 != null)
                {
                  str19 = String.valueOf(str14);
                  if (str19.length() == 0) {
                    break label784;
                  }
                }
              }
            }
          }
        }
        for (str14 = ".".concat(str19);; str14 = new String("."))
        {
          if (str14 == null) {
            str14 = str13.substring(j);
          }
          str13 = str13.substring(0, j);
          break;
        }
        str4 = new String(str15);
        break label293;
        str6 = new String(".");
        break label379;
        str6 = "";
        break label379;
      }
      label848:
      return;
      str13 = null;
      break;
      str4 = null;
    }
  }
  
  public final void a_(HttpUrlRequest paramHttpUrlRequest)
  {
    this.e = paramHttpUrlRequest.b("Content-Disposition");
  }
  
  public final void b(ByteBuffer paramByteBuffer, String paramString)
  {
    c(null, "[media download error]");
    this.d.delete();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     blk
 * JD-Core Version:    0.7.0.1
 */