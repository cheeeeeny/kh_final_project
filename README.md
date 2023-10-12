# 파이널 프로젝트 : JOB-A 구인구직 사이트:handshake:

## Contents:card_index_dividers:
1. [팀 소개](#1️⃣-팀-소개)
2. [프로젝트 개요](#2️⃣-프로젝트-개요)
3. [설계의 주안점](#3️⃣-설계의-주안점)
4. [사용기술 및 개발환경](#4️⃣-사용기술-및-개발환경)
5. [주요기능](#5️⃣-주요기능)
6. [Document](#6️⃣-Document)
7. [최종발표자료](#7️⃣-최종발표자료)
 
 
 ## 1️⃣ 팀 소개
 ![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/c67f1ea7-a030-4090-af63-34945472c151)
 <br>
 <br>
 ## 2️⃣ 프로젝트 개요
 <img width="80%" src="https://github.com/NukNim/kh_final_project/assets/114970601/267ea93d-cbbe-48e8-b16a-a6a088c07ee8"/>
 
 ## 3️⃣ 설계의 주안점  
 ✔️ 원활한 관리를 위해 **카테고리를 지정**하여 관리자 페이지에서 변경 내용을 **일괄적으로 관리 가능**  
   
 ✔️ 개인 회원의 이력서 내 학력, 자격증, 경력 정보에 **독립적인 관리 프로세스를 제공**하여 각각의 이력서마다 원하는 개인 정보 입력 가능  
   
 ✔️ 기업에서 직접 작성 가능한 기업 소개 페이지가 있어 해당 기업에 관한 **다양한 정보 제공** 이 가능  
   
 ✔️ 기업이 채용 과정 단계별로 관리 및 알림을 보낼 수 있으며, 사이트 내에서 일괄적으로 **구인 프로세스 관리 가능**
   
   
 <br>    
       
 ## 4️⃣ 사용기술 및 개발환경
 
<div align="center">    
<img width="80%" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114903799/e290e435-a11d-4fb5-8556-4906babfcb9b"> 
</div>


## 5️⃣ 주요기능
<div align="center">
<img width="200" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114970601/d5926a64-3877-4fd8-8a3f-3ee649ac046e">
</div>
  


<details>
<summary><h3>✅ 인재찾기 및 면접제안 </h3></summary>
<div markdown="1"> 
<div align="center">
<img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 인재찾기 <img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div> 
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/d6f44e3b-6cc9-45ee-85fe-64b85044e1eb">
<br><br>
🔈 <b>인재찾기 : 원하는 조건을 설정하여 이력서를 검색할 수 있다.</b>
<br><br>
1. 이력서 검색전 이력서에 쓰여진 항목에 대하여 학력, 경력을 추가하는 쿼리문을 실행함
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/8cc1bcf9-61bd-44e1-916b-3ac939687df5">
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/8e4ce016-c7f9-4737-a458-c9870b974694">
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/78b86c37-c1f2-43af-8740-aea6a2606298">
 <br>
2. 실행된 결과를 가지고 검색 (이력서 공개에 동의한 결과만 출력)
 <img src="![image](https://github.com/cheeeeeny/kh_final_project/assets/111434047/c42c0bec-7014-4d03-a497-a83f7933ec06)
">
 <br>
3. 검색된 이력서를 바탕으로 면접제안을 보낼 수 있음
<br><br>

<div align="center">
<img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 면접제안 <img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div> 
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/bc109673-db7d-46dc-b70d-09b2632e83f0">
<br><br>
🔈 <b>면접제안 : 인재찾기 페이지에서 면접제안 보낸 리스트를 출력</b>
<br><br>
1. 답변 및 면접등록 현황에 따라 수락대기, 면접등록, 등록완료로 구분
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/50b03251-41fe-41bd-b123-dbc68826f7d0">
<br>
2. 지원자가 수락시 면접등록 버튼활성화 및 면접일정 등록 가능
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/2970b8f7-8498-4b84-8682-db5970a5dfb4">
<br>
3. 면접일정 등록시 면접 메일 발송도 같이 이루어짐
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/af09d6fe-0878-4a8d-af57-9b620bec8670">
<br>
4. 면접일정 등록시 등록완료로 변경됨
 </div>
 </details>
 
<details>
<summary><h3>✅ 기업 게시글 작성 </h3></summary>
<div markdown="1"> 
<div align="center">
<img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 게시판 <img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 <br><br>
🔈 <b>회사 소개 및 뉴스레터 : 인재찾기 페이지에서 면접제안 보낸 리스트를 출력</b>
<br><br>
1. 게시판 작성
<br> <img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/70c704db-02e3-4f77-a9e5-efe4d71b1b37">
<br> 뉴스레터 작성시 링크값의 제목을 추출 <Br>
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/99c10c50-8258-467e-83d3-ae1fb5be123e">
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/101208ca-531b-4327-8023-dbe3133af529">
<Br>
2. 게시판 보기
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/3ec1e837-7742-4cd2-b52a-9517000c57f0">
<Br>
3. 게시판 수정/삭제
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/5cd0115c-9529-4d55-954b-f749fbd8dde2">
<Br>

 </div>
 </details>

<details>
<summary><h3>✅ 면접일정 </h3></summary>
<div markdown="1"> 
<div align="center">
<img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 면접일정 <img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div> 

<br><br>
🔈 <b>면접일정 : 등록된 일정을 조회, 삭제할 수 있고 새로운 일정을 등록할 수 있다.</b>
<br><br>
1. 면접 일정 목록
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/0ce15e2b-a3b7-46d7-8aeb-49b4a84fedb5">
<Br>
2. 면접 일정 추가
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/acb1c4a9-cba5-46cb-b4dc-86416862a6ad">
<Br>
3. 면접 일정 삭제
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/714607ab-2f24-4993-bc76-8cd36a595e13">
<Br><Br>
 

 </div>
 </details>


<details>
<summary><h3>✅ 회원정보 </h3></summary>
<div markdown="1"> 
<div align="center">
<img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 회원정보 <img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div> 
<br><br>
🔈 <b>회원정보 : 기존 회원정보를 가져오고 수정할 수 있다.</b>
<br><br>
1. 기존 회원정보 조회
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/a1afe751-18d3-4cb3-b121-fb69c5c9a554">
<br>
2. 회원정보 변경
 <img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/84a2447c-df5b-4de0-b778-2803df006851">
<br>
3. 새로운 주소값을 입력하면 미리 지도 값 보여줌
 <img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/d1252062-b5b8-4c9c-8589-5478f3e4ac38">
<br>
4. 새로운 사진파일을 등록하면 썸네일 제공
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/4c9c6003-e989-4ffa-9c6b-159714317d90">
<br><Br>
 <div align="center">
<img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 비밀번호 및 탈퇴 <img width="350" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div> 
<br><br>
🔈 <b>비밀번호 : 비밀번호 확인후, 비밀번호 변경과 회원탈퇴를 할 수 있다.</b>
<br><br>
1. 비밀번호 확인
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/e621cea9-912f-4cae-82a5-ce9623f1691d">
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/84fc39da-48de-4f0d-b242-09cf950ac699">

<br>
2. 비밀번호 변경
 <img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/a8652835-27e2-4f9f-931e-87c8f5ddfb08">
 <img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/978fc7c1-8cd8-499a-8667-f997b43c2201">

<br>
3. 회원탈퇴
<img src="https://github.com/cheeeeeny/kh_final_project/assets/111434047/2961fcbc-bc40-4471-a1f0-e325a2fbe249">
<br>
 </div>
 </details>
<div align="center">
<img width="230" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114970601/10918d26-170c-42b3-8037-89b7ca2997c3">
</div>

<details>
<summary><h3>✅ 관리자 카테고리 관리 </h3></summary>
<div markdown="1"> 
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 화면 예시 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <div align="center">
  <img width="" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114903799/f0349833-dbfd-42e3-80fb-9a289b85f069">
 </div>
 
 <br>
 <br>

 카테고리 관리 화면에서 첫 번째 리스트에 대분류 카테고리를 선택하거나 생성한다. 생성하기 위해서는 영역 상단에 +버튼을 클릭하여 입력창이 출력되면 카테고리 아이디와 카테고리 명을 입력하여 등록할 수 있다.
 각각의 상위 카테고리 항목을 클릭하면 하위 카테고리 리스트가 불러와지고 클릭한 상위 카테고리의 하위 카테고리 또한 +버튼으로 생성할 수 있다.
 카테고리 삭제는 삭제하고 싶은 카테고리 항목 클릭 시 삭제버튼이 출력되는데 해당 버튼을 클릭하면 삭제가 가능하지만, 해당 카테고리에 하위 카테고리가 존재한다면 삭제할 수 없다. 

 
 </div>
 </details>
 
 <details>
<summary><h3>✅ 기업 채용공고 </h3></summary>
<div markdown="1"> 
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 화면 예시 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <br>
 
 <div align="center">
  <img width="90%" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114903799/c02f2a19-8282-4c99-a92b-6c430793f2df"> 
 </div>
 <br>
 <br>
 
 기업회원이 채용공고 등록 정보를 전부 입력하고 작성버튼을 클릭하게 되면 데이터베이스에 채용공고가 미승인 상태로 등록되게된다.
 
 <br>
 <br>
 <div align="center">
  <img width="90%" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114903799/ccf97cdc-d497-457b-b52c-f3c51b85810a"> 
 </div>
 <br>
 <br>
 기업회원이 채용공고를 등록하게 되면 관리자가 미승인 상태인 채용공고를 확인하고 승인할지 반려할지를 선택할 수 있다. 
 반려되면 반려 메일이 발송되게 되고 승인된다면 기업회원이 채용공고 화면에서 해당 게시글을 게시할지 하지 않을 것에 관해 정할 수 있다.
 <br>
 <br>
 
 </div>
 </details>
 
 <details>
<summary><h3>✅ 지원자 관리 </h3></summary>
<div markdown="1"> 
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 화면 예시 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <br>
 
 <div align="center">
  <img width="100%" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114903799/6e579389-a08e-4377-9ded-6606a3ffa4f6">
 </div>
  <br>
  <br>

 기업회원이 등록한 채용공고에 지원자가 존재할 때 기업계정에서 지원자 관리를 통해 해당 지원자의 이력서를 확인 후 결과 발표 버튼을 통해 지원자의 합격 단계를 지정하여 작성할 수 있다.
결과발표와 결과 내용으로 이력서 작성 회원의 주소로 이메일이 전송되어 결과를 지원자가 알 수 있게 해주고 해당 지원자를 합격자로 전환하여 합격자 관리에서 확인 할 수 있다.
  
 <br>
 <br>
 
 </div>
 </details>
 
<div align="center">
<img width="230" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114970601/3838da3c-9341-4328-be92-11a688e5a03b">
</div>

<details>
<summary><h3>✅ OPEN API 연동 샘플데이터 추가 </h3></summary>
<div markdown="1"> 
 
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">워크넷 API로 채용공고 샘플데이터 추가<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
 </div>
 
 <br>
 
 <div align="center">
<img width="80%" src="https://github.com/NukNim/kh_final_project/assets/114970601/37353267-2b13-420e-998a-137f0e51f072">
 </div>
  
  - 워크넷 채용공고 API사용.
  - OpenApiUtils 생성 후 제너릭 사용해 dto에 저장.
 <br>
 
 <div align="center">
 <img width="65%" src="https://github.com/NukNim/kh_final_project/assets/114970601/01707431-33b1-4734-a429-1ac7b34e1bcd">
   </div>
 
  - API에서 지원하지 않는 출력값의 경우, NodeList 객체를 생성해 추출한 텍스트 콘텐츠를 리턴하도록 하였고 요소를 찾지 못한 경우에는 NULL을 리턴하도록 함.
 <br>
 
  <div align="center">
  <img width="70%" src="https://github.com/NukNim/kh_final_project/assets/114970601/b81afc2c-1fe8-4b22-a062-0ca258c6fb27">
 </div>
 
 - 데이터가 XML형태로 들어와 XML파싱메소드를 이용해 데이터를 파싱.
 <br>

 </details>

 <details>
<summary><h3>✅ 이력서 작성 및 입사지원 </h3></summary>
<div markdown="1"> 
 <br>
 <br>
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 이력서 작성 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <br>
 
 <div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970601/42cc174c-4da3-4ba9-a36b-72704dd94541">
 이력서 - 학력사항 작성 화면
 </div>
 <br>
 <br> 
 
 
  <div align="center">
<img width="80%" src="https://github.com/NukNim/kh_final_project/assets/114970601/6c24b6de-dd8a-4837-9272-9c787ef4bd50">
 </div>
 <br>
 
  ---
 
  <div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970601/c6b01451-61df-4e7e-9b0e-5ef7d3f8cddc">
 저장된 정보 불러오기, 수정, 삭제 화면
 </div>
 <br>
 <br> 
 
 
  <div align="center">
<img width="60%" src="https://github.com/NukNim/kh_final_project/assets/114970601/908edd1e-dfa8-4733-a41f-23e4b065c4fc">
 </div>
 <br>
 
  ---
 <br>
  <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 입사지원 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <br>
 <br>
 
  <div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970601/6fa8a1a2-b6b6-4306-bb77-bad83afe1011">
 <img width="90%" src="https://github.com/NukNim/kh_final_project/assets/114970601/d243b23f-81c9-47b9-9442-4d49dbf13c1c"><br>
 입사지원 & 지원취소 화면
 </div>

 
 <br>
 <br> 
 
 
1. 채용공고에서 '지원하기' 버튼 클릭 후 모달창에서 해당 공고에 지원할 이력서 선택해 입사지원하기
2. 한 채용공고에 입사지원은 한 번만 가능하도록 구현  
 2-1 다른 이력서여도 입사지원 불가능 -'이미 입사지원한 공고입니다' alert창 출력
3. <입사지원현황>에서 입사지원내역 확인  
 4. 기업이 이력서 확인 전이면 입사 취소 가능  
 4-1 기업이 이미 열람한 이력서의 경우, '지원취소' 버튼 대신 '열람완료' 문구 출력

 
 
 ---
  </div>
 </details>
 
 
 <details>
<summary><h3>✅ 채용공고 & 기업 스크랩 </h3></summary>
<div markdown="1"> 
 <br>
 <br>
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 채용공고 스크랩 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <br>
 
 <div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970601/4497c351-cf09-4fe7-ae19-3a634dca47ea">
  채용공고 스크랩 화면
 </div>
 <br>
 <br>
 <br>
  <br>
<div align="center">
 <img src="https://github.com/NukNim/kh_final_project/assets/114970601/2028a2de-eb0d-485c-9d19-c07a83097bee">
 </div>
 <br>
 
  ---
 <br>
  <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 관심기업 스크랩 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 <br>
 <br>
 
   <div align="center">
  <img width="80%" src="https://github.com/NukNim/kh_final_project/assets/114970601/2197ebd7-3f98-4f3b-a7fe-eff0625769dd">
  <img width="80%" src="https://github.com/NukNim/kh_final_project/assets/114970601/ccff0dca-56f2-44f0-84a4-18dd488622bf">
  </div>
 
   <br>
 
1. 페이지 실행 시, ajax 통해 해당 회사가 관심기업으로 스크랩 되어있는지 확인해 하트 모양 아이콘 상태 변경  
2. 회사 정보 게시판 & 회사 소개페이지에서 하트 모양 아이콘 클릭해 관심기업으로 스크랩 
3. 한 번 더 클립하여 관심기업 스크랩 취소
4. <관심기업정보>에서 스크랩 정보 확인
5. 회사소개 '이동' 버튼 클릭하여 회사소개 페이지로 이동
6. 체크박스로 체크 후 '관심기업 삭제' 버튼 클릭해 DB에서 삭제
 <br>
<br>
 
  ---
 
 </div>
 </details>
 
  <div align="center">
<img width="200" alt="image" src="https://github.com/NukNim/kh_final_project/assets/114970601/8312f9fe-aaa5-4d1d-9946-257ea2eed474">
</div>

<details>
<summary><h3>✅ 회원가입 및 로그인 </h3></summary>
<div markdown="1"> 
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 회원가입 및 로그인 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <br>
 
<div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/4c32d584-a5b1-43c7-a865-65beb5b52285">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/d601bf4b-82d6-4245-8cfe-b8333f8aed14">
</div>
 
 <br>
 <br>
 <br>
 
 <div align="center">
 <img src="https://github.com/NukNim/kh_final_project/assets/114970462/0a804c77-d9e0-4a2c-86ee-15c317b73192">
  회원가입 
 </div>
 
<br> 
<br> 
<br>
 
  1. 개인회원, 기업회원 선택 후 회원 가입 
  2. 모든 회원 정보 기입 필수 
  3. 아이디 정규 표현식 체크 , 아이디 중복 체크
  4. 비밀번호 정규 표현식 체크, 비밀번호 / 비밀번호 확인 불일치 체크, 아이디 / 비밀번호 불일치 체크 
  5. 이름, 이메일 정규 표현식 체크 
  7. 회원가입 버튼 클릭 시 아이디, 이메일 중복된 데이터 여부 한번 더 체크 후 회원가입 

 ---
 
<br> 
<br> 
<br>
 
<div align="center">
 <img src="https://github.com/NukNim/kh_final_project/assets/114970462/040fd29f-2edc-495d-80de-70e742e80b14">
</div>
 
<br> 
<br> 
<br>
 
<div align="center">
 <img src="https://github.com/NukNim/kh_final_project/assets/114970462/6262f694-9033-4653-a11e-16f02f979a88">
  카카오 로그인 
 </div>
 
<br> 
<br> 
<br>
 
1. 카카오 인증 서버와의 통신을 통해 액세스 토큰 가져오기 
2. 토큰을 사용하여 카카오톡 API 서버에 사용자 정보를 요청
3. 사용자 정보와 데이터베이스 데이터 비교해 일치 시 권한 생성 후 로그인 , 불일치 시 로그인 화면 출력

---
 
<br> 
<br> 
<br>
 
 
 </div>
 </details>
 
 <details>
<summary><h3>✅ 이력서 생성 </h3></summary>
<div markdown="1"> 
<div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png"> 이력서 생성 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
 <br>
 
<div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/f05ca6ed-c33a-4bdd-995e-151ffa940a22">
</div>
 
<br> 
<br> 
<br>
 
 <div align="center">
 <img src="https://github.com/NukNim/kh_final_project/assets/114970462/64726f50-1f0f-4c52-8a4d-4c1d3cd2c660">
  이력서 생성
 </div>
 
<br> 
<br> 
<br>
 
1. 현재 로그인한 회원 정보를 포함한 이력서 작성 페이지 출력  
2. 이력서 사진 존재 시 Google Cloud Storage에 파일 업로드 후 이력서 작성 페이지에 재출력
3. 이력서 제목 글자 수 제한, 필수 입력 / 입력 사항 선택 
4. 포트폴리오 파일 존재 시 Google Cloud Storage 파일 업로드 
5. 다음 버튼 클릭 시 이력서 생성 

 ---
 
<br> 
<br> 
<br>
 
 
<div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/1dcbb31e-5eb7-41fa-bb7e-51c04b4a1f9f">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/6475d74c-253d-4cd0-ace0-66aab61cf7ec">
</div>
 
<br> 
<br> 
<br>
 
<div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/558335bd-24a8-4182-8a1d-e0226eea40ec">
  자격증 입력
 </div>
 
<br> 
<br> 
<br>
 
1. 현재 이력서에 새 자격증 정보 입력 
2. 새정보추가 버튼 클릭 후 추가된 입력 form 에 현재 이력서에 여러 개의 새 자격증 정보 입력 
2. 저장된 정보 불러오기로 기존 자격증 선택한 순서대로 출력
3. 기존 자격증 정보로 현재 이력서에 자격증 정보 추가 / 수정 / 삭제


---
 
<br> 
<br> 
<br>
 
 </div>
 </details>
 
 <details>
<summary><h3>✅ 채용정보검색 </h3></summary>
<div markdown="1"> 
 <div align="center">
<img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">  채용정보검색 <img width="250" alt="image" src="https://media.discordapp.net/attachments/692994434526085184/1002954522253074472/a0c55ca0bfe82413.png">
</div>
 
<br>
 
<div align="center">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/57b60a24-85ba-4117-bfa9-518ddf31c092">
<img src="https://github.com/NukNim/kh_final_project/assets/114970462/5bdf1c70-bbfa-4dc3-84a1-7ad93d0fde39">
</div>

 <br>
 <br>
 <br>
 
 <div align="center">
 <img src="https://github.com/NukNim/kh_final_project/assets/114970462/ec21ef55-811f-49be-8481-9a5cdb597c66">
  채용 정보 검색
 </div>
 
<br> 
<br> 
<br>
 
1. 지역, 직종, 우대조건 카테고리 / 현재 채용 중인 채용 공고를 포함한 채용 정보 조회 페이지 출력
2. 3단계 카테고리 선택 시 해당되는 채용 공고 출력 
3. 체크박스로 선택된 조건으로 채용 공고 검색 
4. 검색어로 채용 공고 검색
5. 채용 공고 제목, 채용 회사 클릭 시 새 창으로 채용 공고 상세 페이지 출력 
6. 별 아이콘 클릭 시 해당 채용 공고 스크랩, 다시 클릭 시 스크랩 취소

 ---
 
<br> 
<br> 
<br>
 
 </div>
 </details>
 
## 6️⃣ Document
## 1. 개발일정
<img width="80%" src="https://github.com/NukNim/kh_final_project/assets/114970601/48072776-640d-4bbe-b968-3fb409f5bee3"/>  

<br>

## 2. 요구사항정의서
[요구사항정의서 전체보기](https://docs.google.com/spreadsheets/d/1ZSz9kat6E9u9owKFZAw9wt1C078Hlw0f/edit#gid=15147080)

<br>

## 3. 화면설계서
[화면설계서 전체보기](https://drive.google.com/file/d/1a4bbvSW0Fl5gLfnMDt6l8ZmQv32qvjZr/view?usp=sharing)

<br>

## 4. ERD
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/dcc0cb4b-eece-4512-88e4-3d858485cc8e)

<br>

## 5. 시퀀스 다이어그램  
<h3 align="center">지원자관리</h3>
<p align="center"><img src="https://github.com/NukNim/kh_final_project/assets/114970601/d3fe9518-35a7-42ee-9132-e5266515cca0"></p>
<br>
<h3 align="center">일반로그인</h3>
<p align="center"><img src="https://github.com/NukNim/kh_final_project/assets/114970601/87a99bed-da59-43c4-aade-e638e91acf16"></p>
<h3 align="center">카카오 로그인</h3>
<p align="center"><img src="https://github.com/NukNim/kh_final_project/assets/114970601/05052ca8-b322-4797-b1f3-5cf179b8dcb6"></p>
<br>
<h3 align="center">채용공고 등록</h3>
<p align="center"><img src="https://github.com/NukNim/kh_final_project/assets/114970601/f6200201-545b-4a06-9e93-6a28f8e2c70f"></p>
<br>
<h3 align="center">이력서 등록</h3>
<p align="center"><img src="https://github.com/NukNim/kh_final_project/assets/114970601/96afdc5c-4ca4-42e8-aeae-1a32d1f86d75"></p>
<br>

## 6. 클래스 다이어그램
<details>
<summary><h3>Person</h3></summary>
<div markdown="1"> 

![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/94512b83-c63f-4679-b2cf-bb4c9b581046)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/bcb50e31-41ad-40b0-9a84-f1f6410ad401)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/f1722e67-4caa-47ed-89d6-af16c3f7c75a)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/c3bde1ad-24f1-4e00-97f4-a227efe22962)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/4af94fe8-6530-4373-9bd3-4dbe150d6316)

</div>
</details>
 
<details>
<summary><h3>Resume</h3></summary>
<div markdown="1"> 

![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/691de68f-a4c5-4cd5-94de-f7ee52afeb08)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/f5627b6a-e627-41f1-9900-f03e965b33bd)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/daa36dc2-aa5f-4c9f-8ca0-b88d4b957e08)

</div>
</details>

<details>
<summary><h3>Business</h3></summary>
<div markdown="1"> 

![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/9c14f79c-24db-4653-9f32-9cc16e957490)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/9ece5003-bfe3-47dd-ae53-9a2c3db8ea2d)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/a8e6b6e6-28ca-4230-8922-7fc990e6819f)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/390b0d6d-5ffc-432d-abfd-2468a11a64b8)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/31a39cba-fef5-4d50-a644-552e4f1c0b1e)

</div>
</details>

<details>
<summary><h3>Admin</h3></summary>
<div markdown="1"> 

![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/4303aa2d-5597-4a8d-b4b2-302686bd61c7)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/7a0c8f2d-6256-4535-94e3-28fbfd890455)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/8c893b60-11c0-4114-947d-37d14c54590d)
![이미지](https://github.com/NukNim/kh_final_project/assets/114970601/9f9d59de-ad39-4b30-ac57-8b71e0fcb67b)

</div>
</details>
<br>

## 7. History
[History 전체보기](https://docs.google.com/spreadsheets/d/1cB94RR9iWxg4tUijVIwjBgCle971YG0dyTfw_vWl-iQ/edit#gid=0)
<br>

## 8. 테스트 케이스
[테스트케이스 전체보기](https://docs.google.com/spreadsheets/d/1TQ_Q0W1wnNszXugbbQc8--QzBXlqzesy/edit#gid=1257668180)
<br>

## 7️⃣ 최종발표자료
