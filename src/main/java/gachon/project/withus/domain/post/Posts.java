package gachon.project.withus.domain.post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;

/*
* Posts(게시글)DB를 만들고 관리하는
* Entity클래스입니다
* 여기서 만드는 변수는 하나의 필드?(항목?)가 됩니다
* */
@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx; //게시물의 id

    @Column(length = 500, nullable = false)
    private String title;

    private String writer;

    //게시글 장소에 관련된 값들(추후 변경될 소지가 있음 ----------------------------------------------------------)
    // 운동할 위치 좌표값
    private String locationX;
    private String locationY;
    // 운동위치 지역명
    private String addressName; //"전북 익산시 부송동 100"
    // 00시
    private String region1Depth;
    // 00구
    private String region2Depth;
    // 장소이름
    private String placeName;

    // (----------------------------------------------------------)
    // 해당 일시
    private String eventTime;


    //삭제여부
    private boolean deleteYn;

    @Builder
    public Posts(String title, String writer, String locationX, String locationY, String addressName,String region1Depth,
                 String region2Depth, String placeName, String eventTime){
        this.title=title;
        this.writer = writer;
        this.locationX = locationX;
        this.locationY = locationY;
        this.addressName = addressName;
        this.region1Depth = region1Depth;
        this.region2Depth = region2Depth;
        this.placeName = placeName;
        this.eventTime = eventTime;
        this.deleteYn = false;
    }

}
