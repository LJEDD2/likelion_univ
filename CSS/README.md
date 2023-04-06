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

 > **flex Box - justify-content, align-items**

- `flexBox`란? 
    - display, float, position과 같은 css 속성들로 레이아웃을 구현하는 게 몹시 복잡하거나 어려울 때가 있다. 
    - 그 한계를 극복하기 도입된 기능. 
    - flexible box, flexbox라고도 부른다.
    - 레이아웃 배치 기능에 중점을 맞추어 고안되었기 때문에 기본 방식보다 훨씬 더 수월하게 퍼블리싱이 가능하다. 
    ```
    display:flex; 
    display:inline-flex;  

    -> 속성값으로 flex를 사용하면 block 속성의 flex container를 정의하고, 
    inline-flex를 사용하면 inline 속성의 flex-container를 정의한다. 
    정렬이 가리키는 대상은 내부 item이 아닌 container. 
    ```

- `justify -content` : ( 가로축 - 중심축 )
    - 가로 축을 기준으로 좌우 정렬 
    ```
    flex-start (default) 
    - 요소들을 컨테이너의 왼쪽으로 정렬

	flex-end 
    - 요소들을 컨테이너의 우측으로 정렬

	center 
    - 요소들을 컨테이너의 중앙으로 정렬

	space-between 
    - 요소들 사이에 동일한 간격

	space-around 
    - 요소들 주위에 동일한 간격

	space-evenly(FireFox Only) 
    - 첫번째로 오는 정렬 대상 전에 두개의 인접한 정렬 대상 사이의 간격과 
    마지막 정렬 대상 이후의 간격이 같도록 항목이 분산. 

    ```
- `align-items` : ( 세로축 - 교차축 )
    - 세로 축을 기준으로 정렬

    ```
    flex-start	
    - 컨테이너의 최상단으로 정렬

    flex-end
    - 컨테이너의 최하단으로 정렬

    center
    - 컨테이너의 세로 축의 중앙으로 정렬

    baseline
    - 컨테이너의 시작위치에 정렬

    stretch(default)
    - 컨테이너에 맞게 늘림
    ```