package qianfeng.com.babylattice.z_other.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;

import java.io.File;

/**
 * Created by Administrator on 2016/5/20 0020.
 *
 * 文件工具类
 */
public class FileUtil {

    public static final File DIR_CACHE = createDir("cache");
    public static final File DIR_IMAGE = createDir("image");
    public static final File DIR_AUDIO = createDir("audio");
    public static final File DIR_VIDEO = createDir("video");
    public static final File DIR_APK = createDir("apk");

    public static File getSDcardDir() {

        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            File file = Environment.getExternalStorageDirectory();
            return file;
        }
//        LogUtil.e("无SD卡!!!");
        return null;
    }

    public static File getAppDir() {

        File sDcardDir = getSDcardDir();
        if (sDcardDir == null) {
            return null;
        }

        File koala = new File(sDcardDir, "koala");
        if (!koala.exists()) {
            koala.mkdirs();
        }
        return koala;
    }

    private static File createDir(String fileName) {
        File file = new File(getAppDir(), fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String getFileName(String url, String rename, boolean useHashCode) {
        if (url == null) {
            return null;
        }
        if (useHashCode) {
            return "" + url.hashCode();
        } else {
            int last = url.lastIndexOf(".");
            return rename + url.substring(last);
        }
    }

    /**
     * 安装apk
     *
     * @param context
     * @param file
     */
    public static void installApk(Context context, File file) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction(Intent.ACTION_VIEW);
        String type = "application/vnd.android.package-archive";
        intent.setDataAndType(Uri.fromFile(file), type);
        context.startActivity(intent);
    }
}
