let avenger = {
    "full name": "Steve Rogers",
    place: "Queens",
    skills: [
      "Martial Arts",
      "Taekwondo",
      {
        BestFriend: [
          { name: "Bucky", skills: [] },
          { name: "Natasha", skills: ["Fighting" , "asdas" , "asfasf"] },
        ],
      },
    ],
    movies: ["The First Avenger", "Winter Soldier"],
    age: 200,
  };

  console.log(avenger.skills[2].BestFriend[1].skills[0]); //dot notation
  console.log(avenger["skills"][2]["BestFriend"][1]["skills"][0]); // bracket notation
  console.log(avenger.skills[2]["BestFriend"][1].skills[0]); // combined
