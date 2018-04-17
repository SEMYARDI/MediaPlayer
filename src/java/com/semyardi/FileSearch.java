package com.semyardi;


import java.io.File;

import java.util.Map;

public class FileSearch {

    public void search(String path, Map<String,String> map) {



            File file = new File(path);
            File lf[] = file.listFiles();
            if(lf==null)
                return;
            for (File xf : lf) {
                if (xf == null) return;
                else if (!xf.canRead()|| xf.isHidden())
                    continue;
                else if (xf.isDirectory())
                    search(xf.getPath(),map);
                 if (xf.getName().endsWith(".mp3") || xf.getName().endsWith(".aac")
                         || xf.getName().endsWith(".wav") || xf.getName().endsWith(".wma") /*& xf.getName().startsWith("")*/) {

                    map.put(xf.getName(),xf.getPath());
                }
                // Video formats : often used -> (MPEG-1, MPEG-2, MPEG-4, AVI, MOV, AVCHD, H.264,H.265)
                // Music formats : often used -> (AAC, MP3, WAV, WMA) other music formats -> (AIFF, ASF, FLAC, ADPCM, DSD, LPCM, OGG)
            }






    }


}
