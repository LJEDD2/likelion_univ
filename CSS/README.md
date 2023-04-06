# Week 2 

## Session 03 
> **Internl CSS** 
- Selector { 속성 : 값 }
    - HTML 파일 내부 고유 스타일을 지정 

> **External CSS** 
.css
- 외부 스타일 시트 정의 
- 분리된 파일을 통해 웹 사이트의 모양 변경 

> **Inline CSS** 
- 단일 요소에 고유한 스타일 적용 가능 

---

**ID 와 Class**     
ID : HTML 내부 고유한 값. 하나의 요소를 선택    

Class : 고유 값은 아니기에 여러가지 상황에서 여러 개의 스타일 설정 가능 


## Session 04  

> **오늘의 Git 명령어**
- git pull 업데이트
- git switch 


> **Block** 
- `inline` : 전후 줄바꿈 없이 한 줄에 다른 엘리먼트들과 나란히 배치 
    - width , height 속성 지정을 무시하고, marging, padding으로 좌우를 반영할 수 있다. 
- `block` : 전후 줄바꿈이 들어가 다른 엘리먼트들을 다른 줄로 밀어내고 혼자 한 줄을 차지. 
    - width, height, margin, padding 속성이 모두 반영된다. 
- `inline` - block : 전후 줄바꿈 없이 한 줄에 나란히 배치되지만 위의 모든 속성이 반영된다. 

 > **Margin**
- `Border` :  경계선
    - 경계선 **바깥 영역**의 공백에 관련된 정의
- `margin` : 
    - `margin-top`, `right`, `bottom`, `left` 를 통해 정의 가능.
    - `margin:auto;` 를 통해 가로 방향으로 중앙에 배치도 가능!

> **Padding**
- `Border` :  경계선
    - 경계선 **안쪽 영역**, Content와 Border 사이 여백을 주기 위해 사용
- `padding` : 
    - padding-top, right, bottom, left 를 통해 정의 가능.
    ``` 
        padding : all
        padding : top/bottom right/left
        padding : top right/left bottom
        padding : top right bottom left
    ```