package com.crio.jukebox.exceptions;

public class PlayListNotExists extends RuntimeException{
    public PlayListNotExists()
 {
  super();
 }
 public PlayListNotExists(String msg)
 {
  super(msg);
 }
}
