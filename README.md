![Apache-2.0](https://img.shields.io/badge/license-Apache-blue)  [![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.png?v=103)](https://github.com/ellerbrock/open-source-badges/)

# Case22_RecyclerView_Chat

Android Chat (RecyclerView) Case

This Chat App is actually extracted from a commercial project, which has been used by thousands of users.

```java
private class ViewHolderSend extends RecyclerView.ViewHolder {
	TextView sendText;
	ViewHolderSend(View itemView) {
		super(itemView);
		sendText = itemView.findViewById(R.id.right_msg);
	}

	void bind(DataChat message) {
		sendText.setText(message.getContent());
	}
}
```

Introduction
------------

RecyclerView widget is a container for displaying large data sets that can be scrolled very efficiently by maintaining a limited number of views. Use the RecyclerView widget when you have data collections whose elements change at runtime based on user action or network events. RecyclerView decouples the positioning, animating items and various event handling into different classes.

RecyclerView with Multiple View Types in Java Android is by nature a perfect way to implement the chat App. In this case, 2 types of views (text message in and out) are considered.

Pre-requisites
--------------

- Android Studio 
- SDK 23

Screenshots
-------------

<img src="screenshot.png" height="400" alt="Screenshot"/> 

Getting Started
---------------

* Android Studio: Download this case from github and open it directly in Android Studio.
* Other IDE: This case uses the Gradle build system. To build this project, use the "gradlew build" command or use "Import Project".

Support
-------

1. Hands-on App Development in Android Studio 4.2: https://www.amazon.com/Hands-Development-Android-Studio-Step-dp-B096TL8VMP/dp/B096TL8VMP/
2. Preview of Hands-on App Development in Android Studio 4.2: https://play.google.com/books/reader?id=9g8zEAAAQBAJ
3. GitHub: https://github.com/hypech/
4. Stack Overflow: https://stackoverflow.com/story/hypech
5. Twitter: https://twitter.com/hypechor
6. Youtube: https://www.youtube.com/channel/UCtkxCO5vVSvWMN-HMs0JZyg
7. Tiktok: https://www.tiktok.com/@androidcase
8. http://hypech.github.io
9. http://hypech.com
10. info@hypech.com

If you've found an error in this case, please file an issue on top left of this screen besides <>code.

Patches are encouraged, and may be submitted by forking this project and submitting a pull request through GitHub. 


 <pre>
  Copyright 2021 The Learning Android with Cases Open Source Project

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
  
</pre>
