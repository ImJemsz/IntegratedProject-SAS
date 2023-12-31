package int221.nw2.project.yuuuhooo.dtos;


import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;


@Getter
@Setter
public class AnnouncementDTO {
    private int id;
    private String announcementTitle;
    private ZonedDateTime publishDate;
    private ZonedDateTime closeDate;
    private String announcementDisplay;
    private String announcementCategory;
    private int viewCount;

}
