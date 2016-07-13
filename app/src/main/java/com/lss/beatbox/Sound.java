package com.lss.beatbox;

/**
 * Created by shuai on 16-6-18.
 */
public class Sound {
    private String mAssetPath;
    private  String mName;
    private Integer mSoundId;
    public Sound (String assetPath){
        mAssetPath=assetPath;
        String[] components =mAssetPath.split("/");
        String fileName = components[components.length-1];
        mName=fileName.replace(".wav","");
    }
    public String getAssetPath(){
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
    public Integer getSoundId() {
        return mSoundId;
    }
    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

}
