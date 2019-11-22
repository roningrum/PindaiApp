package org.pindaiaja.pindaiapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Inbox implements Parcelable {
    private String name;
    private String message;
    private String subject;
    private String time;
    private int photo;

    public Inbox() {
    }

    public Inbox(String name, String message, String subject, String time, int photo) {
        this.name = name;
        this.message = message;
        this.subject = subject;
        this.time = time;
        this.photo = photo;
    }

    protected Inbox(Parcel in) {
        name = in.readString();
        message = in.readString();
        subject = in.readString();
        time = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Inbox> CREATOR = new Creator<Inbox>() {
        @Override
        public Inbox createFromParcel(Parcel in) {
            return new Inbox(in);
        }

        @Override
        public Inbox[] newArray(int size) {
            return new Inbox[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public String getTime() {
        return time;
    }

    public int getPhoto() {
        return photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(message);
        dest.writeString(subject);
        dest.writeString(time);
        dest.writeInt(photo);
    }
}
