package com.crio.jukebox.entities;

import java.util.List;

public class PlayList extends BaseEntities{
    private final String name;
    private final List<Song> songs;

    private SongStatus SongStatus;
    public PlayList(String id,String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
        this.id = id;
        this.SongStatus=SongStatus.VIBING_OFF;
    }
    
    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((songs == null) ? 0 : songs.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlayList other = (PlayList) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (songs == null) {
            if (other.songs != null)
                return false;
        } else if (!songs.equals(other.songs))
            return false;
        return true;
    }
    public SongStatus getSongStatus() {
        return SongStatus;
    }

    public void setSongStatus(SongStatus SongStatus) {
        this.SongStatus = SongStatus;
    }
    @Override
    public String toString() {
        return "PlayList [id=" + id +", name=" + name + ", songs=" + songs + "]";
    }
}
