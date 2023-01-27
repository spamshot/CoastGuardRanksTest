package com.l3git.coastguardrankstest

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"What rank is this?",
            R.drawable.a,
            "Seaman Apprentice",
            "Petty Officer Third Class",
            "Seaman",
            "Seaman Recruit",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What rank is this?",R.drawable.b,
            "Petty Officer Third Class",
            "Seaman Apprentice",
            "Petty Officer Second Class",
            "Seaman",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What rank is this?",R.drawable.c,
            "Petty Officer Third Class",
            "Petty Officer First Class",
            "Petty Officer Second Class",
            "Chief Petty Officer",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What rank is this?",R.drawable.d,
            "Petty Officer Third Class",
            "Senior Chief Petty Officer",
            "Petty Officer Second Class",
            "Petty Officer First Class",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What rank is this?",R.drawable.e,
            "Petty Officer First Class",
            "Chief Petty Officer",
            "Seaman",
            "Senior Chief Petty Officer",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What rank is this?",R.drawable.f,
            "Senior Chief Petty Officer",
            "Chief Petty Officer",
            "Chief Warrant Officer 2",
            "Master Chief Petty Officer",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What rank is this?",R.drawable.g,
            "Chief Warrant Officer 3",
            "Senior Chief Petty Officer",
            "Ensign",
            "Chief Petty Officer",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What rank is this?", R.drawable.h,
            "Master Chief Petty Officer",
            "Senior Chief Petty Officer",
            "Chief Warrant Officer 4",
            "Chief Warrant Officer 2",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What rank is this?",R.drawable.i,
            "Master Chief Petty Officer Of The Coast Guard",
            "Chief Petty Officer",
            "Senior Chief Petty Officer",
            "Command Master Chief Petty Officer",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What rank is this?",R.drawable.j,
            "Petty Officer First Class",
            "Command Master Chief Petty Officer",
            "Master Chief Petty Officer Of The Coast Guard",
            "Master Chief Petty Officer",
            3
        )
        questionsList.add(que10)

        val que11 = Question(
            11,"What rank is this?",R.drawable.k,
            "Chief Warrant Officer 2",
            "Chief Warrant Officer 3",
            "Chief Warrant Officer 4",
            "Ensign",
            1
        )
        questionsList.add(que11)

        val que12 = Question(
            12,"What rank is this?",R.drawable.l,
            "Ensign",
            "Chief Warrant Officer 4",
            "Chief Warrant Officer 2",
            "Chief Warrant Officer 3",
            4
        )
        questionsList.add(que12)

        val que13 = Question(
            13,"What rank is this?",R.drawable.m,
            "Chief Warrant Officer 4",
            "Lieutenant Junior Grade",
            "Ensign",
            "Chief Warrant Officer 3",
            1
        )
        questionsList.add(que13)

        val que14 = Question(
            14,"What rank is this?",R.drawable.n,
            "Lieutenant Junior Grade",
            "Ensign",
            "Lieutenant Commander",
            "Commander",
            2
        )
        questionsList.add(que14)

        val que15 = Question(
            15,"What rank is this?",R.drawable.o,
            "Lieutenant",
            "Lieutenant Commander",
            "Ensign",
            "Lieutenant Junior Grade",
            4
        )
        questionsList.add(que15)

        val que16 = Question(
            16,"What rank is this?",R.drawable.p,
            "Lieutenant",
            "Lieutenant Commander",
            "Lieutenant Junior Grade",
            "Captain",
            1
        )
        questionsList.add(que16)

        val que17 = Question(
            17,"What rank is this?",R.drawable.q,
            "Captain",
            "Lieutenant",
            "Lieutenant Commander",
            "Commander",
            3
        )
        questionsList.add(que17)

        val que18 = Question(
            18,"What rank is this?",R.drawable.r,
            "Captain",
            "Commander",
            "Rear Admiral Lower Half",
            "Ensign",
            2
        )
        questionsList.add(que18)

        val que19 = Question(
            19,"What rank is this?",R.drawable.s,
            "Captain",
            "Rear Admiral",
            "Vice Admiral",
            "Commander",
            1
        )
        questionsList.add(que19)

        val que20 = Question(
            20,"What rank is this?",R.drawable.t,
            "Rear Admiral",
            "Admiral",
            "Rear Admiral Lower Half",
            "Vice Admiral",
            3
        )
        questionsList.add(que20)

        val que21 = Question(
            21,"What rank is this?",R.drawable.u,
            "Rear Admiral Upper Half",
            "Rear Admiral Lower Half",
            "Vice Admiral",
            "Admiral",
            1
        )
        questionsList.add(que21)

        val que22 = Question(
            22,"What rank is this?",R.drawable.v,
            "Admiral",
            "Vice Admiral",
            "Rear Admiral",
            "Rear Admiral Lower Half",
            2
        )
        questionsList.add(que22)

        val que23 = Question(
            23,"What rank is this?",R.drawable.w,
            "Commander",
            "Rear Admiral",
            "Vice Admiral",
            "Admiral",
            4
        )
        questionsList.add(que23)

        val que24 = Question(
            24,"What rank is this?",R.drawable.x,
            "Captain",
            "Fleet Admiral",
            "Commander",
            "Admiral",
            2
        )
        questionsList.add(que24)

        return  questionsList


    }



    fun getFacts(): ArrayList<Fact>{
        val factList = ArrayList<Fact>()

        val fac1 = Fact(1,"The Coast Guard was founded on August 4, 1790.")
        factList.add(fac1)

        val fac2 = Fact(2,"Walt Disney created a special logo for the Coast Guard’s Corsair Fleet during World War II, featuring Donald Duck.")
        factList.add(fac2)

        val fac3 = Fact(3,"The Coast Guard has two official flags: The Coast Guard standard and the Coast Guard ensign.")
        factList.add(fac3)

        val fac4 = Fact(4,"Since 2003, the Coast Guard has been operating as part of the Department of Homeland Security.")
        factList.add(fac4)

        val fac5 = Fact(5,"The first permanent Coast Guard Air Station was located in Cape May, New Jersey, and was founded in 1926.")
        factList.add(fac5)

        val fac6 = Fact(6,"241,093 Coast Guard members served during World War II.")
        factList.add(fac6)

        val fac7 = Fact(7,"Coast Guard motto Semper Paratus - Always Ready.")
        factList.add(fac7)

        val fac8 = Fact(8,"Until the Navy was re-established in 1797, the Coast Guard was the only naval service in the country.")
        factList.add(fac8)

        val fac9 = Fact(9,"In 1918, sisters Genevieve and Lucille Baker were the first uniformed women to serve in the Coast Guard.")
        factList.add(fac9)

        val fac10 = Fact(10,"President George Washington commissioned the first Coast Guard officer, Captain Hopley Yeaton, on March 21, 1791.")
        factList.add(fac10)

        val fac11 = Fact(11,"The Coast Guard core values are honor, respect and devotion to duty.")
        factList.add(fac11)

        val fac12 = Fact(12,"The Coast Guard operates about 1,602 boats.")
        factList.add(fac12)

        val fac13 = Fact(13,"The Coast Guard operates about 200 Aircraft.")
        factList.add(fac13)

        val fac14 = Fact(14,"On an average day, the Coast Guard saves 10 lives.")
        factList.add(fac14)

        val fac15 = Fact(15,"On an average day, the Coast Guard seizes 874 pounds of cocaine and 214 pounds of marijuana.")
        factList.add(fac15)

        val fac16 = Fact(16,"On an average day, the Coast Guard screens 360 merchant vessels for potential security threats prior to arrival in U.S. ports.")
        factList.add(fac16)

        val fac17 = Fact(17,"The Coast Guard is the smallest of the U.S. armed forces.")
        factList.add(fac17)

        val fac18 = Fact(18,"The Coast Guard is a military service, although it is not a part of the Department of Defense.")
        factList.add(fac18)

        val fac19 = Fact(19,"The Coast Guard may board any vessel subject to the jurisdiction of the United States.")
        factList.add(fac19)

        val fac20 = Fact(20,"The United States Coast Guard Academy is a service academy of the United States Coast Guard in New London, Connecticut. Founded in 1876")
        factList.add(fac20)

        val fac21 = Fact(21,"United States Coast Guard Cutter is the term used by the U.S. Coast Guard for its commissioned vessels.")
        factList.add(fac21)

        val fac22 = Fact(22,"The NSC-type is the largest combat ship in the USCG fleet. NSC has an overall length of 127.4m (418ft) The full load displacement is 4,500t. The ship can accommodate a crew of 120")
        factList.add(fac22)


        return factList
    }

}