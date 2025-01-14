import java.util.*;

    public class TextIndexer {
        private Map<String, List<Integer>> index;
    
        public TextIndexer() {
            index = new HashMap<>();
        }
    
        // Check if the token already exists in the index
        public void addToken(String token, int position) {
        // If it exists, append the new position to the list of positions
            if (index.containsKey(token)) {
                index.get(token).add(position);
               
        // If it doesn't exist, create a new list with the current position 
            } else {
                List<Integer> positions = new ArrayList<>();
                positions.add(position);
                index.put(token, positions);
            }
        }

    // Search for the token in the index
        public List<Integer> searchToken(String token) {
            return index.getOrDefault(token, new ArrayList<>());
        }
    
        public static void main(String[] args) {
            TextIndexer textIndexer = new TextIndexer();
    
            Scanner scan = new Scanner(System.in);

            // Example text
            String text = "Frankenstein;\r\n" + //
                                "\r\n" + //
                                "or, the Modern Prometheus\r\n" + //
                                "\r\n" + //
                                "by Mary Wollstonecraft (Godwin) Shelley\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                " CONTENTS\r\n" + //
                                "\r\n" + //
                                " Letter 1\r\n" + //
                                " Letter 2\r\n" + //
                                " Letter 3\r\n" + //
                                " Letter 4\r\n" + //
                                " Chapter 1\r\n" + //
                                " Chapter 2\r\n" + //
                                " Chapter 3\r\n" + //
                                " Chapter 4\r\n" + //
                                " Chapter 5\r\n" + //
                                " Chapter 6\r\n" + //
                                " Chapter 7\r\n" + //
                                " Chapter 8\r\n" + //
                                " Chapter 9\r\n" + //
                                " Chapter 10\r\n" + //
                                " Chapter 11\r\n" + //
                                " Chapter 12\r\n" + //
                                " Chapter 13\r\n" + //
                                " Chapter 14\r\n" + //
                                " Chapter 15\r\n" + //
                                " Chapter 16\r\n" + //
                                " Chapter 17\r\n" + //
                                " Chapter 18\r\n" + //
                                " Chapter 19\r\n" + //
                                " Chapter 20\r\n" + //
                                " Chapter 21\r\n" + //
                                " Chapter 22\r\n" + //
                                " Chapter 23\r\n" + //
                                " Chapter 24\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Letter 1\r\n" + //
                                "\r\n" + //
                                "_To Mrs. Saville, England._\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "St. Petersburgh, Dec. 11th, 17—.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "You will rejoice to hear that no disaster has accompanied the\r\n" + //
                                "commencement of an enterprise which you have regarded with such evil\r\n" + //
                                "forebodings. I arrived here yesterday, and my first task is to assure\r\n" + //
                                "my dear sister of my welfare and increasing confidence in the success\r\n" + //
                                "of my undertaking.\r\n" + //
                                "\r\n" + //
                                "I am already far north of London, and as I walk in the streets of\r\n" + //
                                "Petersburgh, I feel a cold northern breeze play upon my cheeks, which\r\n" + //
                                "braces my nerves and fills me with delight. Do you understand this\r\n" + //
                                "feeling? This breeze, which has travelled from the regions towards\r\n" + //
                                "which I am advancing, gives me a foretaste of those icy climes.\r\n" + //
                                "Inspirited by this wind of promise, my daydreams become more fervent\r\n" + //
                                "and vivid. I try in vain to be persuaded that the pole is the seat of\r\n" + //
                                "frost and desolation; it ever presents itself to my imagination as the\r\n" + //
                                "region of beauty and delight. There, Margaret, the sun is for ever\r\n" + //
                                "visible, its broad disk just skirting the horizon and diffusing a\r\n" + //
                                "perpetual splendour. There—for with your leave, my sister, I will put\r\n" + //
                                "some trust in preceding navigators—there snow and frost are banished;\r\n" + //
                                "and, sailing over a calm sea, we may be wafted to a land surpassing in\r\n" + //
                                "wonders and in beauty every region hitherto discovered on the habitable\r\n" + //
                                "globe. Its productions and features may be without example, as the\r\n" + //
                                "phenomena of the heavenly bodies undoubtedly are in those undiscovered\r\n" + //
                                "solitudes. What may not be expected in a country of eternal light? I\r\n" + //
                                "may there discover the wondrous power which attracts the needle and may\r\n" + //
                                "regulate a thousand celestial observations that require only this\r\n" + //
                                "voyage to render their seeming eccentricities consistent for ever. I\r\n" + //
                                "shall satiate my ardent curiosity with the sight of a part of the world\r\n" + //
                                "never before visited, and may tread a land never before imprinted by\r\n" + //
                                "the foot of man. These are my enticements, and they are sufficient to\r\n" + //
                                "conquer all fear of danger or death and to induce me to commence this\r\n" + //
                                "laborious voyage with the joy a child feels when he embarks in a little\r\n" + //
                                "boat, with his holiday mates, on an expedition of discovery up his\r\n" + //
                                "native river. But supposing all these conjectures to be false, you\r\n" + //
                                "cannot contest the inestimable benefit which I shall confer on all\r\n" + //
                                "mankind, to the last generation, by discovering a passage near the pole\r\n" + //
                                "to those countries, to reach which at present so many months are\r\n" + //
                                "requisite; or by ascertaining the secret of the magnet, which, if at\r\n" + //
                                "all possible, can only be effected by an undertaking such as mine.\r\n" + //
                                "\r\n" + //
                                "These reflections have dispelled the agitation with which I began my\r\n" + //
                                "letter, and I feel my heart glow with an enthusiasm which elevates me\r\n" + //
                                "to heaven, for nothing contributes so much to tranquillise the mind as\r\n" + //
                                "a steady purpose—a point on which the soul may fix its intellectual\r\n" + //
                                "eye. This expedition has been the favourite dream of my early years. I\r\n" + //
                                "have read with ardour the accounts of the various voyages which have\r\n" + //
                                "been made in the prospect of arriving at the North Pacific Ocean\r\n" + //
                                "through the seas which surround the pole. You may remember that a\r\n" + //
                                "history of all the voyages made for purposes of discovery composed the\r\n" + //
                                "whole of our good Uncle Thomas’ library. My education was neglected,\r\n" + //
                                "yet I was passionately fond of reading. These volumes were my study\r\n" + //
                                "day and night, and my familiarity with them increased that regret which\r\n" + //
                                "I had felt, as a child, on learning that my father’s dying injunction\r\n" + //
                                "had forbidden my uncle to allow me to embark in a seafaring life.\r\n" + //
                                "\r\n" + //
                                "These visions faded when I perused, for the first time, those poets\r\n" + //
                                "whose effusions entranced my soul and lifted it to heaven. I also\r\n" + //
                                "became a poet and for one year lived in a paradise of my own creation;\r\n" + //
                                "I imagined that I also might obtain a niche in the temple where the\r\n" + //
                                "names of Homer and Shakespeare are consecrated. You are well\r\n" + //
                                "acquainted with my failure and how heavily I bore the disappointment.\r\n" + //
                                "But just at that time I inherited the fortune of my cousin, and my\r\n" + //
                                "thoughts were turned into the channel of their earlier bent.\r\n" + //
                                "\r\n" + //
                                "Six years have passed since I resolved on my present undertaking. I\r\n" + //
                                "can, even now, remember the hour from which I dedicated myself to this\r\n" + //
                                "great enterprise. I commenced by inuring my body to hardship. I\r\n" + //
                                "accompanied the whale-fishers on several expeditions to the North Sea;\r\n" + //
                                "I voluntarily endured cold, famine, thirst, and want of sleep; I often\r\n" + //
                                "worked harder than the common sailors during the day and devoted my\r\n" + //
                                "nights to the study of mathematics, the theory of medicine, and those\r\n" + //
                                "branches of physical science from which a naval adventurer might derive\r\n" + //
                                "the greatest practical advantage. Twice I actually hired myself as an\r\n" + //
                                "under-mate in a Greenland whaler, and acquitted myself to admiration. I\r\n" + //
                                "must own I felt a little proud when my captain offered me the second\r\n" + //
                                "dignity in the vessel and entreated me to remain with the greatest\r\n" + //
                                "earnestness, so valuable did he consider my services.\r\n" + //
                                "\r\n" + //
                                "And now, dear Margaret, do I not deserve to accomplish some great purpose?\r\n" + //
                                "My life might have been passed in ease and luxury, but I preferred glory to\r\n" + //
                                "every enticement that wealth placed in my path. Oh, that some encouraging\r\n" + //
                                "voice would answer in the affirmative! My courage and my resolution is\r\n" + //
                                "firm; but my hopes fluctuate, and my spirits are often depressed. I am\r\n" + //
                                "about to proceed on a long and difficult voyage, the emergencies of which\r\n" + //
                                "will demand all my fortitude: I am required not only to raise the spirits\r\n" + //
                                "of others, but sometimes to sustain my own, when theirs are failing.\r\n" + //
                                "\r\n" + //
                                "This is the most favourable period for travelling in Russia. They fly\r\n" + //
                                "quickly over the snow in their sledges; the motion is pleasant, and, in\r\n" + //
                                "my opinion, far more agreeable than that of an English stagecoach. The\r\n" + //
                                "cold is not excessive, if you are wrapped in furs—a dress which I have\r\n" + //
                                "already adopted, for there is a great difference between walking the\r\n" + //
                                "deck and remaining seated motionless for hours, when no exercise\r\n" + //
                                "prevents the blood from actually freezing in your veins. I have no\r\n" + //
                                "ambition to lose my life on the post-road between St. Petersburgh and\r\n" + //
                                "Archangel.\r\n" + //
                                "\r\n" + //
                                "I shall depart for the latter town in a fortnight or three weeks; and my\r\n" + //
                                "intention is to hire a ship there, which can easily be done by paying the\r\n" + //
                                "insurance for the owner, and to engage as many sailors as I think necessary\r\n" + //
                                "among those who are accustomed to the whale-fishing. I do not intend to\r\n" + //
                                "sail until the month of June; and when shall I return? Ah, dear sister, how\r\n" + //
                                "can I answer this question? If I succeed, many, many months, perhaps years,\r\n" + //
                                "will pass before you and I may meet. If I fail, you will see me again soon,\r\n" + //
                                "or never.\r\n" + //
                                "\r\n" + //
                                "Farewell, my dear, excellent Margaret. Heaven shower down blessings on you,\r\n" + //
                                "and save me, that I may again and again testify my gratitude for all your\r\n" + //
                                "love and kindness.\r\n" + //
                                "\r\n" + //
                                "Your affectionate brother,\r\n" + //
                                "\r\n" + //
                                "R. Walton\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Letter 2\r\n" + //
                                "\r\n" + //
                                "_To Mrs. Saville, England._\r\n" + //
                                "\r\n" + //
                                "Archangel, 28th March, 17—.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "How slowly the time passes here, encompassed as I am by frost and snow!\r\n" + //
                                "Yet a second step is taken towards my enterprise. I have hired a\r\n" + //
                                "vessel and am occupied in collecting my sailors; those whom I have\r\n" + //
                                "already engaged appear to be men on whom I can depend and are certainly\r\n" + //
                                "possessed of dauntless courage.\r\n" + //
                                "\r\n" + //
                                "But I have one want which I have never yet been able to satisfy, and the\r\n" + //
                                "absence of the object of which I now feel as a most severe evil, I have no\r\n" + //
                                "friend, Margaret: when I am glowing with the enthusiasm of success, there\r\n" + //
                                "will be none to participate my joy; if I am assailed by disappointment, no\r\n" + //
                                "one will endeavour to sustain me in dejection. I shall commit my thoughts\r\n" + //
                                "to paper, it is true; but that is a poor medium for the communication of\r\n" + //
                                "feeling. I desire the company of a man who could sympathise with me, whose\r\n" + //
                                "eyes would reply to mine. You may deem me romantic, my dear sister, but I\r\n" + //
                                "bitterly feel the want of a friend. I have no one near me, gentle yet\r\n" + //
                                "courageous, possessed of a cultivated as well as of a capacious mind, whose\r\n" + //
                                "tastes are like my own, to approve or amend my plans. How would such a\r\n" + //
                                "friend repair the faults of your poor brother! I am too ardent in execution\r\n" + //
                                "and too impatient of difficulties. But it is a still greater evil to me\r\n" + //
                                "that I am self-educated: for the first fourteen years of my life I ran wild\r\n" + //
                                "on a common and read nothing but our Uncle Thomas’ books of voyages.\r\n" + //
                                "At that age I became acquainted with the celebrated poets of our own\r\n" + //
                                "country; but it was only when it had ceased to be in my power to derive its\r\n" + //
                                "most important benefits from such a conviction that I perceived the\r\n" + //
                                "necessity of becoming acquainted with more languages than that of my native\r\n" + //
                                "country. Now I am twenty-eight and am in reality more illiterate than many\r\n" + //
                                "schoolboys of fifteen. It is true that I have thought more and that my\r\n" + //
                                "daydreams are more extended and magnificent, but they want (as the painters\r\n" + //
                                "call it) _keeping;_ and I greatly need a friend who would have sense\r\n" + //
                                "enough not to despise me as romantic, and affection enough for me to\r\n" + //
                                "endeavour to regulate my mind.\r\n" + //
                                "\r\n" + //
                                "Well, these are useless complaints; I shall certainly find no friend on the\r\n" + //
                                "wide ocean, nor even here in Archangel, among merchants and seamen. Yet\r\n" + //
                                "some feelings, unallied to the dross of human nature, beat even in these\r\n" + //
                                "rugged bosoms. My lieutenant, for instance, is a man of wonderful courage\r\n" + //
                                "and enterprise; he is madly desirous of glory, or rather, to word my phrase\r\n" + //
                                "more characteristically, of advancement in his profession. He is an\r\n" + //
                                "Englishman, and in the midst of national and professional prejudices,\r\n" + //
                                "unsoftened by cultivation, retains some of the noblest endowments of\r\n" + //
                                "humanity. I first became acquainted with him on board a whale vessel;\r\n" + //
                                "finding that he was unemployed in this city, I easily engaged him to assist\r\n" + //
                                "in my enterprise.\r\n" + //
                                "\r\n" + //
                                "The master is a person of an excellent disposition and is remarkable in the\r\n" + //
                                "ship for his gentleness and the mildness of his discipline. This\r\n" + //
                                "circumstance, added to his well-known integrity and dauntless courage, made\r\n" + //
                                "me very desirous to engage him. A youth passed in solitude, my best years\r\n" + //
                                "spent under your gentle and feminine fosterage, has so refined the\r\n" + //
                                "groundwork of my character that I cannot overcome an intense distaste to\r\n" + //
                                "the usual brutality exercised on board ship: I have never believed it to be\r\n" + //
                                "necessary, and when I heard of a mariner equally noted for his kindliness\r\n" + //
                                "of heart and the respect and obedience paid to him by his crew, I felt\r\n" + //
                                "myself peculiarly fortunate in being able to secure his services. I heard\r\n" + //
                                "of him first in rather a romantic manner, from a lady who owes to him the\r\n" + //
                                "happiness of her life. This, briefly, is his story. Some years ago he loved\r\n" + //
                                "a young Russian lady of moderate fortune, and having amassed a considerable\r\n" + //
                                "sum in prize-money, the father of the girl consented to the match. He saw\r\n" + //
                                "his mistress once before the destined ceremony; but she was bathed in\r\n" + //
                                "tears, and throwing herself at his feet, entreated him to spare her,\r\n" + //
                                "confessing at the same time that she loved another, but that he was poor,\r\n" + //
                                "and that her father would never consent to the union. My generous friend\r\n" + //
                                "reassured the suppliant, and on being informed of the name of her lover,\r\n" + //
                                "instantly abandoned his pursuit. He had already bought a farm with his\r\n" + //
                                "money, on which he had designed to pass the remainder of his life; but he\r\n" + //
                                "bestowed the whole on his rival, together with the remains of his\r\n" + //
                                "prize-money to purchase stock, and then himself solicited the young\r\n" + //
                                "woman’s father to consent to her marriage with her lover. But the old\r\n" + //
                                "man decidedly refused, thinking himself bound in honour to my friend, who,\r\n" + //
                                "when he found the father inexorable, quitted his country, nor returned\r\n" + //
                                "until he heard that his former mistress was married according to her\r\n" + //
                                "inclinations. “What a noble fellow!” you will exclaim. He is\r\n" + //
                                "so; but then he is wholly uneducated: he is as silent as a Turk, and a kind\r\n" + //
                                "of ignorant carelessness attends him, which, while it renders his conduct\r\n" + //
                                "the more astonishing, detracts from the interest and sympathy which\r\n" + //
                                "otherwise he would command.\r\n" + //
                                "\r\n" + //
                                "Yet do not suppose, because I complain a little or because I can\r\n" + //
                                "conceive a consolation for my toils which I may never know, that I am\r\n" + //
                                "wavering in my resolutions. Those are as fixed as fate, and my voyage\r\n" + //
                                "is only now delayed until the weather shall permit my embarkation. The\r\n" + //
                                "winter has been dreadfully severe, but the spring promises well, and it\r\n" + //
                                "is considered as a remarkably early season, so that perhaps I may sail\r\n" + //
                                "sooner than I expected. I shall do nothing rashly: you know me\r\n" + //
                                "sufficiently to confide in my prudence and considerateness whenever the\r\n" + //
                                "safety of others is committed to my care.\r\n" + //
                                "\r\n" + //
                                "I cannot describe to you my sensations on the near prospect of my\r\n" + //
                                "undertaking. It is impossible to communicate to you a conception of\r\n" + //
                                "the trembling sensation, half pleasurable and half fearful, with which\r\n" + //
                                "I am preparing to depart. I am going to unexplored regions, to “the\r\n" + //
                                "land of mist and snow,” but I shall kill no albatross; therefore do not\r\n" + //
                                "be alarmed for my safety or if I should come back to you as worn and\r\n" + //
                                "woeful as the “Ancient Mariner.” You will smile at my allusion, but I\r\n" + //
                                "will disclose a secret. I have often attributed my attachment to, my\r\n" + //
                                "passionate enthusiasm for, the dangerous mysteries of ocean to that\r\n" + //
                                "production of the most imaginative of modern poets. There is something\r\n" + //
                                "at work in my soul which I do not understand. I am practically\r\n" + //
                                "industrious—painstaking, a workman to execute with perseverance and\r\n" + //
                                "labour—but besides this there is a love for the marvellous, a belief\r\n" + //
                                "in the marvellous, intertwined in all my projects, which hurries me out\r\n" + //
                                "of the common pathways of men, even to the wild sea and unvisited\r\n" + //
                                "regions I am about to explore.\r\n" + //
                                "\r\n" + //
                                "But to return to dearer considerations. Shall I meet you again, after\r\n" + //
                                "having traversed immense seas, and returned by the most southern cape of\r\n" + //
                                "Africa or America? I dare not expect such success, yet I cannot bear to\r\n" + //
                                "look on the reverse of the picture. Continue for the present to write to\r\n" + //
                                "me by every opportunity: I may receive your letters on some occasions when\r\n" + //
                                "I need them most to support my spirits. I love you very tenderly. \r\n" + //
                                "Remember me with affection, should you never hear from me again.\r\n" + //
                                "\r\n" + //
                                "Your affectionate brother,\r\n" + //
                                " Robert Walton\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Letter 3\r\n" + //
                                "\r\n" + //
                                "_To Mrs. Saville, England._\r\n" + //
                                "\r\n" + //
                                "July 7th, 17—.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "My dear Sister,\r\n" + //
                                "\r\n" + //
                                "I write a few lines in haste to say that I am safe—and well advanced\r\n" + //
                                "on my voyage. This letter will reach England by a merchantman now on\r\n" + //
                                "its homeward voyage from Archangel; more fortunate than I, who may not\r\n" + //
                                "see my native land, perhaps, for many years. I am, however, in good\r\n" + //
                                "spirits: my men are bold and apparently firm of purpose, nor do the\r\n" + //
                                "floating sheets of ice that continually pass us, indicating the dangers\r\n" + //
                                "of the region towards which we are advancing, appear to dismay them. We\r\n" + //
                                "have already reached a very high latitude; but it is the height of\r\n" + //
                                "summer, and although not so warm as in England, the southern gales,\r\n" + //
                                "which blow us speedily towards those shores which I so ardently desire\r\n" + //
                                "to attain, breathe a degree of renovating warmth which I had not\r\n" + //
                                "expected.\r\n" + //
                                "\r\n" + //
                                "No incidents have hitherto befallen us that would make a figure in a\r\n" + //
                                "letter. One or two stiff gales and the springing of a leak are\r\n" + //
                                "accidents which experienced navigators scarcely remember to record, and\r\n" + //
                                "I shall be well content if nothing worse happen to us during our voyage.\r\n" + //
                                "\r\n" + //
                                "Adieu, my dear Margaret. Be assured that for my own sake, as well as\r\n" + //
                                "yours, I will not rashly encounter danger. I will be cool,\r\n" + //
                                "persevering, and prudent.\r\n" + //
                                "\r\n" + //
                                "But success _shall_ crown my endeavours. Wherefore not? Thus far I\r\n" + //
                                "have gone, tracing a secure way over the pathless seas, the very stars\r\n" + //
                                "themselves being witnesses and testimonies of my triumph. Why not\r\n" + //
                                "still proceed over the untamed yet obedient element? What can stop the\r\n" + //
                                "determined heart and resolved will of man?\r\n" + //
                                "\r\n" + //
                                "My swelling heart involuntarily pours itself out thus. But I must\r\n" + //
                                "finish. Heaven bless my beloved sister!\r\n" + //
                                "\r\n" + //
                                "R.W.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Letter 4\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "_To Mrs. Saville, England._\r\n" + //
                                "\r\n" + //
                                "August 5th, 17—.\r\n" + //
                                "\r\n" + //
                                "So strange an accident has happened to us that I cannot forbear\r\n" + //
                                "recording it, although it is very probable that you will see me before\r\n" + //
                                "these papers can come into your possession.\r\n" + //
                                "\r\n" + //
                                "Last Monday (July 31st) we were nearly surrounded by ice, which closed\r\n" + //
                                "in the ship on all sides, scarcely leaving her the sea-room in which\r\n" + //
                                "she floated. Our situation was somewhat dangerous, especially as we\r\n" + //
                                "were compassed round by a very thick fog. We accordingly lay to,\r\n" + //
                                "hoping that some change would take place in the atmosphere and weather.\r\n" + //
                                "\r\n" + //
                                "About two o’clock the mist cleared away, and we beheld, stretched out\r\n" + //
                                "in every direction, vast and irregular plains of ice, which seemed to\r\n" + //
                                "have no end. Some of my comrades groaned, and my own mind began to\r\n" + //
                                "grow watchful with anxious thoughts, when a strange sight suddenly\r\n" + //
                                "attracted our attention and diverted our solicitude from our own\r\n" + //
                                "situation. We perceived a low carriage, fixed on a sledge and drawn by\r\n" + //
                                "dogs, pass on towards the north, at the distance of half a mile; a\r\n" + //
                                "being which had the shape of a man, but apparently of gigantic stature,\r\n" + //
                                "sat in the sledge and guided the dogs. We watched the rapid progress\r\n" + //
                                "of the traveller with our telescopes until he was lost among the\r\n" + //
                                "distant inequalities of the ice.\r\n" + //
                                "\r\n" + //
                                "This appearance excited our unqualified wonder. We were, as we believed,\r\n" + //
                                "many hundred miles from any land; but this apparition seemed to denote that\r\n" + //
                                "it was not, in reality, so distant as we had supposed. Shut in, however, by\r\n" + //
                                "ice, it was impossible to follow his track, which we had observed with the\r\n" + //
                                "greatest attention.\r\n" + //
                                "\r\n" + //
                                "About two hours after this occurrence we heard the ground sea, and before\r\n" + //
                                "night the ice broke and freed our ship. We, however, lay to until the\r\n" + //
                                "morning, fearing to encounter in the dark those large loose masses which\r\n" + //
                                "float about after the breaking up of the ice. I profited of this time to\r\n" + //
                                "rest for a few hours.\r\n" + //
                                "\r\n" + //
                                "In the morning, however, as soon as it was light, I went upon deck and\r\n" + //
                                "found all the sailors busy on one side of the vessel, apparently\r\n" + //
                                "talking to someone in the sea. It was, in fact, a sledge, like that we\r\n" + //
                                "had seen before, which had drifted towards us in the night on a large\r\n" + //
                                "fragment of ice. Only one dog remained alive; but there was a human\r\n" + //
                                "being within it whom the sailors were persuading to enter the vessel.\r\n" + //
                                "He was not, as the other traveller seemed to be, a savage inhabitant of\r\n" + //
                                "some undiscovered island, but a European. When I appeared on deck the\r\n" + //
                                "master said, “Here is our captain, and he will not allow you to perish\r\n" + //
                                "on the open sea.”\r\n" + //
                                "\r\n" + //
                                "On perceiving me, the stranger addressed me in English, although with a\r\n" + //
                                "foreign accent. “Before I come on board your vessel,” said he,\r\n" + //
                                "“will you have the kindness to inform me whither you are bound?”\r\n" + //
                                "\r\n" + //
                                "You may conceive my astonishment on hearing such a question addressed\r\n" + //
                                "to me from a man on the brink of destruction and to whom I should have\r\n" + //
                                "supposed that my vessel would have been a resource which he would not\r\n" + //
                                "have exchanged for the most precious wealth the earth can afford. I\r\n" + //
                                "replied, however, that we were on a voyage of discovery towards the\r\n" + //
                                "northern pole.\r\n" + //
                                "\r\n" + //
                                "Upon hearing this he appeared satisfied and consented to come on board.\r\n" + //
                                "Good God! Margaret, if you had seen the man who thus capitulated for\r\n" + //
                                "his safety, your surprise would have been boundless. His limbs were\r\n" + //
                                "nearly frozen, and his body dreadfully emaciated by fatigue and\r\n" + //
                                "suffering. I never saw a man in so wretched a condition. We attempted\r\n" + //
                                "to carry him into the cabin, but as soon as he had quitted the fresh\r\n" + //
                                "air he fainted. We accordingly brought him back to the deck and\r\n" + //
                                "restored him to animation by rubbing him with brandy and forcing him to\r\n" + //
                                "swallow a small quantity. As soon as he showed signs of life we\r\n" + //
                                "wrapped him up in blankets and placed him near the chimney of the\r\n" + //
                                "kitchen stove. By slow degrees he recovered and ate a little soup,\r\n" + //
                                "which restored him wonderfully.\r\n" + //
                                "\r\n" + //
                                "Two days passed in this manner before he was able to speak, and I often\r\n" + //
                                "feared that his sufferings had deprived him of understanding. When he\r\n" + //
                                "had in some measure recovered, I removed him to my own cabin and\r\n" + //
                                "attended on him as much as my duty would permit. I never saw a more\r\n" + //
                                "interesting creature: his eyes have generally an expression of\r\n" + //
                                "wildness, and even madness, but there are moments when, if anyone\r\n" + //
                                "performs an act of kindness towards him or does him any the most\r\n" + //
                                "trifling service, his whole countenance is lighted up, as it were, with\r\n" + //
                                "a beam of benevolence and sweetness that I never saw equalled. But he\r\n" + //
                                "is generally melancholy and despairing, and sometimes he gnashes his\r\n" + //
                                "teeth, as if impatient of the weight of woes that oppresses him.\r\n" + //
                                "\r\n" + //
                                "When my guest was a little recovered I had great trouble to keep off\r\n" + //
                                "the men, who wished to ask him a thousand questions; but I would not\r\n" + //
                                "allow him to be tormented by their idle curiosity, in a state of body\r\n" + //
                                "and mind whose restoration evidently depended upon entire repose.\r\n" + //
                                "Once, however, the lieutenant asked why he had come so far upon the ice\r\n" + //
                                "in so strange a vehicle.\r\n" + //
                                "\r\n" + //
                                "His countenance instantly assumed an aspect of the deepest gloom, and\r\n" + //
                                "he replied, “To seek one who fled from me.”\r\n" + //
                                "\r\n" + //
                                "“And did the man whom you pursued travel in the same fashion?”\r\n" + //
                                "\r\n" + //
                                "“Yes.”\r\n" + //
                                "\r\n" + //
                                "“Then I fancy we have seen him, for the day before we picked you up we\r\n" + //
                                "saw some dogs drawing a sledge, with a man in it, across the ice.”\r\n" + //
                                "\r\n" + //
                                "This aroused the stranger’s attention, and he asked a multitude of\r\n" + //
                                "questions concerning the route which the dæmon, as he called him, had\r\n" + //
                                "pursued. Soon after, when he was alone with me, he said, “I have,\r\n" + //
                                "doubtless, excited your curiosity, as well as that of these good\r\n" + //
                                "people; but you are too considerate to make inquiries.”\r\n" + //
                                "\r\n" + //
                                "“Certainly; it would indeed be very impertinent and inhuman in me to\r\n" + //
                                "trouble you with any inquisitiveness of mine.”\r\n" + //
                                "\r\n" + //
                                "“And yet you rescued me from a strange and perilous situation; you have\r\n" + //
                                "benevolently restored me to life.”\r\n" + //
                                "\r\n" + //
                                "Soon after this he inquired if I thought that the breaking up of the\r\n" + //
                                "ice had destroyed the other sledge. I replied that I could not answer\r\n" + //
                                "with any degree of certainty, for the ice had not broken until near\r\n" + //
                                "midnight, and the traveller might have arrived at a place of safety\r\n" + //
                                "before that time; but of this I could not judge.\r\n" + //
                                "\r\n" + //
                                "From this time a new spirit of life animated the decaying frame of the\r\n" + //
                                "stranger. He manifested the greatest eagerness to be upon deck to watch for\r\n" + //
                                "the sledge which had before appeared; but I have persuaded him to remain in\r\n" + //
                                "the cabin, for he is far too weak to sustain the rawness of the atmosphere.\r\n" + //
                                "I have promised that someone should watch for him and give him instant\r\n" + //
                                "notice if any new object should appear in sight.\r\n" + //
                                "\r\n" + //
                                "Such is my journal of what relates to this strange occurrence up to the\r\n" + //
                                "present day. The stranger has gradually improved in health but is very\r\n" + //
                                "silent and appears uneasy when anyone except myself enters his cabin.\r\n" + //
                                "Yet his manners are so conciliating and gentle that the sailors are all\r\n" + //
                                "interested in him, although they have had very little communication\r\n" + //
                                "with him. For my own part, I begin to love him as a brother, and his\r\n" + //
                                "constant and deep grief fills me with sympathy and compassion. He must\r\n" + //
                                "have been a noble creature in his better days, being even now in wreck\r\n" + //
                                "so attractive and amiable.\r\n" + //
                                "\r\n" + //
                                "I said in one of my letters, my dear Margaret, that I should find no friend\r\n" + //
                                "on the wide ocean; yet I have found a man who, before his spirit had been\r\n" + //
                                "broken by misery, I should have been happy to have possessed as the brother\r\n" + //
                                "of my heart.\r\n" + //
                                "\r\n" + //
                                "I shall continue my journal concerning the stranger at intervals,\r\n" + //
                                "should I have any fresh incidents to record.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "August 13th, 17—.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "My affection for my guest increases every day. He excites at once my\r\n" + //
                                "admiration and my pity to an astonishing degree. How can I see so\r\n" + //
                                "noble a creature destroyed by misery without feeling the most poignant\r\n" + //
                                "grief? He is so gentle, yet so wise; his mind is so cultivated, and\r\n" + //
                                "when he speaks, although his words are culled with the choicest art,\r\n" + //
                                "yet they flow with rapidity and unparalleled eloquence.\r\n" + //
                                "\r\n" + //
                                "He is now much recovered from his illness and is continually on the deck,\r\n" + //
                                "apparently watching for the sledge that preceded his own. Yet, although\r\n" + //
                                "unhappy, he is not so utterly occupied by his own misery but that he\r\n" + //
                                "interests himself deeply in the projects of others. He has frequently\r\n" + //
                                "conversed with me on mine, which I have communicated to him without\r\n" + //
                                "disguise. He entered attentively into all my arguments in favour of my\r\n" + //
                                "eventual success and into every minute detail of the measures I had taken\r\n" + //
                                "to secure it. I was easily led by the sympathy which he evinced to use the\r\n" + //
                                "language of my heart, to give utterance to the burning ardour of my soul\r\n" + //
                                "and to say, with all the fervour that warmed me, how gladly I would\r\n" + //
                                "sacrifice my fortune, my existence, my every hope, to the furtherance of my\r\n" + //
                                "enterprise. One man’s life or death were but a small price to pay for\r\n" + //
                                "the acquirement of the knowledge which I sought, for the dominion I should\r\n" + //
                                "acquire and transmit over the elemental foes of our race. As I spoke, a\r\n" + //
                                "dark gloom spread over my listener’s countenance. At first I\r\n" + //
                                "perceived that he tried to suppress his emotion; he placed his hands before\r\n" + //
                                "his eyes, and my voice quivered and failed me as I beheld tears trickle\r\n" + //
                                "fast from between his fingers; a groan burst from his heaving breast. I\r\n" + //
                                "paused; at length he spoke, in broken accents: “Unhappy man! Do you\r\n" + //
                                "share my madness? Have you drunk also of the intoxicating draught? Hear me;\r\n" + //
                                "let me reveal my tale, and you will dash the cup from your lips!”\r\n" + //
                                "\r\n" + //
                                "Such words, you may imagine, strongly excited my curiosity; but the\r\n" + //
                                "paroxysm of grief that had seized the stranger overcame his weakened\r\n" + //
                                "powers, and many hours of repose and tranquil conversation were\r\n" + //
                                "necessary to restore his composure.\r\n" + //
                                "\r\n" + //
                                "Having conquered the violence of his feelings, he appeared to despise\r\n" + //
                                "himself for being the slave of passion; and quelling the dark tyranny of\r\n" + //
                                "despair, he led me again to converse concerning myself personally. He asked\r\n" + //
                                "me the history of my earlier years. The tale was quickly told, but it\r\n" + //
                                "awakened various trains of reflection. I spoke of my desire of finding a\r\n" + //
                                "friend, of my thirst for a more intimate sympathy with a fellow mind than\r\n" + //
                                "had ever fallen to my lot, and expressed my conviction that a man could\r\n" + //
                                "boast of little happiness who did not enjoy this blessing.\r\n" + //
                                "\r\n" + //
                                "“I agree with you,” replied the stranger; “we are\r\n" + //
                                "unfashioned creatures, but half made up, if one wiser, better, dearer than\r\n" + //
                                "ourselves—such a friend ought to be—do not lend his aid to\r\n" + //
                                "perfectionate our weak and faulty natures. I once had a friend, the most\r\n" + //
                                "noble of human creatures, and am entitled, therefore, to judge respecting\r\n" + //
                                "friendship. You have hope, and the world before you, and have no cause for\r\n" + //
                                "despair. But I—I have lost everything and cannot begin life\r\n" + //
                                "anew.”\r\n" + //
                                "\r\n" + //
                                "As he said this his countenance became expressive of a calm, settled\r\n" + //
                                "grief that touched me to the heart. But he was silent and presently\r\n" + //
                                "retired to his cabin.\r\n" + //
                                "\r\n" + //
                                "Even broken in spirit as he is, no one can feel more deeply than he\r\n" + //
                                "does the beauties of nature. The starry sky, the sea, and every sight\r\n" + //
                                "afforded by these wonderful regions seem still to have the power of\r\n" + //
                                "elevating his soul from earth. Such a man has a double existence: he\r\n" + //
                                "may suffer misery and be overwhelmed by disappointments, yet when he\r\n" + //
                                "has retired into himself, he will be like a celestial spirit that has a\r\n" + //
                                "halo around him, within whose circle no grief or folly ventures.\r\n" + //
                                "\r\n" + //
                                "Will you smile at the enthusiasm I express concerning this divine\r\n" + //
                                "wanderer? You would not if you saw him. You have been tutored and\r\n" + //
                                "refined by books and retirement from the world, and you are therefore\r\n" + //
                                "somewhat fastidious; but this only renders you the more fit to\r\n" + //
                                "appreciate the extraordinary merits of this wonderful man. Sometimes I\r\n" + //
                                "have endeavoured to discover what quality it is which he possesses that\r\n" + //
                                "elevates him so immeasurably above any other person I ever knew. I\r\n" + //
                                "believe it to be an intuitive discernment, a quick but never-failing\r\n" + //
                                "power of judgment, a penetration into the causes of things, unequalled\r\n" + //
                                "for clearness and precision; add to this a facility of expression and a\r\n" + //
                                "voice whose varied intonations are soul-subduing music.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "August 19th, 17—.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Yesterday the stranger said to me, “You may easily perceive, Captain\r\n" + //
                                "Walton, that I have suffered great and unparalleled misfortunes. I had\r\n" + //
                                "determined at one time that the memory of these evils should die with\r\n" + //
                                "me, but you have won me to alter my determination. You seek for\r\n" + //
                                "knowledge and wisdom, as I once did; and I ardently hope that the\r\n" + //
                                "gratification of your wishes may not be a serpent to sting you, as mine\r\n" + //
                                "has been. I do not know that the relation of my disasters will be\r\n" + //
                                "useful to you; yet, when I reflect that you are pursuing the same\r\n" + //
                                "course, exposing yourself to the same dangers which have rendered me\r\n" + //
                                "what I am, I imagine that you may deduce an apt moral from my tale, one\r\n" + //
                                "that may direct you if you succeed in your undertaking and console you\r\n" + //
                                "in case of failure. Prepare to hear of occurrences which are usually\r\n" + //
                                "deemed marvellous. Were we among the tamer scenes of nature I might\r\n" + //
                                "fear to encounter your unbelief, perhaps your ridicule; but many things\r\n" + //
                                "will appear possible in these wild and mysterious regions which would\r\n" + //
                                "provoke the laughter of those unacquainted with the ever-varied powers\r\n" + //
                                "of nature; nor can I doubt but that my tale conveys in its series\r\n" + //
                                "internal evidence of the truth of the events of which it is composed.”\r\n" + //
                                "\r\n" + //
                                "You may easily imagine that I was much gratified by the offered\r\n" + //
                                "communication, yet I could not endure that he should renew his grief by\r\n" + //
                                "a recital of his misfortunes. I felt the greatest eagerness to hear\r\n" + //
                                "the promised narrative, partly from curiosity and partly from a strong\r\n" + //
                                "desire to ameliorate his fate if it were in my power. I expressed\r\n" + //
                                "these feelings in my answer.\r\n" + //
                                "\r\n" + //
                                "“I thank you,” he replied, “for your sympathy, but it is\r\n" + //
                                "useless; my fate is nearly fulfilled. I wait but for one event, and then I\r\n" + //
                                "shall repose in peace. I understand your feeling,” continued he,\r\n" + //
                                "perceiving that I wished to interrupt him; “but you are mistaken, my\r\n" + //
                                "friend, if thus you will allow me to name you; nothing can alter my\r\n" + //
                                "destiny; listen to my history, and you will perceive how irrevocably it is\r\n" + //
                                "determined.”\r\n" + //
                                "\r\n" + //
                                "He then told me that he would commence his narrative the next day when I\r\n" + //
                                "should be at leisure. This promise drew from me the warmest thanks. I have\r\n" + //
                                "resolved every night, when I am not imperatively occupied by my duties, to\r\n" + //
                                "record, as nearly as possible in his own words, what he has related during\r\n" + //
                                "the day. If I should be engaged, I will at least make notes. This\r\n" + //
                                "manuscript will doubtless afford you the greatest pleasure; but to me, who\r\n" + //
                                "know him, and who hear it from his own lips—with what interest and\r\n" + //
                                "sympathy shall I read it in some future day! Even now, as I commence my\r\n" + //
                                "task, his full-toned voice swells in my ears; his lustrous eyes dwell on me\r\n" + //
                                "with all their melancholy sweetness; I see his thin hand raised in\r\n" + //
                                "animation, while the lineaments of his face are irradiated by the soul\r\n" + //
                                "within. Strange and harrowing must be his story, frightful the storm which\r\n" + //
                                "embraced the gallant vessel on its course and wrecked it—thus!\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 1\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "I am by birth a Genevese, and my family is one of the most\r\n" + //
                                "distinguished of that republic. My ancestors had been for many years\r\n" + //
                                "counsellors and syndics, and my father had filled several public\r\n" + //
                                "situations with honour and reputation. He was respected by all who\r\n" + //
                                "knew him for his integrity and indefatigable attention to public\r\n" + //
                                "business. He passed his younger days perpetually occupied by the\r\n" + //
                                "affairs of his country; a variety of circumstances had prevented his\r\n" + //
                                "marrying early, nor was it until the decline of life that he became a\r\n" + //
                                "husband and the father of a family.\r\n" + //
                                "\r\n" + //
                                "As the circumstances of his marriage illustrate his character, I cannot\r\n" + //
                                "refrain from relating them. One of his most intimate friends was a\r\n" + //
                                "merchant who, from a flourishing state, fell, through numerous\r\n" + //
                                "mischances, into poverty. This man, whose name was Beaufort, was of a\r\n" + //
                                "proud and unbending disposition and could not bear to live in poverty\r\n" + //
                                "and oblivion in the same country where he had formerly been\r\n" + //
                                "distinguished for his rank and magnificence. Having paid his debts,\r\n" + //
                                "therefore, in the most honourable manner, he retreated with his\r\n" + //
                                "daughter to the town of Lucerne, where he lived unknown and in\r\n" + //
                                "wretchedness. My father loved Beaufort with the truest friendship and\r\n" + //
                                "was deeply grieved by his retreat in these unfortunate circumstances.\r\n" + //
                                "He bitterly deplored the false pride which led his friend to a conduct\r\n" + //
                                "so little worthy of the affection that united them. He lost no time in\r\n" + //
                                "endeavouring to seek him out, with the hope of persuading him to begin\r\n" + //
                                "the world again through his credit and assistance.\r\n" + //
                                "\r\n" + //
                                "Beaufort had taken effectual measures to conceal himself, and it was ten\r\n" + //
                                "months before my father discovered his abode. Overjoyed at this discovery,\r\n" + //
                                "he hastened to the house, which was situated in a mean street near the\r\n" + //
                                "Reuss. But when he entered, misery and despair alone welcomed him. Beaufort\r\n" + //
                                "had saved but a very small sum of money from the wreck of his fortunes, but\r\n" + //
                                "it was sufficient to provide him with sustenance for some months, and in\r\n" + //
                                "the meantime he hoped to procure some respectable employment in a\r\n" + //
                                "merchant’s house. The interval was, consequently, spent in inaction;\r\n" + //
                                "his grief only became more deep and rankling when he had leisure for\r\n" + //
                                "reflection, and at length it took so fast hold of his mind that at the end\r\n" + //
                                "of three months he lay on a bed of sickness, incapable of any exertion.\r\n" + //
                                "\r\n" + //
                                "His daughter attended him with the greatest tenderness, but she saw\r\n" + //
                                "with despair that their little fund was rapidly decreasing and that\r\n" + //
                                "there was no other prospect of support. But Caroline Beaufort\r\n" + //
                                "possessed a mind of an uncommon mould, and her courage rose to support\r\n" + //
                                "her in her adversity. She procured plain work; she plaited straw and\r\n" + //
                                "by various means contrived to earn a pittance scarcely sufficient to\r\n" + //
                                "support life.\r\n" + //
                                "\r\n" + //
                                "Several months passed in this manner. Her father grew worse; her time\r\n" + //
                                "was more entirely occupied in attending him; her means of subsistence\r\n" + //
                                "decreased; and in the tenth month her father died in her arms, leaving\r\n" + //
                                "her an orphan and a beggar. This last blow overcame her, and she knelt\r\n" + //
                                "by Beaufort’s coffin weeping bitterly, when my father entered the\r\n" + //
                                "chamber. He came like a protecting spirit to the poor girl, who\r\n" + //
                                "committed herself to his care; and after the interment of his friend he\r\n" + //
                                "conducted her to Geneva and placed her under the protection of a\r\n" + //
                                "relation. Two years after this event Caroline became his wife.\r\n" + //
                                "\r\n" + //
                                "There was a considerable difference between the ages of my parents, but\r\n" + //
                                "this circumstance seemed to unite them only closer in bonds of devoted\r\n" + //
                                "affection. There was a sense of justice in my father’s upright mind\r\n" + //
                                "which rendered it necessary that he should approve highly to love\r\n" + //
                                "strongly. Perhaps during former years he had suffered from the\r\n" + //
                                "late-discovered unworthiness of one beloved and so was disposed to set\r\n" + //
                                "a greater value on tried worth. There was a show of gratitude and\r\n" + //
                                "worship in his attachment to my mother, differing wholly from the\r\n" + //
                                "doting fondness of age, for it was inspired by reverence for her\r\n" + //
                                "virtues and a desire to be the means of, in some degree, recompensing\r\n" + //
                                "her for the sorrows she had endured, but which gave inexpressible grace\r\n" + //
                                "to his behaviour to her. Everything was made to yield to her wishes\r\n" + //
                                "and her convenience. He strove to shelter her, as a fair exotic is\r\n" + //
                                "sheltered by the gardener, from every rougher wind and to surround her\r\n" + //
                                "with all that could tend to excite pleasurable emotion in her soft and\r\n" + //
                                "benevolent mind. Her health, and even the tranquillity of her hitherto\r\n" + //
                                "constant spirit, had been shaken by what she had gone through. During\r\n" + //
                                "the two years that had elapsed previous to their marriage my father had\r\n" + //
                                "gradually relinquished all his public functions; and immediately after\r\n" + //
                                "their union they sought the pleasant climate of Italy, and the change\r\n" + //
                                "of scene and interest attendant on a tour through that land of wonders,\r\n" + //
                                "as a restorative for her weakened frame.\r\n" + //
                                "\r\n" + //
                                "From Italy they visited Germany and France. I, their eldest child, was born\r\n" + //
                                "at Naples, and as an infant accompanied them in their rambles. I remained\r\n" + //
                                "for several years their only child. Much as they were attached to each\r\n" + //
                                "other, they seemed to draw inexhaustible stores of affection from a very\r\n" + //
                                "mine of love to bestow them upon me. My mother’s tender caresses and\r\n" + //
                                "my father’s smile of benevolent pleasure while regarding me are my\r\n" + //
                                "first recollections. I was their plaything and their idol, and something\r\n" + //
                                "better—their child, the innocent and helpless creature bestowed on\r\n" + //
                                "them by Heaven, whom to bring up to good, and whose future lot it was in\r\n" + //
                                "their hands to direct to happiness or misery, according as they fulfilled\r\n" + //
                                "their duties towards me. With this deep consciousness of what they owed\r\n" + //
                                "towards the being to which they had given life, added to the active spirit\r\n" + //
                                "of tenderness that animated both, it may be imagined that while during\r\n" + //
                                "every hour of my infant life I received a lesson of patience, of charity,\r\n" + //
                                "and of self-control, I was so guided by a silken cord that all seemed but\r\n" + //
                                "one train of enjoyment to me.\r\n" + //
                                "\r\n" + //
                                "For a long time I was their only care. My mother had much desired to have a\r\n" + //
                                "daughter, but I continued their single offspring. When I was about five\r\n" + //
                                "years old, while making an excursion beyond the frontiers of Italy, they\r\n" + //
                                "passed a week on the shores of the Lake of Como. Their benevolent\r\n" + //
                                "disposition often made them enter the cottages of the poor. This, to my\r\n" + //
                                "mother, was more than a duty; it was a necessity, a\r\n" + //
                                "passion—remembering what she had suffered, and how she had been\r\n" + //
                                "relieved—for her to act in her turn the guardian angel to the\r\n" + //
                                "afflicted. During one of their walks a poor cot in the foldings of a vale\r\n" + //
                                "attracted their notice as being singularly disconsolate, while the number\r\n" + //
                                "of half-clothed children gathered about it spoke of penury in its worst\r\n" + //
                                "shape. One day, when my father had gone by himself to Milan, my mother,\r\n" + //
                                "accompanied by me, visited this abode. She found a peasant and his wife,\r\n" + //
                                "hard working, bent down by care and labour, distributing a scanty meal to\r\n" + //
                                "five hungry babes. Among these there was one which attracted my mother far\r\n" + //
                                "above all the rest. She appeared of a different stock. The four others were\r\n" + //
                                "dark-eyed, hardy little vagrants; this child was thin and very fair. Her\r\n" + //
                                "hair was the brightest living gold, and despite the poverty of her\r\n" + //
                                "clothing, seemed to set a crown of distinction on her head. Her brow was\r\n" + //
                                "clear and ample, her blue eyes cloudless, and her lips and the moulding of\r\n" + //
                                "her face so expressive of sensibility and sweetness that none could behold\r\n" + //
                                "her without looking on her as of a distinct species, a being heaven-sent,\r\n" + //
                                "and bearing a celestial stamp in all her features.\r\n" + //
                                "\r\n" + //
                                "The peasant woman, perceiving that my mother fixed eyes of wonder and\r\n" + //
                                "admiration on this lovely girl, eagerly communicated her history. She was\r\n" + //
                                "not her child, but the daughter of a Milanese nobleman. Her mother was a\r\n" + //
                                "German and had died on giving her birth. The infant had been placed with\r\n" + //
                                "these good people to nurse: they were better off then. They had not been\r\n" + //
                                "long married, and their eldest child was but just born. The father of their\r\n" + //
                                "charge was one of those Italians nursed in the memory of the antique glory\r\n" + //
                                "of Italy—one among the _schiavi ognor frementi,_ who exerted\r\n" + //
                                "himself to obtain the liberty of his country. He became the victim of its\r\n" + //
                                "weakness. Whether he had died or still lingered in the dungeons of Austria\r\n" + //
                                "was not known. His property was confiscated; his child became an orphan and\r\n" + //
                                "a beggar. She continued with her foster parents and bloomed in their rude\r\n" + //
                                "abode, fairer than a garden rose among dark-leaved brambles.\r\n" + //
                                "\r\n" + //
                                "When my father returned from Milan, he found playing with me in the hall of\r\n" + //
                                "our villa a child fairer than pictured cherub—a creature who seemed\r\n" + //
                                "to shed radiance from her looks and whose form and motions were lighter\r\n" + //
                                "than the chamois of the hills. The apparition was soon explained. With his\r\n" + //
                                "permission my mother prevailed on her rustic guardians to yield their\r\n" + //
                                "charge to her. They were fond of the sweet orphan. Her presence had seemed\r\n" + //
                                "a blessing to them, but it would be unfair to her to keep her in poverty\r\n" + //
                                "and want when Providence afforded her such powerful protection. They\r\n" + //
                                "consulted their village priest, and the result was that Elizabeth Lavenza\r\n" + //
                                "became the inmate of my parents’ house—my more than\r\n" + //
                                "sister—the beautiful and adored companion of all my occupations and\r\n" + //
                                "my pleasures.\r\n" + //
                                "\r\n" + //
                                "Everyone loved Elizabeth. The passionate and almost reverential\r\n" + //
                                "attachment with which all regarded her became, while I shared it, my\r\n" + //
                                "pride and my delight. On the evening previous to her being brought to\r\n" + //
                                "my home, my mother had said playfully, “I have a pretty present for my\r\n" + //
                                "Victor—tomorrow he shall have it.” And when, on the morrow, she\r\n" + //
                                "presented Elizabeth to me as her promised gift, I, with childish\r\n" + //
                                "seriousness, interpreted her words literally and looked upon Elizabeth\r\n" + //
                                "as mine—mine to protect, love, and cherish. All praises bestowed on\r\n" + //
                                "her I received as made to a possession of my own. We called each other\r\n" + //
                                "familiarly by the name of cousin. No word, no expression could body\r\n" + //
                                "forth the kind of relation in which she stood to me—my more than\r\n" + //
                                "sister, since till death she was to be mine only.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 2\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "We were brought up together; there was not quite a year difference in\r\n" + //
                                "our ages. I need not say that we were strangers to any species of\r\n" + //
                                "disunion or dispute. Harmony was the soul of our companionship, and\r\n" + //
                                "the diversity and contrast that subsisted in our characters drew us\r\n" + //
                                "nearer together. Elizabeth was of a calmer and more concentrated\r\n" + //
                                "disposition; but, with all my ardour, I was capable of a more intense\r\n" + //
                                "application and was more deeply smitten with the thirst for knowledge.\r\n" + //
                                "She busied herself with following the aerial creations of the poets;\r\n" + //
                                "and in the majestic and wondrous scenes which surrounded our Swiss\r\n" + //
                                "home —the sublime shapes of the mountains, the changes of the seasons,\r\n" + //
                                "tempest and calm, the silence of winter, and the life and turbulence of\r\n" + //
                                "our Alpine summers—she found ample scope for admiration and delight.\r\n" + //
                                "While my companion contemplated with a serious and satisfied spirit the\r\n" + //
                                "magnificent appearances of things, I delighted in investigating their\r\n" + //
                                "causes. The world was to me a secret which I desired to divine.\r\n" + //
                                "Curiosity, earnest research to learn the hidden laws of nature,\r\n" + //
                                "gladness akin to rapture, as they were unfolded to me, are among the\r\n" + //
                                "earliest sensations I can remember.\r\n" + //
                                "\r\n" + //
                                "On the birth of a second son, my junior by seven years, my parents gave\r\n" + //
                                "up entirely their wandering life and fixed themselves in their native\r\n" + //
                                "country. We possessed a house in Geneva, and a _campagne_ on Belrive,\r\n" + //
                                "the eastern shore of the lake, at the distance of rather more than a\r\n" + //
                                "league from the city. We resided principally in the latter, and the\r\n" + //
                                "lives of my parents were passed in considerable seclusion. It was my\r\n" + //
                                "temper to avoid a crowd and to attach myself fervently to a few. I was\r\n" + //
                                "indifferent, therefore, to my school-fellows in general; but I united\r\n" + //
                                "myself in the bonds of the closest friendship to one among them. Henry\r\n" + //
                                "Clerval was the son of a merchant of Geneva. He was a boy of singular\r\n" + //
                                "talent and fancy. He loved enterprise, hardship, and even danger for\r\n" + //
                                "its own sake. He was deeply read in books of chivalry and romance. He\r\n" + //
                                "composed heroic songs and began to write many a tale of enchantment and\r\n" + //
                                "knightly adventure. He tried to make us act plays and to enter into\r\n" + //
                                "masquerades, in which the characters were drawn from the heroes of\r\n" + //
                                "Roncesvalles, of the Round Table of King Arthur, and the chivalrous\r\n" + //
                                "train who shed their blood to redeem the holy sepulchre from the hands\r\n" + //
                                "of the infidels.\r\n" + //
                                "\r\n" + //
                                "No human being could have passed a happier childhood than myself. My\r\n" + //
                                "parents were possessed by the very spirit of kindness and indulgence.\r\n" + //
                                "We felt that they were not the tyrants to rule our lot according to\r\n" + //
                                "their caprice, but the agents and creators of all the many delights\r\n" + //
                                "which we enjoyed. When I mingled with other families I distinctly\r\n" + //
                                "discerned how peculiarly fortunate my lot was, and gratitude assisted\r\n" + //
                                "the development of filial love.\r\n" + //
                                "\r\n" + //
                                "My temper was sometimes violent, and my passions vehement; but by some\r\n" + //
                                "law in my temperature they were turned not towards childish pursuits\r\n" + //
                                "but to an eager desire to learn, and not to learn all things\r\n" + //
                                "indiscriminately. I confess that neither the structure of languages,\r\n" + //
                                "nor the code of governments, nor the politics of various states\r\n" + //
                                "possessed attractions for me. It was the secrets of heaven and earth\r\n" + //
                                "that I desired to learn; and whether it was the outward substance of\r\n" + //
                                "things or the inner spirit of nature and the mysterious soul of man\r\n" + //
                                "that occupied me, still my inquiries were directed to the metaphysical,\r\n" + //
                                "or in its highest sense, the physical secrets of the world.\r\n" + //
                                "\r\n" + //
                                "Meanwhile Clerval occupied himself, so to speak, with the moral\r\n" + //
                                "relations of things. The busy stage of life, the virtues of heroes,\r\n" + //
                                "and the actions of men were his theme; and his hope and his dream was\r\n" + //
                                "to become one among those whose names are recorded in story as the\r\n" + //
                                "gallant and adventurous benefactors of our species. The saintly soul\r\n" + //
                                "of Elizabeth shone like a shrine-dedicated lamp in our peaceful home.\r\n" + //
                                "Her sympathy was ours; her smile, her soft voice, the sweet glance of\r\n" + //
                                "her celestial eyes, were ever there to bless and animate us. She was\r\n" + //
                                "the living spirit of love to soften and attract; I might have become\r\n" + //
                                "sullen in my study, rough through the ardour of my nature, but that\r\n" + //
                                "she was there to subdue me to a semblance of her own gentleness. And\r\n" + //
                                "Clerval—could aught ill entrench on the noble spirit of Clerval? Yet\r\n" + //
                                "he might not have been so perfectly humane, so thoughtful in his\r\n" + //
                                "generosity, so full of kindness and tenderness amidst his passion for\r\n" + //
                                "adventurous exploit, had she not unfolded to him the real loveliness of\r\n" + //
                                "beneficence and made the doing good the end and aim of his soaring\r\n" + //
                                "ambition.\r\n" + //
                                "\r\n" + //
                                "I feel exquisite pleasure in dwelling on the recollections of childhood,\r\n" + //
                                "before misfortune had tainted my mind and changed its bright visions of\r\n" + //
                                "extensive usefulness into gloomy and narrow reflections upon self. Besides,\r\n" + //
                                "in drawing the picture of my early days, I also record those events which\r\n" + //
                                "led, by insensible steps, to my after tale of misery, for when I would\r\n" + //
                                "account to myself for the birth of that passion which afterwards ruled my\r\n" + //
                                "destiny I find it arise, like a mountain river, from ignoble and almost\r\n" + //
                                "forgotten sources; but, swelling as it proceeded, it became the torrent\r\n" + //
                                "which, in its course, has swept away all my hopes and joys.\r\n" + //
                                "\r\n" + //
                                "Natural philosophy is the genius that has regulated my fate; I desire,\r\n" + //
                                "therefore, in this narration, to state those facts which led to my\r\n" + //
                                "predilection for that science. When I was thirteen years of age we all went\r\n" + //
                                "on a party of pleasure to the baths near Thonon; the inclemency of the\r\n" + //
                                "weather obliged us to remain a day confined to the inn. In this house I\r\n" + //
                                "chanced to find a volume of the works of Cornelius Agrippa. I opened it\r\n" + //
                                "with apathy; the theory which he attempts to demonstrate and the wonderful\r\n" + //
                                "facts which he relates soon changed this feeling into enthusiasm. A new\r\n" + //
                                "light seemed to dawn upon my mind, and bounding with joy, I communicated my\r\n" + //
                                "discovery to my father. My father looked carelessly at the title page of my\r\n" + //
                                "book and said, “Ah! Cornelius Agrippa! My dear Victor, do not waste\r\n" + //
                                "your time upon this; it is sad trash.”\r\n" + //
                                "\r\n" + //
                                "If, instead of this remark, my father had taken the pains to explain to me\r\n" + //
                                "that the principles of Agrippa had been entirely exploded and that a modern\r\n" + //
                                "system of science had been introduced which possessed much greater powers\r\n" + //
                                "than the ancient, because the powers of the latter were chimerical, while\r\n" + //
                                "those of the former were real and practical, under such circumstances I\r\n" + //
                                "should certainly have thrown Agrippa aside and have contented my\r\n" + //
                                "imagination, warmed as it was, by returning with greater ardour to my\r\n" + //
                                "former studies. It is even possible that the train of my ideas would never\r\n" + //
                                "have received the fatal impulse that led to my ruin. But the cursory glance\r\n" + //
                                "my father had taken of my volume by no means assured me that he was\r\n" + //
                                "acquainted with its contents, and I continued to read with the greatest\r\n" + //
                                "avidity.\r\n" + //
                                "\r\n" + //
                                "When I returned home my first care was to procure the whole works of this\r\n" + //
                                "author, and afterwards of Paracelsus and Albertus Magnus. I read and\r\n" + //
                                "studied the wild fancies of these writers with delight; they appeared to me\r\n" + //
                                "treasures known to few besides myself. I have described myself as always\r\n" + //
                                "having been imbued with a fervent longing to penetrate the secrets of\r\n" + //
                                "nature. In spite of the intense labour and wonderful discoveries of modern\r\n" + //
                                "philosophers, I always came from my studies discontented and unsatisfied.\r\n" + //
                                "Sir Isaac Newton is said to have avowed that he felt like a child picking\r\n" + //
                                "up shells beside the great and unexplored ocean of truth. Those of his\r\n" + //
                                "successors in each branch of natural philosophy with whom I was acquainted\r\n" + //
                                "appeared even to my boy’s apprehensions as tyros engaged in the same\r\n" + //
                                "pursuit.\r\n" + //
                                "\r\n" + //
                                "The untaught peasant beheld the elements around him and was acquainted\r\n" + //
                                "with their practical uses. The most learned philosopher knew little\r\n" + //
                                "more. He had partially unveiled the face of Nature, but her immortal\r\n" + //
                                "lineaments were still a wonder and a mystery. He might dissect,\r\n" + //
                                "anatomise, and give names; but, not to speak of a final cause, causes\r\n" + //
                                "in their secondary and tertiary grades were utterly unknown to him. I\r\n" + //
                                "had gazed upon the fortifications and impediments that seemed to keep\r\n" + //
                                "human beings from entering the citadel of nature, and rashly and\r\n" + //
                                "ignorantly I had repined.\r\n" + //
                                "\r\n" + //
                                "But here were books, and here were men who had penetrated deeper and knew\r\n" + //
                                "more. I took their word for all that they averred, and I became their\r\n" + //
                                "disciple. It may appear strange that such should arise in the eighteenth\r\n" + //
                                "century; but while I followed the routine of education in the schools of\r\n" + //
                                "Geneva, I was, to a great degree, self-taught with regard to my favourite\r\n" + //
                                "studies. My father was not scientific, and I was left to struggle with a\r\n" + //
                                "child’s blindness, added to a student’s thirst for knowledge.\r\n" + //
                                "Under the guidance of my new preceptors I entered with the greatest\r\n" + //
                                "diligence into the search of the philosopher’s stone and the elixir\r\n" + //
                                "of life; but the latter soon obtained my undivided attention. Wealth was an\r\n" + //
                                "inferior object, but what glory would attend the discovery if I could\r\n" + //
                                "banish disease from the human frame and render man invulnerable to any but\r\n" + //
                                "a violent death!\r\n" + //
                                "\r\n" + //
                                "Nor were these my only visions. The raising of ghosts or devils was a\r\n" + //
                                "promise liberally accorded by my favourite authors, the fulfilment of which\r\n" + //
                                "I most eagerly sought; and if my incantations were always unsuccessful, I\r\n" + //
                                "attributed the failure rather to my own inexperience and mistake than to a\r\n" + //
                                "want of skill or fidelity in my instructors. And thus for a time I was\r\n" + //
                                "occupied by exploded systems, mingling, like an unadept, a thousand\r\n" + //
                                "contradictory theories and floundering desperately in a very slough of\r\n" + //
                                "multifarious knowledge, guided by an ardent imagination and childish\r\n" + //
                                "reasoning, till an accident again changed the current of my ideas.\r\n" + //
                                "\r\n" + //
                                "When I was about fifteen years old we had retired to our house near\r\n" + //
                                "Belrive, when we witnessed a most violent and terrible thunderstorm. It\r\n" + //
                                "advanced from behind the mountains of Jura, and the thunder burst at once\r\n" + //
                                "with frightful loudness from various quarters of the heavens. I remained,\r\n" + //
                                "while the storm lasted, watching its progress with curiosity and delight.\r\n" + //
                                "As I stood at the door, on a sudden I beheld a stream of fire issue from an\r\n" + //
                                "old and beautiful oak which stood about twenty yards from our house; and so\r\n" + //
                                "soon as the dazzling light vanished, the oak had disappeared, and nothing\r\n" + //
                                "remained but a blasted stump. When we visited it the next morning, we found\r\n" + //
                                "the tree shattered in a singular manner. It was not splintered by the\r\n" + //
                                "shock, but entirely reduced to thin ribbons of wood. I never beheld\r\n" + //
                                "anything so utterly destroyed.\r\n" + //
                                "\r\n" + //
                                "Before this I was not unacquainted with the more obvious laws of\r\n" + //
                                "electricity. On this occasion a man of great research in natural\r\n" + //
                                "philosophy was with us, and excited by this catastrophe, he entered on\r\n" + //
                                "the explanation of a theory which he had formed on the subject of\r\n" + //
                                "electricity and galvanism, which was at once new and astonishing to me.\r\n" + //
                                "All that he said threw greatly into the shade Cornelius Agrippa,\r\n" + //
                                "Albertus Magnus, and Paracelsus, the lords of my imagination; but by\r\n" + //
                                "some fatality the overthrow of these men disinclined me to pursue my\r\n" + //
                                "accustomed studies. It seemed to me as if nothing would or could ever\r\n" + //
                                "be known. All that had so long engaged my attention suddenly grew\r\n" + //
                                "despicable. By one of those caprices of the mind which we are perhaps\r\n" + //
                                "most subject to in early youth, I at once gave up my former\r\n" + //
                                "occupations, set down natural history and all its progeny as a deformed\r\n" + //
                                "and abortive creation, and entertained the greatest disdain for a\r\n" + //
                                "would-be science which could never even step within the threshold of\r\n" + //
                                "real knowledge. In this mood of mind I betook myself to the\r\n" + //
                                "mathematics and the branches of study appertaining to that science as\r\n" + //
                                "being built upon secure foundations, and so worthy of my consideration.\r\n" + //
                                "\r\n" + //
                                "Thus strangely are our souls constructed, and by such slight ligaments\r\n" + //
                                "are we bound to prosperity or ruin. When I look back, it seems to me\r\n" + //
                                "as if this almost miraculous change of inclination and will was the\r\n" + //
                                "immediate suggestion of the guardian angel of my life—the last effort\r\n" + //
                                "made by the spirit of preservation to avert the storm that was even\r\n" + //
                                "then hanging in the stars and ready to envelop me. Her victory was\r\n" + //
                                "announced by an unusual tranquillity and gladness of soul which\r\n" + //
                                "followed the relinquishing of my ancient and latterly tormenting\r\n" + //
                                "studies. It was thus that I was to be taught to associate evil with\r\n" + //
                                "their prosecution, happiness with their disregard.\r\n" + //
                                "\r\n" + //
                                "It was a strong effort of the spirit of good, but it was ineffectual.\r\n" + //
                                "Destiny was too potent, and her immutable laws had decreed my utter and\r\n" + //
                                "terrible destruction.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 3\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "When I had attained the age of seventeen my parents resolved that I\r\n" + //
                                "should become a student at the university of Ingolstadt. I had\r\n" + //
                                "hitherto attended the schools of Geneva, but my father thought it\r\n" + //
                                "necessary for the completion of my education that I should be made\r\n" + //
                                "acquainted with other customs than those of my native country. My\r\n" + //
                                "departure was therefore fixed at an early date, but before the day\r\n" + //
                                "resolved upon could arrive, the first misfortune of my life\r\n" + //
                                "occurred—an omen, as it were, of my future misery.\r\n" + //
                                "\r\n" + //
                                "Elizabeth had caught the scarlet fever; her illness was severe, and she was\r\n" + //
                                "in the greatest danger. During her illness many arguments had been urged to\r\n" + //
                                "persuade my mother to refrain from attending upon her. She had at first\r\n" + //
                                "yielded to our entreaties, but when she heard that the life of her\r\n" + //
                                "favourite was menaced, she could no longer control her anxiety. She\r\n" + //
                                "attended her sickbed; her watchful attentions triumphed over the malignity\r\n" + //
                                "of the distemper—Elizabeth was saved, but the consequences of this\r\n" + //
                                "imprudence were fatal to her preserver. On the third day my mother\r\n" + //
                                "sickened; her fever was accompanied by the most alarming symptoms, and the\r\n" + //
                                "looks of her medical attendants prognosticated the worst event. On her\r\n" + //
                                "deathbed the fortitude and benignity of this best of women did not desert\r\n" + //
                                "her. She joined the hands of Elizabeth and myself. “My\r\n" + //
                                "children,” she said, “my firmest hopes of future happiness were\r\n" + //
                                "placed on the prospect of your union. This expectation will now be the\r\n" + //
                                "consolation of your father. Elizabeth, my love, you must supply my place to\r\n" + //
                                "my younger children. Alas! I regret that I am taken from you; and, happy\r\n" + //
                                "and beloved as I have been, is it not hard to quit you all? But these are\r\n" + //
                                "not thoughts befitting me; I will endeavour to resign myself cheerfully to\r\n" + //
                                "death and will indulge a hope of meeting you in another world.”\r\n" + //
                                "\r\n" + //
                                "She died calmly, and her countenance expressed affection even in death.\r\n" + //
                                "I need not describe the feelings of those whose dearest ties are rent\r\n" + //
                                "by that most irreparable evil, the void that presents itself to the\r\n" + //
                                "soul, and the despair that is exhibited on the countenance. It is so\r\n" + //
                                "long before the mind can persuade itself that she whom we saw every day\r\n" + //
                                "and whose very existence appeared a part of our own can have departed\r\n" + //
                                "for ever—that the brightness of a beloved eye can have been\r\n" + //
                                "extinguished and the sound of a voice so familiar and dear to the ear\r\n" + //
                                "can be hushed, never more to be heard. These are the reflections of\r\n" + //
                                "the first days; but when the lapse of time proves the reality of the\r\n" + //
                                "evil, then the actual bitterness of grief commences. Yet from whom has\r\n" + //
                                "not that rude hand rent away some dear connection? And why should I\r\n" + //
                                "describe a sorrow which all have felt, and must feel? The time at\r\n" + //
                                "length arrives when grief is rather an indulgence than a necessity; and\r\n" + //
                                "the smile that plays upon the lips, although it may be deemed a\r\n" + //
                                "sacrilege, is not banished. My mother was dead, but we had still\r\n" + //
                                "duties which we ought to perform; we must continue our course with the\r\n" + //
                                "rest and learn to think ourselves fortunate whilst one remains whom the\r\n" + //
                                "spoiler has not seized.\r\n" + //
                                "\r\n" + //
                                "My departure for Ingolstadt, which had been deferred by these events,\r\n" + //
                                "was now again determined upon. I obtained from my father a respite of\r\n" + //
                                "some weeks. It appeared to me sacrilege so soon to leave the repose,\r\n" + //
                                "akin to death, of the house of mourning and to rush into the thick of\r\n" + //
                                "life. I was new to sorrow, but it did not the less alarm me. I was\r\n" + //
                                "unwilling to quit the sight of those that remained to me, and above\r\n" + //
                                "all, I desired to see my sweet Elizabeth in some degree consoled.\r\n" + //
                                "\r\n" + //
                                "She indeed veiled her grief and strove to act the comforter to us all.\r\n" + //
                                "She looked steadily on life and assumed its duties with courage and\r\n" + //
                                "zeal. She devoted herself to those whom she had been taught to call\r\n" + //
                                "her uncle and cousins. Never was she so enchanting as at this time,\r\n" + //
                                "when she recalled the sunshine of her smiles and spent them upon us.\r\n" + //
                                "She forgot even her own regret in her endeavours to make us forget.\r\n" + //
                                "\r\n" + //
                                "The day of my departure at length arrived. Clerval spent the last\r\n" + //
                                "evening with us. He had endeavoured to persuade his father to permit\r\n" + //
                                "him to accompany me and to become my fellow student, but in vain. His\r\n" + //
                                "father was a narrow-minded trader and saw idleness and ruin in the\r\n" + //
                                "aspirations and ambition of his son. Henry deeply felt the misfortune\r\n" + //
                                "of being debarred from a liberal education. He said little, but when\r\n" + //
                                "he spoke I read in his kindling eye and in his animated glance a\r\n" + //
                                "restrained but firm resolve not to be chained to the miserable details\r\n" + //
                                "of commerce.\r\n" + //
                                "\r\n" + //
                                "We sat late. We could not tear ourselves away from each other nor\r\n" + //
                                "persuade ourselves to say the word “Farewell!” It was said, and we\r\n" + //
                                "retired under the pretence of seeking repose, each fancying that the\r\n" + //
                                "other was deceived; but when at morning’s dawn I descended to the\r\n" + //
                                "carriage which was to convey me away, they were all there—my father\r\n" + //
                                "again to bless me, Clerval to press my hand once more, my Elizabeth to\r\n" + //
                                "renew her entreaties that I would write often and to bestow the last\r\n" + //
                                "feminine attentions on her playmate and friend.\r\n" + //
                                "\r\n" + //
                                "I threw myself into the chaise that was to convey me away and indulged in\r\n" + //
                                "the most melancholy reflections. I, who had ever been surrounded by\r\n" + //
                                "amiable companions, continually engaged in endeavouring to bestow mutual\r\n" + //
                                "pleasure—I was now alone. In the university whither I was going I\r\n" + //
                                "must form my own friends and be my own protector. My life had hitherto\r\n" + //
                                "been remarkably secluded and domestic, and this had given me invincible\r\n" + //
                                "repugnance to new countenances. I loved my brothers, Elizabeth, and\r\n" + //
                                "Clerval; these were “old familiar faces,” but I believed myself\r\n" + //
                                "totally unfitted for the company of strangers. Such were my reflections as\r\n" + //
                                "I commenced my journey; but as I proceeded, my spirits and hopes rose. I\r\n" + //
                                "ardently desired the acquisition of knowledge. I had often, when at home,\r\n" + //
                                "thought it hard to remain during my youth cooped up in one place and had\r\n" + //
                                "longed to enter the world and take my station among other human beings. \r\n" + //
                                "Now my desires were complied with, and it would, indeed, have been folly to\r\n" + //
                                "repent.\r\n" + //
                                "\r\n" + //
                                "I had sufficient leisure for these and many other reflections during my\r\n" + //
                                "journey to Ingolstadt, which was long and fatiguing. At length the\r\n" + //
                                "high white steeple of the town met my eyes. I alighted and was\r\n" + //
                                "conducted to my solitary apartment to spend the evening as I pleased.\r\n" + //
                                "\r\n" + //
                                "The next morning I delivered my letters of introduction and paid a visit to\r\n" + //
                                "some of the principal professors. Chance—or rather the evil\r\n" + //
                                "influence, the Angel of Destruction, which asserted omnipotent sway over me\r\n" + //
                                "from the moment I turned my reluctant steps from my father’s\r\n" + //
                                "door—led me first to M. Krempe, professor of natural philosophy. He\r\n" + //
                                "was an uncouth man, but deeply imbued in the secrets of his science. He\r\n" + //
                                "asked me several questions concerning my progress in the different branches\r\n" + //
                                "of science appertaining to natural philosophy. I replied carelessly, and\r\n" + //
                                "partly in contempt, mentioned the names of my alchemists as the principal\r\n" + //
                                "authors I had studied. The professor stared. “Have you,” he\r\n" + //
                                "said, “really spent your time in studying such nonsense?”\r\n" + //
                                "\r\n" + //
                                "I replied in the affirmative. “Every minute,” continued M. Krempe with\r\n" + //
                                "warmth, “every instant that you have wasted on those books is utterly\r\n" + //
                                "and entirely lost. You have burdened your memory with exploded systems\r\n" + //
                                "and useless names. Good God! In what desert land have you lived,\r\n" + //
                                "where no one was kind enough to inform you that these fancies which you\r\n" + //
                                "have so greedily imbibed are a thousand years old and as musty as they\r\n" + //
                                "are ancient? I little expected, in this enlightened and scientific\r\n" + //
                                "age, to find a disciple of Albertus Magnus and Paracelsus. My dear\r\n" + //
                                "sir, you must begin your studies entirely anew.”\r\n" + //
                                "\r\n" + //
                                "So saying, he stepped aside and wrote down a list of several books\r\n" + //
                                "treating of natural philosophy which he desired me to procure, and\r\n" + //
                                "dismissed me after mentioning that in the beginning of the following\r\n" + //
                                "week he intended to commence a course of lectures upon natural\r\n" + //
                                "philosophy in its general relations, and that M. Waldman, a fellow\r\n" + //
                                "professor, would lecture upon chemistry the alternate days that he\r\n" + //
                                "omitted.\r\n" + //
                                "\r\n" + //
                                "I returned home not disappointed, for I have said that I had long\r\n" + //
                                "considered those authors useless whom the professor reprobated; but I\r\n" + //
                                "returned not at all the more inclined to recur to these studies in any\r\n" + //
                                "shape. M. Krempe was a little squat man with a gruff voice and a\r\n" + //
                                "repulsive countenance; the teacher, therefore, did not prepossess me in\r\n" + //
                                "favour of his pursuits. In rather a too philosophical and connected a\r\n" + //
                                "strain, perhaps, I have given an account of the conclusions I had come\r\n" + //
                                "to concerning them in my early years. As a child I had not been\r\n" + //
                                "content with the results promised by the modern professors of natural\r\n" + //
                                "science. With a confusion of ideas only to be accounted for by my\r\n" + //
                                "extreme youth and my want of a guide on such matters, I had retrod the\r\n" + //
                                "steps of knowledge along the paths of time and exchanged the\r\n" + //
                                "discoveries of recent inquirers for the dreams of forgotten alchemists.\r\n" + //
                                "Besides, I had a contempt for the uses of modern natural philosophy.\r\n" + //
                                "It was very different when the masters of the science sought\r\n" + //
                                "immortality and power; such views, although futile, were grand; but now\r\n" + //
                                "the scene was changed. The ambition of the inquirer seemed to limit\r\n" + //
                                "itself to the annihilation of those visions on which my interest in\r\n" + //
                                "science was chiefly founded. I was required to exchange chimeras of\r\n" + //
                                "boundless grandeur for realities of little worth.\r\n" + //
                                "\r\n" + //
                                "Such were my reflections during the first two or three days of my\r\n" + //
                                "residence at Ingolstadt, which were chiefly spent in becoming\r\n" + //
                                "acquainted with the localities and the principal residents in my new\r\n" + //
                                "abode. But as the ensuing week commenced, I thought of the information\r\n" + //
                                "which M. Krempe had given me concerning the lectures. And although I\r\n" + //
                                "could not consent to go and hear that little conceited fellow deliver\r\n" + //
                                "sentences out of a pulpit, I recollected what he had said of M.\r\n" + //
                                "Waldman, whom I had never seen, as he had hitherto been out of town.\r\n" + //
                                "\r\n" + //
                                "Partly from curiosity and partly from idleness, I went into the lecturing\r\n" + //
                                "room, which M. Waldman entered shortly after. This professor was very\r\n" + //
                                "unlike his colleague. He appeared about fifty years of age, but with an\r\n" + //
                                "aspect expressive of the greatest benevolence; a few grey hairs covered his\r\n" + //
                                "temples, but those at the back of his head were nearly black. His person\r\n" + //
                                "was short but remarkably erect and his voice the sweetest I had ever heard.\r\n" + //
                                "He began his lecture by a recapitulation of the history of chemistry and\r\n" + //
                                "the various improvements made by different men of learning, pronouncing\r\n" + //
                                "with fervour the names of the most distinguished discoverers. He then took\r\n" + //
                                "a cursory view of the present state of the science and explained many of\r\n" + //
                                "its elementary terms. After having made a few preparatory experiments, he\r\n" + //
                                "concluded with a panegyric upon modern chemistry, the terms of which I\r\n" + //
                                "shall never forget:\r\n" + //
                                "\r\n" + //
                                "“The ancient teachers of this science,” said he,\r\n" + //
                                "“promised impossibilities and performed nothing. The modern masters\r\n" + //
                                "promise very little; they know that metals cannot be transmuted and that\r\n" + //
                                "the elixir of life is a chimera but these philosophers, whose hands seem\r\n" + //
                                "only made to dabble in dirt, and their eyes to pore over the microscope or\r\n" + //
                                "crucible, have indeed performed miracles. They penetrate into the recesses\r\n" + //
                                "of nature and show how she works in her hiding-places. They ascend into the\r\n" + //
                                "heavens; they have discovered how the blood circulates, and the nature of\r\n" + //
                                "the air we breathe. They have acquired new and almost unlimited powers;\r\n" + //
                                "they can command the thunders of heaven, mimic the earthquake, and even\r\n" + //
                                "mock the invisible world with its own shadows.”\r\n" + //
                                "\r\n" + //
                                "Such were the professor’s words—rather let me say such the words of\r\n" + //
                                "the fate—enounced to destroy me. As he went on I felt as if my soul\r\n" + //
                                "were grappling with a palpable enemy; one by one the various keys were\r\n" + //
                                "touched which formed the mechanism of my being; chord after chord was\r\n" + //
                                "sounded, and soon my mind was filled with one thought, one conception,\r\n" + //
                                "one purpose. So much has been done, exclaimed the soul of\r\n" + //
                                "Frankenstein—more, far more, will I achieve; treading in the steps\r\n" + //
                                "already marked, I will pioneer a new way, explore unknown powers, and\r\n" + //
                                "unfold to the world the deepest mysteries of creation.\r\n" + //
                                "\r\n" + //
                                "I closed not my eyes that night. My internal being was in a state of\r\n" + //
                                "insurrection and turmoil; I felt that order would thence arise, but I\r\n" + //
                                "had no power to produce it. By degrees, after the morning’s dawn,\r\n" + //
                                "sleep came. I awoke, and my yesternight’s thoughts were as a dream.\r\n" + //
                                "There only remained a resolution to return to my ancient studies and to\r\n" + //
                                "devote myself to a science for which I believed myself to possess a\r\n" + //
                                "natural talent. On the same day I paid M. Waldman a visit. His\r\n" + //
                                "manners in private were even more mild and attractive than in public,\r\n" + //
                                "for there was a certain dignity in his mien during his lecture which in\r\n" + //
                                "his own house was replaced by the greatest affability and kindness. I\r\n" + //
                                "gave him pretty nearly the same account of my former pursuits as I had\r\n" + //
                                "given to his fellow professor. He heard with attention the little\r\n" + //
                                "narration concerning my studies and smiled at the names of Cornelius\r\n" + //
                                "Agrippa and Paracelsus, but without the contempt that M. Krempe had\r\n" + //
                                "exhibited. He said that “These were men to whose indefatigable zeal\r\n" + //
                                "modern philosophers were indebted for most of the foundations of their\r\n" + //
                                "knowledge. They had left to us, as an easier task, to give new names\r\n" + //
                                "and arrange in connected classifications the facts which they in a\r\n" + //
                                "great degree had been the instruments of bringing to light. The\r\n" + //
                                "labours of men of genius, however erroneously directed, scarcely ever\r\n" + //
                                "fail in ultimately turning to the solid advantage of mankind.” I\r\n" + //
                                "listened to his statement, which was delivered without any presumption\r\n" + //
                                "or affectation, and then added that his lecture had removed my\r\n" + //
                                "prejudices against modern chemists; I expressed myself in measured\r\n" + //
                                "terms, with the modesty and deference due from a youth to his\r\n" + //
                                "instructor, without letting escape (inexperience in life would have\r\n" + //
                                "made me ashamed) any of the enthusiasm which stimulated my intended\r\n" + //
                                "labours. I requested his advice concerning the books I ought to\r\n" + //
                                "procure.\r\n" + //
                                "\r\n" + //
                                "“I am happy,” said M. Waldman, “to have gained a\r\n" + //
                                "disciple; and if your application equals your ability, I have no doubt of\r\n" + //
                                "your success. Chemistry is that branch of natural philosophy in which the\r\n" + //
                                "greatest improvements have been and may be made; it is on that account that\r\n" + //
                                "I have made it my peculiar study; but at the same time, I have not\r\n" + //
                                "neglected the other branches of science. A man would make but a very sorry\r\n" + //
                                "chemist if he attended to that department of human knowledge alone. If your\r\n" + //
                                "wish is to become really a man of science and not merely a petty\r\n" + //
                                "experimentalist, I should advise you to apply to every branch of natural\r\n" + //
                                "philosophy, including mathematics.”\r\n" + //
                                "\r\n" + //
                                "He then took me into his laboratory and explained to me the uses of his\r\n" + //
                                "various machines, instructing me as to what I ought to procure and\r\n" + //
                                "promising me the use of his own when I should have advanced far enough in\r\n" + //
                                "the science not to derange their mechanism. He also gave me the list of\r\n" + //
                                "books which I had requested, and I took my leave.\r\n" + //
                                "\r\n" + //
                                "Thus ended a day memorable to me; it decided my future destiny.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 4\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "From this day natural philosophy, and particularly chemistry, in the\r\n" + //
                                "most comprehensive sense of the term, became nearly my sole occupation.\r\n" + //
                                "I read with ardour those works, so full of genius and discrimination,\r\n" + //
                                "which modern inquirers have written on these subjects. I attended the\r\n" + //
                                "lectures and cultivated the acquaintance of the men of science of the\r\n" + //
                                "university, and I found even in M. Krempe a great deal of sound sense\r\n" + //
                                "and real information, combined, it is true, with a repulsive\r\n" + //
                                "physiognomy and manners, but not on that account the less valuable. In\r\n" + //
                                "M. Waldman I found a true friend. His gentleness was never tinged by\r\n" + //
                                "dogmatism, and his instructions were given with an air of frankness and\r\n" + //
                                "good nature that banished every idea of pedantry. In a thousand ways\r\n" + //
                                "he smoothed for me the path of knowledge and made the most abstruse\r\n" + //
                                "inquiries clear and facile to my apprehension. My application was at\r\n" + //
                                "first fluctuating and uncertain; it gained strength as I proceeded and\r\n" + //
                                "soon became so ardent and eager that the stars often disappeared in the\r\n" + //
                                "light of morning whilst I was yet engaged in my laboratory.\r\n" + //
                                "\r\n" + //
                                "As I applied so closely, it may be easily conceived that my progress\r\n" + //
                                "was rapid. My ardour was indeed the astonishment of the students, and\r\n" + //
                                "my proficiency that of the masters. Professor Krempe often asked me,\r\n" + //
                                "with a sly smile, how Cornelius Agrippa went on, whilst M. Waldman\r\n" + //
                                "expressed the most heartfelt exultation in my progress. Two years\r\n" + //
                                "passed in this manner, during which I paid no visit to Geneva, but was\r\n" + //
                                "engaged, heart and soul, in the pursuit of some discoveries which I\r\n" + //
                                "hoped to make. None but those who have experienced them can conceive\r\n" + //
                                "of the enticements of science. In other studies you go as far as\r\n" + //
                                "others have gone before you, and there is nothing more to know; but in\r\n" + //
                                "a scientific pursuit there is continual food for discovery and wonder.\r\n" + //
                                "A mind of moderate capacity which closely pursues one study must\r\n" + //
                                "infallibly arrive at great proficiency in that study; and I, who\r\n" + //
                                "continually sought the attainment of one object of pursuit and was\r\n" + //
                                "solely wrapped up in this, improved so rapidly that at the end of two\r\n" + //
                                "years I made some discoveries in the improvement of some chemical\r\n" + //
                                "instruments, which procured me great esteem and admiration at the\r\n" + //
                                "university. When I had arrived at this point and had become as well\r\n" + //
                                "acquainted with the theory and practice of natural philosophy as\r\n" + //
                                "depended on the lessons of any of the professors at Ingolstadt, my\r\n" + //
                                "residence there being no longer conducive to my improvements, I thought\r\n" + //
                                "of returning to my friends and my native town, when an incident\r\n" + //
                                "happened that protracted my stay.\r\n" + //
                                "\r\n" + //
                                "One of the phenomena which had peculiarly attracted my attention was\r\n" + //
                                "the structure of the human frame, and, indeed, any animal endued with\r\n" + //
                                "life. Whence, I often asked myself, did the principle of life proceed?\r\n" + //
                                "It was a bold question, and one which has ever been considered as a\r\n" + //
                                "mystery; yet with how many things are we upon the brink of becoming\r\n" + //
                                "acquainted, if cowardice or carelessness did not restrain our\r\n" + //
                                "inquiries. I revolved these circumstances in my mind and determined\r\n" + //
                                "thenceforth to apply myself more particularly to those branches of\r\n" + //
                                "natural philosophy which relate to physiology. Unless I had been\r\n" + //
                                "animated by an almost supernatural enthusiasm, my application to this\r\n" + //
                                "study would have been irksome and almost intolerable. To examine the\r\n" + //
                                "causes of life, we must first have recourse to death. I became\r\n" + //
                                "acquainted with the science of anatomy, but this was not sufficient; I\r\n" + //
                                "must also observe the natural decay and corruption of the human body.\r\n" + //
                                "In my education my father had taken the greatest precautions that my\r\n" + //
                                "mind should be impressed with no supernatural horrors. I do not ever\r\n" + //
                                "remember to have trembled at a tale of superstition or to have feared\r\n" + //
                                "the apparition of a spirit. Darkness had no effect upon my fancy, and\r\n" + //
                                "a churchyard was to me merely the receptacle of bodies deprived of\r\n" + //
                                "life, which, from being the seat of beauty and strength, had become\r\n" + //
                                "food for the worm. Now I was led to examine the cause and progress of\r\n" + //
                                "this decay and forced to spend days and nights in vaults and\r\n" + //
                                "charnel-houses. My attention was fixed upon every object the most\r\n" + //
                                "insupportable to the delicacy of the human feelings. I saw how the\r\n" + //
                                "fine form of man was degraded and wasted; I beheld the corruption of\r\n" + //
                                "death succeed to the blooming cheek of life; I saw how the worm\r\n" + //
                                "inherited the wonders of the eye and brain. I paused, examining and\r\n" + //
                                "analysing all the minutiae of causation, as exemplified in the change\r\n" + //
                                "from life to death, and death to life, until from the midst of this\r\n" + //
                                "darkness a sudden light broke in upon me—a light so brilliant and\r\n" + //
                                "wondrous, yet so simple, that while I became dizzy with the immensity\r\n" + //
                                "of the prospect which it illustrated, I was surprised that among so\r\n" + //
                                "many men of genius who had directed their inquiries towards the same\r\n" + //
                                "science, that I alone should be reserved to discover so astonishing a\r\n" + //
                                "secret.\r\n" + //
                                "\r\n" + //
                                "Remember, I am not recording the vision of a madman. The sun does not\r\n" + //
                                "more certainly shine in the heavens than that which I now affirm is\r\n" + //
                                "true. Some miracle might have produced it, yet the stages of the\r\n" + //
                                "discovery were distinct and probable. After days and nights of\r\n" + //
                                "incredible labour and fatigue, I succeeded in discovering the cause of\r\n" + //
                                "generation and life; nay, more, I became myself capable of bestowing\r\n" + //
                                "animation upon lifeless matter.\r\n" + //
                                "\r\n" + //
                                "The astonishment which I had at first experienced on this discovery\r\n" + //
                                "soon gave place to delight and rapture. After so much time spent in\r\n" + //
                                "painful labour, to arrive at once at the summit of my desires was the\r\n" + //
                                "most gratifying consummation of my toils. But this discovery was so\r\n" + //
                                "great and overwhelming that all the steps by which I had been\r\n" + //
                                "progressively led to it were obliterated, and I beheld only the result.\r\n" + //
                                "What had been the study and desire of the wisest men since the creation\r\n" + //
                                "of the world was now within my grasp. Not that, like a magic scene, it\r\n" + //
                                "all opened upon me at once: the information I had obtained was of a\r\n" + //
                                "nature rather to direct my endeavours so soon as I should point them\r\n" + //
                                "towards the object of my search than to exhibit that object already\r\n" + //
                                "accomplished. I was like the Arabian who had been buried with the dead\r\n" + //
                                "and found a passage to life, aided only by one glimmering and seemingly\r\n" + //
                                "ineffectual light.\r\n" + //
                                "\r\n" + //
                                "I see by your eagerness and the wonder and hope which your eyes\r\n" + //
                                "express, my friend, that you expect to be informed of the secret with\r\n" + //
                                "which I am acquainted; that cannot be; listen patiently until the end\r\n" + //
                                "of my story, and you will easily perceive why I am reserved upon that\r\n" + //
                                "subject. I will not lead you on, unguarded and ardent as I then was,\r\n" + //
                                "to your destruction and infallible misery. Learn from me, if not by my\r\n" + //
                                "precepts, at least by my example, how dangerous is the acquirement of\r\n" + //
                                "knowledge and how much happier that man is who believes his native town\r\n" + //
                                "to be the world, than he who aspires to become greater than his nature\r\n" + //
                                "will allow.\r\n" + //
                                "\r\n" + //
                                "When I found so astonishing a power placed within my hands, I hesitated\r\n" + //
                                "a long time concerning the manner in which I should employ it.\r\n" + //
                                "Although I possessed the capacity of bestowing animation, yet to\r\n" + //
                                "prepare a frame for the reception of it, with all its intricacies of\r\n" + //
                                "fibres, muscles, and veins, still remained a work of inconceivable\r\n" + //
                                "difficulty and labour. I doubted at first whether I should attempt the\r\n" + //
                                "creation of a being like myself, or one of simpler organization; but my\r\n" + //
                                "imagination was too much exalted by my first success to permit me to\r\n" + //
                                "doubt of my ability to give life to an animal as complex and wonderful\r\n" + //
                                "as man. The materials at present within my command hardly appeared\r\n" + //
                                "adequate to so arduous an undertaking, but I doubted not that I should\r\n" + //
                                "ultimately succeed. I prepared myself for a multitude of reverses; my\r\n" + //
                                "operations might be incessantly baffled, and at last my work be\r\n" + //
                                "imperfect, yet when I considered the improvement which every day takes\r\n" + //
                                "place in science and mechanics, I was encouraged to hope my present\r\n" + //
                                "attempts would at least lay the foundations of future success. Nor\r\n" + //
                                "could I consider the magnitude and complexity of my plan as any\r\n" + //
                                "argument of its impracticability. It was with these feelings that I\r\n" + //
                                "began the creation of a human being. As the minuteness of the parts\r\n" + //
                                "formed a great hindrance to my speed, I resolved, contrary to my first\r\n" + //
                                "intention, to make the being of a gigantic stature, that is to say,\r\n" + //
                                "about eight feet in height, and proportionably large. After having\r\n" + //
                                "formed this determination and having spent some months in successfully\r\n" + //
                                "collecting and arranging my materials, I began.\r\n" + //
                                "\r\n" + //
                                "No one can conceive the variety of feelings which bore me onwards, like\r\n" + //
                                "a hurricane, in the first enthusiasm of success. Life and death\r\n" + //
                                "appeared to me ideal bounds, which I should first break through, and\r\n" + //
                                "pour a torrent of light into our dark world. A new species would bless\r\n" + //
                                "me as its creator and source; many happy and excellent natures would\r\n" + //
                                "owe their being to me. No father could claim the gratitude of his\r\n" + //
                                "child so completely as I should deserve theirs. Pursuing these\r\n" + //
                                "reflections, I thought that if I could bestow animation upon lifeless\r\n" + //
                                "matter, I might in process of time (although I now found it impossible)\r\n" + //
                                "renew life where death had apparently devoted the body to corruption.\r\n" + //
                                "\r\n" + //
                                "These thoughts supported my spirits, while I pursued my undertaking\r\n" + //
                                "with unremitting ardour. My cheek had grown pale with study, and my\r\n" + //
                                "person had become emaciated with confinement. Sometimes, on the very\r\n" + //
                                "brink of certainty, I failed; yet still I clung to the hope which the\r\n" + //
                                "next day or the next hour might realise. One secret which I alone\r\n" + //
                                "possessed was the hope to which I had dedicated myself; and the moon\r\n" + //
                                "gazed on my midnight labours, while, with unrelaxed and breathless\r\n" + //
                                "eagerness, I pursued nature to her hiding-places. Who shall conceive\r\n" + //
                                "the horrors of my secret toil as I dabbled among the unhallowed damps\r\n" + //
                                "of the grave or tortured the living animal to animate the lifeless\r\n" + //
                                "clay? My limbs now tremble, and my eyes swim with the remembrance; but\r\n" + //
                                "then a resistless and almost frantic impulse urged me forward; I seemed\r\n" + //
                                "to have lost all soul or sensation but for this one pursuit. It was\r\n" + //
                                "indeed but a passing trance, that only made me feel with renewed\r\n" + //
                                "acuteness so soon as, the unnatural stimulus ceasing to operate, I had\r\n" + //
                                "returned to my old habits. I collected bones from charnel-houses and\r\n" + //
                                "disturbed, with profane fingers, the tremendous secrets of the human\r\n" + //
                                "frame. In a solitary chamber, or rather cell, at the top of the house,\r\n" + //
                                "and separated from all the other apartments by a gallery and staircase,\r\n" + //
                                "I kept my workshop of filthy creation; my eyeballs were starting from\r\n" + //
                                "their sockets in attending to the details of my employment. The\r\n" + //
                                "dissecting room and the slaughter-house furnished many of my materials;\r\n" + //
                                "and often did my human nature turn with loathing from my occupation,\r\n" + //
                                "whilst, still urged on by an eagerness which perpetually increased, I\r\n" + //
                                "brought my work near to a conclusion.\r\n" + //
                                "\r\n" + //
                                "The summer months passed while I was thus engaged, heart and soul, in\r\n" + //
                                "one pursuit. It was a most beautiful season; never did the fields\r\n" + //
                                "bestow a more plentiful harvest or the vines yield a more luxuriant\r\n" + //
                                "vintage, but my eyes were insensible to the charms of nature. And the\r\n" + //
                                "same feelings which made me neglect the scenes around me caused me also\r\n" + //
                                "to forget those friends who were so many miles absent, and whom I had\r\n" + //
                                "not seen for so long a time. I knew my silence disquieted them, and I\r\n" + //
                                "well remembered the words of my father: “I know that while you are\r\n" + //
                                "pleased with yourself you will think of us with affection, and we shall\r\n" + //
                                "hear regularly from you. You must pardon me if I regard any\r\n" + //
                                "interruption in your correspondence as a proof that your other duties\r\n" + //
                                "are equally neglected.”\r\n" + //
                                "\r\n" + //
                                "I knew well therefore what would be my father’s feelings, but I could\r\n" + //
                                "not tear my thoughts from my employment, loathsome in itself, but which\r\n" + //
                                "had taken an irresistible hold of my imagination. I wished, as it\r\n" + //
                                "were, to procrastinate all that related to my feelings of affection\r\n" + //
                                "until the great object, which swallowed up every habit of my nature,\r\n" + //
                                "should be completed.\r\n" + //
                                "\r\n" + //
                                "I then thought that my father would be unjust if he ascribed my neglect\r\n" + //
                                "to vice or faultiness on my part, but I am now convinced that he was\r\n" + //
                                "justified in conceiving that I should not be altogether free from\r\n" + //
                                "blame. A human being in perfection ought always to preserve a calm and\r\n" + //
                                "peaceful mind and never to allow passion or a transitory desire to\r\n" + //
                                "disturb his tranquillity. I do not think that the pursuit of knowledge\r\n" + //
                                "is an exception to this rule. If the study to which you apply yourself\r\n" + //
                                "has a tendency to weaken your affections and to destroy your taste for\r\n" + //
                                "those simple pleasures in which no alloy can possibly mix, then that\r\n" + //
                                "study is certainly unlawful, that is to say, not befitting the human\r\n" + //
                                "mind. If this rule were always observed; if no man allowed any pursuit\r\n" + //
                                "whatsoever to interfere with the tranquillity of his domestic\r\n" + //
                                "affections, Greece had not been enslaved, Cæsar would have spared his\r\n" + //
                                "country, America would have been discovered more gradually, and the\r\n" + //
                                "empires of Mexico and Peru had not been destroyed.\r\n" + //
                                "\r\n" + //
                                "But I forget that I am moralizing in the most interesting part of my\r\n" + //
                                "tale, and your looks remind me to proceed.\r\n" + //
                                "\r\n" + //
                                "My father made no reproach in his letters and only took notice of my\r\n" + //
                                "silence by inquiring into my occupations more particularly than before.\r\n" + //
                                "Winter, spring, and summer passed away during my labours; but I did not\r\n" + //
                                "watch the blossom or the expanding leaves—sights which before always\r\n" + //
                                "yielded me supreme delight—so deeply was I engrossed in my\r\n" + //
                                "occupation. The leaves of that year had withered before my work drew near\r\n" + //
                                "to a close, and now every day showed me more plainly how well I had\r\n" + //
                                "succeeded. But my enthusiasm was checked by my anxiety, and I appeared\r\n" + //
                                "rather like one doomed by slavery to toil in the mines, or any other\r\n" + //
                                "unwholesome trade than an artist occupied by his favourite employment.\r\n" + //
                                "Every night I was oppressed by a slow fever, and I became nervous to a most\r\n" + //
                                "painful degree; the fall of a leaf startled me, and I shunned my fellow\r\n" + //
                                "creatures as if I had been guilty of a crime. Sometimes I grew alarmed at\r\n" + //
                                "the wreck I perceived that I had become; the energy of my purpose alone\r\n" + //
                                "sustained me: my labours would soon end, and I believed that exercise and\r\n" + //
                                "amusement would then drive away incipient disease; and I promised myself\r\n" + //
                                "both of these when my creation should be complete.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 5\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "It was on a dreary night of November that I beheld the accomplishment\r\n" + //
                                "of my toils. With an anxiety that almost amounted to agony, I\r\n" + //
                                "collected the instruments of life around me, that I might infuse a\r\n" + //
                                "spark of being into the lifeless thing that lay at my feet. It was\r\n" + //
                                "already one in the morning; the rain pattered dismally against the\r\n" + //
                                "panes, and my candle was nearly burnt out, when, by the glimmer of the\r\n" + //
                                "half-extinguished light, I saw the dull yellow eye of the creature\r\n" + //
                                "open; it breathed hard, and a convulsive motion agitated its limbs.\r\n" + //
                                "\r\n" + //
                                "How can I describe my emotions at this catastrophe, or how delineate\r\n" + //
                                "the wretch whom with such infinite pains and care I had endeavoured to\r\n" + //
                                "form? His limbs were in proportion, and I had selected his features as\r\n" + //
                                "beautiful. Beautiful! Great God! His yellow skin scarcely covered\r\n" + //
                                "the work of muscles and arteries beneath; his hair was of a lustrous\r\n" + //
                                "black, and flowing; his teeth of a pearly whiteness; but these\r\n" + //
                                "luxuriances only formed a more horrid contrast with his watery eyes,\r\n" + //
                                "that seemed almost of the same colour as the dun-white sockets in which\r\n" + //
                                "they were set, his shrivelled complexion and straight black lips.\r\n" + //
                                "\r\n" + //
                                "The different accidents of life are not so changeable as the feelings\r\n" + //
                                "of human nature. I had worked hard for nearly two years, for the sole\r\n" + //
                                "purpose of infusing life into an inanimate body. For this I had\r\n" + //
                                "deprived myself of rest and health. I had desired it with an ardour\r\n" + //
                                "that far exceeded moderation; but now that I had finished, the beauty\r\n" + //
                                "of the dream vanished, and breathless horror and disgust filled my\r\n" + //
                                "heart. Unable to endure the aspect of the being I had created, I\r\n" + //
                                "rushed out of the room and continued a long time traversing my\r\n" + //
                                "bed-chamber, unable to compose my mind to sleep. At length lassitude\r\n" + //
                                "succeeded to the tumult I had before endured, and I threw myself on the\r\n" + //
                                "bed in my clothes, endeavouring to seek a few moments of forgetfulness.\r\n" + //
                                "But it was in vain; I slept, indeed, but I was disturbed by the wildest\r\n" + //
                                "dreams. I thought I saw Elizabeth, in the bloom of health, walking in\r\n" + //
                                "the streets of Ingolstadt. Delighted and surprised, I embraced her,\r\n" + //
                                "but as I imprinted the first kiss on her lips, they became livid with\r\n" + //
                                "the hue of death; her features appeared to change, and I thought that I\r\n" + //
                                "held the corpse of my dead mother in my arms; a shroud enveloped her\r\n" + //
                                "form, and I saw the grave-worms crawling in the folds of the flannel.\r\n" + //
                                "I started from my sleep with horror; a cold dew covered my forehead, my\r\n" + //
                                "teeth chattered, and every limb became convulsed; when, by the dim and\r\n" + //
                                "yellow light of the moon, as it forced its way through the window\r\n" + //
                                "shutters, I beheld the wretch—the miserable monster whom I had\r\n" + //
                                "created. He held up the curtain of the bed; and his eyes, if eyes they\r\n" + //
                                "may be called, were fixed on me. His jaws opened, and he muttered some\r\n" + //
                                "inarticulate sounds, while a grin wrinkled his cheeks. He might have\r\n" + //
                                "spoken, but I did not hear; one hand was stretched out, seemingly to\r\n" + //
                                "detain me, but I escaped and rushed downstairs. I took refuge in the\r\n" + //
                                "courtyard belonging to the house which I inhabited, where I remained\r\n" + //
                                "during the rest of the night, walking up and down in the greatest\r\n" + //
                                "agitation, listening attentively, catching and fearing each sound as if\r\n" + //
                                "it were to announce the approach of the demoniacal corpse to which I\r\n" + //
                                "had so miserably given life.\r\n" + //
                                "\r\n" + //
                                "Oh! No mortal could support the horror of that countenance. A mummy\r\n" + //
                                "again endued with animation could not be so hideous as that wretch. I\r\n" + //
                                "had gazed on him while unfinished; he was ugly then, but when those\r\n" + //
                                "muscles and joints were rendered capable of motion, it became a thing\r\n" + //
                                "such as even Dante could not have conceived.\r\n" + //
                                "\r\n" + //
                                "I passed the night wretchedly. Sometimes my pulse beat so quickly and\r\n" + //
                                "hardly that I felt the palpitation of every artery; at others, I nearly\r\n" + //
                                "sank to the ground through languor and extreme weakness. Mingled with\r\n" + //
                                "this horror, I felt the bitterness of disappointment; dreams that had\r\n" + //
                                "been my food and pleasant rest for so long a space were now become a\r\n" + //
                                "hell to me; and the change was so rapid, the overthrow so complete!\r\n" + //
                                "\r\n" + //
                                "Morning, dismal and wet, at length dawned and discovered to my\r\n" + //
                                "sleepless and aching eyes the church of Ingolstadt, its white steeple\r\n" + //
                                "and clock, which indicated the sixth hour. The porter opened the gates\r\n" + //
                                "of the court, which had that night been my asylum, and I issued into\r\n" + //
                                "the streets, pacing them with quick steps, as if I sought to avoid the\r\n" + //
                                "wretch whom I feared every turning of the street would present to my\r\n" + //
                                "view. I did not dare return to the apartment which I inhabited, but\r\n" + //
                                "felt impelled to hurry on, although drenched by the rain which poured\r\n" + //
                                "from a black and comfortless sky.\r\n" + //
                                "\r\n" + //
                                "I continued walking in this manner for some time, endeavouring by\r\n" + //
                                "bodily exercise to ease the load that weighed upon my mind. I\r\n" + //
                                "traversed the streets without any clear conception of where I was or\r\n" + //
                                "what I was doing. My heart palpitated in the sickness of fear, and I\r\n" + //
                                "hurried on with irregular steps, not daring to look about me:\r\n" + //
                                " \r\n" + //
                                " Like one who, on a lonely road,\r\n" + //
                                " Doth walk in fear and dread,\r\n" + //
                                " And, having once turned round, walks on,\r\n" + //
                                " And turns no more his head;\r\n" + //
                                " Because he knows a frightful fiend\r\n" + //
                                " Doth close behind him tread.\r\n" + //
                                " \r\n" + //
                                " [Coleridge’s “Ancient Mariner.”]\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Continuing thus, I came at length opposite to the inn at which the various\r\n" + //
                                "diligences and carriages usually stopped. Here I paused, I knew not why;\r\n" + //
                                "but I remained some minutes with my eyes fixed on a coach that was coming\r\n" + //
                                "towards me from the other end of the street. As it drew nearer I observed\r\n" + //
                                "that it was the Swiss diligence; it stopped just where I was standing, and\r\n" + //
                                "on the door being opened, I perceived Henry Clerval, who, on seeing me,\r\n" + //
                                "instantly sprung out. “My dear Frankenstein,” exclaimed he,\r\n" + //
                                "“how glad I am to see you! How fortunate that you should be here at\r\n" + //
                                "the very moment of my alighting!”\r\n" + //
                                "\r\n" + //
                                "Nothing could equal my delight on seeing Clerval; his presence brought back\r\n" + //
                                "to my thoughts my father, Elizabeth, and all those scenes of home so dear\r\n" + //
                                "to my recollection. I grasped his hand, and in a moment forgot my horror\r\n" + //
                                "and misfortune; I felt suddenly, and for the first time during many months,\r\n" + //
                                "calm and serene joy. I welcomed my friend, therefore, in the most cordial\r\n" + //
                                "manner, and we walked towards my college. Clerval continued talking for\r\n" + //
                                "some time about our mutual friends and his own good fortune in being\r\n" + //
                                "permitted to come to Ingolstadt. “You may easily believe,” said\r\n" + //
                                "he, “how great was the difficulty to persuade my father that all\r\n" + //
                                "necessary knowledge was not comprised in the noble art of book-keeping;\r\n" + //
                                "and, indeed, I believe I left him incredulous to the last, for his constant\r\n" + //
                                "answer to my unwearied entreaties was the same as that of the Dutch\r\n" + //
                                "schoolmaster in The Vicar of Wakefield: ‘I have ten thousand florins\r\n" + //
                                "a year without Greek, I eat heartily without Greek.’ But his\r\n" + //
                                "affection for me at length overcame his dislike of learning, and he has\r\n" + //
                                "permitted me to undertake a voyage of discovery to the land of\r\n" + //
                                "knowledge.”\r\n" + //
                                "\r\n" + //
                                "“It gives me the greatest delight to see you; but tell me how you left\r\n" + //
                                "my father, brothers, and Elizabeth.”\r\n" + //
                                "\r\n" + //
                                "“Very well, and very happy, only a little uneasy that they hear from\r\n" + //
                                "you so seldom. By the by, I mean to lecture you a little upon their\r\n" + //
                                "account myself. But, my dear Frankenstein,” continued he, stopping\r\n" + //
                                "short and gazing full in my face, “I did not before remark how very ill\r\n" + //
                                "you appear; so thin and pale; you look as if you had been watching for\r\n" + //
                                "several nights.”\r\n" + //
                                "\r\n" + //
                                "“You have guessed right; I have lately been so deeply engaged in one\r\n" + //
                                "occupation that I have not allowed myself sufficient rest, as you see;\r\n" + //
                                "but I hope, I sincerely hope, that all these employments are now at an\r\n" + //
                                "end and that I am at length free.”\r\n" + //
                                "\r\n" + //
                                "I trembled excessively; I could not endure to think of, and far less to\r\n" + //
                                "allude to, the occurrences of the preceding night. I walked with a\r\n" + //
                                "quick pace, and we soon arrived at my college. I then reflected, and\r\n" + //
                                "the thought made me shiver, that the creature whom I had left in my\r\n" + //
                                "apartment might still be there, alive and walking about. I dreaded to\r\n" + //
                                "behold this monster, but I feared still more that Henry should see him.\r\n" + //
                                "Entreating him, therefore, to remain a few minutes at the bottom of the\r\n" + //
                                "stairs, I darted up towards my own room. My hand was already on the\r\n" + //
                                "lock of the door before I recollected myself. I then paused, and a\r\n" + //
                                "cold shivering came over me. I threw the door forcibly open, as\r\n" + //
                                "children are accustomed to do when they expect a spectre to stand in\r\n" + //
                                "waiting for them on the other side; but nothing appeared. I stepped\r\n" + //
                                "fearfully in: the apartment was empty, and my bedroom was also freed\r\n" + //
                                "from its hideous guest. I could hardly believe that so great a good\r\n" + //
                                "fortune could have befallen me, but when I became assured that my enemy\r\n" + //
                                "had indeed fled, I clapped my hands for joy and ran down to Clerval.\r\n" + //
                                "\r\n" + //
                                "We ascended into my room, and the servant presently brought breakfast;\r\n" + //
                                "but I was unable to contain myself. It was not joy only that possessed\r\n" + //
                                "me; I felt my flesh tingle with excess of sensitiveness, and my pulse\r\n" + //
                                "beat rapidly. I was unable to remain for a single instant in the same\r\n" + //
                                "place; I jumped over the chairs, clapped my hands, and laughed aloud.\r\n" + //
                                "Clerval at first attributed my unusual spirits to joy on his arrival,\r\n" + //
                                "but when he observed me more attentively, he saw a wildness in my eyes\r\n" + //
                                "for which he could not account, and my loud, unrestrained, heartless\r\n" + //
                                "laughter frightened and astonished him.\r\n" + //
                                "\r\n" + //
                                "“My dear Victor,” cried he, “what, for God’s sake,\r\n" + //
                                "is the matter? Do not laugh in that manner. How ill you are! What is the\r\n" + //
                                "cause of all this?”\r\n" + //
                                "\r\n" + //
                                "“Do not ask me,” cried I, putting my hands before my eyes, for I\r\n" + //
                                "thought I saw the dreaded spectre glide into the room; “_he_ can\r\n" + //
                                "tell. Oh, save me! Save me!” I imagined that the monster seized me;\r\n" + //
                                "I struggled furiously and fell down in a fit.\r\n" + //
                                "\r\n" + //
                                "Poor Clerval! What must have been his feelings? A meeting, which he\r\n" + //
                                "anticipated with such joy, so strangely turned to bitterness. But I\r\n" + //
                                "was not the witness of his grief, for I was lifeless and did not\r\n" + //
                                "recover my senses for a long, long time.\r\n" + //
                                "\r\n" + //
                                "This was the commencement of a nervous fever which confined me for\r\n" + //
                                "several months. During all that time Henry was my only nurse. I\r\n" + //
                                "afterwards learned that, knowing my father’s advanced age and unfitness\r\n" + //
                                "for so long a journey, and how wretched my sickness would make\r\n" + //
                                "Elizabeth, he spared them this grief by concealing the extent of my\r\n" + //
                                "disorder. He knew that I could not have a more kind and attentive\r\n" + //
                                "nurse than himself; and, firm in the hope he felt of my recovery, he\r\n" + //
                                "did not doubt that, instead of doing harm, he performed the kindest\r\n" + //
                                "action that he could towards them.\r\n" + //
                                "\r\n" + //
                                "But I was in reality very ill, and surely nothing but the unbounded and\r\n" + //
                                "unremitting attentions of my friend could have restored me to life.\r\n" + //
                                "The form of the monster on whom I had bestowed existence was for ever\r\n" + //
                                "before my eyes, and I raved incessantly concerning him. Doubtless my\r\n" + //
                                "words surprised Henry; he at first believed them to be the wanderings\r\n" + //
                                "of my disturbed imagination, but the pertinacity with which I\r\n" + //
                                "continually recurred to the same subject persuaded him that my disorder\r\n" + //
                                "indeed owed its origin to some uncommon and terrible event.\r\n" + //
                                "\r\n" + //
                                "By very slow degrees, and with frequent relapses that alarmed and\r\n" + //
                                "grieved my friend, I recovered. I remember the first time I became\r\n" + //
                                "capable of observing outward objects with any kind of pleasure, I\r\n" + //
                                "perceived that the fallen leaves had disappeared and that the young\r\n" + //
                                "buds were shooting forth from the trees that shaded my window. It was\r\n" + //
                                "a divine spring, and the season contributed greatly to my\r\n" + //
                                "convalescence. I felt also sentiments of joy and affection revive in\r\n" + //
                                "my bosom; my gloom disappeared, and in a short time I became as\r\n" + //
                                "cheerful as before I was attacked by the fatal passion.\r\n" + //
                                "\r\n" + //
                                "“Dearest Clerval,” exclaimed I, “how kind, how very good\r\n" + //
                                "you are to me. This whole winter, instead of being spent in study, as you\r\n" + //
                                "promised yourself, has been consumed in my sick room. How shall I ever\r\n" + //
                                "repay you? I feel the greatest remorse for the disappointment of which I\r\n" + //
                                "have been the occasion, but you will forgive me.”\r\n" + //
                                "\r\n" + //
                                "“You will repay me entirely if you do not discompose yourself, but get\r\n" + //
                                "well as fast as you can; and since you appear in such good spirits, I\r\n" + //
                                "may speak to you on one subject, may I not?”\r\n" + //
                                "\r\n" + //
                                "I trembled. One subject! What could it be? Could he allude to an object on\r\n" + //
                                "whom I dared not even think?\r\n" + //
                                "\r\n" + //
                                "“Compose yourself,” said Clerval, who observed my change of\r\n" + //
                                "colour, “I will not mention it if it agitates you; but your father\r\n" + //
                                "and cousin would be very happy if they received a letter from you in your\r\n" + //
                                "own handwriting. They hardly know how ill you have been and are uneasy at\r\n" + //
                                "your long silence.”\r\n" + //
                                "\r\n" + //
                                "“Is that all, my dear Henry? How could you suppose that my first\r\n" + //
                                "thought would not fly towards those dear, dear friends whom I love and\r\n" + //
                                "who are so deserving of my love?”\r\n" + //
                                "\r\n" + //
                                "“If this is your present temper, my friend, you will perhaps be glad\r\n" + //
                                "to see a letter that has been lying here some days for you; it is from\r\n" + //
                                "your cousin, I believe.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 6\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Clerval then put the following letter into my hands. It was from my\r\n" + //
                                "own Elizabeth:\r\n" + //
                                "\r\n" + //
                                "“My dearest Cousin,\r\n" + //
                                "\r\n" + //
                                "“You have been ill, very ill, and even the constant letters of dear\r\n" + //
                                "kind Henry are not sufficient to reassure me on your account. You are\r\n" + //
                                "forbidden to write—to hold a pen; yet one word from you, dear Victor,\r\n" + //
                                "is necessary to calm our apprehensions. For a long time I have thought\r\n" + //
                                "that each post would bring this line, and my persuasions have\r\n" + //
                                "restrained my uncle from undertaking a journey to Ingolstadt. I have\r\n" + //
                                "prevented his encountering the inconveniences and perhaps dangers of so\r\n" + //
                                "long a journey, yet how often have I regretted not being able to\r\n" + //
                                "perform it myself! I figure to myself that the task of attending on\r\n" + //
                                "your sickbed has devolved on some mercenary old nurse, who could never\r\n" + //
                                "guess your wishes nor minister to them with the care and affection of\r\n" + //
                                "your poor cousin. Yet that is over now: Clerval writes that indeed\r\n" + //
                                "you are getting better. I eagerly hope that you will confirm this\r\n" + //
                                "intelligence soon in your own handwriting.\r\n" + //
                                "\r\n" + //
                                "“Get well—and return to us. You will find a happy, cheerful home and\r\n" + //
                                "friends who love you dearly. Your father’s health is vigorous, and he\r\n" + //
                                "asks but to see you, but to be assured that you are well; and not a\r\n" + //
                                "care will ever cloud his benevolent countenance. How pleased you would\r\n" + //
                                "be to remark the improvement of our Ernest! He is now sixteen and full\r\n" + //
                                "of activity and spirit. He is desirous to be a true Swiss and to enter\r\n" + //
                                "into foreign service, but we cannot part with him, at least until his\r\n" + //
                                "elder brother returns to us. My uncle is not pleased with the idea of\r\n" + //
                                "a military career in a distant country, but Ernest never had your\r\n" + //
                                "powers of application. He looks upon study as an odious fetter; his\r\n" + //
                                "time is spent in the open air, climbing the hills or rowing on the\r\n" + //
                                "lake. I fear that he will become an idler unless we yield the point\r\n" + //
                                "and permit him to enter on the profession which he has selected.\r\n" + //
                                "\r\n" + //
                                "“Little alteration, except the growth of our dear children, has taken\r\n" + //
                                "place since you left us. The blue lake and snow-clad mountains—they\r\n" + //
                                "never change; and I think our placid home and our contented hearts are\r\n" + //
                                "regulated by the same immutable laws. My trifling occupations take up\r\n" + //
                                "my time and amuse me, and I am rewarded for any exertions by seeing\r\n" + //
                                "none but happy, kind faces around me. Since you left us, but one\r\n" + //
                                "change has taken place in our little household. Do you remember on\r\n" + //
                                "what occasion Justine Moritz entered our family? Probably you do not;\r\n" + //
                                "I will relate her history, therefore in a few words. Madame Moritz,\r\n" + //
                                "her mother, was a widow with four children, of whom Justine was the\r\n" + //
                                "third. This girl had always been the favourite of her father, but\r\n" + //
                                "through a strange perversity, her mother could not endure her, and\r\n" + //
                                "after the death of M. Moritz, treated her very ill. My aunt observed\r\n" + //
                                "this, and when Justine was twelve years of age, prevailed on her mother\r\n" + //
                                "to allow her to live at our house. The republican institutions of our\r\n" + //
                                "country have produced simpler and happier manners than those which\r\n" + //
                                "prevail in the great monarchies that surround it. Hence there is less\r\n" + //
                                "distinction between the several classes of its inhabitants; and the\r\n" + //
                                "lower orders, being neither so poor nor so despised, their manners are\r\n" + //
                                "more refined and moral. A servant in Geneva does not mean the same\r\n" + //
                                "thing as a servant in France and England. Justine, thus received in\r\n" + //
                                "our family, learned the duties of a servant, a condition which, in our\r\n" + //
                                "fortunate country, does not include the idea of ignorance and a\r\n" + //
                                "sacrifice of the dignity of a human being.\r\n" + //
                                "\r\n" + //
                                "“Justine, you may remember, was a great favourite of yours; and I\r\n" + //
                                "recollect you once remarked that if you were in an ill humour, one\r\n" + //
                                "glance from Justine could dissipate it, for the same reason that\r\n" + //
                                "Ariosto gives concerning the beauty of Angelica—she looked so\r\n" + //
                                "frank-hearted and happy. My aunt conceived a great attachment for her,\r\n" + //
                                "by which she was induced to give her an education superior to that\r\n" + //
                                "which she had at first intended. This benefit was fully repaid;\r\n" + //
                                "Justine was the most grateful little creature in the world: I do not\r\n" + //
                                "mean that she made any professions I never heard one pass her lips, but\r\n" + //
                                "you could see by her eyes that she almost adored her protectress.\r\n" + //
                                "Although her disposition was gay and in many respects inconsiderate,\r\n" + //
                                "yet she paid the greatest attention to every gesture of my aunt. She\r\n" + //
                                "thought her the model of all excellence and endeavoured to imitate her\r\n" + //
                                "phraseology and manners, so that even now she often reminds me of her.\r\n" + //
                                "\r\n" + //
                                "“When my dearest aunt died every one was too much occupied in their own\r\n" + //
                                "grief to notice poor Justine, who had attended her during her illness\r\n" + //
                                "with the most anxious affection. Poor Justine was very ill; but other\r\n" + //
                                "trials were reserved for her.\r\n" + //
                                "\r\n" + //
                                "“One by one, her brothers and sister died; and her mother, with the\r\n" + //
                                "exception of her neglected daughter, was left childless. The\r\n" + //
                                "conscience of the woman was troubled; she began to think that the\r\n" + //
                                "deaths of her favourites was a judgement from heaven to chastise her\r\n" + //
                                "partiality. She was a Roman Catholic; and I believe her confessor\r\n" + //
                                "confirmed the idea which she had conceived. Accordingly, a few months\r\n" + //
                                "after your departure for Ingolstadt, Justine was called home by her\r\n" + //
                                "repentant mother. Poor girl! She wept when she quitted our house; she\r\n" + //
                                "was much altered since the death of my aunt; grief had given softness\r\n" + //
                                "and a winning mildness to her manners, which had before been remarkable\r\n" + //
                                "for vivacity. Nor was her residence at her mother’s house of a nature\r\n" + //
                                "to restore her gaiety. The poor woman was very vacillating in her\r\n" + //
                                "repentance. She sometimes begged Justine to forgive her unkindness,\r\n" + //
                                "but much oftener accused her of having caused the deaths of her\r\n" + //
                                "brothers and sister. Perpetual fretting at length threw Madame Moritz\r\n" + //
                                "into a decline, which at first increased her irritability, but she is\r\n" + //
                                "now at peace for ever. She died on the first approach of cold weather,\r\n" + //
                                "at the beginning of this last winter. Justine has just returned to us;\r\n" + //
                                "and I assure you I love her tenderly. She is very clever and gentle,\r\n" + //
                                "and extremely pretty; as I mentioned before, her mien and her\r\n" + //
                                "expression continually remind me of my dear aunt.\r\n" + //
                                "\r\n" + //
                                "“I must say also a few words to you, my dear cousin, of little darling\r\n" + //
                                "William. I wish you could see him; he is very tall of his age, with\r\n" + //
                                "sweet laughing blue eyes, dark eyelashes, and curling hair. When he\r\n" + //
                                "smiles, two little dimples appear on each cheek, which are rosy with\r\n" + //
                                "health. He has already had one or two little _wives,_ but Louisa Biron\r\n" + //
                                "is his favourite, a pretty little girl of five years of age.\r\n" + //
                                "\r\n" + //
                                "“Now, dear Victor, I dare say you wish to be indulged in a little\r\n" + //
                                "gossip concerning the good people of Geneva. The pretty Miss Mansfield\r\n" + //
                                "has already received the congratulatory visits on her approaching\r\n" + //
                                "marriage with a young Englishman, John Melbourne, Esq. Her ugly\r\n" + //
                                "sister, Manon, married M. Duvillard, the rich banker, last autumn. Your\r\n" + //
                                "favourite schoolfellow, Louis Manoir, has suffered several misfortunes\r\n" + //
                                "since the departure of Clerval from Geneva. But he has already\r\n" + //
                                "recovered his spirits, and is reported to be on the point of marrying a\r\n" + //
                                "lively pretty Frenchwoman, Madame Tavernier. She is a widow, and much\r\n" + //
                                "older than Manoir; but she is very much admired, and a favourite with\r\n" + //
                                "everybody.\r\n" + //
                                "\r\n" + //
                                "“I have written myself into better spirits, dear cousin; but my anxiety\r\n" + //
                                "returns upon me as I conclude. Write, dearest Victor,—one line—one\r\n" + //
                                "word will be a blessing to us. Ten thousand thanks to Henry for his\r\n" + //
                                "kindness, his affection, and his many letters; we are sincerely\r\n" + //
                                "grateful. Adieu! my cousin; take care of yourself; and, I entreat\r\n" + //
                                "you, write!\r\n" + //
                                "\r\n" + //
                                "“Elizabeth Lavenza.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“Geneva, March 18th, 17—.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“Dear, dear Elizabeth!” I exclaimed, when I had read her\r\n" + //
                                "letter: “I will write instantly and relieve them from the anxiety\r\n" + //
                                "they must feel.” I wrote, and this exertion greatly fatigued me; but\r\n" + //
                                "my convalescence had commenced, and proceeded regularly. In another\r\n" + //
                                "fortnight I was able to leave my chamber.\r\n" + //
                                "\r\n" + //
                                "One of my first duties on my recovery was to introduce Clerval to the\r\n" + //
                                "several professors of the university. In doing this, I underwent a\r\n" + //
                                "kind of rough usage, ill befitting the wounds that my mind had\r\n" + //
                                "sustained. Ever since the fatal night, the end of my labours, and the\r\n" + //
                                "beginning of my misfortunes, I had conceived a violent antipathy even\r\n" + //
                                "to the name of natural philosophy. When I was otherwise quite restored\r\n" + //
                                "to health, the sight of a chemical instrument would renew all the agony\r\n" + //
                                "of my nervous symptoms. Henry saw this, and had removed all my\r\n" + //
                                "apparatus from my view. He had also changed my apartment; for he\r\n" + //
                                "perceived that I had acquired a dislike for the room which had\r\n" + //
                                "previously been my laboratory. But these cares of Clerval were made of\r\n" + //
                                "no avail when I visited the professors. M. Waldman inflicted torture\r\n" + //
                                "when he praised, with kindness and warmth, the astonishing progress I\r\n" + //
                                "had made in the sciences. He soon perceived that I disliked the\r\n" + //
                                "subject; but not guessing the real cause, he attributed my feelings to\r\n" + //
                                "modesty, and changed the subject from my improvement, to the science\r\n" + //
                                "itself, with a desire, as I evidently saw, of drawing me out. What\r\n" + //
                                "could I do? He meant to please, and he tormented me. I felt as if he\r\n" + //
                                "had placed carefully, one by one, in my view those instruments which\r\n" + //
                                "were to be afterwards used in putting me to a slow and cruel death. I\r\n" + //
                                "writhed under his words, yet dared not exhibit the pain I felt.\r\n" + //
                                "Clerval, whose eyes and feelings were always quick in discerning the\r\n" + //
                                "sensations of others, declined the subject, alleging, in excuse, his\r\n" + //
                                "total ignorance; and the conversation took a more general turn. I\r\n" + //
                                "thanked my friend from my heart, but I did not speak. I saw plainly\r\n" + //
                                "that he was surprised, but he never attempted to draw my secret from\r\n" + //
                                "me; and although I loved him with a mixture of affection and reverence\r\n" + //
                                "that knew no bounds, yet I could never persuade myself to confide in\r\n" + //
                                "him that event which was so often present to my recollection, but which\r\n" + //
                                "I feared the detail to another would only impress more deeply.\r\n" + //
                                "\r\n" + //
                                "M. Krempe was not equally docile; and in my condition at that time, of\r\n" + //
                                "almost insupportable sensitiveness, his harsh blunt encomiums gave me even\r\n" + //
                                "more pain than the benevolent approbation of M. Waldman. “D—n\r\n" + //
                                "the fellow!” cried he; “why, M. Clerval, I assure you he has\r\n" + //
                                "outstript us all. Ay, stare if you please; but it is nevertheless true. A\r\n" + //
                                "youngster who, but a few years ago, believed in Cornelius Agrippa as firmly\r\n" + //
                                "as in the gospel, has now set himself at the head of the university; and if\r\n" + //
                                "he is not soon pulled down, we shall all be out of countenance.—Ay,\r\n" + //
                                "ay,” continued he, observing my face expressive of suffering,\r\n" + //
                                "“M. Frankenstein is modest; an excellent quality in a young man.\r\n" + //
                                "Young men should be diffident of themselves, you know, M. Clerval: I was\r\n" + //
                                "myself when young; but that wears out in a very short time.”\r\n" + //
                                "\r\n" + //
                                "M. Krempe had now commenced an eulogy on himself, which happily turned\r\n" + //
                                "the conversation from a subject that was so annoying to me.\r\n" + //
                                "\r\n" + //
                                "Clerval had never sympathised in my tastes for natural science; and his\r\n" + //
                                "literary pursuits differed wholly from those which had occupied me. He\r\n" + //
                                "came to the university with the design of making himself complete\r\n" + //
                                "master of the oriental languages, and thus he should open a field for\r\n" + //
                                "the plan of life he had marked out for himself. Resolved to pursue no\r\n" + //
                                "inglorious career, he turned his eyes toward the East, as affording\r\n" + //
                                "scope for his spirit of enterprise. The Persian, Arabic, and Sanskrit\r\n" + //
                                "languages engaged his attention, and I was easily induced to enter on\r\n" + //
                                "the same studies. Idleness had ever been irksome to me, and now that I\r\n" + //
                                "wished to fly from reflection, and hated my former studies, I felt\r\n" + //
                                "great relief in being the fellow-pupil with my friend, and found not\r\n" + //
                                "only instruction but consolation in the works of the orientalists. I\r\n" + //
                                "did not, like him, attempt a critical knowledge of their dialects, for\r\n" + //
                                "I did not contemplate making any other use of them than temporary\r\n" + //
                                "amusement. I read merely to understand their meaning, and they well\r\n" + //
                                "repaid my labours. Their melancholy is soothing, and their joy\r\n" + //
                                "elevating, to a degree I never experienced in studying the authors of\r\n" + //
                                "any other country. When you read their writings, life appears to\r\n" + //
                                "consist in a warm sun and a garden of roses,—in the smiles and frowns\r\n" + //
                                "of a fair enemy, and the fire that consumes your own heart. How\r\n" + //
                                "different from the manly and heroical poetry of Greece and Rome!\r\n" + //
                                "\r\n" + //
                                "Summer passed away in these occupations, and my return to Geneva was\r\n" + //
                                "fixed for the latter end of autumn; but being delayed by several\r\n" + //
                                "accidents, winter and snow arrived, the roads were deemed impassable,\r\n" + //
                                "and my journey was retarded until the ensuing spring. I felt this\r\n" + //
                                "delay very bitterly; for I longed to see my native town and my beloved\r\n" + //
                                "friends. My return had only been delayed so long, from an\r\n" + //
                                "unwillingness to leave Clerval in a strange place, before he had become\r\n" + //
                                "acquainted with any of its inhabitants. The winter, however, was spent\r\n" + //
                                "cheerfully; and although the spring was uncommonly late, when it came\r\n" + //
                                "its beauty compensated for its dilatoriness.\r\n" + //
                                "\r\n" + //
                                "The month of May had already commenced, and I expected the letter daily\r\n" + //
                                "which was to fix the date of my departure, when Henry proposed a\r\n" + //
                                "pedestrian tour in the environs of Ingolstadt, that I might bid a\r\n" + //
                                "personal farewell to the country I had so long inhabited. I acceded\r\n" + //
                                "with pleasure to this proposition: I was fond of exercise, and Clerval\r\n" + //
                                "had always been my favourite companion in the ramble of this nature\r\n" + //
                                "that I had taken among the scenes of my native country.\r\n" + //
                                "\r\n" + //
                                "We passed a fortnight in these perambulations: my health and spirits\r\n" + //
                                "had long been restored, and they gained additional strength from the\r\n" + //
                                "salubrious air I breathed, the natural incidents of our progress, and\r\n" + //
                                "the conversation of my friend. Study had before secluded me from the\r\n" + //
                                "intercourse of my fellow-creatures, and rendered me unsocial; but\r\n" + //
                                "Clerval called forth the better feelings of my heart; he again taught\r\n" + //
                                "me to love the aspect of nature, and the cheerful faces of children.\r\n" + //
                                "Excellent friend! how sincerely you did love me, and endeavour to\r\n" + //
                                "elevate my mind until it was on a level with your own. A selfish\r\n" + //
                                "pursuit had cramped and narrowed me, until your gentleness and\r\n" + //
                                "affection warmed and opened my senses; I became the same happy creature\r\n" + //
                                "who, a few years ago, loved and beloved by all, had no sorrow or care.\r\n" + //
                                "When happy, inanimate nature had the power of bestowing on me the most\r\n" + //
                                "delightful sensations. A serene sky and verdant fields filled me with\r\n" + //
                                "ecstasy. The present season was indeed divine; the flowers of spring\r\n" + //
                                "bloomed in the hedges, while those of summer were already in bud. I\r\n" + //
                                "was undisturbed by thoughts which during the preceding year had pressed\r\n" + //
                                "upon me, notwithstanding my endeavours to throw them off, with an\r\n" + //
                                "invincible burden.\r\n" + //
                                "\r\n" + //
                                "Henry rejoiced in my gaiety, and sincerely sympathised in my feelings: he\r\n" + //
                                "exerted himself to amuse me, while he expressed the sensations that filled\r\n" + //
                                "his soul. The resources of his mind on this occasion were truly\r\n" + //
                                "astonishing: his conversation was full of imagination; and very often, in\r\n" + //
                                "imitation of the Persian and Arabic writers, he invented tales of wonderful\r\n" + //
                                "fancy and passion. At other times he repeated my favourite poems, or drew\r\n" + //
                                "me out into arguments, which he supported with great ingenuity.\r\n" + //
                                "\r\n" + //
                                "We returned to our college on a Sunday afternoon: the peasants were\r\n" + //
                                "dancing, and every one we met appeared gay and happy. My own spirits were\r\n" + //
                                "high, and I bounded along with feelings of unbridled joy and hilarity.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 7\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "On my return, I found the following letter from my father:—\r\n" + //
                                "\r\n" + //
                                "“My dear Victor,\r\n" + //
                                "\r\n" + //
                                "“You have probably waited impatiently for a letter to fix the date of\r\n" + //
                                "your return to us; and I was at first tempted to write only a few\r\n" + //
                                "lines, merely mentioning the day on which I should expect you. But\r\n" + //
                                "that would be a cruel kindness, and I dare not do it. What would be\r\n" + //
                                "your surprise, my son, when you expected a happy and glad welcome, to\r\n" + //
                                "behold, on the contrary, tears and wretchedness? And how, Victor, can\r\n" + //
                                "I relate our misfortune? Absence cannot have rendered you callous to\r\n" + //
                                "our joys and griefs; and how shall I inflict pain on my long absent\r\n" + //
                                "son? I wish to prepare you for the woeful news, but I know it is\r\n" + //
                                "impossible; even now your eye skims over the page to seek the words\r\n" + //
                                "which are to convey to you the horrible tidings.\r\n" + //
                                "\r\n" + //
                                "“William is dead!—that sweet child, whose smiles delighted and warmed\r\n" + //
                                "my heart, who was so gentle, yet so gay! Victor, he is murdered!\r\n" + //
                                "\r\n" + //
                                "“I will not attempt to console you; but will simply relate the\r\n" + //
                                "circumstances of the transaction.\r\n" + //
                                "\r\n" + //
                                "“Last Thursday (May 7th), I, my niece, and your two brothers, went to\r\n" + //
                                "walk in Plainpalais. The evening was warm and serene, and we prolonged\r\n" + //
                                "our walk farther than usual. It was already dusk before we thought of\r\n" + //
                                "returning; and then we discovered that William and Ernest, who had gone\r\n" + //
                                "on before, were not to be found. We accordingly rested on a seat until\r\n" + //
                                "they should return. Presently Ernest came, and enquired if we had seen\r\n" + //
                                "his brother; he said, that he had been playing with him, that William\r\n" + //
                                "had run away to hide himself, and that he vainly sought for him, and\r\n" + //
                                "afterwards waited for a long time, but that he did not return.\r\n" + //
                                "\r\n" + //
                                "“This account rather alarmed us, and we continued to search for him\r\n" + //
                                "until night fell, when Elizabeth conjectured that he might have\r\n" + //
                                "returned to the house. He was not there. We returned again, with\r\n" + //
                                "torches; for I could not rest, when I thought that my sweet boy had\r\n" + //
                                "lost himself, and was exposed to all the damps and dews of night;\r\n" + //
                                "Elizabeth also suffered extreme anguish. About five in the morning I\r\n" + //
                                "discovered my lovely boy, whom the night before I had seen blooming and\r\n" + //
                                "active in health, stretched on the grass livid and motionless; the\r\n" + //
                                "print of the murder’s finger was on his neck.\r\n" + //
                                "\r\n" + //
                                "“He was conveyed home, and the anguish that was visible in my\r\n" + //
                                "countenance betrayed the secret to Elizabeth. She was very earnest to\r\n" + //
                                "see the corpse. At first I attempted to prevent her but she persisted,\r\n" + //
                                "and entering the room where it lay, hastily examined the neck of the\r\n" + //
                                "victim, and clasping her hands exclaimed, ‘O God! I have murdered my\r\n" + //
                                "darling child!’\r\n" + //
                                "\r\n" + //
                                "“She fainted, and was restored with extreme difficulty. When she again\r\n" + //
                                "lived, it was only to weep and sigh. She told me, that that same\r\n" + //
                                "evening William had teased her to let him wear a very valuable\r\n" + //
                                "miniature that she possessed of your mother. This picture is gone, and\r\n" + //
                                "was doubtless the temptation which urged the murderer to the deed. We\r\n" + //
                                "have no trace of him at present, although our exertions to discover him\r\n" + //
                                "are unremitted; but they will not restore my beloved William!\r\n" + //
                                "\r\n" + //
                                "“Come, dearest Victor; you alone can console Elizabeth. She weeps\r\n" + //
                                "continually, and accuses herself unjustly as the cause of his death;\r\n" + //
                                "her words pierce my heart. We are all unhappy; but will not that be an\r\n" + //
                                "additional motive for you, my son, to return and be our comforter?\r\n" + //
                                "Your dear mother! Alas, Victor! I now say, Thank God she did not live\r\n" + //
                                "to witness the cruel, miserable death of her youngest darling!\r\n" + //
                                "\r\n" + //
                                "“Come, Victor; not brooding thoughts of vengeance against the assassin,\r\n" + //
                                "but with feelings of peace and gentleness, that will heal, instead of\r\n" + //
                                "festering, the wounds of our minds. Enter the house of mourning, my\r\n" + //
                                "friend, but with kindness and affection for those who love you, and not\r\n" + //
                                "with hatred for your enemies.\r\n" + //
                                "\r\n" + //
                                "“Your affectionate and afflicted father,\r\n" + //
                                "\r\n" + //
                                "“Alphonse Frankenstein.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“Geneva, May 12th, 17—.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Clerval, who had watched my countenance as I read this letter, was\r\n" + //
                                "surprised to observe the despair that succeeded the joy I at first\r\n" + //
                                "expressed on receiving new from my friends. I threw the letter on the\r\n" + //
                                "table, and covered my face with my hands.\r\n" + //
                                "\r\n" + //
                                "“My dear Frankenstein,” exclaimed Henry, when he perceived me\r\n" + //
                                "weep with bitterness, “are you always to be unhappy? My dear friend,\r\n" + //
                                "what has happened?”\r\n" + //
                                "\r\n" + //
                                "I motioned him to take up the letter, while I walked up and down the\r\n" + //
                                "room in the extremest agitation. Tears also gushed from the eyes of\r\n" + //
                                "Clerval, as he read the account of my misfortune.\r\n" + //
                                "\r\n" + //
                                "“I can offer you no consolation, my friend,” said he;\r\n" + //
                                "“your disaster is irreparable. What do you intend to do?”\r\n" + //
                                "\r\n" + //
                                "“To go instantly to Geneva: come with me, Henry, to order the horses.”\r\n" + //
                                "\r\n" + //
                                "During our walk, Clerval endeavoured to say a few words of consolation;\r\n" + //
                                "he could only express his heartfelt sympathy. “Poor William!” said he,\r\n" + //
                                "“dear lovely child, he now sleeps with his angel mother! Who that had\r\n" + //
                                "seen him bright and joyous in his young beauty, but must weep over his\r\n" + //
                                "untimely loss! To die so miserably; to feel the murderer’s grasp! How\r\n" + //
                                "much more a murdered that could destroy radiant innocence! Poor little\r\n" + //
                                "fellow! one only consolation have we; his friends mourn and weep, but\r\n" + //
                                "he is at rest. The pang is over, his sufferings are at an end for ever.\r\n" + //
                                "A sod covers his gentle form, and he knows no pain. He can no longer\r\n" + //
                                "be a subject for pity; we must reserve that for his miserable\r\n" + //
                                "survivors.”\r\n" + //
                                "\r\n" + //
                                "Clerval spoke thus as we hurried through the streets; the words\r\n" + //
                                "impressed themselves on my mind and I remembered them afterwards in\r\n" + //
                                "solitude. But now, as soon as the horses arrived, I hurried into a\r\n" + //
                                "cabriolet, and bade farewell to my friend.\r\n" + //
                                "\r\n" + //
                                "My journey was very melancholy. At first I wished to hurry on, for I longed\r\n" + //
                                "to console and sympathise with my loved and sorrowing friends; but when I\r\n" + //
                                "drew near my native town, I slackened my progress. I could hardly sustain\r\n" + //
                                "the multitude of feelings that crowded into my mind. I passed through\r\n" + //
                                "scenes familiar to my youth, but which I had not seen for nearly six years.\r\n" + //
                                "How altered every thing might be during that time! One sudden and\r\n" + //
                                "desolating change had taken place; but a thousand little circumstances\r\n" + //
                                "might have by degrees worked other alterations, which, although they were\r\n" + //
                                "done more tranquilly, might not be the less decisive. Fear overcame me; I\r\n" + //
                                "dared no advance, dreading a thousand nameless evils that made me tremble,\r\n" + //
                                "although I was unable to define them.\r\n" + //
                                "\r\n" + //
                                "I remained two days at Lausanne, in this painful state of mind. I\r\n" + //
                                "contemplated the lake: the waters were placid; all around was calm; and the\r\n" + //
                                "snowy mountains, “the palaces of nature,” were not changed. By\r\n" + //
                                "degrees the calm and heavenly scene restored me, and I continued my journey\r\n" + //
                                "towards Geneva.\r\n" + //
                                "\r\n" + //
                                "The road ran by the side of the lake, which became narrower as I\r\n" + //
                                "approached my native town. I discovered more distinctly the black\r\n" + //
                                "sides of Jura, and the bright summit of Mont Blanc. I wept like a\r\n" + //
                                "child. “Dear mountains! my own beautiful lake! how do you welcome your\r\n" + //
                                "wanderer? Your summits are clear; the sky and lake are blue and\r\n" + //
                                "placid. Is this to prognosticate peace, or to mock at my unhappiness?”\r\n" + //
                                "\r\n" + //
                                "I fear, my friend, that I shall render myself tedious by dwelling on\r\n" + //
                                "these preliminary circumstances; but they were days of comparative\r\n" + //
                                "happiness, and I think of them with pleasure. My country, my beloved\r\n" + //
                                "country! who but a native can tell the delight I took in again\r\n" + //
                                "beholding thy streams, thy mountains, and, more than all, thy lovely\r\n" + //
                                "lake!\r\n" + //
                                "\r\n" + //
                                "Yet, as I drew nearer home, grief and fear again overcame me. Night also\r\n" + //
                                "closed around; and when I could hardly see the dark mountains, I felt still\r\n" + //
                                "more gloomily. The picture appeared a vast and dim scene of evil, and I\r\n" + //
                                "foresaw obscurely that I was destined to become the most wretched of human\r\n" + //
                                "beings. Alas! I prophesied truly, and failed only in one single\r\n" + //
                                "circumstance, that in all the misery I imagined and dreaded, I did not\r\n" + //
                                "conceive the hundredth part of the anguish I was destined to endure.\r\n" + //
                                "\r\n" + //
                                "It was completely dark when I arrived in the environs of Geneva; the gates\r\n" + //
                                "of the town were already shut; and I was obliged to pass the night at\r\n" + //
                                "Secheron, a village at the distance of half a league from the city. The sky\r\n" + //
                                "was serene; and, as I was unable to rest, I resolved to visit the spot\r\n" + //
                                "where my poor William had been murdered. As I could not pass through the\r\n" + //
                                "town, I was obliged to cross the lake in a boat to arrive at Plainpalais.\r\n" + //
                                "During this short voyage I saw the lightning playing on the summit of Mont\r\n" + //
                                "Blanc in the most beautiful figures. The storm appeared to approach\r\n" + //
                                "rapidly, and, on landing, I ascended a low hill, that I might observe its\r\n" + //
                                "progress. It advanced; the heavens were clouded, and I soon felt the rain\r\n" + //
                                "coming slowly in large drops, but its violence quickly increased.\r\n" + //
                                "\r\n" + //
                                "I quitted my seat, and walked on, although the darkness and storm\r\n" + //
                                "increased every minute, and the thunder burst with a terrific crash\r\n" + //
                                "over my head. It was echoed from Salêve, the Juras, and the Alps of\r\n" + //
                                "Savoy; vivid flashes of lightning dazzled my eyes, illuminating the\r\n" + //
                                "lake, making it appear like a vast sheet of fire; then for an instant\r\n" + //
                                "every thing seemed of a pitchy darkness, until the eye recovered itself\r\n" + //
                                "from the preceding flash. The storm, as is often the case in\r\n" + //
                                "Switzerland, appeared at once in various parts of the heavens. The\r\n" + //
                                "most violent storm hung exactly north of the town, over the part of the\r\n" + //
                                "lake which lies between the promontory of Belrive and the village of\r\n" + //
                                "Copêt. Another storm enlightened Jura with faint flashes; and another\r\n" + //
                                "darkened and sometimes disclosed the Môle, a peaked mountain to the\r\n" + //
                                "east of the lake.\r\n" + //
                                "\r\n" + //
                                "While I watched the tempest, so beautiful yet terrific, I wandered on with\r\n" + //
                                "a hasty step. This noble war in the sky elevated my spirits; I clasped my\r\n" + //
                                "hands, and exclaimed aloud, “William, dear angel! this is thy\r\n" + //
                                "funeral, this thy dirge!” As I said these words, I perceived in the\r\n" + //
                                "gloom a figure which stole from behind a clump of trees near me; I stood\r\n" + //
                                "fixed, gazing intently: I could not be mistaken. A flash of lightning\r\n" + //
                                "illuminated the object, and discovered its shape plainly to me; its\r\n" + //
                                "gigantic stature, and the deformity of its aspect more hideous than belongs\r\n" + //
                                "to humanity, instantly informed me that it was the wretch, the filthy\r\n" + //
                                "dæmon, to whom I had given life. What did he there? Could he be (I\r\n" + //
                                "shuddered at the conception) the murderer of my brother? No sooner did that\r\n" + //
                                "idea cross my imagination, than I became convinced of its truth; my teeth\r\n" + //
                                "chattered, and I was forced to lean against a tree for support. The figure\r\n" + //
                                "passed me quickly, and I lost it in the gloom. Nothing in human shape could\r\n" + //
                                "have destroyed the fair child. _He_ was the murderer! I could not\r\n" + //
                                "doubt it. The mere presence of the idea was an irresistible proof of the\r\n" + //
                                "fact. I thought of pursuing the devil; but it would have been in vain, for\r\n" + //
                                "another flash discovered him to me hanging among the rocks of the nearly\r\n" + //
                                "perpendicular ascent of Mont Salêve, a hill that bounds Plainpalais on the\r\n" + //
                                "south. He soon reached the summit, and disappeared.\r\n" + //
                                "\r\n" + //
                                "I remained motionless. The thunder ceased; but the rain still\r\n" + //
                                "continued, and the scene was enveloped in an impenetrable darkness. I\r\n" + //
                                "revolved in my mind the events which I had until now sought to forget:\r\n" + //
                                "the whole train of my progress toward the creation; the appearance of\r\n" + //
                                "the works of my own hands at my bedside; its departure. Two years had\r\n" + //
                                "now nearly elapsed since the night on which he first received life; and\r\n" + //
                                "was this his first crime? Alas! I had turned loose into the world a\r\n" + //
                                "depraved wretch, whose delight was in carnage and misery; had he not\r\n" + //
                                "murdered my brother?\r\n" + //
                                "\r\n" + //
                                "No one can conceive the anguish I suffered during the remainder of the\r\n" + //
                                "night, which I spent, cold and wet, in the open air. But I did not\r\n" + //
                                "feel the inconvenience of the weather; my imagination was busy in\r\n" + //
                                "scenes of evil and despair. I considered the being whom I had cast\r\n" + //
                                "among mankind, and endowed with the will and power to effect purposes\r\n" + //
                                "of horror, such as the deed which he had now done, nearly in the light\r\n" + //
                                "of my own vampire, my own spirit let loose from the grave, and forced\r\n" + //
                                "to destroy all that was dear to me.\r\n" + //
                                "\r\n" + //
                                "Day dawned; and I directed my steps towards the town. The gates were\r\n" + //
                                "open, and I hastened to my father’s house. My first thought was to\r\n" + //
                                "discover what I knew of the murderer, and cause instant pursuit to be\r\n" + //
                                "made. But I paused when I reflected on the story that I had to tell. A\r\n" + //
                                "being whom I myself had formed, and endued with life, had met me at\r\n" + //
                                "midnight among the precipices of an inaccessible mountain. I\r\n" + //
                                "remembered also the nervous fever with which I had been seized just at\r\n" + //
                                "the time that I dated my creation, and which would give an air of\r\n" + //
                                "delirium to a tale otherwise so utterly improbable. I well knew that\r\n" + //
                                "if any other had communicated such a relation to me, I should have\r\n" + //
                                "looked upon it as the ravings of insanity. Besides, the strange nature\r\n" + //
                                "of the animal would elude all pursuit, even if I were so far credited\r\n" + //
                                "as to persuade my relatives to commence it. And then of what use would\r\n" + //
                                "be pursuit? Who could arrest a creature capable of scaling the\r\n" + //
                                "overhanging sides of Mont Salêve? These reflections determined me, and\r\n" + //
                                "I resolved to remain silent.\r\n" + //
                                "\r\n" + //
                                "It was about five in the morning when I entered my father’s house. I\r\n" + //
                                "told the servants not to disturb the family, and went into the library\r\n" + //
                                "to attend their usual hour of rising.\r\n" + //
                                "\r\n" + //
                                "Six years had elapsed, passed in a dream but for one indelible trace, and I\r\n" + //
                                "stood in the same place where I had last embraced my father before my\r\n" + //
                                "departure for Ingolstadt. Beloved and venerable parent! He still remained\r\n" + //
                                "to me. I gazed on the picture of my mother, which stood over the\r\n" + //
                                "mantel-piece. It was an historical subject, painted at my father’s\r\n" + //
                                "desire, and represented Caroline Beaufort in an agony of despair, kneeling\r\n" + //
                                "by the coffin of her dead father. Her garb was rustic, and her cheek pale;\r\n" + //
                                "but there was an air of dignity and beauty, that hardly permitted the\r\n" + //
                                "sentiment of pity. Below this picture was a miniature of William; and my\r\n" + //
                                "tears flowed when I looked upon it. While I was thus engaged, Ernest\r\n" + //
                                "entered: he had heard me arrive, and hastened to welcome me:\r\n" + //
                                "“Welcome, my dearest Victor,” said he. “Ah! I wish you\r\n" + //
                                "had come three months ago, and then you would have found us all joyous and\r\n" + //
                                "delighted. You come to us now to share a misery which nothing can\r\n" + //
                                "alleviate; yet your presence will, I hope, revive our father, who seems\r\n" + //
                                "sinking under his misfortune; and your persuasions will induce poor\r\n" + //
                                "Elizabeth to cease her vain and tormenting self-accusations.—Poor\r\n" + //
                                "William! he was our darling and our pride!”\r\n" + //
                                "\r\n" + //
                                "Tears, unrestrained, fell from my brother’s eyes; a sense of mortal\r\n" + //
                                "agony crept over my frame. Before, I had only imagined the\r\n" + //
                                "wretchedness of my desolated home; the reality came on me as a new, and\r\n" + //
                                "a not less terrible, disaster. I tried to calm Ernest; I enquired more\r\n" + //
                                "minutely concerning my father, and here I named my cousin.\r\n" + //
                                "\r\n" + //
                                "“She most of all,” said Ernest, “requires consolation; she accused\r\n" + //
                                "herself of having caused the death of my brother, and that made her\r\n" + //
                                "very wretched. But since the murderer has been discovered—”\r\n" + //
                                "\r\n" + //
                                "“The murderer discovered! Good God! how can that be? who could attempt\r\n" + //
                                "to pursue him? It is impossible; one might as well try to overtake the\r\n" + //
                                "winds, or confine a mountain-stream with a straw. I saw him too; he\r\n" + //
                                "was free last night!”\r\n" + //
                                "\r\n" + //
                                "“I do not know what you mean,” replied my brother, in accents of\r\n" + //
                                "wonder, “but to us the discovery we have made completes our misery. No\r\n" + //
                                "one would believe it at first; and even now Elizabeth will not be\r\n" + //
                                "convinced, notwithstanding all the evidence. Indeed, who would credit\r\n" + //
                                "that Justine Moritz, who was so amiable, and fond of all the family,\r\n" + //
                                "could suddenly become so capable of so frightful, so appalling a crime?”\r\n" + //
                                "\r\n" + //
                                "“Justine Moritz! Poor, poor girl, is she the accused? But it is\r\n" + //
                                "wrongfully; every one knows that; no one believes it, surely, Ernest?”\r\n" + //
                                "\r\n" + //
                                "“No one did at first; but several circumstances came out, that have\r\n" + //
                                "almost forced conviction upon us; and her own behaviour has been so\r\n" + //
                                "confused, as to add to the evidence of facts a weight that, I fear,\r\n" + //
                                "leaves no hope for doubt. But she will be tried today, and you will\r\n" + //
                                "then hear all.”\r\n" + //
                                "\r\n" + //
                                "He then related that, the morning on which the murder of poor William\r\n" + //
                                "had been discovered, Justine had been taken ill, and confined to her\r\n" + //
                                "bed for several days. During this interval, one of the servants,\r\n" + //
                                "happening to examine the apparel she had worn on the night of the\r\n" + //
                                "murder, had discovered in her pocket the picture of my mother, which\r\n" + //
                                "had been judged to be the temptation of the murderer. The servant\r\n" + //
                                "instantly showed it to one of the others, who, without saying a word to\r\n" + //
                                "any of the family, went to a magistrate; and, upon their deposition,\r\n" + //
                                "Justine was apprehended. On being charged with the fact, the poor girl\r\n" + //
                                "confirmed the suspicion in a great measure by her extreme confusion of\r\n" + //
                                "manner.\r\n" + //
                                "\r\n" + //
                                "This was a strange tale, but it did not shake my faith; and I replied\r\n" + //
                                "earnestly, “You are all mistaken; I know the murderer. Justine, poor,\r\n" + //
                                "good Justine, is innocent.”\r\n" + //
                                "\r\n" + //
                                "At that instant my father entered. I saw unhappiness deeply impressed\r\n" + //
                                "on his countenance, but he endeavoured to welcome me cheerfully; and,\r\n" + //
                                "after we had exchanged our mournful greeting, would have introduced\r\n" + //
                                "some other topic than that of our disaster, had not Ernest exclaimed,\r\n" + //
                                "“Good God, papa! Victor says that he knows who was the murderer of\r\n" + //
                                "poor William.”\r\n" + //
                                "\r\n" + //
                                "“We do also, unfortunately,” replied my father, “for indeed I had\r\n" + //
                                "rather have been for ever ignorant than have discovered so much\r\n" + //
                                "depravity and ungratitude in one I valued so highly.”\r\n" + //
                                "\r\n" + //
                                "“My dear father, you are mistaken; Justine is innocent.”\r\n" + //
                                "\r\n" + //
                                "“If she is, God forbid that she should suffer as guilty. She is to be\r\n" + //
                                "tried today, and I hope, I sincerely hope, that she will be acquitted.”\r\n" + //
                                "\r\n" + //
                                "This speech calmed me. I was firmly convinced in my own mind that\r\n" + //
                                "Justine, and indeed every human being, was guiltless of this murder. I\r\n" + //
                                "had no fear, therefore, that any circumstantial evidence could be\r\n" + //
                                "brought forward strong enough to convict her. My tale was not one to\r\n" + //
                                "announce publicly; its astounding horror would be looked upon as\r\n" + //
                                "madness by the vulgar. Did any one indeed exist, except I, the\r\n" + //
                                "creator, who would believe, unless his senses convinced him, in the\r\n" + //
                                "existence of the living monument of presumption and rash ignorance\r\n" + //
                                "which I had let loose upon the world?\r\n" + //
                                "\r\n" + //
                                "We were soon joined by Elizabeth. Time had altered her since I last\r\n" + //
                                "beheld her; it had endowed her with loveliness surpassing the beauty of\r\n" + //
                                "her childish years. There was the same candour, the same vivacity, but\r\n" + //
                                "it was allied to an expression more full of sensibility and intellect.\r\n" + //
                                "She welcomed me with the greatest affection. “Your arrival, my dear\r\n" + //
                                "cousin,” said she, “fills me with hope. You perhaps will find some\r\n" + //
                                "means to justify my poor guiltless Justine. Alas! who is safe, if she\r\n" + //
                                "be convicted of crime? I rely on her innocence as certainly as I do\r\n" + //
                                "upon my own. Our misfortune is doubly hard to us; we have not only\r\n" + //
                                "lost that lovely darling boy, but this poor girl, whom I sincerely\r\n" + //
                                "love, is to be torn away by even a worse fate. If she is condemned, I\r\n" + //
                                "never shall know joy more. But she will not, I am sure she will not;\r\n" + //
                                "and then I shall be happy again, even after the sad death of my little\r\n" + //
                                "William.”\r\n" + //
                                "\r\n" + //
                                "“She is innocent, my Elizabeth,” said I, “and that shall\r\n" + //
                                "be proved; fear nothing, but let your spirits be cheered by the assurance\r\n" + //
                                "of her acquittal.”\r\n" + //
                                "\r\n" + //
                                "“How kind and generous you are! every one else believes in her guilt,\r\n" + //
                                "and that made me wretched, for I knew that it was impossible: and to\r\n" + //
                                "see every one else prejudiced in so deadly a manner rendered me\r\n" + //
                                "hopeless and despairing.” She wept.\r\n" + //
                                "\r\n" + //
                                "“Dearest niece,” said my father, “dry your tears. If she\r\n" + //
                                "is, as you believe, innocent, rely on the justice of our laws, and the\r\n" + //
                                "activity with which I shall prevent the slightest shadow of\r\n" + //
                                "partiality.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 8\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "We passed a few sad hours until eleven o’clock, when the trial was to\r\n" + //
                                "commence. My father and the rest of the family being obliged to attend\r\n" + //
                                "as witnesses, I accompanied them to the court. During the whole of\r\n" + //
                                "this wretched mockery of justice I suffered living torture. It was to\r\n" + //
                                "be decided whether the result of my curiosity and lawless devices would\r\n" + //
                                "cause the death of two of my fellow beings: one a smiling babe full of\r\n" + //
                                "innocence and joy, the other far more dreadfully murdered, with every\r\n" + //
                                "aggravation of infamy that could make the murder memorable in horror.\r\n" + //
                                "Justine also was a girl of merit and possessed qualities which promised\r\n" + //
                                "to render her life happy; now all was to be obliterated in an\r\n" + //
                                "ignominious grave, and I the cause! A thousand times rather would I\r\n" + //
                                "have confessed myself guilty of the crime ascribed to Justine, but I\r\n" + //
                                "was absent when it was committed, and such a declaration would have\r\n" + //
                                "been considered as the ravings of a madman and would not have\r\n" + //
                                "exculpated her who suffered through me.\r\n" + //
                                "\r\n" + //
                                "The appearance of Justine was calm. She was dressed in mourning, and\r\n" + //
                                "her countenance, always engaging, was rendered, by the solemnity of her\r\n" + //
                                "feelings, exquisitely beautiful. Yet she appeared confident in\r\n" + //
                                "innocence and did not tremble, although gazed on and execrated by\r\n" + //
                                "thousands, for all the kindness which her beauty might otherwise have\r\n" + //
                                "excited was obliterated in the minds of the spectators by the\r\n" + //
                                "imagination of the enormity she was supposed to have committed. She\r\n" + //
                                "was tranquil, yet her tranquillity was evidently constrained; and as\r\n" + //
                                "her confusion had before been adduced as a proof of her guilt, she\r\n" + //
                                "worked up her mind to an appearance of courage. When she entered the\r\n" + //
                                "court she threw her eyes round it and quickly discovered where we were\r\n" + //
                                "seated. A tear seemed to dim her eye when she saw us, but she quickly\r\n" + //
                                "recovered herself, and a look of sorrowful affection seemed to attest\r\n" + //
                                "her utter guiltlessness.\r\n" + //
                                "\r\n" + //
                                "The trial began, and after the advocate against her had stated the\r\n" + //
                                "charge, several witnesses were called. Several strange facts combined\r\n" + //
                                "against her, which might have staggered anyone who had not such proof\r\n" + //
                                "of her innocence as I had. She had been out the whole of the night on\r\n" + //
                                "which the murder had been committed and towards morning had been\r\n" + //
                                "perceived by a market-woman not far from the spot where the body of the\r\n" + //
                                "murdered child had been afterwards found. The woman asked her what she\r\n" + //
                                "did there, but she looked very strangely and only returned a confused\r\n" + //
                                "and unintelligible answer. She returned to the house about eight\r\n" + //
                                "o’clock, and when one inquired where she had passed the night, she\r\n" + //
                                "replied that she had been looking for the child and demanded earnestly\r\n" + //
                                "if anything had been heard concerning him. When shown the body, she\r\n" + //
                                "fell into violent hysterics and kept her bed for several days. The\r\n" + //
                                "picture was then produced which the servant had found in her pocket;\r\n" + //
                                "and when Elizabeth, in a faltering voice, proved that it was the same\r\n" + //
                                "which, an hour before the child had been missed, she had placed round\r\n" + //
                                "his neck, a murmur of horror and indignation filled the court.\r\n" + //
                                "\r\n" + //
                                "Justine was called on for her defence. As the trial had proceeded, her\r\n" + //
                                "countenance had altered. Surprise, horror, and misery were strongly\r\n" + //
                                "expressed. Sometimes she struggled with her tears, but when she was\r\n" + //
                                "desired to plead, she collected her powers and spoke in an audible\r\n" + //
                                "although variable voice.\r\n" + //
                                "\r\n" + //
                                "“God knows,” she said, “how entirely I am innocent. But I\r\n" + //
                                "do not pretend that my protestations should acquit me; I rest my innocence\r\n" + //
                                "on a plain and simple explanation of the facts which have been adduced\r\n" + //
                                "against me, and I hope the character I have always borne will incline my\r\n" + //
                                "judges to a favourable interpretation where any circumstance appears\r\n" + //
                                "doubtful or suspicious.”\r\n" + //
                                "\r\n" + //
                                "She then related that, by the permission of Elizabeth, she had passed\r\n" + //
                                "the evening of the night on which the murder had been committed at the\r\n" + //
                                "house of an aunt at Chêne, a village situated at about a league from\r\n" + //
                                "Geneva. On her return, at about nine o’clock, she met a man who asked\r\n" + //
                                "her if she had seen anything of the child who was lost. She was\r\n" + //
                                "alarmed by this account and passed several hours in looking for him,\r\n" + //
                                "when the gates of Geneva were shut, and she was forced to remain\r\n" + //
                                "several hours of the night in a barn belonging to a cottage, being\r\n" + //
                                "unwilling to call up the inhabitants, to whom she was well known. Most\r\n" + //
                                "of the night she spent here watching; towards morning she believed that\r\n" + //
                                "she slept for a few minutes; some steps disturbed her, and she awoke.\r\n" + //
                                "It was dawn, and she quitted her asylum, that she might again endeavour\r\n" + //
                                "to find my brother. If she had gone near the spot where his body lay,\r\n" + //
                                "it was without her knowledge. That she had been bewildered when\r\n" + //
                                "questioned by the market-woman was not surprising, since she had passed\r\n" + //
                                "a sleepless night and the fate of poor William was yet uncertain.\r\n" + //
                                "Concerning the picture she could give no account.\r\n" + //
                                "\r\n" + //
                                "“I know,” continued the unhappy victim, “how heavily and\r\n" + //
                                "fatally this one circumstance weighs against me, but I have no power of\r\n" + //
                                "explaining it; and when I have expressed my utter ignorance, I am only left\r\n" + //
                                "to conjecture concerning the probabilities by which it might have been\r\n" + //
                                "placed in my pocket. But here also I am checked. I believe that I have no\r\n" + //
                                "enemy on earth, and none surely would have been so wicked as to destroy me\r\n" + //
                                "wantonly. Did the murderer place it there? I know of no opportunity\r\n" + //
                                "afforded him for so doing; or, if I had, why should he have stolen the\r\n" + //
                                "jewel, to part with it again so soon?\r\n" + //
                                "\r\n" + //
                                "“I commit my cause to the justice of my judges, yet I see no room for\r\n" + //
                                "hope. I beg permission to have a few witnesses examined concerning my\r\n" + //
                                "character, and if their testimony shall not overweigh my supposed\r\n" + //
                                "guilt, I must be condemned, although I would pledge my salvation on my\r\n" + //
                                "innocence.”\r\n" + //
                                "\r\n" + //
                                "Several witnesses were called who had known her for many years, and\r\n" + //
                                "they spoke well of her; but fear and hatred of the crime of which they\r\n" + //
                                "supposed her guilty rendered them timorous and unwilling to come\r\n" + //
                                "forward. Elizabeth saw even this last resource, her excellent\r\n" + //
                                "dispositions and irreproachable conduct, about to fail the accused,\r\n" + //
                                "when, although violently agitated, she desired permission to address\r\n" + //
                                "the court.\r\n" + //
                                "\r\n" + //
                                "“I am,” said she, “the cousin of the unhappy child who\r\n" + //
                                "was murdered, or rather his sister, for I was educated by and have lived\r\n" + //
                                "with his parents ever since and even long before his birth. It may\r\n" + //
                                "therefore be judged indecent in me to come forward on this occasion, but\r\n" + //
                                "when I see a fellow creature about to perish through the cowardice of her\r\n" + //
                                "pretended friends, I wish to be allowed to speak, that I may say what I\r\n" + //
                                "know of her character. I am well acquainted with the accused. I have lived\r\n" + //
                                "in the same house with her, at one time for five and at another for nearly\r\n" + //
                                "two years. During all that period she appeared to me the most amiable and\r\n" + //
                                "benevolent of human creatures. She nursed Madame Frankenstein, my aunt, in\r\n" + //
                                "her last illness, with the greatest affection and care and afterwards\r\n" + //
                                "attended her own mother during a tedious illness, in a manner that excited\r\n" + //
                                "the admiration of all who knew her, after which she again lived in my\r\n" + //
                                "uncle’s house, where she was beloved by all the family. She was\r\n" + //
                                "warmly attached to the child who is now dead and acted towards him like a\r\n" + //
                                "most affectionate mother. For my own part, I do not hesitate to say that,\r\n" + //
                                "notwithstanding all the evidence produced against her, I believe and rely\r\n" + //
                                "on her perfect innocence. She had no temptation for such an action; as to\r\n" + //
                                "the bauble on which the chief proof rests, if she had earnestly desired it,\r\n" + //
                                "I should have willingly given it to her, so much do I esteem and value\r\n" + //
                                "her.”\r\n" + //
                                "\r\n" + //
                                "A murmur of approbation followed Elizabeth’s simple and powerful\r\n" + //
                                "appeal, but it was excited by her generous interference, and not in\r\n" + //
                                "favour of poor Justine, on whom the public indignation was turned with\r\n" + //
                                "renewed violence, charging her with the blackest ingratitude. She\r\n" + //
                                "herself wept as Elizabeth spoke, but she did not answer. My own\r\n" + //
                                "agitation and anguish was extreme during the whole trial. I believed\r\n" + //
                                "in her innocence; I knew it. Could the dæmon who had (I did not for a\r\n" + //
                                "minute doubt) murdered my brother also in his hellish sport have\r\n" + //
                                "betrayed the innocent to death and ignominy? I could not sustain the\r\n" + //
                                "horror of my situation, and when I perceived that the popular voice and\r\n" + //
                                "the countenances of the judges had already condemned my unhappy victim,\r\n" + //
                                "I rushed out of the court in agony. The tortures of the accused did\r\n" + //
                                "not equal mine; she was sustained by innocence, but the fangs of\r\n" + //
                                "remorse tore my bosom and would not forgo their hold.\r\n" + //
                                "\r\n" + //
                                "I passed a night of unmingled wretchedness. In the morning I went to\r\n" + //
                                "the court; my lips and throat were parched. I dared not ask the fatal\r\n" + //
                                "question, but I was known, and the officer guessed the cause of my\r\n" + //
                                "visit. The ballots had been thrown; they were all black, and Justine\r\n" + //
                                "was condemned.\r\n" + //
                                "\r\n" + //
                                "I cannot pretend to describe what I then felt. I had before\r\n" + //
                                "experienced sensations of horror, and I have endeavoured to bestow upon\r\n" + //
                                "them adequate expressions, but words cannot convey an idea of the\r\n" + //
                                "heart-sickening despair that I then endured. The person to whom I\r\n" + //
                                "addressed myself added that Justine had already confessed her guilt.\r\n" + //
                                "“That evidence,” he observed, “was hardly required in so glaring a\r\n" + //
                                "case, but I am glad of it, and, indeed, none of our judges like to\r\n" + //
                                "condemn a criminal upon circumstantial evidence, be it ever so\r\n" + //
                                "decisive.”\r\n" + //
                                "\r\n" + //
                                "This was strange and unexpected intelligence; what could it mean? Had\r\n" + //
                                "my eyes deceived me? And was I really as mad as the whole world would\r\n" + //
                                "believe me to be if I disclosed the object of my suspicions? I\r\n" + //
                                "hastened to return home, and Elizabeth eagerly demanded the result.\r\n" + //
                                "\r\n" + //
                                "“My cousin,” replied I, “it is decided as you may have expected; all\r\n" + //
                                "judges had rather that ten innocent should suffer than that one guilty\r\n" + //
                                "should escape. But she has confessed.”\r\n" + //
                                "\r\n" + //
                                "This was a dire blow to poor Elizabeth, who had relied with firmness upon\r\n" + //
                                "Justine’s innocence. “Alas!” said she. “How shall I\r\n" + //
                                "ever again believe in human goodness? Justine, whom I loved and esteemed as\r\n" + //
                                "my sister, how could she put on those smiles of innocence only to betray?\r\n" + //
                                "Her mild eyes seemed incapable of any severity or guile, and yet she has\r\n" + //
                                "committed a murder.”\r\n" + //
                                "\r\n" + //
                                "Soon after we heard that the poor victim had expressed a desire to see my\r\n" + //
                                "cousin. My father wished her not to go but said that he left it to her own\r\n" + //
                                "judgment and feelings to decide. “Yes,” said Elizabeth,\r\n" + //
                                "“I will go, although she is guilty; and you, Victor, shall accompany\r\n" + //
                                "me; I cannot go alone.” The idea of this visit was torture to me, yet\r\n" + //
                                "I could not refuse.\r\n" + //
                                "\r\n" + //
                                "We entered the gloomy prison chamber and beheld Justine sitting on some\r\n" + //
                                "straw at the farther end; her hands were manacled, and her head rested on\r\n" + //
                                "her knees. She rose on seeing us enter, and when we were left alone with\r\n" + //
                                "her, she threw herself at the feet of Elizabeth, weeping bitterly. My\r\n" + //
                                "cousin wept also.\r\n" + //
                                "\r\n" + //
                                "“Oh, Justine!” said she. “Why did you rob me of my last consolation?\r\n" + //
                                "I relied on your innocence, and although I was then very wretched, I\r\n" + //
                                "was not so miserable as I am now.”\r\n" + //
                                "\r\n" + //
                                "“And do you also believe that I am so very, very wicked? Do you also\r\n" + //
                                "join with my enemies to crush me, to condemn me as a murderer?” Her\r\n" + //
                                "voice was suffocated with sobs.\r\n" + //
                                "\r\n" + //
                                "“Rise, my poor girl,” said Elizabeth; “why do you kneel,\r\n" + //
                                "if you are innocent? I am not one of your enemies, I believed you\r\n" + //
                                "guiltless, notwithstanding every evidence, until I heard that you had\r\n" + //
                                "yourself declared your guilt. That report, you say, is false; and be\r\n" + //
                                "assured, dear Justine, that nothing can shake my confidence in you for a\r\n" + //
                                "moment, but your own confession.”\r\n" + //
                                "\r\n" + //
                                "“I did confess, but I confessed a lie. I confessed, that I might\r\n" + //
                                "obtain absolution; but now that falsehood lies heavier at my heart than\r\n" + //
                                "all my other sins. The God of heaven forgive me! Ever since I was\r\n" + //
                                "condemned, my confessor has besieged me; he threatened and menaced,\r\n" + //
                                "until I almost began to think that I was the monster that he said I\r\n" + //
                                "was. He threatened excommunication and hell fire in my last moments if\r\n" + //
                                "I continued obdurate. Dear lady, I had none to support me; all looked\r\n" + //
                                "on me as a wretch doomed to ignominy and perdition. What could I do?\r\n" + //
                                "In an evil hour I subscribed to a lie; and now only am I truly\r\n" + //
                                "miserable.”\r\n" + //
                                "\r\n" + //
                                "She paused, weeping, and then continued, “I thought with horror, my\r\n" + //
                                "sweet lady, that you should believe your Justine, whom your blessed\r\n" + //
                                "aunt had so highly honoured, and whom you loved, was a creature capable\r\n" + //
                                "of a crime which none but the devil himself could have perpetrated.\r\n" + //
                                "Dear William! dearest blessed child! I soon shall see you again in\r\n" + //
                                "heaven, where we shall all be happy; and that consoles me, going as I\r\n" + //
                                "am to suffer ignominy and death.”\r\n" + //
                                "\r\n" + //
                                "“Oh, Justine! Forgive me for having for one moment distrusted you.\r\n" + //
                                "Why did you confess? But do not mourn, dear girl. Do not fear. I\r\n" + //
                                "will proclaim, I will prove your innocence. I will melt the stony\r\n" + //
                                "hearts of your enemies by my tears and prayers. You shall not die!\r\n" + //
                                "You, my playfellow, my companion, my sister, perish on the scaffold!\r\n" + //
                                "No! No! I never could survive so horrible a misfortune.”\r\n" + //
                                "\r\n" + //
                                "Justine shook her head mournfully. “I do not fear to die,” she said;\r\n" + //
                                "“that pang is past. God raises my weakness and gives me courage to\r\n" + //
                                "endure the worst. I leave a sad and bitter world; and if you remember\r\n" + //
                                "me and think of me as of one unjustly condemned, I am resigned to the\r\n" + //
                                "fate awaiting me. Learn from me, dear lady, to submit in patience to\r\n" + //
                                "the will of heaven!”\r\n" + //
                                "\r\n" + //
                                "During this conversation I had retired to a corner of the prison room,\r\n" + //
                                "where I could conceal the horrid anguish that possessed me. Despair!\r\n" + //
                                "Who dared talk of that? The poor victim, who on the morrow was to pass\r\n" + //
                                "the awful boundary between life and death, felt not, as I did, such\r\n" + //
                                "deep and bitter agony. I gnashed my teeth and ground them together,\r\n" + //
                                "uttering a groan that came from my inmost soul. Justine started. When\r\n" + //
                                "she saw who it was, she approached me and said, “Dear sir, you are very\r\n" + //
                                "kind to visit me; you, I hope, do not believe that I am guilty?”\r\n" + //
                                "\r\n" + //
                                "I could not answer. “No, Justine,” said Elizabeth; “he is more\r\n" + //
                                "convinced of your innocence than I was, for even when he heard that you\r\n" + //
                                "had confessed, he did not credit it.”\r\n" + //
                                "\r\n" + //
                                "“I truly thank him. In these last moments I feel the sincerest\r\n" + //
                                "gratitude towards those who think of me with kindness. How sweet is\r\n" + //
                                "the affection of others to such a wretch as I am! It removes more than\r\n" + //
                                "half my misfortune, and I feel as if I could die in peace now that my\r\n" + //
                                "innocence is acknowledged by you, dear lady, and your cousin.”\r\n" + //
                                "\r\n" + //
                                "Thus the poor sufferer tried to comfort others and herself. She indeed\r\n" + //
                                "gained the resignation she desired. But I, the true murderer, felt the\r\n" + //
                                "never-dying worm alive in my bosom, which allowed of no hope or\r\n" + //
                                "consolation. Elizabeth also wept and was unhappy, but hers also was\r\n" + //
                                "the misery of innocence, which, like a cloud that passes over the fair\r\n" + //
                                "moon, for a while hides but cannot tarnish its brightness. Anguish and\r\n" + //
                                "despair had penetrated into the core of my heart; I bore a hell within\r\n" + //
                                "me which nothing could extinguish. We stayed several hours with\r\n" + //
                                "Justine, and it was with great difficulty that Elizabeth could tear\r\n" + //
                                "herself away. “I wish,” cried she, “that I were to die with you; I\r\n" + //
                                "cannot live in this world of misery.”\r\n" + //
                                "\r\n" + //
                                "Justine assumed an air of cheerfulness, while she with difficulty\r\n" + //
                                "repressed her bitter tears. She embraced Elizabeth and said in a voice\r\n" + //
                                "of half-suppressed emotion, “Farewell, sweet lady, dearest Elizabeth,\r\n" + //
                                "my beloved and only friend; may heaven, in its bounty, bless and\r\n" + //
                                "preserve you; may this be the last misfortune that you will ever\r\n" + //
                                "suffer! Live, and be happy, and make others so.”\r\n" + //
                                "\r\n" + //
                                "And on the morrow Justine died. Elizabeth’s heart-rending eloquence\r\n" + //
                                "failed to move the judges from their settled conviction in the\r\n" + //
                                "criminality of the saintly sufferer. My passionate and indignant\r\n" + //
                                "appeals were lost upon them. And when I received their cold answers\r\n" + //
                                "and heard the harsh, unfeeling reasoning of these men, my purposed\r\n" + //
                                "avowal died away on my lips. Thus I might proclaim myself a madman,\r\n" + //
                                "but not revoke the sentence passed upon my wretched victim. She\r\n" + //
                                "perished on the scaffold as a murderess!\r\n" + //
                                "\r\n" + //
                                "From the tortures of my own heart, I turned to contemplate the deep and\r\n" + //
                                "voiceless grief of my Elizabeth. This also was my doing! And my\r\n" + //
                                "father’s woe, and the desolation of that late so smiling home all was\r\n" + //
                                "the work of my thrice-accursed hands! Ye weep, unhappy ones, but these\r\n" + //
                                "are not your last tears! Again shall you raise the funeral wail, and\r\n" + //
                                "the sound of your lamentations shall again and again be heard!\r\n" + //
                                "Frankenstein, your son, your kinsman, your early, much-loved friend; he\r\n" + //
                                "who would spend each vital drop of blood for your sakes, who has no\r\n" + //
                                "thought nor sense of joy except as it is mirrored also in your dear\r\n" + //
                                "countenances, who would fill the air with blessings and spend his life\r\n" + //
                                "in serving you—he bids you weep, to shed countless tears; happy beyond\r\n" + //
                                "his hopes, if thus inexorable fate be satisfied, and if the destruction\r\n" + //
                                "pause before the peace of the grave have succeeded to your sad torments!\r\n" + //
                                "\r\n" + //
                                "Thus spoke my prophetic soul, as, torn by remorse, horror, and despair,\r\n" + //
                                "I beheld those I loved spend vain sorrow upon the graves of William and\r\n" + //
                                "Justine, the first hapless victims to my unhallowed arts.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 9\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Nothing is more painful to the human mind than, after the feelings have\r\n" + //
                                "been worked up by a quick succession of events, the dead calmness of\r\n" + //
                                "inaction and certainty which follows and deprives the soul both of hope\r\n" + //
                                "and fear. Justine died, she rested, and I was alive. The blood flowed\r\n" + //
                                "freely in my veins, but a weight of despair and remorse pressed on my\r\n" + //
                                "heart which nothing could remove. Sleep fled from my eyes; I wandered\r\n" + //
                                "like an evil spirit, for I had committed deeds of mischief beyond\r\n" + //
                                "description horrible, and more, much more (I persuaded myself) was yet\r\n" + //
                                "behind. Yet my heart overflowed with kindness and the love of virtue.\r\n" + //
                                "I had begun life with benevolent intentions and thirsted for the moment\r\n" + //
                                "when I should put them in practice and make myself useful to my fellow\r\n" + //
                                "beings. Now all was blasted; instead of that serenity of conscience\r\n" + //
                                "which allowed me to look back upon the past with self-satisfaction, and\r\n" + //
                                "from thence to gather promise of new hopes, I was seized by remorse and\r\n" + //
                                "the sense of guilt, which hurried me away to a hell of intense tortures\r\n" + //
                                "such as no language can describe.\r\n" + //
                                "\r\n" + //
                                "This state of mind preyed upon my health, which had perhaps never\r\n" + //
                                "entirely recovered from the first shock it had sustained. I shunned\r\n" + //
                                "the face of man; all sound of joy or complacency was torture to me;\r\n" + //
                                "solitude was my only consolation—deep, dark, deathlike solitude.\r\n" + //
                                "\r\n" + //
                                "My father observed with pain the alteration perceptible in my disposition\r\n" + //
                                "and habits and endeavoured by arguments deduced from the feelings of his\r\n" + //
                                "serene conscience and guiltless life to inspire me with fortitude and\r\n" + //
                                "awaken in me the courage to dispel the dark cloud which brooded over me.\r\n" + //
                                "“Do you think, Victor,” said he, “that I do not suffer\r\n" + //
                                "also? No one could love a child more than I loved your\r\n" + //
                                "brother”—tears came into his eyes as he spoke—“but\r\n" + //
                                "is it not a duty to the survivors that we should refrain from augmenting\r\n" + //
                                "their unhappiness by an appearance of immoderate grief? It is also a duty\r\n" + //
                                "owed to yourself, for excessive sorrow prevents improvement or enjoyment,\r\n" + //
                                "or even the discharge of daily usefulness, without which no man is fit for\r\n" + //
                                "society.”\r\n" + //
                                "\r\n" + //
                                "This advice, although good, was totally inapplicable to my case; I\r\n" + //
                                "should have been the first to hide my grief and console my friends if\r\n" + //
                                "remorse had not mingled its bitterness, and terror its alarm, with my\r\n" + //
                                "other sensations. Now I could only answer my father with a look of\r\n" + //
                                "despair and endeavour to hide myself from his view.\r\n" + //
                                "\r\n" + //
                                "About this time we retired to our house at Belrive. This change was\r\n" + //
                                "particularly agreeable to me. The shutting of the gates regularly at\r\n" + //
                                "ten o’clock and the impossibility of remaining on the lake after that\r\n" + //
                                "hour had rendered our residence within the walls of Geneva very irksome\r\n" + //
                                "to me. I was now free. Often, after the rest of the family had\r\n" + //
                                "retired for the night, I took the boat and passed many hours upon the\r\n" + //
                                "water. Sometimes, with my sails set, I was carried by the wind; and\r\n" + //
                                "sometimes, after rowing into the middle of the lake, I left the boat to\r\n" + //
                                "pursue its own course and gave way to my own miserable reflections. I\r\n" + //
                                "was often tempted, when all was at peace around me, and I the only\r\n" + //
                                "unquiet thing that wandered restless in a scene so beautiful and\r\n" + //
                                "heavenly—if I except some bat, or the frogs, whose harsh and\r\n" + //
                                "interrupted croaking was heard only when I approached the shore—often,\r\n" + //
                                "I say, I was tempted to plunge into the silent lake, that the waters\r\n" + //
                                "might close over me and my calamities for ever. But I was restrained,\r\n" + //
                                "when I thought of the heroic and suffering Elizabeth, whom I tenderly\r\n" + //
                                "loved, and whose existence was bound up in mine. I thought also of my\r\n" + //
                                "father and surviving brother; should I by my base desertion leave them\r\n" + //
                                "exposed and unprotected to the malice of the fiend whom I had let loose\r\n" + //
                                "among them?\r\n" + //
                                "\r\n" + //
                                "At these moments I wept bitterly and wished that peace would revisit my\r\n" + //
                                "mind only that I might afford them consolation and happiness. But that\r\n" + //
                                "could not be. Remorse extinguished every hope. I had been the author of\r\n" + //
                                "unalterable evils, and I lived in daily fear lest the monster whom I had\r\n" + //
                                "created should perpetrate some new wickedness. I had an obscure feeling\r\n" + //
                                "that all was not over and that he would still commit some signal crime,\r\n" + //
                                "which by its enormity should almost efface the recollection of the past.\r\n" + //
                                "There was always scope for fear so long as anything I loved remained\r\n" + //
                                "behind. My abhorrence of this fiend cannot be conceived. When I thought of\r\n" + //
                                "him I gnashed my teeth, my eyes became inflamed, and I ardently wished to\r\n" + //
                                "extinguish that life which I had so thoughtlessly bestowed. When I\r\n" + //
                                "reflected on his crimes and malice, my hatred and revenge burst all bounds\r\n" + //
                                "of moderation. I would have made a pilgrimage to the highest peak of the\r\n" + //
                                "Andes, could I, when there, have precipitated him to their base. I wished\r\n" + //
                                "to see him again, that I might wreak the utmost extent of abhorrence on his\r\n" + //
                                "head and avenge the deaths of William and Justine.\r\n" + //
                                "\r\n" + //
                                "Our house was the house of mourning. My father’s health was deeply\r\n" + //
                                "shaken by the horror of the recent events. Elizabeth was sad and\r\n" + //
                                "desponding; she no longer took delight in her ordinary occupations; all\r\n" + //
                                "pleasure seemed to her sacrilege toward the dead; eternal woe and tears she\r\n" + //
                                "then thought was the just tribute she should pay to innocence so blasted\r\n" + //
                                "and destroyed. She was no longer that happy creature who in earlier youth\r\n" + //
                                "wandered with me on the banks of the lake and talked with ecstasy of our\r\n" + //
                                "future prospects. The first of those sorrows which are sent to wean us from\r\n" + //
                                "the earth had visited her, and its dimming influence quenched her dearest\r\n" + //
                                "smiles.\r\n" + //
                                "\r\n" + //
                                "“When I reflect, my dear cousin,” said she, “on the miserable death of\r\n" + //
                                "Justine Moritz, I no longer see the world and its works as they before\r\n" + //
                                "appeared to me. Before, I looked upon the accounts of vice and\r\n" + //
                                "injustice that I read in books or heard from others as tales of ancient\r\n" + //
                                "days or imaginary evils; at least they were remote and more familiar to\r\n" + //
                                "reason than to the imagination; but now misery has come home, and men\r\n" + //
                                "appear to me as monsters thirsting for each other’s blood. Yet I am\r\n" + //
                                "certainly unjust. Everybody believed that poor girl to be guilty; and\r\n" + //
                                "if she could have committed the crime for which she suffered, assuredly\r\n" + //
                                "she would have been the most depraved of human creatures. For the sake\r\n" + //
                                "of a few jewels, to have murdered the son of her benefactor and friend,\r\n" + //
                                "a child whom she had nursed from its birth, and appeared to love as if\r\n" + //
                                "it had been her own! I could not consent to the death of any human\r\n" + //
                                "being, but certainly I should have thought such a creature unfit to\r\n" + //
                                "remain in the society of men. But she was innocent. I know, I feel\r\n" + //
                                "she was innocent; you are of the same opinion, and that confirms me.\r\n" + //
                                "Alas! Victor, when falsehood can look so like the truth, who can\r\n" + //
                                "assure themselves of certain happiness? I feel as if I were walking on\r\n" + //
                                "the edge of a precipice, towards which thousands are crowding and\r\n" + //
                                "endeavouring to plunge me into the abyss. William and Justine were\r\n" + //
                                "assassinated, and the murderer escapes; he walks about the world free,\r\n" + //
                                "and perhaps respected. But even if I were condemned to suffer on the\r\n" + //
                                "scaffold for the same crimes, I would not change places with such a\r\n" + //
                                "wretch.”\r\n" + //
                                "\r\n" + //
                                "I listened to this discourse with the extremest agony. I, not in deed,\r\n" + //
                                "but in effect, was the true murderer. Elizabeth read my anguish in my\r\n" + //
                                "countenance, and kindly taking my hand, said, “My dearest friend, you\r\n" + //
                                "must calm yourself. These events have affected me, God knows how\r\n" + //
                                "deeply; but I am not so wretched as you are. There is an expression of\r\n" + //
                                "despair, and sometimes of revenge, in your countenance that makes me\r\n" + //
                                "tremble. Dear Victor, banish these dark passions. Remember the\r\n" + //
                                "friends around you, who centre all their hopes in you. Have we lost\r\n" + //
                                "the power of rendering you happy? Ah! While we love, while we are\r\n" + //
                                "true to each other, here in this land of peace and beauty, your native\r\n" + //
                                "country, we may reap every tranquil blessing—what can disturb our\r\n" + //
                                "peace?”\r\n" + //
                                "\r\n" + //
                                "And could not such words from her whom I fondly prized before every\r\n" + //
                                "other gift of fortune suffice to chase away the fiend that lurked in my\r\n" + //
                                "heart? Even as she spoke I drew near to her, as if in terror, lest at\r\n" + //
                                "that very moment the destroyer had been near to rob me of her.\r\n" + //
                                "\r\n" + //
                                "Thus not the tenderness of friendship, nor the beauty of earth, nor of\r\n" + //
                                "heaven, could redeem my soul from woe; the very accents of love were\r\n" + //
                                "ineffectual. I was encompassed by a cloud which no beneficial\r\n" + //
                                "influence could penetrate. The wounded deer dragging its fainting\r\n" + //
                                "limbs to some untrodden brake, there to gaze upon the arrow which had\r\n" + //
                                "pierced it, and to die, was but a type of me.\r\n" + //
                                "\r\n" + //
                                "Sometimes I could cope with the sullen despair that overwhelmed me, but\r\n" + //
                                "sometimes the whirlwind passions of my soul drove me to seek, by bodily\r\n" + //
                                "exercise and by change of place, some relief from my intolerable\r\n" + //
                                "sensations. It was during an access of this kind that I suddenly left\r\n" + //
                                "my home, and bending my steps towards the near Alpine valleys, sought\r\n" + //
                                "in the magnificence, the eternity of such scenes, to forget myself and\r\n" + //
                                "my ephemeral, because human, sorrows. My wanderings were directed\r\n" + //
                                "towards the valley of Chamounix. I had visited it frequently during my\r\n" + //
                                "boyhood. Six years had passed since then: _I_ was a wreck, but nought\r\n" + //
                                "had changed in those savage and enduring scenes.\r\n" + //
                                "\r\n" + //
                                "I performed the first part of my journey on horseback. I afterwards\r\n" + //
                                "hired a mule, as the more sure-footed and least liable to receive\r\n" + //
                                "injury on these rugged roads. The weather was fine; it was about the\r\n" + //
                                "middle of the month of August, nearly two months after the death of\r\n" + //
                                "Justine, that miserable epoch from which I dated all my woe. The\r\n" + //
                                "weight upon my spirit was sensibly lightened as I plunged yet deeper in\r\n" + //
                                "the ravine of Arve. The immense mountains and precipices that overhung\r\n" + //
                                "me on every side, the sound of the river raging among the rocks, and\r\n" + //
                                "the dashing of the waterfalls around spoke of a power mighty as\r\n" + //
                                "Omnipotence—and I ceased to fear or to bend before any being less\r\n" + //
                                "almighty than that which had created and ruled the elements, here\r\n" + //
                                "displayed in their most terrific guise. Still, as I ascended higher,\r\n" + //
                                "the valley assumed a more magnificent and astonishing character.\r\n" + //
                                "Ruined castles hanging on the precipices of piny mountains, the\r\n" + //
                                "impetuous Arve, and cottages every here and there peeping forth from\r\n" + //
                                "among the trees formed a scene of singular beauty. But it was\r\n" + //
                                "augmented and rendered sublime by the mighty Alps, whose white and\r\n" + //
                                "shining pyramids and domes towered above all, as belonging to another\r\n" + //
                                "earth, the habitations of another race of beings.\r\n" + //
                                "\r\n" + //
                                "I passed the bridge of Pélissier, where the ravine, which the river\r\n" + //
                                "forms, opened before me, and I began to ascend the mountain that\r\n" + //
                                "overhangs it. Soon after, I entered the valley of Chamounix. This\r\n" + //
                                "valley is more wonderful and sublime, but not so beautiful and\r\n" + //
                                "picturesque as that of Servox, through which I had just passed. The\r\n" + //
                                "high and snowy mountains were its immediate boundaries, but I saw no\r\n" + //
                                "more ruined castles and fertile fields. Immense glaciers approached\r\n" + //
                                "the road; I heard the rumbling thunder of the falling avalanche and\r\n" + //
                                "marked the smoke of its passage. Mont Blanc, the supreme and\r\n" + //
                                "magnificent Mont Blanc, raised itself from the surrounding _aiguilles_,\r\n" + //
                                "and its tremendous _dôme_ overlooked the valley.\r\n" + //
                                "\r\n" + //
                                "A tingling long-lost sense of pleasure often came across me during this\r\n" + //
                                "journey. Some turn in the road, some new object suddenly perceived and\r\n" + //
                                "recognised, reminded me of days gone by, and were associated with the\r\n" + //
                                "lighthearted gaiety of boyhood. The very winds whispered in soothing\r\n" + //
                                "accents, and maternal Nature bade me weep no more. Then again the\r\n" + //
                                "kindly influence ceased to act—I found myself fettered again to grief\r\n" + //
                                "and indulging in all the misery of reflection. Then I spurred on my\r\n" + //
                                "animal, striving so to forget the world, my fears, and more than all,\r\n" + //
                                "myself—or, in a more desperate fashion, I alighted and threw myself on\r\n" + //
                                "the grass, weighed down by horror and despair.\r\n" + //
                                "\r\n" + //
                                "At length I arrived at the village of Chamounix. Exhaustion succeeded\r\n" + //
                                "to the extreme fatigue both of body and of mind which I had endured.\r\n" + //
                                "For a short space of time I remained at the window watching the pallid\r\n" + //
                                "lightnings that played above Mont Blanc and listening to the rushing of\r\n" + //
                                "the Arve, which pursued its noisy way beneath. The same lulling sounds\r\n" + //
                                "acted as a lullaby to my too keen sensations; when I placed my head\r\n" + //
                                "upon my pillow, sleep crept over me; I felt it as it came and blessed\r\n" + //
                                "the giver of oblivion.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 10\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "I spent the following day roaming through the valley. I stood beside\r\n" + //
                                "the sources of the Arveiron, which take their rise in a glacier, that\r\n" + //
                                "with slow pace is advancing down from the summit of the hills to\r\n" + //
                                "barricade the valley. The abrupt sides of vast mountains were before\r\n" + //
                                "me; the icy wall of the glacier overhung me; a few shattered pines were\r\n" + //
                                "scattered around; and the solemn silence of this glorious\r\n" + //
                                "presence-chamber of imperial Nature was broken only by the brawling\r\n" + //
                                "waves or the fall of some vast fragment, the thunder sound of the\r\n" + //
                                "avalanche or the cracking, reverberated along the mountains, of the\r\n" + //
                                "accumulated ice, which, through the silent working of immutable laws,\r\n" + //
                                "was ever and anon rent and torn, as if it had been but a plaything in\r\n" + //
                                "their hands. These sublime and magnificent scenes afforded me the\r\n" + //
                                "greatest consolation that I was capable of receiving. They elevated me\r\n" + //
                                "from all littleness of feeling, and although they did not remove my\r\n" + //
                                "grief, they subdued and tranquillised it. In some degree, also, they\r\n" + //
                                "diverted my mind from the thoughts over which it had brooded for the\r\n" + //
                                "last month. I retired to rest at night; my slumbers, as it were,\r\n" + //
                                "waited on and ministered to by the assemblance of grand shapes which I\r\n" + //
                                "had contemplated during the day. They congregated round me; the\r\n" + //
                                "unstained snowy mountain-top, the glittering pinnacle, the pine woods,\r\n" + //
                                "and ragged bare ravine, the eagle, soaring amidst the clouds—they all\r\n" + //
                                "gathered round me and bade me be at peace.\r\n" + //
                                "\r\n" + //
                                "Where had they fled when the next morning I awoke? All of\r\n" + //
                                "soul-inspiriting fled with sleep, and dark melancholy clouded every\r\n" + //
                                "thought. The rain was pouring in torrents, and thick mists hid the\r\n" + //
                                "summits of the mountains, so that I even saw not the faces of those\r\n" + //
                                "mighty friends. Still I would penetrate their misty veil and seek them\r\n" + //
                                "in their cloudy retreats. What were rain and storm to me? My mule was\r\n" + //
                                "brought to the door, and I resolved to ascend to the summit of\r\n" + //
                                "Montanvert. I remembered the effect that the view of the tremendous\r\n" + //
                                "and ever-moving glacier had produced upon my mind when I first saw it.\r\n" + //
                                "It had then filled me with a sublime ecstasy that gave wings to the\r\n" + //
                                "soul and allowed it to soar from the obscure world to light and joy.\r\n" + //
                                "The sight of the awful and majestic in nature had indeed always the\r\n" + //
                                "effect of solemnising my mind and causing me to forget the passing\r\n" + //
                                "cares of life. I determined to go without a guide, for I was well\r\n" + //
                                "acquainted with the path, and the presence of another would destroy the\r\n" + //
                                "solitary grandeur of the scene.\r\n" + //
                                "\r\n" + //
                                "The ascent is precipitous, but the path is cut into continual and short\r\n" + //
                                "windings, which enable you to surmount the perpendicularity of the\r\n" + //
                                "mountain. It is a scene terrifically desolate. In a thousand spots\r\n" + //
                                "the traces of the winter avalanche may be perceived, where trees lie\r\n" + //
                                "broken and strewed on the ground, some entirely destroyed, others bent,\r\n" + //
                                "leaning upon the jutting rocks of the mountain or transversely upon\r\n" + //
                                "other trees. The path, as you ascend higher, is intersected by ravines\r\n" + //
                                "of snow, down which stones continually roll from above; one of them is\r\n" + //
                                "particularly dangerous, as the slightest sound, such as even speaking\r\n" + //
                                "in a loud voice, produces a concussion of air sufficient to draw\r\n" + //
                                "destruction upon the head of the speaker. The pines are not tall or\r\n" + //
                                "luxuriant, but they are sombre and add an air of severity to the scene.\r\n" + //
                                "I looked on the valley beneath; vast mists were rising from the rivers\r\n" + //
                                "which ran through it and curling in thick wreaths around the opposite\r\n" + //
                                "mountains, whose summits were hid in the uniform clouds, while rain\r\n" + //
                                "poured from the dark sky and added to the melancholy impression I\r\n" + //
                                "received from the objects around me. Alas! Why does man boast of\r\n" + //
                                "sensibilities superior to those apparent in the brute; it only renders\r\n" + //
                                "them more necessary beings. If our impulses were confined to hunger,\r\n" + //
                                "thirst, and desire, we might be nearly free; but now we are moved by\r\n" + //
                                "every wind that blows and a chance word or scene that that word may\r\n" + //
                                "convey to us.\r\n" + //
                                "\r\n" + //
                                "  We rest; a dream has power to poison sleep.\r\n" + //
                                "     We rise; one wand’ring thought pollutes the day.\r\n" + //
                                "  We feel, conceive, or reason; laugh or weep,\r\n" + //
                                "     Embrace fond woe, or cast our cares away;\r\n" + //
                                "  It is the same: for, be it joy or sorrow,\r\n" + //
                                "     The path of its departure still is free.\r\n" + //
                                "  Man’s yesterday may ne’er be like his morrow;\r\n" + //
                                "     Nought may endure but mutability!\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "It was nearly noon when I arrived at the top of the ascent. For some\r\n" + //
                                "time I sat upon the rock that overlooks the sea of ice. A mist covered\r\n" + //
                                "both that and the surrounding mountains. Presently a breeze dissipated\r\n" + //
                                "the cloud, and I descended upon the glacier. The surface is very\r\n" + //
                                "uneven, rising like the waves of a troubled sea, descending low, and\r\n" + //
                                "interspersed by rifts that sink deep. The field of ice is almost a\r\n" + //
                                "league in width, but I spent nearly two hours in crossing it. The\r\n" + //
                                "opposite mountain is a bare perpendicular rock. From the side where I\r\n" + //
                                "now stood Montanvert was exactly opposite, at the distance of a league;\r\n" + //
                                "and above it rose Mont Blanc, in awful majesty. I remained in a recess\r\n" + //
                                "of the rock, gazing on this wonderful and stupendous scene. The sea,\r\n" + //
                                "or rather the vast river of ice, wound among its dependent mountains,\r\n" + //
                                "whose aerial summits hung over its recesses. Their icy and glittering\r\n" + //
                                "peaks shone in the sunlight over the clouds. My heart, which was\r\n" + //
                                "before sorrowful, now swelled with something like joy; I exclaimed,\r\n" + //
                                "“Wandering spirits, if indeed ye wander, and do not rest in your narrow\r\n" + //
                                "beds, allow me this faint happiness, or take me, as your companion,\r\n" + //
                                "away from the joys of life.”\r\n" + //
                                "\r\n" + //
                                "As I said this I suddenly beheld the figure of a man, at some distance,\r\n" + //
                                "advancing towards me with superhuman speed. He bounded over the\r\n" + //
                                "crevices in the ice, among which I had walked with caution; his\r\n" + //
                                "stature, also, as he approached, seemed to exceed that of man. I was\r\n" + //
                                "troubled; a mist came over my eyes, and I felt a faintness seize me,\r\n" + //
                                "but I was quickly restored by the cold gale of the mountains. I\r\n" + //
                                "perceived, as the shape came nearer (sight tremendous and abhorred!)\r\n" + //
                                "that it was the wretch whom I had created. I trembled with rage and\r\n" + //
                                "horror, resolving to wait his approach and then close with him in\r\n" + //
                                "mortal combat. He approached; his countenance bespoke bitter anguish,\r\n" + //
                                "combined with disdain and malignity, while its unearthly ugliness\r\n" + //
                                "rendered it almost too horrible for human eyes. But I scarcely\r\n" + //
                                "observed this; rage and hatred had at first deprived me of utterance,\r\n" + //
                                "and I recovered only to overwhelm him with words expressive of furious\r\n" + //
                                "detestation and contempt.\r\n" + //
                                "\r\n" + //
                                "“Devil,” I exclaimed, “do you dare approach me? And do\r\n" + //
                                "not you fear the fierce vengeance of my arm wreaked on your miserable head?\r\n" + //
                                "Begone, vile insect! Or rather, stay, that I may trample you to dust! And,\r\n" + //
                                "oh! That I could, with the extinction of your miserable existence, restore\r\n" + //
                                "those victims whom you have so diabolically murdered!”\r\n" + //
                                "\r\n" + //
                                "“I expected this reception,” said the dæmon. “All men hate the\r\n" + //
                                "wretched; how, then, must I be hated, who am miserable beyond all\r\n" + //
                                "living things! Yet you, my creator, detest and spurn me, thy creature,\r\n" + //
                                "to whom thou art bound by ties only dissoluble by the annihilation of\r\n" + //
                                "one of us. You purpose to kill me. How dare you sport thus with life?\r\n" + //
                                "Do your duty towards me, and I will do mine towards you and the rest of\r\n" + //
                                "mankind. If you will comply with my conditions, I will leave them and\r\n" + //
                                "you at peace; but if you refuse, I will glut the maw of death, until it\r\n" + //
                                "be satiated with the blood of your remaining friends.”\r\n" + //
                                "\r\n" + //
                                "“Abhorred monster! Fiend that thou art! The tortures of hell are too\r\n" + //
                                "mild a vengeance for thy crimes. Wretched devil! You reproach me with\r\n" + //
                                "your creation, come on, then, that I may extinguish the spark which I\r\n" + //
                                "so negligently bestowed.”\r\n" + //
                                "\r\n" + //
                                "My rage was without bounds; I sprang on him, impelled by all the\r\n" + //
                                "feelings which can arm one being against the existence of another.\r\n" + //
                                "\r\n" + //
                                "He easily eluded me and said,\r\n" + //
                                "\r\n" + //
                                "“Be calm! I entreat you to hear me before you give vent to your hatred\r\n" + //
                                "on my devoted head. Have I not suffered enough, that you seek to\r\n" + //
                                "increase my misery? Life, although it may only be an accumulation of\r\n" + //
                                "anguish, is dear to me, and I will defend it. Remember, thou hast made\r\n" + //
                                "me more powerful than thyself; my height is superior to thine, my\r\n" + //
                                "joints more supple. But I will not be tempted to set myself in\r\n" + //
                                "opposition to thee. I am thy creature, and I will be even mild and\r\n" + //
                                "docile to my natural lord and king if thou wilt also perform thy part,\r\n" + //
                                "the which thou owest me. Oh, Frankenstein, be not equitable to every\r\n" + //
                                "other and trample upon me alone, to whom thy justice, and even thy\r\n" + //
                                "clemency and affection, is most due. Remember that I am thy creature;\r\n" + //
                                "I ought to be thy Adam, but I am rather the fallen angel, whom thou\r\n" + //
                                "drivest from joy for no misdeed. Everywhere I see bliss, from which I\r\n" + //
                                "alone am irrevocably excluded. I was benevolent and good; misery made\r\n" + //
                                "me a fiend. Make me happy, and I shall again be virtuous.”\r\n" + //
                                "\r\n" + //
                                "“Begone! I will not hear you. There can be no community between you\r\n" + //
                                "and me; we are enemies. Begone, or let us try our strength in a fight,\r\n" + //
                                "in which one must fall.”\r\n" + //
                                "\r\n" + //
                                "“How can I move thee? Will no entreaties cause thee to turn a\r\n" + //
                                "favourable eye upon thy creature, who implores thy goodness and\r\n" + //
                                "compassion? Believe me, Frankenstein, I was benevolent; my soul glowed\r\n" + //
                                "with love and humanity; but am I not alone, miserably alone? You, my\r\n" + //
                                "creator, abhor me; what hope can I gather from your fellow creatures,\r\n" + //
                                "who owe me nothing? They spurn and hate me. The desert mountains and\r\n" + //
                                "dreary glaciers are my refuge. I have wandered here many days; the\r\n" + //
                                "caves of ice, which I only do not fear, are a dwelling to me, and the\r\n" + //
                                "only one which man does not grudge. These bleak skies I hail, for they\r\n" + //
                                "are kinder to me than your fellow beings. If the multitude of mankind\r\n" + //
                                "knew of my existence, they would do as you do, and arm themselves for\r\n" + //
                                "my destruction. Shall I not then hate them who abhor me? I will keep\r\n" + //
                                "no terms with my enemies. I am miserable, and they shall share my\r\n" + //
                                "wretchedness. Yet it is in your power to recompense me, and deliver\r\n" + //
                                "them from an evil which it only remains for you to make so great, that\r\n" + //
                                "not only you and your family, but thousands of others, shall be\r\n" + //
                                "swallowed up in the whirlwinds of its rage. Let your compassion be\r\n" + //
                                "moved, and do not disdain me. Listen to my tale; when you have heard\r\n" + //
                                "that, abandon or commiserate me, as you shall judge that I deserve.\r\n" + //
                                "But hear me. The guilty are allowed, by human laws, bloody as they\r\n" + //
                                "are, to speak in their own defence before they are condemned. Listen\r\n" + //
                                "to me, Frankenstein. You accuse me of murder, and yet you would, with\r\n" + //
                                "a satisfied conscience, destroy your own creature. Oh, praise the\r\n" + //
                                "eternal justice of man! Yet I ask you not to spare me; listen to me,\r\n" + //
                                "and then, if you can, and if you will, destroy the work of your hands.”\r\n" + //
                                "\r\n" + //
                                "“Why do you call to my remembrance,” I rejoined, “circumstances of\r\n" + //
                                "which I shudder to reflect, that I have been the miserable origin and\r\n" + //
                                "author? Cursed be the day, abhorred devil, in which you first saw\r\n" + //
                                "light! Cursed (although I curse myself) be the hands that formed you!\r\n" + //
                                "You have made me wretched beyond expression. You have left me no power\r\n" + //
                                "to consider whether I am just to you or not. Begone! Relieve me from\r\n" + //
                                "the sight of your detested form.”\r\n" + //
                                "\r\n" + //
                                "“Thus I relieve thee, my creator,” he said, and placed his hated hands\r\n" + //
                                "before my eyes, which I flung from me with violence; “thus I take from\r\n" + //
                                "thee a sight which you abhor. Still thou canst listen to me and grant\r\n" + //
                                "me thy compassion. By the virtues that I once possessed, I demand this\r\n" + //
                                "from you. Hear my tale; it is long and strange, and the temperature of\r\n" + //
                                "this place is not fitting to your fine sensations; come to the hut upon\r\n" + //
                                "the mountain. The sun is yet high in the heavens; before it descends\r\n" + //
                                "to hide itself behind your snowy precipices and illuminate another\r\n" + //
                                "world, you will have heard my story and can decide. On you it rests,\r\n" + //
                                "whether I quit for ever the neighbourhood of man and lead a harmless\r\n" + //
                                "life, or become the scourge of your fellow creatures and the author of\r\n" + //
                                "your own speedy ruin.”\r\n" + //
                                "\r\n" + //
                                "As he said this he led the way across the ice; I followed. My heart\r\n" + //
                                "was full, and I did not answer him, but as I proceeded, I weighed the\r\n" + //
                                "various arguments that he had used and determined at least to listen to\r\n" + //
                                "his tale. I was partly urged by curiosity, and compassion confirmed my\r\n" + //
                                "resolution. I had hitherto supposed him to be the murderer of my\r\n" + //
                                "brother, and I eagerly sought a confirmation or denial of this opinion.\r\n" + //
                                "For the first time, also, I felt what the duties of a creator towards\r\n" + //
                                "his creature were, and that I ought to render him happy before I\r\n" + //
                                "complained of his wickedness. These motives urged me to comply with\r\n" + //
                                "his demand. We crossed the ice, therefore, and ascended the opposite\r\n" + //
                                "rock. The air was cold, and the rain again began to descend; we\r\n" + //
                                "entered the hut, the fiend with an air of exultation, I with a heavy\r\n" + //
                                "heart and depressed spirits. But I consented to listen, and seating\r\n" + //
                                "myself by the fire which my odious companion had lighted, he thus began\r\n" + //
                                "his tale.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 11\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“It is with considerable difficulty that I remember the original era of\r\n" + //
                                "my being; all the events of that period appear confused and indistinct.\r\n" + //
                                "A strange multiplicity of sensations seized me, and I saw, felt, heard,\r\n" + //
                                "and smelt at the same time; and it was, indeed, a long time before I\r\n" + //
                                "learned to distinguish between the operations of my various senses. By\r\n" + //
                                "degrees, I remember, a stronger light pressed upon my nerves, so that I\r\n" + //
                                "was obliged to shut my eyes. Darkness then came over me and troubled\r\n" + //
                                "me, but hardly had I felt this when, by opening my eyes, as I now\r\n" + //
                                "suppose, the light poured in upon me again. I walked and, I believe,\r\n" + //
                                "descended, but I presently found a great alteration in my sensations.\r\n" + //
                                "Before, dark and opaque bodies had surrounded me, impervious to my\r\n" + //
                                "touch or sight; but I now found that I could wander on at liberty, with\r\n" + //
                                "no obstacles which I could not either surmount or avoid. The light\r\n" + //
                                "became more and more oppressive to me, and the heat wearying me as I\r\n" + //
                                "walked, I sought a place where I could receive shade. This was the\r\n" + //
                                "forest near Ingolstadt; and here I lay by the side of a brook resting\r\n" + //
                                "from my fatigue, until I felt tormented by hunger and thirst. This\r\n" + //
                                "roused me from my nearly dormant state, and I ate some berries which I\r\n" + //
                                "found hanging on the trees or lying on the ground. I slaked my thirst\r\n" + //
                                "at the brook, and then lying down, was overcome by sleep.\r\n" + //
                                "\r\n" + //
                                "“It was dark when I awoke; I felt cold also, and half frightened, as it\r\n" + //
                                "were, instinctively, finding myself so desolate. Before I had quitted\r\n" + //
                                "your apartment, on a sensation of cold, I had covered myself with some\r\n" + //
                                "clothes, but these were insufficient to secure me from the dews of\r\n" + //
                                "night. I was a poor, helpless, miserable wretch; I knew, and could\r\n" + //
                                "distinguish, nothing; but feeling pain invade me on all sides, I sat\r\n" + //
                                "down and wept.\r\n" + //
                                "\r\n" + //
                                "“Soon a gentle light stole over the heavens and gave me a sensation of\r\n" + //
                                "pleasure. I started up and beheld a radiant form rise from among the\r\n" + //
                                "trees. [The moon] I gazed with a kind of wonder. It moved slowly,\r\n" + //
                                "but it enlightened my path, and I again went out in search of berries.\r\n" + //
                                "I was still cold when under one of the trees I found a huge cloak, with\r\n" + //
                                "which I covered myself, and sat down upon the ground. No distinct\r\n" + //
                                "ideas occupied my mind; all was confused. I felt light, and hunger,\r\n" + //
                                "and thirst, and darkness; innumerable sounds rang in my ears, and on\r\n" + //
                                "all sides various scents saluted me; the only object that I could\r\n" + //
                                "distinguish was the bright moon, and I fixed my eyes on that with\r\n" + //
                                "pleasure.\r\n" + //
                                "\r\n" + //
                                "“Several changes of day and night passed, and the orb of night had\r\n" + //
                                "greatly lessened, when I began to distinguish my sensations from each\r\n" + //
                                "other. I gradually saw plainly the clear stream that supplied me with\r\n" + //
                                "drink and the trees that shaded me with their foliage. I was delighted\r\n" + //
                                "when I first discovered that a pleasant sound, which often saluted my\r\n" + //
                                "ears, proceeded from the throats of the little winged animals who had\r\n" + //
                                "often intercepted the light from my eyes. I began also to observe,\r\n" + //
                                "with greater accuracy, the forms that surrounded me and to perceive the\r\n" + //
                                "boundaries of the radiant roof of light which canopied me. Sometimes I\r\n" + //
                                "tried to imitate the pleasant songs of the birds but was unable.\r\n" + //
                                "Sometimes I wished to express my sensations in my own mode, but the\r\n" + //
                                "uncouth and inarticulate sounds which broke from me frightened me into\r\n" + //
                                "silence again.\r\n" + //
                                "\r\n" + //
                                "“The moon had disappeared from the night, and again, with a lessened\r\n" + //
                                "form, showed itself, while I still remained in the forest. My\r\n" + //
                                "sensations had by this time become distinct, and my mind received every\r\n" + //
                                "day additional ideas. My eyes became accustomed to the light and to\r\n" + //
                                "perceive objects in their right forms; I distinguished the insect from\r\n" + //
                                "the herb, and by degrees, one herb from another. I found that the\r\n" + //
                                "sparrow uttered none but harsh notes, whilst those of the blackbird and\r\n" + //
                                "thrush were sweet and enticing.\r\n" + //
                                "\r\n" + //
                                "“One day, when I was oppressed by cold, I found a fire which had been\r\n" + //
                                "left by some wandering beggars, and was overcome with delight at the\r\n" + //
                                "warmth I experienced from it. In my joy I thrust my hand into the live\r\n" + //
                                "embers, but quickly drew it out again with a cry of pain. How strange,\r\n" + //
                                "I thought, that the same cause should produce such opposite effects! I\r\n" + //
                                "examined the materials of the fire, and to my joy found it to be\r\n" + //
                                "composed of wood. I quickly collected some branches, but they were wet\r\n" + //
                                "and would not burn. I was pained at this and sat still watching the\r\n" + //
                                "operation of the fire. The wet wood which I had placed near the heat\r\n" + //
                                "dried and itself became inflamed. I reflected on this, and by touching\r\n" + //
                                "the various branches, I discovered the cause and busied myself in\r\n" + //
                                "collecting a great quantity of wood, that I might dry it and have a\r\n" + //
                                "plentiful supply of fire. When night came on and brought sleep with\r\n" + //
                                "it, I was in the greatest fear lest my fire should be extinguished. I\r\n" + //
                                "covered it carefully with dry wood and leaves and placed wet branches\r\n" + //
                                "upon it; and then, spreading my cloak, I lay on the ground and sank\r\n" + //
                                "into sleep.\r\n" + //
                                "\r\n" + //
                                "“It was morning when I awoke, and my first care was to visit the fire.\r\n" + //
                                "I uncovered it, and a gentle breeze quickly fanned it into a flame. I\r\n" + //
                                "observed this also and contrived a fan of branches, which roused the\r\n" + //
                                "embers when they were nearly extinguished. When night came again I\r\n" + //
                                "found, with pleasure, that the fire gave light as well as heat and that\r\n" + //
                                "the discovery of this element was useful to me in my food, for I found\r\n" + //
                                "some of the offals that the travellers had left had been roasted, and\r\n" + //
                                "tasted much more savoury than the berries I gathered from the trees. I\r\n" + //
                                "tried, therefore, to dress my food in the same manner, placing it on\r\n" + //
                                "the live embers. I found that the berries were spoiled by this\r\n" + //
                                "operation, and the nuts and roots much improved.\r\n" + //
                                "\r\n" + //
                                "“Food, however, became scarce, and I often spent the whole day\r\n" + //
                                "searching in vain for a few acorns to assuage the pangs of hunger. When\r\n" + //
                                "I found this, I resolved to quit the place that I had hitherto\r\n" + //
                                "inhabited, to seek for one where the few wants I experienced would be\r\n" + //
                                "more easily satisfied. In this emigration I exceedingly lamented the\r\n" + //
                                "loss of the fire which I had obtained through accident and knew not how\r\n" + //
                                "to reproduce it. I gave several hours to the serious consideration of\r\n" + //
                                "this difficulty, but I was obliged to relinquish all attempt to supply\r\n" + //
                                "it, and wrapping myself up in my cloak, I struck across the wood\r\n" + //
                                "towards the setting sun. I passed three days in these rambles and at\r\n" + //
                                "length discovered the open country. A great fall of snow had taken\r\n" + //
                                "place the night before, and the fields were of one uniform white; the\r\n" + //
                                "appearance was disconsolate, and I found my feet chilled by the cold\r\n" + //
                                "damp substance that covered the ground.\r\n" + //
                                "\r\n" + //
                                "“It was about seven in the morning, and I longed to obtain food and\r\n" + //
                                "shelter; at length I perceived a small hut, on a rising ground, which\r\n" + //
                                "had doubtless been built for the convenience of some shepherd. This\r\n" + //
                                "was a new sight to me, and I examined the structure with great\r\n" + //
                                "curiosity. Finding the door open, I entered. An old man sat in it,\r\n" + //
                                "near a fire, over which he was preparing his breakfast. He turned on\r\n" + //
                                "hearing a noise, and perceiving me, shrieked loudly, and quitting the\r\n" + //
                                "hut, ran across the fields with a speed of which his debilitated form\r\n" + //
                                "hardly appeared capable. His appearance, different from any I had ever\r\n" + //
                                "before seen, and his flight somewhat surprised me. But I was enchanted\r\n" + //
                                "by the appearance of the hut; here the snow and rain could not\r\n" + //
                                "penetrate; the ground was dry; and it presented to me then as exquisite\r\n" + //
                                "and divine a retreat as Pandæmonium appeared to the dæmons of hell\r\n" + //
                                "after their sufferings in the lake of fire. I greedily devoured the\r\n" + //
                                "remnants of the shepherd’s breakfast, which consisted of bread, cheese,\r\n" + //
                                "milk, and wine; the latter, however, I did not like. Then, overcome by\r\n" + //
                                "fatigue, I lay down among some straw and fell asleep.\r\n" + //
                                "\r\n" + //
                                "“It was noon when I awoke, and allured by the warmth of the sun, which\r\n" + //
                                "shone brightly on the white ground, I determined to recommence my\r\n" + //
                                "travels; and, depositing the remains of the peasant’s breakfast in a\r\n" + //
                                "wallet I found, I proceeded across the fields for several hours, until\r\n" + //
                                "at sunset I arrived at a village. How miraculous did this appear! The\r\n" + //
                                "huts, the neater cottages, and stately houses engaged my admiration by\r\n" + //
                                "turns. The vegetables in the gardens, the milk and cheese that I saw\r\n" + //
                                "placed at the windows of some of the cottages, allured my appetite. One\r\n" + //
                                "of the best of these I entered, but I had hardly placed my foot within\r\n" + //
                                "the door before the children shrieked, and one of the women fainted.\r\n" + //
                                "The whole village was roused; some fled, some attacked me, until,\r\n" + //
                                "grievously bruised by stones and many other kinds of missile weapons, I\r\n" + //
                                "escaped to the open country and fearfully took refuge in a low hovel,\r\n" + //
                                "quite bare, and making a wretched appearance after the palaces I had\r\n" + //
                                "beheld in the village. This hovel however, joined a cottage of a neat\r\n" + //
                                "and pleasant appearance, but after my late dearly bought experience, I\r\n" + //
                                "dared not enter it. My place of refuge was constructed of wood, but so\r\n" + //
                                "low that I could with difficulty sit upright in it. No wood, however,\r\n" + //
                                "was placed on the earth, which formed the floor, but it was dry; and\r\n" + //
                                "although the wind entered it by innumerable chinks, I found it an\r\n" + //
                                "agreeable asylum from the snow and rain.\r\n" + //
                                "\r\n" + //
                                "“Here, then, I retreated and lay down happy to have found a shelter,\r\n" + //
                                "however miserable, from the inclemency of the season, and still more\r\n" + //
                                "from the barbarity of man. As soon as morning dawned I crept from my\r\n" + //
                                "kennel, that I might view the adjacent cottage and discover if I could\r\n" + //
                                "remain in the habitation I had found. It was situated against the back\r\n" + //
                                "of the cottage and surrounded on the sides which were exposed by a pig\r\n" + //
                                "sty and a clear pool of water. One part was open, and by that I had\r\n" + //
                                "crept in; but now I covered every crevice by which I might be perceived\r\n" + //
                                "with stones and wood, yet in such a manner that I might move them on\r\n" + //
                                "occasion to pass out; all the light I enjoyed came through the sty, and\r\n" + //
                                "that was sufficient for me.\r\n" + //
                                "\r\n" + //
                                "“Having thus arranged my dwelling and carpeted it with clean straw, I\r\n" + //
                                "retired, for I saw the figure of a man at a distance, and I remembered\r\n" + //
                                "too well my treatment the night before to trust myself in his power. I\r\n" + //
                                "had first, however, provided for my sustenance for that day by a loaf\r\n" + //
                                "of coarse bread, which I purloined, and a cup with which I could drink\r\n" + //
                                "more conveniently than from my hand of the pure water which flowed by\r\n" + //
                                "my retreat. The floor was a little raised, so that it was kept\r\n" + //
                                "perfectly dry, and by its vicinity to the chimney of the cottage it was\r\n" + //
                                "tolerably warm.\r\n" + //
                                "\r\n" + //
                                "“Being thus provided, I resolved to reside in this hovel until\r\n" + //
                                "something should occur which might alter my determination. It was\r\n" + //
                                "indeed a paradise compared to the bleak forest, my former residence,\r\n" + //
                                "the rain-dropping branches, and dank earth. I ate my breakfast with\r\n" + //
                                "pleasure and was about to remove a plank to procure myself a little\r\n" + //
                                "water when I heard a step, and looking through a small chink, I beheld\r\n" + //
                                "a young creature, with a pail on her head, passing before my hovel. The\r\n" + //
                                "girl was young and of gentle demeanour, unlike what I have since found\r\n" + //
                                "cottagers and farmhouse servants to be. Yet she was meanly dressed, a\r\n" + //
                                "coarse blue petticoat and a linen jacket being her only garb; her fair\r\n" + //
                                "hair was plaited but not adorned: she looked patient yet sad. I lost\r\n" + //
                                "sight of her, and in about a quarter of an hour she returned bearing\r\n" + //
                                "the pail, which was now partly filled with milk. As she walked along,\r\n" + //
                                "seemingly incommoded by the burden, a young man met her, whose\r\n" + //
                                "countenance expressed a deeper despondence. Uttering a few sounds with\r\n" + //
                                "an air of melancholy, he took the pail from her head and bore it to the\r\n" + //
                                "cottage himself. She followed, and they disappeared. Presently I saw\r\n" + //
                                "the young man again, with some tools in his hand, cross the field\r\n" + //
                                "behind the cottage; and the girl was also busied, sometimes in the\r\n" + //
                                "house and sometimes in the yard.\r\n" + //
                                "\r\n" + //
                                "“On examining my dwelling, I found that one of the windows of the\r\n" + //
                                "cottage had formerly occupied a part of it, but the panes had been\r\n" + //
                                "filled up with wood. In one of these was a small and almost\r\n" + //
                                "imperceptible chink through which the eye could just penetrate.\r\n" + //
                                "Through this crevice a small room was visible, whitewashed and clean\r\n" + //
                                "but very bare of furniture. In one corner, near a small fire, sat an\r\n" + //
                                "old man, leaning his head on his hands in a disconsolate attitude. The\r\n" + //
                                "young girl was occupied in arranging the cottage; but presently she\r\n" + //
                                "took something out of a drawer, which employed her hands, and she sat\r\n" + //
                                "down beside the old man, who, taking up an instrument, began to play\r\n" + //
                                "and to produce sounds sweeter than the voice of the thrush or the\r\n" + //
                                "nightingale. It was a lovely sight, even to me, poor wretch who had\r\n" + //
                                "never beheld aught beautiful before. The silver hair and benevolent\r\n" + //
                                "countenance of the aged cottager won my reverence, while the gentle\r\n" + //
                                "manners of the girl enticed my love. He played a sweet mournful air\r\n" + //
                                "which I perceived drew tears from the eyes of his amiable companion, of\r\n" + //
                                "which the old man took no notice, until she sobbed audibly; he then\r\n" + //
                                "pronounced a few sounds, and the fair creature, leaving her work, knelt\r\n" + //
                                "at his feet. He raised her and smiled with such kindness and affection\r\n" + //
                                "that I felt sensations of a peculiar and overpowering nature; they were\r\n" + //
                                "a mixture of pain and pleasure, such as I had never before experienced,\r\n" + //
                                "either from hunger or cold, warmth or food; and I withdrew from the\r\n" + //
                                "window, unable to bear these emotions.\r\n" + //
                                "\r\n" + //
                                "“Soon after this the young man returned, bearing on his shoulders a\r\n" + //
                                "load of wood. The girl met him at the door, helped to relieve him of\r\n" + //
                                "his burden, and taking some of the fuel into the cottage, placed it on\r\n" + //
                                "the fire; then she and the youth went apart into a nook of the cottage,\r\n" + //
                                "and he showed her a large loaf and a piece of cheese. She seemed\r\n" + //
                                "pleased and went into the garden for some roots and plants, which she\r\n" + //
                                "placed in water, and then upon the fire. She afterwards continued her\r\n" + //
                                "work, whilst the young man went into the garden and appeared busily\r\n" + //
                                "employed in digging and pulling up roots. After he had been employed\r\n" + //
                                "thus about an hour, the young woman joined him and they entered the\r\n" + //
                                "cottage together.\r\n" + //
                                "\r\n" + //
                                "“The old man had, in the meantime, been pensive, but on the appearance\r\n" + //
                                "of his companions he assumed a more cheerful air, and they sat down to\r\n" + //
                                "eat. The meal was quickly dispatched. The young woman was again\r\n" + //
                                "occupied in arranging the cottage, the old man walked before the\r\n" + //
                                "cottage in the sun for a few minutes, leaning on the arm of the youth.\r\n" + //
                                "Nothing could exceed in beauty the contrast between these two excellent\r\n" + //
                                "creatures. One was old, with silver hairs and a countenance beaming\r\n" + //
                                "with benevolence and love; the younger was slight and graceful in his\r\n" + //
                                "figure, and his features were moulded with the finest symmetry, yet his\r\n" + //
                                "eyes and attitude expressed the utmost sadness and despondency. The\r\n" + //
                                "old man returned to the cottage, and the youth, with tools different\r\n" + //
                                "from those he had used in the morning, directed his steps across the\r\n" + //
                                "fields.\r\n" + //
                                "\r\n" + //
                                "“Night quickly shut in, but to my extreme wonder, I found that the\r\n" + //
                                "cottagers had a means of prolonging light by the use of tapers, and was\r\n" + //
                                "delighted to find that the setting of the sun did not put an end to the\r\n" + //
                                "pleasure I experienced in watching my human neighbours. In the evening\r\n" + //
                                "the young girl and her companion were employed in various occupations\r\n" + //
                                "which I did not understand; and the old man again took up the\r\n" + //
                                "instrument which produced the divine sounds that had enchanted me in\r\n" + //
                                "the morning. So soon as he had finished, the youth began, not to play,\r\n" + //
                                "but to utter sounds that were monotonous, and neither resembling the\r\n" + //
                                "harmony of the old man’s instrument nor the songs of the birds; I since\r\n" + //
                                "found that he read aloud, but at that time I knew nothing of the\r\n" + //
                                "science of words or letters.\r\n" + //
                                "\r\n" + //
                                "“The family, after having been thus occupied for a short time,\r\n" + //
                                "extinguished their lights and retired, as I conjectured, to rest.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 12\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“I lay on my straw, but I could not sleep. I thought of the\r\n" + //
                                "occurrences of the day. What chiefly struck me was the gentle manners\r\n" + //
                                "of these people, and I longed to join them, but dared not. I\r\n" + //
                                "remembered too well the treatment I had suffered the night before from\r\n" + //
                                "the barbarous villagers, and resolved, whatever course of conduct I\r\n" + //
                                "might hereafter think it right to pursue, that for the present I would\r\n" + //
                                "remain quietly in my hovel, watching and endeavouring to discover the\r\n" + //
                                "motives which influenced their actions.\r\n" + //
                                "\r\n" + //
                                "“The cottagers arose the next morning before the sun. The young woman\r\n" + //
                                "arranged the cottage and prepared the food, and the youth departed\r\n" + //
                                "after the first meal.\r\n" + //
                                "\r\n" + //
                                "“This day was passed in the same routine as that which preceded it.\r\n" + //
                                "The young man was constantly employed out of doors, and the girl in\r\n" + //
                                "various laborious occupations within. The old man, whom I soon\r\n" + //
                                "perceived to be blind, employed his leisure hours on his instrument or\r\n" + //
                                "in contemplation. Nothing could exceed the love and respect which the\r\n" + //
                                "younger cottagers exhibited towards their venerable companion. They\r\n" + //
                                "performed towards him every little office of affection and duty with\r\n" + //
                                "gentleness, and he rewarded them by his benevolent smiles.\r\n" + //
                                "\r\n" + //
                                "“They were not entirely happy. The young man and his companion often\r\n" + //
                                "went apart and appeared to weep. I saw no cause for their unhappiness,\r\n" + //
                                "but I was deeply affected by it. If such lovely creatures were\r\n" + //
                                "miserable, it was less strange that I, an imperfect and solitary being,\r\n" + //
                                "should be wretched. Yet why were these gentle beings unhappy? They\r\n" + //
                                "possessed a delightful house (for such it was in my eyes) and every\r\n" + //
                                "luxury; they had a fire to warm them when chill and delicious viands\r\n" + //
                                "when hungry; they were dressed in excellent clothes; and, still more,\r\n" + //
                                "they enjoyed one another’s company and speech, interchanging each day\r\n" + //
                                "looks of affection and kindness. What did their tears imply? Did they\r\n" + //
                                "really express pain? I was at first unable to solve these questions,\r\n" + //
                                "but perpetual attention and time explained to me many appearances which\r\n" + //
                                "were at first enigmatic.\r\n" + //
                                "\r\n" + //
                                "“A considerable period elapsed before I discovered one of the causes of\r\n" + //
                                "the uneasiness of this amiable family: it was poverty, and they\r\n" + //
                                "suffered that evil in a very distressing degree. Their nourishment\r\n" + //
                                "consisted entirely of the vegetables of their garden and the milk of\r\n" + //
                                "one cow, which gave very little during the winter, when its masters\r\n" + //
                                "could scarcely procure food to support it. They often, I believe,\r\n" + //
                                "suffered the pangs of hunger very poignantly, especially the two\r\n" + //
                                "younger cottagers, for several times they placed food before the old\r\n" + //
                                "man when they reserved none for themselves.\r\n" + //
                                "\r\n" + //
                                "“This trait of kindness moved me sensibly. I had been accustomed,\r\n" + //
                                "during the night, to steal a part of their store for my own\r\n" + //
                                "consumption, but when I found that in doing this I inflicted pain on\r\n" + //
                                "the cottagers, I abstained and satisfied myself with berries, nuts, and\r\n" + //
                                "roots which I gathered from a neighbouring wood.\r\n" + //
                                "\r\n" + //
                                "“I discovered also another means through which I was enabled to assist\r\n" + //
                                "their labours. I found that the youth spent a great part of each day\r\n" + //
                                "in collecting wood for the family fire, and during the night I often\r\n" + //
                                "took his tools, the use of which I quickly discovered, and brought home\r\n" + //
                                "firing sufficient for the consumption of several days.\r\n" + //
                                "\r\n" + //
                                "“I remember, the first time that I did this, the young woman, when she\r\n" + //
                                "opened the door in the morning, appeared greatly astonished on seeing a great\r\n" + //
                                "pile of wood on the outside. She uttered some words in a loud voice, and the\r\n" + //
                                "youth joined her, who also expressed surprise. I observed, with pleasure,\r\n" + //
                                "that he did not go to the forest that day, but spent it in repairing the\r\n" + //
                                "cottage and cultivating the garden.\r\n" + //
                                "\r\n" + //
                                "“By degrees I made a discovery of still greater moment. I found that\r\n" + //
                                "these people possessed a method of communicating their experience and\r\n" + //
                                "feelings to one another by articulate sounds. I perceived that the words\r\n" + //
                                "they spoke sometimes produced pleasure or pain, smiles or sadness, in the\r\n" + //
                                "minds and countenances of the hearers. This was indeed a godlike science,\r\n" + //
                                "and I ardently desired to become acquainted with it. But I was baffled in\r\n" + //
                                "every attempt I made for this purpose. Their pronunciation was quick, and\r\n" + //
                                "the words they uttered, not having any apparent connection with visible\r\n" + //
                                "objects, I was unable to discover any clue by which I could unravel the\r\n" + //
                                "mystery of their reference. By great application, however, and after having\r\n" + //
                                "remained during the space of several revolutions of the moon in my hovel, I\r\n" + //
                                "discovered the names that were given to some of the most familiar objects of\r\n" + //
                                "discourse; I learned and applied the words, _fire, milk, bread,_ and\r\n" + //
                                "_wood._ I learned also the names of the cottagers themselves. The youth\r\n" + //
                                "and his companion had each of them several names, but the old man had only\r\n" + //
                                "one, which was _father._ The girl was called _sister_ or\r\n" + //
                                "_Agatha,_ and the youth _Felix, brother,_ or _son_. I cannot\r\n" + //
                                "describe the delight I felt when I learned the ideas appropriated to each of\r\n" + //
                                "these sounds and was able to pronounce them. I distinguished several other\r\n" + //
                                "words without being able as yet to understand or apply them, such as _good,\r\n" + //
                                "dearest, unhappy._\r\n" + //
                                "\r\n" + //
                                "“I spent the winter in this manner. The gentle manners and beauty of\r\n" + //
                                "the cottagers greatly endeared them to me; when they were unhappy, I\r\n" + //
                                "felt depressed; when they rejoiced, I sympathised in their joys. I saw\r\n" + //
                                "few human beings besides them, and if any other happened to enter the\r\n" + //
                                "cottage, their harsh manners and rude gait only enhanced to me the\r\n" + //
                                "superior accomplishments of my friends. The old man, I could perceive,\r\n" + //
                                "often endeavoured to encourage his children, as sometimes I found that\r\n" + //
                                "he called them, to cast off their melancholy. He would talk in a\r\n" + //
                                "cheerful accent, with an expression of goodness that bestowed pleasure\r\n" + //
                                "even upon me. Agatha listened with respect, her eyes sometimes filled\r\n" + //
                                "with tears, which she endeavoured to wipe away unperceived; but I\r\n" + //
                                "generally found that her countenance and tone were more cheerful after\r\n" + //
                                "having listened to the exhortations of her father. It was not thus\r\n" + //
                                "with Felix. He was always the saddest of the group, and even to my\r\n" + //
                                "unpractised senses, he appeared to have suffered more deeply than his\r\n" + //
                                "friends. But if his countenance was more sorrowful, his voice was more\r\n" + //
                                "cheerful than that of his sister, especially when he addressed the old\r\n" + //
                                "man.\r\n" + //
                                "\r\n" + //
                                "“I could mention innumerable instances which, although slight, marked\r\n" + //
                                "the dispositions of these amiable cottagers. In the midst of poverty\r\n" + //
                                "and want, Felix carried with pleasure to his sister the first little\r\n" + //
                                "white flower that peeped out from beneath the snowy ground. Early in\r\n" + //
                                "the morning, before she had risen, he cleared away the snow that\r\n" + //
                                "obstructed her path to the milk-house, drew water from the well, and\r\n" + //
                                "brought the wood from the outhouse, where, to his perpetual\r\n" + //
                                "astonishment, he found his store always replenished by an invisible\r\n" + //
                                "hand. In the day, I believe, he worked sometimes for a neighbouring\r\n" + //
                                "farmer, because he often went forth and did not return until dinner,\r\n" + //
                                "yet brought no wood with him. At other times he worked in the garden,\r\n" + //
                                "but as there was little to do in the frosty season, he read to the old\r\n" + //
                                "man and Agatha.\r\n" + //
                                "\r\n" + //
                                "“This reading had puzzled me extremely at first, but by degrees I\r\n" + //
                                "discovered that he uttered many of the same sounds when he read as when\r\n" + //
                                "he talked. I conjectured, therefore, that he found on the paper signs\r\n" + //
                                "for speech which he understood, and I ardently longed to comprehend\r\n" + //
                                "these also; but how was that possible when I did not even understand\r\n" + //
                                "the sounds for which they stood as signs? I improved, however,\r\n" + //
                                "sensibly in this science, but not sufficiently to follow up any kind of\r\n" + //
                                "conversation, although I applied my whole mind to the endeavour, for I\r\n" + //
                                "easily perceived that, although I eagerly longed to discover myself to\r\n" + //
                                "the cottagers, I ought not to make the attempt until I had first become\r\n" + //
                                "master of their language, which knowledge might enable me to make them\r\n" + //
                                "overlook the deformity of my figure, for with this also the contrast\r\n" + //
                                "perpetually presented to my eyes had made me acquainted.\r\n" + //
                                "\r\n" + //
                                "“I had admired the perfect forms of my cottagers—their grace, beauty,\r\n" + //
                                "and delicate complexions; but how was I terrified when I viewed myself\r\n" + //
                                "in a transparent pool! At first I started back, unable to believe that\r\n" + //
                                "it was indeed I who was reflected in the mirror; and when I became\r\n" + //
                                "fully convinced that I was in reality the monster that I am, I was\r\n" + //
                                "filled with the bitterest sensations of despondence and mortification.\r\n" + //
                                "Alas! I did not yet entirely know the fatal effects of this miserable\r\n" + //
                                "deformity.\r\n" + //
                                "\r\n" + //
                                "“As the sun became warmer and the light of day longer, the snow\r\n" + //
                                "vanished, and I beheld the bare trees and the black earth. From this\r\n" + //
                                "time Felix was more employed, and the heart-moving indications of\r\n" + //
                                "impending famine disappeared. Their food, as I afterwards found, was\r\n" + //
                                "coarse, but it was wholesome; and they procured a sufficiency of it.\r\n" + //
                                "Several new kinds of plants sprang up in the garden, which they\r\n" + //
                                "dressed; and these signs of comfort increased daily as the season\r\n" + //
                                "advanced.\r\n" + //
                                "\r\n" + //
                                "“The old man, leaning on his son, walked each day at noon, when it did\r\n" + //
                                "not rain, as I found it was called when the heavens poured forth its\r\n" + //
                                "waters. This frequently took place, but a high wind quickly dried the\r\n" + //
                                "earth, and the season became far more pleasant than it had been.\r\n" + //
                                "\r\n" + //
                                "“My mode of life in my hovel was uniform. During the morning I\r\n" + //
                                "attended the motions of the cottagers, and when they were dispersed in\r\n" + //
                                "various occupations, I slept; the remainder of the day was spent in\r\n" + //
                                "observing my friends. When they had retired to rest, if there was any\r\n" + //
                                "moon or the night was star-light, I went into the woods and collected\r\n" + //
                                "my own food and fuel for the cottage. When I returned, as often as it\r\n" + //
                                "was necessary, I cleared their path from the snow and performed those\r\n" + //
                                "offices that I had seen done by Felix. I afterwards found that these\r\n" + //
                                "labours, performed by an invisible hand, greatly astonished them; and\r\n" + //
                                "once or twice I heard them, on these occasions, utter the words _good\r\n" + //
                                "spirit, wonderful_; but I did not then understand the signification\r\n" + //
                                "of these terms.\r\n" + //
                                "\r\n" + //
                                "“My thoughts now became more active, and I longed to discover the\r\n" + //
                                "motives and feelings of these lovely creatures; I was inquisitive to\r\n" + //
                                "know why Felix appeared so miserable and Agatha so sad. I thought\r\n" + //
                                "(foolish wretch!) that it might be in my power to restore happiness to\r\n" + //
                                "these deserving people. When I slept or was absent, the forms of the\r\n" + //
                                "venerable blind father, the gentle Agatha, and the excellent Felix\r\n" + //
                                "flitted before me. I looked upon them as superior beings who would be\r\n" + //
                                "the arbiters of my future destiny. I formed in my imagination a\r\n" + //
                                "thousand pictures of presenting myself to them, and their reception of\r\n" + //
                                "me. I imagined that they would be disgusted, until, by my gentle\r\n" + //
                                "demeanour and conciliating words, I should first win their favour and\r\n" + //
                                "afterwards their love.\r\n" + //
                                "\r\n" + //
                                "“These thoughts exhilarated me and led me to apply with fresh ardour to\r\n" + //
                                "the acquiring the art of language. My organs were indeed harsh, but\r\n" + //
                                "supple; and although my voice was very unlike the soft music of their\r\n" + //
                                "tones, yet I pronounced such words as I understood with tolerable ease.\r\n" + //
                                "It was as the ass and the lap-dog; yet surely the gentle ass whose\r\n" + //
                                "intentions were affectionate, although his manners were rude, deserved\r\n" + //
                                "better treatment than blows and execration.\r\n" + //
                                "\r\n" + //
                                "“The pleasant showers and genial warmth of spring greatly altered the\r\n" + //
                                "aspect of the earth. Men who before this change seemed to have been\r\n" + //
                                "hid in caves dispersed themselves and were employed in various arts of\r\n" + //
                                "cultivation. The birds sang in more cheerful notes, and the leaves\r\n" + //
                                "began to bud forth on the trees. Happy, happy earth! Fit habitation\r\n" + //
                                "for gods, which, so short a time before, was bleak, damp, and\r\n" + //
                                "unwholesome. My spirits were elevated by the enchanting appearance of\r\n" + //
                                "nature; the past was blotted from my memory, the present was tranquil,\r\n" + //
                                "and the future gilded by bright rays of hope and anticipations of joy.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 13\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“I now hasten to the more moving part of my story. I shall relate\r\n" + //
                                "events that impressed me with feelings which, from what I had been,\r\n" + //
                                "have made me what I am.\r\n" + //
                                "\r\n" + //
                                "“Spring advanced rapidly; the weather became fine and the skies\r\n" + //
                                "cloudless. It surprised me that what before was desert and gloomy\r\n" + //
                                "should now bloom with the most beautiful flowers and verdure. My\r\n" + //
                                "senses were gratified and refreshed by a thousand scents of delight and\r\n" + //
                                "a thousand sights of beauty.\r\n" + //
                                "\r\n" + //
                                "“It was on one of these days, when my cottagers periodically rested\r\n" + //
                                "from labour—the old man played on his guitar, and the children\r\n" + //
                                "listened to him—that I observed the countenance of Felix was\r\n" + //
                                "melancholy beyond expression; he sighed frequently, and once his father\r\n" + //
                                "paused in his music, and I conjectured by his manner that he inquired\r\n" + //
                                "the cause of his son’s sorrow. Felix replied in a cheerful accent, and\r\n" + //
                                "the old man was recommencing his music when someone tapped at the door.\r\n" + //
                                "\r\n" + //
                                "“It was a lady on horseback, accompanied by a country-man as a guide.\r\n" + //
                                "The lady was dressed in a dark suit and covered with a thick black\r\n" + //
                                "veil. Agatha asked a question, to which the stranger only replied by\r\n" + //
                                "pronouncing, in a sweet accent, the name of Felix. Her voice was\r\n" + //
                                "musical but unlike that of either of my friends. On hearing this word,\r\n" + //
                                "Felix came up hastily to the lady, who, when she saw him, threw up her\r\n" + //
                                "veil, and I beheld a countenance of angelic beauty and expression. Her\r\n" + //
                                "hair of a shining raven black, and curiously braided; her eyes were\r\n" + //
                                "dark, but gentle, although animated; her features of a regular\r\n" + //
                                "proportion, and her complexion wondrously fair, each cheek tinged with\r\n" + //
                                "a lovely pink.\r\n" + //
                                "\r\n" + //
                                "“Felix seemed ravished with delight when he saw her, every trait of\r\n" + //
                                "sorrow vanished from his face, and it instantly expressed a degree of\r\n" + //
                                "ecstatic joy, of which I could hardly have believed it capable; his\r\n" + //
                                "eyes sparkled, as his cheek flushed with pleasure; and at that moment I\r\n" + //
                                "thought him as beautiful as the stranger. She appeared affected by\r\n" + //
                                "different feelings; wiping a few tears from her lovely eyes, she held\r\n" + //
                                "out her hand to Felix, who kissed it rapturously and called her, as\r\n" + //
                                "well as I could distinguish, his sweet Arabian. She did not appear to\r\n" + //
                                "understand him, but smiled. He assisted her to dismount, and\r\n" + //
                                "dismissing her guide, conducted her into the cottage. Some\r\n" + //
                                "conversation took place between him and his father, and the young\r\n" + //
                                "stranger knelt at the old man’s feet and would have kissed his hand,\r\n" + //
                                "but he raised her and embraced her affectionately.\r\n" + //
                                "\r\n" + //
                                "“I soon perceived that although the stranger uttered articulate sounds\r\n" + //
                                "and appeared to have a language of her own, she was neither understood\r\n" + //
                                "by nor herself understood the cottagers. They made many signs which I\r\n" + //
                                "did not comprehend, but I saw that her presence diffused gladness\r\n" + //
                                "through the cottage, dispelling their sorrow as the sun dissipates the\r\n" + //
                                "morning mists. Felix seemed peculiarly happy and with smiles of\r\n" + //
                                "delight welcomed his Arabian. Agatha, the ever-gentle Agatha, kissed\r\n" + //
                                "the hands of the lovely stranger, and pointing to her brother, made\r\n" + //
                                "signs which appeared to me to mean that he had been sorrowful until she\r\n" + //
                                "came. Some hours passed thus, while they, by their countenances,\r\n" + //
                                "expressed joy, the cause of which I did not comprehend. Presently I\r\n" + //
                                "found, by the frequent recurrence of some sound which the stranger\r\n" + //
                                "repeated after them, that she was endeavouring to learn their language;\r\n" + //
                                "and the idea instantly occurred to me that I should make use of the\r\n" + //
                                "same instructions to the same end. The stranger learned about twenty\r\n" + //
                                "words at the first lesson; most of them, indeed, were those which I had\r\n" + //
                                "before understood, but I profited by the others.\r\n" + //
                                "\r\n" + //
                                "“As night came on, Agatha and the Arabian retired early. When they\r\n" + //
                                "separated Felix kissed the hand of the stranger and said, ‘Good night\r\n" + //
                                "sweet Safie.’ He sat up much longer, conversing with his father, and\r\n" + //
                                "by the frequent repetition of her name I conjectured that their lovely\r\n" + //
                                "guest was the subject of their conversation. I ardently desired to\r\n" + //
                                "understand them, and bent every faculty towards that purpose, but found\r\n" + //
                                "it utterly impossible.\r\n" + //
                                "\r\n" + //
                                "“The next morning Felix went out to his work, and after the usual\r\n" + //
                                "occupations of Agatha were finished, the Arabian sat at the feet of the\r\n" + //
                                "old man, and taking his guitar, played some airs so entrancingly\r\n" + //
                                "beautiful that they at once drew tears of sorrow and delight from my\r\n" + //
                                "eyes. She sang, and her voice flowed in a rich cadence, swelling or\r\n" + //
                                "dying away like a nightingale of the woods.\r\n" + //
                                "\r\n" + //
                                "“When she had finished, she gave the guitar to Agatha, who at first\r\n" + //
                                "declined it. She played a simple air, and her voice accompanied it in\r\n" + //
                                "sweet accents, but unlike the wondrous strain of the stranger. The old\r\n" + //
                                "man appeared enraptured and said some words which Agatha endeavoured to\r\n" + //
                                "explain to Safie, and by which he appeared to wish to express that she\r\n" + //
                                "bestowed on him the greatest delight by her music.\r\n" + //
                                "\r\n" + //
                                "“The days now passed as peaceably as before, with the sole alteration\r\n" + //
                                "that joy had taken place of sadness in the countenances of my friends.\r\n" + //
                                "Safie was always gay and happy; she and I improved rapidly in the\r\n" + //
                                "knowledge of language, so that in two months I began to comprehend most\r\n" + //
                                "of the words uttered by my protectors.\r\n" + //
                                "\r\n" + //
                                "“In the meanwhile also the black ground was covered with herbage, and\r\n" + //
                                "the green banks interspersed with innumerable flowers, sweet to the\r\n" + //
                                "scent and the eyes, stars of pale radiance among the moonlight woods;\r\n" + //
                                "the sun became warmer, the nights clear and balmy; and my nocturnal\r\n" + //
                                "rambles were an extreme pleasure to me, although they were considerably\r\n" + //
                                "shortened by the late setting and early rising of the sun, for I never\r\n" + //
                                "ventured abroad during daylight, fearful of meeting with the same\r\n" + //
                                "treatment I had formerly endured in the first village which I entered.\r\n" + //
                                "\r\n" + //
                                "“My days were spent in close attention, that I might more speedily\r\n" + //
                                "master the language; and I may boast that I improved more rapidly than\r\n" + //
                                "the Arabian, who understood very little and conversed in broken\r\n" + //
                                "accents, whilst I comprehended and could imitate almost every word that\r\n" + //
                                "was spoken.\r\n" + //
                                "\r\n" + //
                                "“While I improved in speech, I also learned the science of letters as\r\n" + //
                                "it was taught to the stranger, and this opened before me a wide field\r\n" + //
                                "for wonder and delight.\r\n" + //
                                "\r\n" + //
                                "“The book from which Felix instructed Safie was Volney’s _Ruins\r\n" + //
                                "of Empires_. I should not have understood the purport of this book had not\r\n" + //
                                "Felix, in reading it, given very minute explanations. He had chosen this\r\n" + //
                                "work, he said, because the declamatory style was framed in imitation of the\r\n" + //
                                "Eastern authors. Through this work I obtained a cursory knowledge of history\r\n" + //
                                "and a view of the several empires at present existing in the world; it gave\r\n" + //
                                "me an insight into the manners, governments, and religions of the different\r\n" + //
                                "nations of the earth. I heard of the slothful Asiatics, of the stupendous\r\n" + //
                                "genius and mental activity of the Grecians, of the wars and wonderful virtue\r\n" + //
                                "of the early Romans—of their subsequent degenerating—of the\r\n" + //
                                "decline of that mighty empire, of chivalry, Christianity, and kings. I heard\r\n" + //
                                "of the discovery of the American hemisphere and wept with Safie over the\r\n" + //
                                "hapless fate of its original inhabitants.\r\n" + //
                                "\r\n" + //
                                "“These wonderful narrations inspired me with strange feelings. Was\r\n" + //
                                "man, indeed, at once so powerful, so virtuous and magnificent, yet so\r\n" + //
                                "vicious and base? He appeared at one time a mere scion of the evil\r\n" + //
                                "principle and at another as all that can be conceived of noble and\r\n" + //
                                "godlike. To be a great and virtuous man appeared the highest honour\r\n" + //
                                "that can befall a sensitive being; to be base and vicious, as many on\r\n" + //
                                "record have been, appeared the lowest degradation, a condition more\r\n" + //
                                "abject than that of the blind mole or harmless worm. For a long time I\r\n" + //
                                "could not conceive how one man could go forth to murder his fellow, or\r\n" + //
                                "even why there were laws and governments; but when I heard details of\r\n" + //
                                "vice and bloodshed, my wonder ceased and I turned away with disgust and\r\n" + //
                                "loathing.\r\n" + //
                                "\r\n" + //
                                "“Every conversation of the cottagers now opened new wonders to me.\r\n" + //
                                "While I listened to the instructions which Felix bestowed upon the\r\n" + //
                                "Arabian, the strange system of human society was explained to me. I\r\n" + //
                                "heard of the division of property, of immense wealth and squalid\r\n" + //
                                "poverty, of rank, descent, and noble blood.\r\n" + //
                                "\r\n" + //
                                "“The words induced me to turn towards myself. I learned that the\r\n" + //
                                "possessions most esteemed by your fellow creatures were high and\r\n" + //
                                "unsullied descent united with riches. A man might be respected with\r\n" + //
                                "only one of these advantages, but without either he was considered,\r\n" + //
                                "except in very rare instances, as a vagabond and a slave, doomed to\r\n" + //
                                "waste his powers for the profits of the chosen few! And what was I? Of\r\n" + //
                                "my creation and creator I was absolutely ignorant, but I knew that I\r\n" + //
                                "possessed no money, no friends, no kind of property. I was, besides,\r\n" + //
                                "endued with a figure hideously deformed and loathsome; I was not even\r\n" + //
                                "of the same nature as man. I was more agile than they and could\r\n" + //
                                "subsist upon coarser diet; I bore the extremes of heat and cold with\r\n" + //
                                "less injury to my frame; my stature far exceeded theirs. When I looked\r\n" + //
                                "around I saw and heard of none like me. Was I, then, a monster, a blot\r\n" + //
                                "upon the earth, from which all men fled and whom all men disowned?\r\n" + //
                                "\r\n" + //
                                "“I cannot describe to you the agony that these reflections inflicted\r\n" + //
                                "upon me; I tried to dispel them, but sorrow only increased with\r\n" + //
                                "knowledge. Oh, that I had for ever remained in my native wood, nor\r\n" + //
                                "known nor felt beyond the sensations of hunger, thirst, and heat!\r\n" + //
                                "\r\n" + //
                                "“Of what a strange nature is knowledge! It clings to the mind when it\r\n" + //
                                "has once seized on it like a lichen on the rock. I wished sometimes to\r\n" + //
                                "shake off all thought and feeling, but I learned that there was but one\r\n" + //
                                "means to overcome the sensation of pain, and that was death—a state\r\n" + //
                                "which I feared yet did not understand. I admired virtue and good\r\n" + //
                                "feelings and loved the gentle manners and amiable qualities of my\r\n" + //
                                "cottagers, but I was shut out from intercourse with them, except\r\n" + //
                                "through means which I obtained by stealth, when I was unseen and\r\n" + //
                                "unknown, and which rather increased than satisfied the desire I had of\r\n" + //
                                "becoming one among my fellows. The gentle words of Agatha and the\r\n" + //
                                "animated smiles of the charming Arabian were not for me. The mild\r\n" + //
                                "exhortations of the old man and the lively conversation of the loved\r\n" + //
                                "Felix were not for me. Miserable, unhappy wretch!\r\n" + //
                                "\r\n" + //
                                "“Other lessons were impressed upon me even more deeply. I heard of the\r\n" + //
                                "difference of sexes, and the birth and growth of children, how the\r\n" + //
                                "father doted on the smiles of the infant, and the lively sallies of the\r\n" + //
                                "older child, how all the life and cares of the mother were wrapped up\r\n" + //
                                "in the precious charge, how the mind of youth expanded and gained\r\n" + //
                                "knowledge, of brother, sister, and all the various relationships which\r\n" + //
                                "bind one human being to another in mutual bonds.\r\n" + //
                                "\r\n" + //
                                "“But where were my friends and relations? No father had watched my\r\n" + //
                                "infant days, no mother had blessed me with smiles and caresses; or if\r\n" + //
                                "they had, all my past life was now a blot, a blind vacancy in which I\r\n" + //
                                "distinguished nothing. From my earliest remembrance I had been as I\r\n" + //
                                "then was in height and proportion. I had never yet seen a being\r\n" + //
                                "resembling me or who claimed any intercourse with me. What was I? The\r\n" + //
                                "question again recurred, to be answered only with groans.\r\n" + //
                                "\r\n" + //
                                "“I will soon explain to what these feelings tended, but allow me now to\r\n" + //
                                "return to the cottagers, whose story excited in me such various\r\n" + //
                                "feelings of indignation, delight, and wonder, but which all terminated\r\n" + //
                                "in additional love and reverence for my protectors (for so I loved, in\r\n" + //
                                "an innocent, half-painful self-deceit, to call them).”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 14\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“Some time elapsed before I learned the history of my friends. It was\r\n" + //
                                "one which could not fail to impress itself deeply on my mind, unfolding\r\n" + //
                                "as it did a number of circumstances, each interesting and wonderful to\r\n" + //
                                "one so utterly inexperienced as I was.\r\n" + //
                                "\r\n" + //
                                "“The name of the old man was De Lacey. He was descended from a good\r\n" + //
                                "family in France, where he had lived for many years in affluence,\r\n" + //
                                "respected by his superiors and beloved by his equals. His son was bred\r\n" + //
                                "in the service of his country, and Agatha had ranked with ladies of the\r\n" + //
                                "highest distinction. A few months before my arrival they had lived in\r\n" + //
                                "a large and luxurious city called Paris, surrounded by friends and\r\n" + //
                                "possessed of every enjoyment which virtue, refinement of intellect, or\r\n" + //
                                "taste, accompanied by a moderate fortune, could afford.\r\n" + //
                                "\r\n" + //
                                "“The father of Safie had been the cause of their ruin. He was a\r\n" + //
                                "Turkish merchant and had inhabited Paris for many years, when, for some\r\n" + //
                                "reason which I could not learn, he became obnoxious to the government.\r\n" + //
                                "He was seized and cast into prison the very day that Safie arrived from\r\n" + //
                                "Constantinople to join him. He was tried and condemned to death. The\r\n" + //
                                "injustice of his sentence was very flagrant; all Paris was indignant;\r\n" + //
                                "and it was judged that his religion and wealth rather than the crime\r\n" + //
                                "alleged against him had been the cause of his condemnation.\r\n" + //
                                "\r\n" + //
                                "“Felix had accidentally been present at the trial; his horror and\r\n" + //
                                "indignation were uncontrollable when he heard the decision of the\r\n" + //
                                "court. He made, at that moment, a solemn vow to deliver him and then\r\n" + //
                                "looked around for the means. After many fruitless attempts to gain\r\n" + //
                                "admittance to the prison, he found a strongly grated window in an\r\n" + //
                                "unguarded part of the building, which lighted the dungeon of the\r\n" + //
                                "unfortunate Muhammadan, who, loaded with chains, waited in despair the\r\n" + //
                                "execution of the barbarous sentence. Felix visited the grate at night\r\n" + //
                                "and made known to the prisoner his intentions in his favour. The Turk,\r\n" + //
                                "amazed and delighted, endeavoured to kindle the zeal of his deliverer\r\n" + //
                                "by promises of reward and wealth. Felix rejected his offers with\r\n" + //
                                "contempt, yet when he saw the lovely Safie, who was allowed to visit\r\n" + //
                                "her father and who by her gestures expressed her lively gratitude, the\r\n" + //
                                "youth could not help owning to his own mind that the captive possessed\r\n" + //
                                "a treasure which would fully reward his toil and hazard.\r\n" + //
                                "\r\n" + //
                                "“The Turk quickly perceived the impression that his daughter had made\r\n" + //
                                "on the heart of Felix and endeavoured to secure him more entirely in\r\n" + //
                                "his interests by the promise of her hand in marriage so soon as he\r\n" + //
                                "should be conveyed to a place of safety. Felix was too delicate to\r\n" + //
                                "accept this offer, yet he looked forward to the probability of the\r\n" + //
                                "event as to the consummation of his happiness.\r\n" + //
                                "\r\n" + //
                                "“During the ensuing days, while the preparations were going forward for\r\n" + //
                                "the escape of the merchant, the zeal of Felix was warmed by several\r\n" + //
                                "letters that he received from this lovely girl, who found means to\r\n" + //
                                "express her thoughts in the language of her lover by the aid of an old\r\n" + //
                                "man, a servant of her father who understood French. She thanked him in\r\n" + //
                                "the most ardent terms for his intended services towards her parent, and\r\n" + //
                                "at the same time she gently deplored her own fate.\r\n" + //
                                "\r\n" + //
                                "“I have copies of these letters, for I found means, during my residence\r\n" + //
                                "in the hovel, to procure the implements of writing; and the letters\r\n" + //
                                "were often in the hands of Felix or Agatha. Before I depart I will\r\n" + //
                                "give them to you; they will prove the truth of my tale; but at present,\r\n" + //
                                "as the sun is already far declined, I shall only have time to repeat\r\n" + //
                                "the substance of them to you.\r\n" + //
                                "\r\n" + //
                                "“Safie related that her mother was a Christian Arab, seized and made a\r\n" + //
                                "slave by the Turks; recommended by her beauty, she had won the heart of\r\n" + //
                                "the father of Safie, who married her. The young girl spoke in high and\r\n" + //
                                "enthusiastic terms of her mother, who, born in freedom, spurned the\r\n" + //
                                "bondage to which she was now reduced. She instructed her daughter in\r\n" + //
                                "the tenets of her religion and taught her to aspire to higher powers of\r\n" + //
                                "intellect and an independence of spirit forbidden to the female\r\n" + //
                                "followers of Muhammad. This lady died, but her lessons were indelibly\r\n" + //
                                "impressed on the mind of Safie, who sickened at the prospect of again\r\n" + //
                                "returning to Asia and being immured within the walls of a harem,\r\n" + //
                                "allowed only to occupy herself with infantile amusements, ill-suited to\r\n" + //
                                "the temper of her soul, now accustomed to grand ideas and a noble\r\n" + //
                                "emulation for virtue. The prospect of marrying a Christian and\r\n" + //
                                "remaining in a country where women were allowed to take a rank in\r\n" + //
                                "society was enchanting to her.\r\n" + //
                                "\r\n" + //
                                "“The day for the execution of the Turk was fixed, but on the night\r\n" + //
                                "previous to it he quitted his prison and before morning was distant\r\n" + //
                                "many leagues from Paris. Felix had procured passports in the name of\r\n" + //
                                "his father, sister, and himself. He had previously communicated his\r\n" + //
                                "plan to the former, who aided the deceit by quitting his house, under\r\n" + //
                                "the pretence of a journey and concealed himself, with his daughter, in\r\n" + //
                                "an obscure part of Paris.\r\n" + //
                                "\r\n" + //
                                "“Felix conducted the fugitives through France to Lyons and across Mont\r\n" + //
                                "Cenis to Leghorn, where the merchant had decided to wait a favourable\r\n" + //
                                "opportunity of passing into some part of the Turkish dominions.\r\n" + //
                                "\r\n" + //
                                "“Safie resolved to remain with her father until the moment of his\r\n" + //
                                "departure, before which time the Turk renewed his promise that she\r\n" + //
                                "should be united to his deliverer; and Felix remained with them in\r\n" + //
                                "expectation of that event; and in the meantime he enjoyed the society\r\n" + //
                                "of the Arabian, who exhibited towards him the simplest and tenderest\r\n" + //
                                "affection. They conversed with one another through the means of an\r\n" + //
                                "interpreter, and sometimes with the interpretation of looks; and Safie\r\n" + //
                                "sang to him the divine airs of her native country.\r\n" + //
                                "\r\n" + //
                                "“The Turk allowed this intimacy to take place and encouraged the hopes\r\n" + //
                                "of the youthful lovers, while in his heart he had formed far other\r\n" + //
                                "plans. He loathed the idea that his daughter should be united to a\r\n" + //
                                "Christian, but he feared the resentment of Felix if he should appear\r\n" + //
                                "lukewarm, for he knew that he was still in the power of his deliverer\r\n" + //
                                "if he should choose to betray him to the Italian state which they\r\n" + //
                                "inhabited. He revolved a thousand plans by which he should be enabled\r\n" + //
                                "to prolong the deceit until it might be no longer necessary, and\r\n" + //
                                "secretly to take his daughter with him when he departed. His plans\r\n" + //
                                "were facilitated by the news which arrived from Paris.\r\n" + //
                                "\r\n" + //
                                "“The government of France were greatly enraged at the escape of their\r\n" + //
                                "victim and spared no pains to detect and punish his deliverer. The\r\n" + //
                                "plot of Felix was quickly discovered, and De Lacey and Agatha were\r\n" + //
                                "thrown into prison. The news reached Felix and roused him from his\r\n" + //
                                "dream of pleasure. His blind and aged father and his gentle sister lay\r\n" + //
                                "in a noisome dungeon while he enjoyed the free air and the society of\r\n" + //
                                "her whom he loved. This idea was torture to him. He quickly arranged\r\n" + //
                                "with the Turk that if the latter should find a favourable opportunity\r\n" + //
                                "for escape before Felix could return to Italy, Safie should remain as a\r\n" + //
                                "boarder at a convent at Leghorn; and then, quitting the lovely Arabian,\r\n" + //
                                "he hastened to Paris and delivered himself up to the vengeance of the\r\n" + //
                                "law, hoping to free De Lacey and Agatha by this proceeding.\r\n" + //
                                "\r\n" + //
                                "“He did not succeed. They remained confined for five months before the\r\n" + //
                                "trial took place, the result of which deprived them of their fortune\r\n" + //
                                "and condemned them to a perpetual exile from their native country.\r\n" + //
                                "\r\n" + //
                                "“They found a miserable asylum in the cottage in Germany, where I\r\n" + //
                                "discovered them. Felix soon learned that the treacherous Turk, for\r\n" + //
                                "whom he and his family endured such unheard-of oppression, on\r\n" + //
                                "discovering that his deliverer was thus reduced to poverty and ruin,\r\n" + //
                                "became a traitor to good feeling and honour and had quitted Italy with\r\n" + //
                                "his daughter, insultingly sending Felix a pittance of money to aid him,\r\n" + //
                                "as he said, in some plan of future maintenance.\r\n" + //
                                "\r\n" + //
                                "“Such were the events that preyed on the heart of Felix and rendered\r\n" + //
                                "him, when I first saw him, the most miserable of his family. He could\r\n" + //
                                "have endured poverty, and while this distress had been the meed of his\r\n" + //
                                "virtue, he gloried in it; but the ingratitude of the Turk and the loss\r\n" + //
                                "of his beloved Safie were misfortunes more bitter and irreparable. The\r\n" + //
                                "arrival of the Arabian now infused new life into his soul.\r\n" + //
                                "\r\n" + //
                                "“When the news reached Leghorn that Felix was deprived of his wealth\r\n" + //
                                "and rank, the merchant commanded his daughter to think no more of her\r\n" + //
                                "lover, but to prepare to return to her native country. The generous\r\n" + //
                                "nature of Safie was outraged by this command; she attempted to\r\n" + //
                                "expostulate with her father, but he left her angrily, reiterating his\r\n" + //
                                "tyrannical mandate.\r\n" + //
                                "\r\n" + //
                                "“A few days after, the Turk entered his daughter’s apartment and told\r\n" + //
                                "her hastily that he had reason to believe that his residence at Leghorn\r\n" + //
                                "had been divulged and that he should speedily be delivered up to the\r\n" + //
                                "French government; he had consequently hired a vessel to convey him to\r\n" + //
                                "Constantinople, for which city he should sail in a few hours. He\r\n" + //
                                "intended to leave his daughter under the care of a confidential\r\n" + //
                                "servant, to follow at her leisure with the greater part of his\r\n" + //
                                "property, which had not yet arrived at Leghorn.\r\n" + //
                                "\r\n" + //
                                "“When alone, Safie resolved in her own mind the plan of conduct that it\r\n" + //
                                "would become her to pursue in this emergency. A residence in Turkey\r\n" + //
                                "was abhorrent to her; her religion and her feelings were alike averse\r\n" + //
                                "to it. By some papers of her father which fell into her hands she\r\n" + //
                                "heard of the exile of her lover and learnt the name of the spot where\r\n" + //
                                "he then resided. She hesitated some time, but at length she formed her\r\n" + //
                                "determination. Taking with her some jewels that belonged to her and a\r\n" + //
                                "sum of money, she quitted Italy with an attendant, a native of Leghorn,\r\n" + //
                                "but who understood the common language of Turkey, and departed for\r\n" + //
                                "Germany.\r\n" + //
                                "\r\n" + //
                                "“She arrived in safety at a town about twenty leagues from the cottage\r\n" + //
                                "of De Lacey, when her attendant fell dangerously ill. Safie nursed her\r\n" + //
                                "with the most devoted affection, but the poor girl died, and the\r\n" + //
                                "Arabian was left alone, unacquainted with the language of the country\r\n" + //
                                "and utterly ignorant of the customs of the world. She fell, however,\r\n" + //
                                "into good hands. The Italian had mentioned the name of the spot for\r\n" + //
                                "which they were bound, and after her death the woman of the house in\r\n" + //
                                "which they had lived took care that Safie should arrive in safety at\r\n" + //
                                "the cottage of her lover.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 15\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“Such was the history of my beloved cottagers. It impressed me deeply.\r\n" + //
                                "I learned, from the views of social life which it developed, to admire\r\n" + //
                                "their virtues and to deprecate the vices of mankind.\r\n" + //
                                "\r\n" + //
                                "“As yet I looked upon crime as a distant evil, benevolence and\r\n" + //
                                "generosity were ever present before me, inciting within me a desire to\r\n" + //
                                "become an actor in the busy scene where so many admirable qualities\r\n" + //
                                "were called forth and displayed. But in giving an account of the\r\n" + //
                                "progress of my intellect, I must not omit a circumstance which occurred\r\n" + //
                                "in the beginning of the month of August of the same year.\r\n" + //
                                "\r\n" + //
                                "“One night during my accustomed visit to the neighbouring wood where I\r\n" + //
                                "collected my own food and brought home firing for my protectors, I found on\r\n" + //
                                "the ground a leathern portmanteau containing several articles of dress and\r\n" + //
                                "some books. I eagerly seized the prize and returned with it to my hovel. \r\n" + //
                                "Fortunately the books were written in the language, the elements of which I\r\n" + //
                                "had acquired at the cottage; they consisted of _Paradise Lost_, a volume\r\n" + //
                                "of _Plutarch’s Lives_, and the _Sorrows of Werter_. The\r\n" + //
                                "possession of these treasures gave me extreme delight; I now continually\r\n" + //
                                "studied and exercised my mind upon these histories, whilst my friends were\r\n" + //
                                "employed in their ordinary occupations.\r\n" + //
                                "\r\n" + //
                                "“I can hardly describe to you the effect of these books. They produced\r\n" + //
                                "in me an infinity of new images and feelings, that sometimes raised me\r\n" + //
                                "to ecstasy, but more frequently sunk me into the lowest dejection. In\r\n" + //
                                "the _Sorrows of Werter_, besides the interest of its simple and affecting\r\n" + //
                                "story, so many opinions are canvassed and so many lights thrown upon\r\n" + //
                                "what had hitherto been to me obscure subjects that I found in it a\r\n" + //
                                "never-ending source of speculation and astonishment. The gentle and\r\n" + //
                                "domestic manners it described, combined with lofty sentiments and\r\n" + //
                                "feelings, which had for their object something out of self, accorded\r\n" + //
                                "well with my experience among my protectors and with the wants which\r\n" + //
                                "were for ever alive in my own bosom. But I thought Werter himself a\r\n" + //
                                "more divine being than I had ever beheld or imagined; his character\r\n" + //
                                "contained no pretension, but it sank deep. The disquisitions upon\r\n" + //
                                "death and suicide were calculated to fill me with wonder. I did not\r\n" + //
                                "pretend to enter into the merits of the case, yet I inclined towards\r\n" + //
                                "the opinions of the hero, whose extinction I wept, without precisely\r\n" + //
                                "understanding it.\r\n" + //
                                "\r\n" + //
                                "“As I read, however, I applied much personally to my own feelings and\r\n" + //
                                "condition. I found myself similar yet at the same time strangely\r\n" + //
                                "unlike to the beings concerning whom I read and to whose conversation I\r\n" + //
                                "was a listener. I sympathised with and partly understood them, but I\r\n" + //
                                "was unformed in mind; I was dependent on none and related to none.\r\n" + //
                                "‘The path of my departure was free,’ and there was none to lament my\r\n" + //
                                "annihilation. My person was hideous and my stature gigantic. What did\r\n" + //
                                "this mean? Who was I? What was I? Whence did I come? What was my\r\n" + //
                                "destination? These questions continually recurred, but I was unable to\r\n" + //
                                "solve them.\r\n" + //
                                "\r\n" + //
                                "“The volume of _Plutarch’s Lives_ which I possessed contained the\r\n" + //
                                "histories of the first founders of the ancient republics. This book\r\n" + //
                                "had a far different effect upon me from the _Sorrows of Werter_. I\r\n" + //
                                "learned from Werter’s imaginations despondency and gloom, but Plutarch\r\n" + //
                                "taught me high thoughts; he elevated me above the wretched sphere of my\r\n" + //
                                "own reflections, to admire and love the heroes of past ages. Many\r\n" + //
                                "things I read surpassed my understanding and experience. I had a very\r\n" + //
                                "confused knowledge of kingdoms, wide extents of country, mighty rivers,\r\n" + //
                                "and boundless seas. But I was perfectly unacquainted with towns and\r\n" + //
                                "large assemblages of men. The cottage of my protectors had been the\r\n" + //
                                "only school in which I had studied human nature, but this book\r\n" + //
                                "developed new and mightier scenes of action. I read of men concerned\r\n" + //
                                "in public affairs, governing or massacring their species. I felt the\r\n" + //
                                "greatest ardour for virtue rise within me, and abhorrence for vice, as\r\n" + //
                                "far as I understood the signification of those terms, relative as they\r\n" + //
                                "were, as I applied them, to pleasure and pain alone. Induced by these\r\n" + //
                                "feelings, I was of course led to admire peaceable lawgivers, Numa,\r\n" + //
                                "Solon, and Lycurgus, in preference to Romulus and Theseus. The\r\n" + //
                                "patriarchal lives of my protectors caused these impressions to take a\r\n" + //
                                "firm hold on my mind; perhaps, if my first introduction to humanity had\r\n" + //
                                "been made by a young soldier, burning for glory and slaughter, I should\r\n" + //
                                "have been imbued with different sensations.\r\n" + //
                                "\r\n" + //
                                "“But _Paradise Lost_ excited different and far deeper emotions. I read\r\n" + //
                                "it, as I had read the other volumes which had fallen into my hands, as\r\n" + //
                                "a true history. It moved every feeling of wonder and awe that the\r\n" + //
                                "picture of an omnipotent God warring with his creatures was capable of\r\n" + //
                                "exciting. I often referred the several situations, as their similarity\r\n" + //
                                "struck me, to my own. Like Adam, I was apparently united by no link to\r\n" + //
                                "any other being in existence; but his state was far different from mine\r\n" + //
                                "in every other respect. He had come forth from the hands of God a\r\n" + //
                                "perfect creature, happy and prosperous, guarded by the especial care of\r\n" + //
                                "his Creator; he was allowed to converse with and acquire knowledge from\r\n" + //
                                "beings of a superior nature, but I was wretched, helpless, and alone.\r\n" + //
                                "Many times I considered Satan as the fitter emblem of my condition, for\r\n" + //
                                "often, like him, when I viewed the bliss of my protectors, the bitter\r\n" + //
                                "gall of envy rose within me.\r\n" + //
                                "\r\n" + //
                                "“Another circumstance strengthened and confirmed these feelings. Soon\r\n" + //
                                "after my arrival in the hovel I discovered some papers in the pocket of\r\n" + //
                                "the dress which I had taken from your laboratory. At first I had\r\n" + //
                                "neglected them, but now that I was able to decipher the characters in\r\n" + //
                                "which they were written, I began to study them with diligence. It was\r\n" + //
                                "your journal of the four months that preceded my creation. You\r\n" + //
                                "minutely described in these papers every step you took in the progress\r\n" + //
                                "of your work; this history was mingled with accounts of domestic\r\n" + //
                                "occurrences. You doubtless recollect these papers. Here they are.\r\n" + //
                                "Everything is related in them which bears reference to my accursed\r\n" + //
                                "origin; the whole detail of that series of disgusting circumstances\r\n" + //
                                "which produced it is set in view; the minutest description of my odious\r\n" + //
                                "and loathsome person is given, in language which painted your own\r\n" + //
                                "horrors and rendered mine indelible. I sickened as I read. ‘Hateful\r\n" + //
                                "day when I received life!’ I exclaimed in agony. ‘Accursed creator!\r\n" + //
                                "Why did you form a monster so hideous that even _you_ turned from me in\r\n" + //
                                "disgust? God, in pity, made man beautiful and alluring, after his own\r\n" + //
                                "image; but my form is a filthy type of yours, more horrid even from the\r\n" + //
                                "very resemblance. Satan had his companions, fellow devils, to admire\r\n" + //
                                "and encourage him, but I am solitary and abhorred.’\r\n" + //
                                "\r\n" + //
                                "“These were the reflections of my hours of despondency and solitude;\r\n" + //
                                "but when I contemplated the virtues of the cottagers, their amiable and\r\n" + //
                                "benevolent dispositions, I persuaded myself that when they should\r\n" + //
                                "become acquainted with my admiration of their virtues they would\r\n" + //
                                "compassionate me and overlook my personal deformity. Could they turn\r\n" + //
                                "from their door one, however monstrous, who solicited their compassion\r\n" + //
                                "and friendship? I resolved, at least, not to despair, but in every way\r\n" + //
                                "to fit myself for an interview with them which would decide my fate. I\r\n" + //
                                "postponed this attempt for some months longer, for the importance\r\n" + //
                                "attached to its success inspired me with a dread lest I should fail.\r\n" + //
                                "Besides, I found that my understanding improved so much with every\r\n" + //
                                "day’s experience that I was unwilling to commence this undertaking\r\n" + //
                                "until a few more months should have added to my sagacity.\r\n" + //
                                "\r\n" + //
                                "“Several changes, in the meantime, took place in the cottage. The\r\n" + //
                                "presence of Safie diffused happiness among its inhabitants, and I also\r\n" + //
                                "found that a greater degree of plenty reigned there. Felix and Agatha\r\n" + //
                                "spent more time in amusement and conversation, and were assisted in\r\n" + //
                                "their labours by servants. They did not appear rich, but they were\r\n" + //
                                "contented and happy; their feelings were serene and peaceful, while\r\n" + //
                                "mine became every day more tumultuous. Increase of knowledge only\r\n" + //
                                "discovered to me more clearly what a wretched outcast I was. I\r\n" + //
                                "cherished hope, it is true, but it vanished when I beheld my person\r\n" + //
                                "reflected in water or my shadow in the moonshine, even as that frail\r\n" + //
                                "image and that inconstant shade.\r\n" + //
                                "\r\n" + //
                                "“I endeavoured to crush these fears and to fortify myself for the trial\r\n" + //
                                "which in a few months I resolved to undergo; and sometimes I allowed my\r\n" + //
                                "thoughts, unchecked by reason, to ramble in the fields of Paradise, and\r\n" + //
                                "dared to fancy amiable and lovely creatures sympathising with my\r\n" + //
                                "feelings and cheering my gloom; their angelic countenances breathed\r\n" + //
                                "smiles of consolation. But it was all a dream; no Eve soothed my\r\n" + //
                                "sorrows nor shared my thoughts; I was alone. I remembered Adam’s\r\n" + //
                                "supplication to his Creator. But where was mine? He had abandoned me,\r\n" + //
                                "and in the bitterness of my heart I cursed him.\r\n" + //
                                "\r\n" + //
                                "“Autumn passed thus. I saw, with surprise and grief, the leaves decay\r\n" + //
                                "and fall, and nature again assume the barren and bleak appearance it\r\n" + //
                                "had worn when I first beheld the woods and the lovely moon. Yet I did\r\n" + //
                                "not heed the bleakness of the weather; I was better fitted by my\r\n" + //
                                "conformation for the endurance of cold than heat. But my chief\r\n" + //
                                "delights were the sight of the flowers, the birds, and all the gay\r\n" + //
                                "apparel of summer; when those deserted me, I turned with more attention\r\n" + //
                                "towards the cottagers. Their happiness was not decreased by the\r\n" + //
                                "absence of summer. They loved and sympathised with one another; and\r\n" + //
                                "their joys, depending on each other, were not interrupted by the\r\n" + //
                                "casualties that took place around them. The more I saw of them, the\r\n" + //
                                "greater became my desire to claim their protection and kindness; my\r\n" + //
                                "heart yearned to be known and loved by these amiable creatures; to see\r\n" + //
                                "their sweet looks directed towards me with affection was the utmost\r\n" + //
                                "limit of my ambition. I dared not think that they would turn them from\r\n" + //
                                "me with disdain and horror. The poor that stopped at their door were\r\n" + //
                                "never driven away. I asked, it is true, for greater treasures than a\r\n" + //
                                "little food or rest: I required kindness and sympathy; but I did not\r\n" + //
                                "believe myself utterly unworthy of it.\r\n" + //
                                "\r\n" + //
                                "“The winter advanced, and an entire revolution of the seasons had taken\r\n" + //
                                "place since I awoke into life. My attention at this time was solely\r\n" + //
                                "directed towards my plan of introducing myself into the cottage of my\r\n" + //
                                "protectors. I revolved many projects, but that on which I finally\r\n" + //
                                "fixed was to enter the dwelling when the blind old man should be alone.\r\n" + //
                                "I had sagacity enough to discover that the unnatural hideousness of my\r\n" + //
                                "person was the chief object of horror with those who had formerly\r\n" + //
                                "beheld me. My voice, although harsh, had nothing terrible in it; I\r\n" + //
                                "thought, therefore, that if in the absence of his children I could gain\r\n" + //
                                "the good will and mediation of the old De Lacey, I might by his means\r\n" + //
                                "be tolerated by my younger protectors.\r\n" + //
                                "\r\n" + //
                                "“One day, when the sun shone on the red leaves that strewed the ground\r\n" + //
                                "and diffused cheerfulness, although it denied warmth, Safie, Agatha,\r\n" + //
                                "and Felix departed on a long country walk, and the old man, at his own\r\n" + //
                                "desire, was left alone in the cottage. When his children had departed,\r\n" + //
                                "he took up his guitar and played several mournful but sweet airs, more\r\n" + //
                                "sweet and mournful than I had ever heard him play before. At first his\r\n" + //
                                "countenance was illuminated with pleasure, but as he continued,\r\n" + //
                                "thoughtfulness and sadness succeeded; at length, laying aside the\r\n" + //
                                "instrument, he sat absorbed in reflection.\r\n" + //
                                "\r\n" + //
                                "“My heart beat quick; this was the hour and moment of trial, which\r\n" + //
                                "would decide my hopes or realise my fears. The servants were gone to a\r\n" + //
                                "neighbouring fair. All was silent in and around the cottage; it was an\r\n" + //
                                "excellent opportunity; yet, when I proceeded to execute my plan, my\r\n" + //
                                "limbs failed me and I sank to the ground. Again I rose, and exerting\r\n" + //
                                "all the firmness of which I was master, removed the planks which I had\r\n" + //
                                "placed before my hovel to conceal my retreat. The fresh air revived\r\n" + //
                                "me, and with renewed determination I approached the door of their\r\n" + //
                                "cottage.\r\n" + //
                                "\r\n" + //
                                "“I knocked. ‘Who is there?’ said the old man. ‘Come in.’\r\n" + //
                                "\r\n" + //
                                "“I entered. ‘Pardon this intrusion,’ said I; ‘I am\r\n" + //
                                "a traveller in want of a little rest; you would greatly oblige me if you\r\n" + //
                                "would allow me to remain a few minutes before the fire.’\r\n" + //
                                "\r\n" + //
                                "“‘Enter,’ said De Lacey, ‘and I will try in what\r\n" + //
                                "manner I can to relieve your wants; but, unfortunately, my children are\r\n" + //
                                "from home, and as I am blind, I am afraid I shall find it difficult to\r\n" + //
                                "procure food for you.’\r\n" + //
                                "\r\n" + //
                                "“‘Do not trouble yourself, my kind host; I have food; it is\r\n" + //
                                "warmth and rest only that I need.’\r\n" + //
                                "\r\n" + //
                                "“I sat down, and a silence ensued. I knew that every minute was\r\n" + //
                                "precious to me, yet I remained irresolute in what manner to commence\r\n" + //
                                "the interview, when the old man addressed me.\r\n" + //
                                "\r\n" + //
                                "‘By your language, stranger, I suppose you are my countryman; are you\r\n" + //
                                "French?’\r\n" + //
                                "\r\n" + //
                                "“‘No; but I was educated by a French family and understand that\r\n" + //
                                "language only. I am now going to claim the protection of some friends,\r\n" + //
                                "whom I sincerely love, and of whose favour I have some hopes.’\r\n" + //
                                "\r\n" + //
                                "“‘Are they Germans?’\r\n" + //
                                "\r\n" + //
                                "“‘No, they are French. But let us change the subject. I am an\r\n" + //
                                "unfortunate and deserted creature, I look around and I have no relation\r\n" + //
                                "or friend upon earth. These amiable people to whom I go have never\r\n" + //
                                "seen me and know little of me. I am full of fears, for if I fail\r\n" + //
                                "there, I am an outcast in the world for ever.’\r\n" + //
                                "\r\n" + //
                                "“‘Do not despair. To be friendless is indeed to be unfortunate, but\r\n" + //
                                "the hearts of men, when unprejudiced by any obvious self-interest, are\r\n" + //
                                "full of brotherly love and charity. Rely, therefore, on your hopes;\r\n" + //
                                "and if these friends are good and amiable, do not despair.’\r\n" + //
                                "\r\n" + //
                                "“‘They are kind—they are the most excellent creatures in the world;\r\n" + //
                                "but, unfortunately, they are prejudiced against me. I have good\r\n" + //
                                "dispositions; my life has been hitherto harmless and in some degree\r\n" + //
                                "beneficial; but a fatal prejudice clouds their eyes, and where they\r\n" + //
                                "ought to see a feeling and kind friend, they behold only a detestable\r\n" + //
                                "monster.’\r\n" + //
                                "\r\n" + //
                                "“‘That is indeed unfortunate; but if you are really blameless, cannot\r\n" + //
                                "you undeceive them?’\r\n" + //
                                "\r\n" + //
                                "“‘I am about to undertake that task; and it is on that account that I\r\n" + //
                                "feel so many overwhelming terrors. I tenderly love these friends; I\r\n" + //
                                "have, unknown to them, been for many months in the habits of daily\r\n" + //
                                "kindness towards them; but they believe that I wish to injure them, and\r\n" + //
                                "it is that prejudice which I wish to overcome.’\r\n" + //
                                "\r\n" + //
                                "“‘Where do these friends reside?’\r\n" + //
                                "\r\n" + //
                                "“‘Near this spot.’\r\n" + //
                                "\r\n" + //
                                "“The old man paused and then continued, ‘If you will unreservedly\r\n" + //
                                "confide to me the particulars of your tale, I perhaps may be of use in\r\n" + //
                                "undeceiving them. I am blind and cannot judge of your countenance, but\r\n" + //
                                "there is something in your words which persuades me that you are\r\n" + //
                                "sincere. I am poor and an exile, but it will afford me true pleasure\r\n" + //
                                "to be in any way serviceable to a human creature.’\r\n" + //
                                "\r\n" + //
                                "“‘Excellent man! I thank you and accept your generous offer. You\r\n" + //
                                "raise me from the dust by this kindness; and I trust that, by your aid,\r\n" + //
                                "I shall not be driven from the society and sympathy of your fellow\r\n" + //
                                "creatures.’\r\n" + //
                                "\r\n" + //
                                "“‘Heaven forbid! Even if you were really criminal, for that can only\r\n" + //
                                "drive you to desperation, and not instigate you to virtue. I also am\r\n" + //
                                "unfortunate; I and my family have been condemned, although innocent;\r\n" + //
                                "judge, therefore, if I do not feel for your misfortunes.’\r\n" + //
                                "\r\n" + //
                                "“‘How can I thank you, my best and only benefactor? From your lips\r\n" + //
                                "first have I heard the voice of kindness directed towards me; I shall\r\n" + //
                                "be for ever grateful; and your present humanity assures me of success\r\n" + //
                                "with those friends whom I am on the point of meeting.’\r\n" + //
                                "\r\n" + //
                                "“‘May I know the names and residence of those friends?’\r\n" + //
                                "\r\n" + //
                                "“I paused. This, I thought, was the moment of decision, which was to\r\n" + //
                                "rob me of or bestow happiness on me for ever. I struggled vainly for\r\n" + //
                                "firmness sufficient to answer him, but the effort destroyed all my\r\n" + //
                                "remaining strength; I sank on the chair and sobbed aloud. At that\r\n" + //
                                "moment I heard the steps of my younger protectors. I had not a moment\r\n" + //
                                "to lose, but seizing the hand of the old man, I cried, ‘Now is the\r\n" + //
                                "time! Save and protect me! You and your family are the friends whom I\r\n" + //
                                "seek. Do not you desert me in the hour of trial!’\r\n" + //
                                "\r\n" + //
                                "“‘Great God!’ exclaimed the old man. ‘Who are you?’\r\n" + //
                                "\r\n" + //
                                "“At that instant the cottage door was opened, and Felix, Safie, and\r\n" + //
                                "Agatha entered. Who can describe their horror and consternation on\r\n" + //
                                "beholding me? Agatha fainted, and Safie, unable to attend to her\r\n" + //
                                "friend, rushed out of the cottage. Felix darted forward, and with\r\n" + //
                                "supernatural force tore me from his father, to whose knees I clung, in\r\n" + //
                                "a transport of fury, he dashed me to the ground and struck me violently\r\n" + //
                                "with a stick. I could have torn him limb from limb, as the lion rends\r\n" + //
                                "the antelope. But my heart sank within me as with bitter sickness, and\r\n" + //
                                "I refrained. I saw him on the point of repeating his blow, when,\r\n" + //
                                "overcome by pain and anguish, I quitted the cottage, and in the general\r\n" + //
                                "tumult escaped unperceived to my hovel.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 16\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“Cursed, cursed creator! Why did I live? Why, in that instant, did I\r\n" + //
                                "not extinguish the spark of existence which you had so wantonly\r\n" + //
                                "bestowed? I know not; despair had not yet taken possession of me; my\r\n" + //
                                "feelings were those of rage and revenge. I could with pleasure have\r\n" + //
                                "destroyed the cottage and its inhabitants and have glutted myself with\r\n" + //
                                "their shrieks and misery.\r\n" + //
                                "\r\n" + //
                                "“When night came I quitted my retreat and wandered in the wood; and\r\n" + //
                                "now, no longer restrained by the fear of discovery, I gave vent to my\r\n" + //
                                "anguish in fearful howlings. I was like a wild beast that had broken\r\n" + //
                                "the toils, destroying the objects that obstructed me and ranging\r\n" + //
                                "through the wood with a stag-like swiftness. Oh! What a miserable\r\n" + //
                                "night I passed! The cold stars shone in mockery, and the bare trees\r\n" + //
                                "waved their branches above me; now and then the sweet voice of a bird\r\n" + //
                                "burst forth amidst the universal stillness. All, save I, were at rest\r\n" + //
                                "or in enjoyment; I, like the arch-fiend, bore a hell within me, and\r\n" + //
                                "finding myself unsympathised with, wished to tear up the trees, spread\r\n" + //
                                "havoc and destruction around me, and then to have sat down and enjoyed\r\n" + //
                                "the ruin.\r\n" + //
                                "\r\n" + //
                                "“But this was a luxury of sensation that could not endure; I became\r\n" + //
                                "fatigued with excess of bodily exertion and sank on the damp grass in\r\n" + //
                                "the sick impotence of despair. There was none among the myriads of men\r\n" + //
                                "that existed who would pity or assist me; and should I feel kindness\r\n" + //
                                "towards my enemies? No; from that moment I declared everlasting war\r\n" + //
                                "against the species, and more than all, against him who had formed me\r\n" + //
                                "and sent me forth to this insupportable misery.\r\n" + //
                                "\r\n" + //
                                "“The sun rose; I heard the voices of men and knew that it was\r\n" + //
                                "impossible to return to my retreat during that day. Accordingly I hid\r\n" + //
                                "myself in some thick underwood, determining to devote the ensuing hours\r\n" + //
                                "to reflection on my situation.\r\n" + //
                                "\r\n" + //
                                "“The pleasant sunshine and the pure air of day restored me to some\r\n" + //
                                "degree of tranquillity; and when I considered what had passed at the\r\n" + //
                                "cottage, I could not help believing that I had been too hasty in my\r\n" + //
                                "conclusions. I had certainly acted imprudently. It was apparent that\r\n" + //
                                "my conversation had interested the father in my behalf, and I was a\r\n" + //
                                "fool in having exposed my person to the horror of his children. I\r\n" + //
                                "ought to have familiarised the old De Lacey to me, and by degrees to\r\n" + //
                                "have discovered myself to the rest of his family, when they should have\r\n" + //
                                "been prepared for my approach. But I did not believe my errors to be\r\n" + //
                                "irretrievable, and after much consideration I resolved to return to the\r\n" + //
                                "cottage, seek the old man, and by my representations win him to my\r\n" + //
                                "party.\r\n" + //
                                "\r\n" + //
                                "“These thoughts calmed me, and in the afternoon I sank into a profound\r\n" + //
                                "sleep; but the fever of my blood did not allow me to be visited by\r\n" + //
                                "peaceful dreams. The horrible scene of the preceding day was for ever\r\n" + //
                                "acting before my eyes; the females were flying and the enraged Felix\r\n" + //
                                "tearing me from his father’s feet. I awoke exhausted, and finding that\r\n" + //
                                "it was already night, I crept forth from my hiding-place, and went in\r\n" + //
                                "search of food.\r\n" + //
                                "\r\n" + //
                                "“When my hunger was appeased, I directed my steps towards the\r\n" + //
                                "well-known path that conducted to the cottage. All there was at peace.\r\n" + //
                                "I crept into my hovel and remained in silent expectation of the\r\n" + //
                                "accustomed hour when the family arose. That hour passed, the sun\r\n" + //
                                "mounted high in the heavens, but the cottagers did not appear. I\r\n" + //
                                "trembled violently, apprehending some dreadful misfortune. The inside\r\n" + //
                                "of the cottage was dark, and I heard no motion; I cannot describe the\r\n" + //
                                "agony of this suspense.\r\n" + //
                                "\r\n" + //
                                "“Presently two countrymen passed by, but pausing near the cottage, they\r\n" + //
                                "entered into conversation, using violent gesticulations; but I did not\r\n" + //
                                "understand what they said, as they spoke the language of the country,\r\n" + //
                                "which differed from that of my protectors. Soon after, however, Felix\r\n" + //
                                "approached with another man; I was surprised, as I knew that he had not\r\n" + //
                                "quitted the cottage that morning, and waited anxiously to discover from\r\n" + //
                                "his discourse the meaning of these unusual appearances.\r\n" + //
                                "\r\n" + //
                                "“‘Do you consider,’ said his companion to him,\r\n" + //
                                "‘that you will be obliged to pay three months’ rent and to lose\r\n" + //
                                "the produce of your garden? I do not wish to take any unfair advantage, and\r\n" + //
                                "I beg therefore that you will take some days to consider of your\r\n" + //
                                "determination.’\r\n" + //
                                "\r\n" + //
                                "“‘It is utterly useless,’ replied Felix; ‘we can\r\n" + //
                                "never again inhabit your cottage. The life of my father is in the greatest\r\n" + //
                                "danger, owing to the dreadful circumstance that I have related. My wife and\r\n" + //
                                "my sister will never recover from their horror. I entreat you not to reason\r\n" + //
                                "with me any more. Take possession of your tenement and let me fly from this\r\n" + //
                                "place.’\r\n" + //
                                "\r\n" + //
                                "“Felix trembled violently as he said this. He and his companion\r\n" + //
                                "entered the cottage, in which they remained for a few minutes, and then\r\n" + //
                                "departed. I never saw any of the family of De Lacey more.\r\n" + //
                                "\r\n" + //
                                "“I continued for the remainder of the day in my hovel in a state of\r\n" + //
                                "utter and stupid despair. My protectors had departed and had broken\r\n" + //
                                "the only link that held me to the world. For the first time the\r\n" + //
                                "feelings of revenge and hatred filled my bosom, and I did not strive to\r\n" + //
                                "control them, but allowing myself to be borne away by the stream, I\r\n" + //
                                "bent my mind towards injury and death. When I thought of my friends,\r\n" + //
                                "of the mild voice of De Lacey, the gentle eyes of Agatha, and the\r\n" + //
                                "exquisite beauty of the Arabian, these thoughts vanished and a gush of\r\n" + //
                                "tears somewhat soothed me. But again when I reflected that they had\r\n" + //
                                "spurned and deserted me, anger returned, a rage of anger, and unable to\r\n" + //
                                "injure anything human, I turned my fury towards inanimate objects. As\r\n" + //
                                "night advanced, I placed a variety of combustibles around the cottage,\r\n" + //
                                "and after having destroyed every vestige of cultivation in the garden,\r\n" + //
                                "I waited with forced impatience until the moon had sunk to commence my\r\n" + //
                                "operations.\r\n" + //
                                "\r\n" + //
                                "“As the night advanced, a fierce wind arose from the woods and quickly\r\n" + //
                                "dispersed the clouds that had loitered in the heavens; the blast tore\r\n" + //
                                "along like a mighty avalanche and produced a kind of insanity in my\r\n" + //
                                "spirits that burst all bounds of reason and reflection. I lighted the\r\n" + //
                                "dry branch of a tree and danced with fury around the devoted cottage,\r\n" + //
                                "my eyes still fixed on the western horizon, the edge of which the moon\r\n" + //
                                "nearly touched. A part of its orb was at length hid, and I waved my\r\n" + //
                                "brand; it sank, and with a loud scream I fired the straw, and heath,\r\n" + //
                                "and bushes, which I had collected. The wind fanned the fire, and the\r\n" + //
                                "cottage was quickly enveloped by the flames, which clung to it and\r\n" + //
                                "licked it with their forked and destroying tongues.\r\n" + //
                                "\r\n" + //
                                "“As soon as I was convinced that no assistance could save any part of\r\n" + //
                                "the habitation, I quitted the scene and sought for refuge in the woods.\r\n" + //
                                "\r\n" + //
                                "“And now, with the world before me, whither should I bend my steps? I\r\n" + //
                                "resolved to fly far from the scene of my misfortunes; but to me, hated\r\n" + //
                                "and despised, every country must be equally horrible. At length the\r\n" + //
                                "thought of you crossed my mind. I learned from your papers that you\r\n" + //
                                "were my father, my creator; and to whom could I apply with more fitness\r\n" + //
                                "than to him who had given me life? Among the lessons that Felix had\r\n" + //
                                "bestowed upon Safie, geography had not been omitted; I had learned from\r\n" + //
                                "these the relative situations of the different countries of the earth.\r\n" + //
                                "You had mentioned Geneva as the name of your native town, and towards\r\n" + //
                                "this place I resolved to proceed.\r\n" + //
                                "\r\n" + //
                                "“But how was I to direct myself? I knew that I must travel in a\r\n" + //
                                "southwesterly direction to reach my destination, but the sun was my\r\n" + //
                                "only guide. I did not know the names of the towns that I was to pass\r\n" + //
                                "through, nor could I ask information from a single human being; but I\r\n" + //
                                "did not despair. From you only could I hope for succour, although\r\n" + //
                                "towards you I felt no sentiment but that of hatred. Unfeeling,\r\n" + //
                                "heartless creator! You had endowed me with perceptions and passions\r\n" + //
                                "and then cast me abroad an object for the scorn and horror of mankind.\r\n" + //
                                "But on you only had I any claim for pity and redress, and from you I\r\n" + //
                                "determined to seek that justice which I vainly attempted to gain from\r\n" + //
                                "any other being that wore the human form.\r\n" + //
                                "\r\n" + //
                                "“My travels were long and the sufferings I endured intense. It was\r\n" + //
                                "late in autumn when I quitted the district where I had so long resided.\r\n" + //
                                "I travelled only at night, fearful of encountering the visage of a\r\n" + //
                                "human being. Nature decayed around me, and the sun became heatless;\r\n" + //
                                "rain and snow poured around me; mighty rivers were frozen; the surface\r\n" + //
                                "of the earth was hard and chill, and bare, and I found no shelter. Oh,\r\n" + //
                                "earth! How often did I imprecate curses on the cause of my being! The\r\n" + //
                                "mildness of my nature had fled, and all within me was turned to gall\r\n" + //
                                "and bitterness. The nearer I approached to your habitation, the more\r\n" + //
                                "deeply did I feel the spirit of revenge enkindled in my heart. Snow\r\n" + //
                                "fell, and the waters were hardened, but I rested not. A few incidents\r\n" + //
                                "now and then directed me, and I possessed a map of the country; but I\r\n" + //
                                "often wandered wide from my path. The agony of my feelings allowed me\r\n" + //
                                "no respite; no incident occurred from which my rage and misery could\r\n" + //
                                "not extract its food; but a circumstance that happened when I arrived\r\n" + //
                                "on the confines of Switzerland, when the sun had recovered its warmth\r\n" + //
                                "and the earth again began to look green, confirmed in an especial\r\n" + //
                                "manner the bitterness and horror of my feelings.\r\n" + //
                                "\r\n" + //
                                "“I generally rested during the day and travelled only when I was\r\n" + //
                                "secured by night from the view of man. One morning, however, finding\r\n" + //
                                "that my path lay through a deep wood, I ventured to continue my journey\r\n" + //
                                "after the sun had risen; the day, which was one of the first of spring,\r\n" + //
                                "cheered even me by the loveliness of its sunshine and the balminess of\r\n" + //
                                "the air. I felt emotions of gentleness and pleasure, that had long\r\n" + //
                                "appeared dead, revive within me. Half surprised by the novelty of\r\n" + //
                                "these sensations, I allowed myself to be borne away by them, and\r\n" + //
                                "forgetting my solitude and deformity, dared to be happy. Soft tears\r\n" + //
                                "again bedewed my cheeks, and I even raised my humid eyes with\r\n" + //
                                "thankfulness towards the blessed sun, which bestowed such joy upon me.\r\n" + //
                                "\r\n" + //
                                "“I continued to wind among the paths of the wood, until I came to its\r\n" + //
                                "boundary, which was skirted by a deep and rapid river, into which many\r\n" + //
                                "of the trees bent their branches, now budding with the fresh spring.\r\n" + //
                                "Here I paused, not exactly knowing what path to pursue, when I heard\r\n" + //
                                "the sound of voices, that induced me to conceal myself under the shade\r\n" + //
                                "of a cypress. I was scarcely hid when a young girl came running\r\n" + //
                                "towards the spot where I was concealed, laughing, as if she ran from\r\n" + //
                                "someone in sport. She continued her course along the precipitous sides\r\n" + //
                                "of the river, when suddenly her foot slipped, and she fell into the\r\n" + //
                                "rapid stream. I rushed from my hiding-place and with extreme labour,\r\n" + //
                                "from the force of the current, saved her and dragged her to shore. She\r\n" + //
                                "was senseless, and I endeavoured by every means in my power to restore\r\n" + //
                                "animation, when I was suddenly interrupted by the approach of a rustic,\r\n" + //
                                "who was probably the person from whom she had playfully fled. On\r\n" + //
                                "seeing me, he darted towards me, and tearing the girl from my arms,\r\n" + //
                                "hastened towards the deeper parts of the wood. I followed speedily, I\r\n" + //
                                "hardly knew why; but when the man saw me draw near, he aimed a gun,\r\n" + //
                                "which he carried, at my body and fired. I sank to the ground, and my\r\n" + //
                                "injurer, with increased swiftness, escaped into the wood.\r\n" + //
                                "\r\n" + //
                                "“This was then the reward of my benevolence! I had saved a human being\r\n" + //
                                "from destruction, and as a recompense I now writhed under the miserable\r\n" + //
                                "pain of a wound which shattered the flesh and bone. The feelings of\r\n" + //
                                "kindness and gentleness which I had entertained but a few moments\r\n" + //
                                "before gave place to hellish rage and gnashing of teeth. Inflamed by\r\n" + //
                                "pain, I vowed eternal hatred and vengeance to all mankind. But the\r\n" + //
                                "agony of my wound overcame me; my pulses paused, and I fainted.\r\n" + //
                                "\r\n" + //
                                "“For some weeks I led a miserable life in the woods, endeavouring to\r\n" + //
                                "cure the wound which I had received. The ball had entered my shoulder,\r\n" + //
                                "and I knew not whether it had remained there or passed through; at any\r\n" + //
                                "rate I had no means of extracting it. My sufferings were augmented\r\n" + //
                                "also by the oppressive sense of the injustice and ingratitude of their\r\n" + //
                                "infliction. My daily vows rose for revenge—a deep and deadly revenge,\r\n" + //
                                "such as would alone compensate for the outrages and anguish I had\r\n" + //
                                "endured.\r\n" + //
                                "\r\n" + //
                                "“After some weeks my wound healed, and I continued my journey. The\r\n" + //
                                "labours I endured were no longer to be alleviated by the bright sun or\r\n" + //
                                "gentle breezes of spring; all joy was but a mockery which insulted my\r\n" + //
                                "desolate state and made me feel more painfully that I was not made for\r\n" + //
                                "the enjoyment of pleasure.\r\n" + //
                                "\r\n" + //
                                "“But my toils now drew near a close, and in two months from this time I\r\n" + //
                                "reached the environs of Geneva.\r\n" + //
                                "\r\n" + //
                                "“It was evening when I arrived, and I retired to a hiding-place among\r\n" + //
                                "the fields that surround it to meditate in what manner I should apply\r\n" + //
                                "to you. I was oppressed by fatigue and hunger and far too unhappy to\r\n" + //
                                "enjoy the gentle breezes of evening or the prospect of the sun setting\r\n" + //
                                "behind the stupendous mountains of Jura.\r\n" + //
                                "\r\n" + //
                                "“At this time a slight sleep relieved me from the pain of reflection,\r\n" + //
                                "which was disturbed by the approach of a beautiful child, who came\r\n" + //
                                "running into the recess I had chosen, with all the sportiveness of\r\n" + //
                                "infancy. Suddenly, as I gazed on him, an idea seized me that this\r\n" + //
                                "little creature was unprejudiced and had lived too short a time to have\r\n" + //
                                "imbibed a horror of deformity. If, therefore, I could seize him and\r\n" + //
                                "educate him as my companion and friend, I should not be so desolate in\r\n" + //
                                "this peopled earth.\r\n" + //
                                "\r\n" + //
                                "“Urged by this impulse, I seized on the boy as he passed and drew him\r\n" + //
                                "towards me. As soon as he beheld my form, he placed his hands before\r\n" + //
                                "his eyes and uttered a shrill scream; I drew his hand forcibly from his\r\n" + //
                                "face and said, ‘Child, what is the meaning of this? I do not intend to\r\n" + //
                                "hurt you; listen to me.’\r\n" + //
                                "\r\n" + //
                                "“He struggled violently. ‘Let me go,’ he cried;\r\n" + //
                                "‘monster! Ugly wretch! You wish to eat me and tear me to pieces. You\r\n" + //
                                "are an ogre. Let me go, or I will tell my papa.’\r\n" + //
                                "\r\n" + //
                                "“‘Boy, you will never see your father again; you must come with me.’\r\n" + //
                                "\r\n" + //
                                "“‘Hideous monster! Let me go. My papa is a syndic—he is M.\r\n" + //
                                "Frankenstein—he will punish you. You dare not keep me.’\r\n" + //
                                "\r\n" + //
                                "“‘Frankenstein! you belong then to my enemy—to him towards whom I have\r\n" + //
                                "sworn eternal revenge; you shall be my first victim.’\r\n" + //
                                "\r\n" + //
                                "“The child still struggled and loaded me with epithets which carried\r\n" + //
                                "despair to my heart; I grasped his throat to silence him, and in a\r\n" + //
                                "moment he lay dead at my feet.\r\n" + //
                                "\r\n" + //
                                "“I gazed on my victim, and my heart swelled with exultation and hellish\r\n" + //
                                "triumph; clapping my hands, I exclaimed, ‘I too can create desolation;\r\n" + //
                                "my enemy is not invulnerable; this death will carry despair to him, and\r\n" + //
                                "a thousand other miseries shall torment and destroy him.’\r\n" + //
                                "\r\n" + //
                                "“As I fixed my eyes on the child, I saw something glittering on his\r\n" + //
                                "breast. I took it; it was a portrait of a most lovely woman. In spite\r\n" + //
                                "of my malignity, it softened and attracted me. For a few moments I\r\n" + //
                                "gazed with delight on her dark eyes, fringed by deep lashes, and her\r\n" + //
                                "lovely lips; but presently my rage returned; I remembered that I was\r\n" + //
                                "for ever deprived of the delights that such beautiful creatures could\r\n" + //
                                "bestow and that she whose resemblance I contemplated would, in\r\n" + //
                                "regarding me, have changed that air of divine benignity to one\r\n" + //
                                "expressive of disgust and affright.\r\n" + //
                                "\r\n" + //
                                "“Can you wonder that such thoughts transported me with rage? I only\r\n" + //
                                "wonder that at that moment, instead of venting my sensations in\r\n" + //
                                "exclamations and agony, I did not rush among mankind and perish in the\r\n" + //
                                "attempt to destroy them.\r\n" + //
                                "\r\n" + //
                                "“While I was overcome by these feelings, I left the spot where I had\r\n" + //
                                "committed the murder, and seeking a more secluded hiding-place, I\r\n" + //
                                "entered a barn which had appeared to me to be empty. A woman was\r\n" + //
                                "sleeping on some straw; she was young, not indeed so beautiful as her\r\n" + //
                                "whose portrait I held, but of an agreeable aspect and blooming in the\r\n" + //
                                "loveliness of youth and health. Here, I thought, is one of those whose\r\n" + //
                                "joy-imparting smiles are bestowed on all but me. And then I bent over\r\n" + //
                                "her and whispered, ‘Awake, fairest, thy lover is near—he who would\r\n" + //
                                "give his life but to obtain one look of affection from thine eyes; my\r\n" + //
                                "beloved, awake!’\r\n" + //
                                "\r\n" + //
                                "“The sleeper stirred; a thrill of terror ran through me. Should she\r\n" + //
                                "indeed awake, and see me, and curse me, and denounce the murderer? Thus\r\n" + //
                                "would she assuredly act if her darkened eyes opened and she beheld me.\r\n" + //
                                "The thought was madness; it stirred the fiend within me—not I, but\r\n" + //
                                "she, shall suffer; the murder I have committed because I am for ever\r\n" + //
                                "robbed of all that she could give me, she shall atone. The crime had\r\n" + //
                                "its source in her; be hers the punishment! Thanks to the lessons of\r\n" + //
                                "Felix and the sanguinary laws of man, I had learned now to work\r\n" + //
                                "mischief. I bent over her and placed the portrait securely in one of\r\n" + //
                                "the folds of her dress. She moved again, and I fled.\r\n" + //
                                "\r\n" + //
                                "“For some days I haunted the spot where these scenes had taken place,\r\n" + //
                                "sometimes wishing to see you, sometimes resolved to quit the world and\r\n" + //
                                "its miseries for ever. At length I wandered towards these mountains,\r\n" + //
                                "and have ranged through their immense recesses, consumed by a burning\r\n" + //
                                "passion which you alone can gratify. We may not part until you have\r\n" + //
                                "promised to comply with my requisition. I am alone and miserable; man\r\n" + //
                                "will not associate with me; but one as deformed and horrible as myself\r\n" + //
                                "would not deny herself to me. My companion must be of the same species\r\n" + //
                                "and have the same defects. This being you must create.”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 17\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "The being finished speaking and fixed his looks upon me in the\r\n" + //
                                "expectation of a reply. But I was bewildered, perplexed, and unable to\r\n" + //
                                "arrange my ideas sufficiently to understand the full extent of his\r\n" + //
                                "proposition. He continued,\r\n" + //
                                "\r\n" + //
                                "“You must create a female for me with whom I can live in the\r\n" + //
                                "interchange of those sympathies necessary for my being. This you alone\r\n" + //
                                "can do, and I demand it of you as a right which you must not refuse to\r\n" + //
                                "concede.”\r\n" + //
                                "\r\n" + //
                                "The latter part of his tale had kindled anew in me the anger that had\r\n" + //
                                "died away while he narrated his peaceful life among the cottagers, and\r\n" + //
                                "as he said this I could no longer suppress the rage that burned within\r\n" + //
                                "me.\r\n" + //
                                "\r\n" + //
                                "“I do refuse it,” I replied; “and no torture shall ever extort a\r\n" + //
                                "consent from me. You may render me the most miserable of men, but you\r\n" + //
                                "shall never make me base in my own eyes. Shall I create another like\r\n" + //
                                "yourself, whose joint wickedness might desolate the world. Begone! I\r\n" + //
                                "have answered you; you may torture me, but I will never consent.”\r\n" + //
                                "\r\n" + //
                                "“You are in the wrong,” replied the fiend; “and instead\r\n" + //
                                "of threatening, I am content to reason with you. I am malicious because I\r\n" + //
                                "am miserable. Am I not shunned and hated by all mankind? You, my creator,\r\n" + //
                                "would tear me to pieces and triumph; remember that, and tell me why I\r\n" + //
                                "should pity man more than he pities me? You would not call it murder if you\r\n" + //
                                "could precipitate me into one of those ice-rifts and destroy my frame, the\r\n" + //
                                "work of your own hands. Shall I respect man when he condemns me? Let him\r\n" + //
                                "live with me in the interchange of kindness, and instead of injury I would\r\n" + //
                                "bestow every benefit upon him with tears of gratitude at his acceptance.\r\n" + //
                                "But that cannot be; the human senses are insurmountable barriers to our\r\n" + //
                                "union. Yet mine shall not be the submission of abject slavery. I will\r\n" + //
                                "revenge my injuries; if I cannot inspire love, I will cause fear, and\r\n" + //
                                "chiefly towards you my arch-enemy, because my creator, do I swear\r\n" + //
                                "inextinguishable hatred. Have a care; I will work at your destruction, nor\r\n" + //
                                "finish until I desolate your heart, so that you shall curse the hour of\r\n" + //
                                "your birth.”\r\n" + //
                                "\r\n" + //
                                "A fiendish rage animated him as he said this; his face was wrinkled\r\n" + //
                                "into contortions too horrible for human eyes to behold; but presently\r\n" + //
                                "he calmed himself and proceeded—\r\n" + //
                                "\r\n" + //
                                "“I intended to reason. This passion is detrimental to me, for you do\r\n" + //
                                "not reflect that _you_ are the cause of its excess. If any being felt\r\n" + //
                                "emotions of benevolence towards me, I should return them a hundred and a\r\n" + //
                                "hundredfold; for that one creature’s sake I would make peace with the\r\n" + //
                                "whole kind! But I now indulge in dreams of bliss that cannot be realised.\r\n" + //
                                "What I ask of you is reasonable and moderate; I demand a creature of\r\n" + //
                                "another sex, but as hideous as myself; the gratification is small, but it\r\n" + //
                                "is all that I can receive, and it shall content me. It is true, we shall be\r\n" + //
                                "monsters, cut off from all the world; but on that account we shall be more\r\n" + //
                                "attached to one another. Our lives will not be happy, but they will be\r\n" + //
                                "harmless and free from the misery I now feel. Oh! My creator, make me\r\n" + //
                                "happy; let me feel gratitude towards you for one benefit! Let me see that I\r\n" + //
                                "excite the sympathy of some existing thing; do not deny me my\r\n" + //
                                "request!”\r\n" + //
                                "\r\n" + //
                                "I was moved. I shuddered when I thought of the possible consequences\r\n" + //
                                "of my consent, but I felt that there was some justice in his argument.\r\n" + //
                                "His tale and the feelings he now expressed proved him to be a creature\r\n" + //
                                "of fine sensations, and did I not as his maker owe him all the portion\r\n" + //
                                "of happiness that it was in my power to bestow? He saw my change of\r\n" + //
                                "feeling and continued,\r\n" + //
                                "\r\n" + //
                                "“If you consent, neither you nor any other human being shall ever see\r\n" + //
                                "us again; I will go to the vast wilds of South America. My food is not\r\n" + //
                                "that of man; I do not destroy the lamb and the kid to glut my appetite;\r\n" + //
                                "acorns and berries afford me sufficient nourishment. My companion will\r\n" + //
                                "be of the same nature as myself and will be content with the same fare.\r\n" + //
                                "We shall make our bed of dried leaves; the sun will shine on us as on\r\n" + //
                                "man and will ripen our food. The picture I present to you is peaceful\r\n" + //
                                "and human, and you must feel that you could deny it only in the\r\n" + //
                                "wantonness of power and cruelty. Pitiless as you have been towards me,\r\n" + //
                                "I now see compassion in your eyes; let me seize the favourable moment\r\n" + //
                                "and persuade you to promise what I so ardently desire.”\r\n" + //
                                "\r\n" + //
                                "“You propose,” replied I, “to fly from the habitations of\r\n" + //
                                "man, to dwell in those wilds where the beasts of the field will be your\r\n" + //
                                "only companions. How can you, who long for the love and sympathy of man,\r\n" + //
                                "persevere in this exile? You will return and again seek their kindness, and\r\n" + //
                                "you will meet with their detestation; your evil passions will be renewed,\r\n" + //
                                "and you will then have a companion to aid you in the task of destruction.\r\n" + //
                                "This may not be; cease to argue the point, for I cannot consent.”\r\n" + //
                                "\r\n" + //
                                "“How inconstant are your feelings! But a moment ago you were moved by\r\n" + //
                                "my representations, and why do you again harden yourself to my complaints?\r\n" + //
                                "I swear to you, by the earth which I inhabit, and by you that made me, that\r\n" + //
                                "with the companion you bestow, I will quit the neighbourhood of man and\r\n" + //
                                "dwell, as it may chance, in the most savage of places. My evil passions\r\n" + //
                                "will have fled, for I shall meet with sympathy! My life will flow quietly\r\n" + //
                                "away, and in my dying moments I shall not curse my maker.”\r\n" + //
                                "\r\n" + //
                                "His words had a strange effect upon me. I compassionated him and\r\n" + //
                                "sometimes felt a wish to console him, but when I looked upon him, when\r\n" + //
                                "I saw the filthy mass that moved and talked, my heart sickened and my\r\n" + //
                                "feelings were altered to those of horror and hatred. I tried to stifle\r\n" + //
                                "these sensations; I thought that as I could not sympathise with him, I\r\n" + //
                                "had no right to withhold from him the small portion of happiness which\r\n" + //
                                "was yet in my power to bestow.\r\n" + //
                                "\r\n" + //
                                "“You swear,” I said, “to be harmless; but have you not\r\n" + //
                                "already shown a degree of malice that should reasonably make me distrust\r\n" + //
                                "you? May not even this be a feint that will increase your triumph by\r\n" + //
                                "affording a wider scope for your revenge?”\r\n" + //
                                "\r\n" + //
                                "“How is this? I must not be trifled with, and I demand an answer. If\r\n" + //
                                "I have no ties and no affections, hatred and vice must be my portion;\r\n" + //
                                "the love of another will destroy the cause of my crimes, and I shall\r\n" + //
                                "become a thing of whose existence everyone will be ignorant. My vices\r\n" + //
                                "are the children of a forced solitude that I abhor, and my virtues will\r\n" + //
                                "necessarily arise when I live in communion with an equal. I shall feel\r\n" + //
                                "the affections of a sensitive being and become linked to the chain of\r\n" + //
                                "existence and events from which I am now excluded.”\r\n" + //
                                "\r\n" + //
                                "I paused some time to reflect on all he had related and the various\r\n" + //
                                "arguments which he had employed. I thought of the promise of virtues which\r\n" + //
                                "he had displayed on the opening of his existence and the subsequent blight\r\n" + //
                                "of all kindly feeling by the loathing and scorn which his protectors had\r\n" + //
                                "manifested towards him. His power and threats were not omitted in my\r\n" + //
                                "calculations; a creature who could exist in the ice-caves of the glaciers\r\n" + //
                                "and hide himself from pursuit among the ridges of inaccessible precipices\r\n" + //
                                "was a being possessing faculties it would be vain to cope with. After a\r\n" + //
                                "long pause of reflection I concluded that the justice due both to him and\r\n" + //
                                "my fellow creatures demanded of me that I should comply with his request.\r\n" + //
                                "Turning to him, therefore, I said,\r\n" + //
                                "\r\n" + //
                                "“I consent to your demand, on your solemn oath to quit Europe for ever,\r\n" + //
                                "and every other place in the neighbourhood of man, as soon as I shall\r\n" + //
                                "deliver into your hands a female who will accompany you in your exile.”\r\n" + //
                                "\r\n" + //
                                "“I swear,” he cried, “by the sun, and by the blue sky of\r\n" + //
                                "heaven, and by the fire of love that burns my heart, that if you grant my\r\n" + //
                                "prayer, while they exist you shall never behold me again. Depart to your\r\n" + //
                                "home and commence your labours; I shall watch their progress with\r\n" + //
                                "unutterable anxiety; and fear not but that when you are ready I shall\r\n" + //
                                "appear.”\r\n" + //
                                "\r\n" + //
                                "Saying this, he suddenly quitted me, fearful, perhaps, of any change in\r\n" + //
                                "my sentiments. I saw him descend the mountain with greater speed than\r\n" + //
                                "the flight of an eagle, and quickly lost among the undulations of the\r\n" + //
                                "sea of ice.\r\n" + //
                                "\r\n" + //
                                "His tale had occupied the whole day, and the sun was upon the verge of\r\n" + //
                                "the horizon when he departed. I knew that I ought to hasten my descent\r\n" + //
                                "towards the valley, as I should soon be encompassed in darkness; but my\r\n" + //
                                "heart was heavy, and my steps slow. The labour of winding among the\r\n" + //
                                "little paths of the mountain and fixing my feet firmly as I advanced\r\n" + //
                                "perplexed me, occupied as I was by the emotions which the occurrences\r\n" + //
                                "of the day had produced. Night was far advanced when I came to the\r\n" + //
                                "halfway resting-place and seated myself beside the fountain. The stars\r\n" + //
                                "shone at intervals as the clouds passed from over them; the dark pines\r\n" + //
                                "rose before me, and every here and there a broken tree lay on the\r\n" + //
                                "ground; it was a scene of wonderful solemnity and stirred strange\r\n" + //
                                "thoughts within me. I wept bitterly, and clasping my hands in agony, I\r\n" + //
                                "exclaimed, “Oh! stars and clouds and winds, ye are all about to mock\r\n" + //
                                "me; if ye really pity me, crush sensation and memory; let me become as\r\n" + //
                                "nought; but if not, depart, depart, and leave me in darkness.”\r\n" + //
                                "\r\n" + //
                                "These were wild and miserable thoughts, but I cannot describe to you\r\n" + //
                                "how the eternal twinkling of the stars weighed upon me and how I\r\n" + //
                                "listened to every blast of wind as if it were a dull ugly siroc on its\r\n" + //
                                "way to consume me.\r\n" + //
                                "\r\n" + //
                                "Morning dawned before I arrived at the village of Chamounix; I took no\r\n" + //
                                "rest, but returned immediately to Geneva. Even in my own heart I could\r\n" + //
                                "give no expression to my sensations—they weighed on me with a\r\n" + //
                                "mountain’s weight and their excess destroyed my agony beneath them.\r\n" + //
                                "Thus I returned home, and entering the house, presented myself to the\r\n" + //
                                "family. My haggard and wild appearance awoke intense alarm, but I\r\n" + //
                                "answered no question, scarcely did I speak. I felt as if I were placed\r\n" + //
                                "under a ban—as if I had no right to claim their sympathies—as if\r\n" + //
                                "never more might I enjoy companionship with them. Yet even thus I\r\n" + //
                                "loved them to adoration; and to save them, I resolved to dedicate\r\n" + //
                                "myself to my most abhorred task. The prospect of such an occupation\r\n" + //
                                "made every other circumstance of existence pass before me like a dream,\r\n" + //
                                "and that thought only had to me the reality of life.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 18\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Day after day, week after week, passed away on my return to Geneva; and\r\n" + //
                                "I could not collect the courage to recommence my work. I feared the\r\n" + //
                                "vengeance of the disappointed fiend, yet I was unable to overcome my\r\n" + //
                                "repugnance to the task which was enjoined me. I found that I could not\r\n" + //
                                "compose a female without again devoting several months to profound\r\n" + //
                                "study and laborious disquisition. I had heard of some discoveries\r\n" + //
                                "having been made by an English philosopher, the knowledge of which was\r\n" + //
                                "material to my success, and I sometimes thought of obtaining my\r\n" + //
                                "father’s consent to visit England for this purpose; but I clung to\r\n" + //
                                "every pretence of delay and shrank from taking the first step in an\r\n" + //
                                "undertaking whose immediate necessity began to appear less absolute to\r\n" + //
                                "me. A change indeed had taken place in me; my health, which had\r\n" + //
                                "hitherto declined, was now much restored; and my spirits, when\r\n" + //
                                "unchecked by the memory of my unhappy promise, rose proportionably. My\r\n" + //
                                "father saw this change with pleasure, and he turned his thoughts\r\n" + //
                                "towards the best method of eradicating the remains of my melancholy,\r\n" + //
                                "which every now and then would return by fits, and with a devouring\r\n" + //
                                "blackness overcast the approaching sunshine. At these moments I took\r\n" + //
                                "refuge in the most perfect solitude. I passed whole days on the lake\r\n" + //
                                "alone in a little boat, watching the clouds and listening to the\r\n" + //
                                "rippling of the waves, silent and listless. But the fresh air and\r\n" + //
                                "bright sun seldom failed to restore me to some degree of composure, and\r\n" + //
                                "on my return I met the salutations of my friends with a readier smile\r\n" + //
                                "and a more cheerful heart.\r\n" + //
                                "\r\n" + //
                                "It was after my return from one of these rambles that my father,\r\n" + //
                                "calling me aside, thus addressed me,\r\n" + //
                                "\r\n" + //
                                "“I am happy to remark, my dear son, that you have resumed your former\r\n" + //
                                "pleasures and seem to be returning to yourself. And yet you are still\r\n" + //
                                "unhappy and still avoid our society. For some time I was lost in\r\n" + //
                                "conjecture as to the cause of this, but yesterday an idea struck me,\r\n" + //
                                "and if it is well founded, I conjure you to avow it. Reserve on such a\r\n" + //
                                "point would be not only useless, but draw down treble misery on us all.”\r\n" + //
                                "\r\n" + //
                                "I trembled violently at his exordium, and my father continued—\r\n" + //
                                "\r\n" + //
                                "“I confess, my son, that I have always looked forward to your\r\n" + //
                                "marriage with our dear Elizabeth as the tie of our domestic comfort and the\r\n" + //
                                "stay of my declining years. You were attached to each other from your\r\n" + //
                                "earliest infancy; you studied together, and appeared, in dispositions and\r\n" + //
                                "tastes, entirely suited to one another. But so blind is the experience of\r\n" + //
                                "man that what I conceived to be the best assistants to my plan may have\r\n" + //
                                "entirely destroyed it. You, perhaps, regard her as your sister, without any\r\n" + //
                                "wish that she might become your wife. Nay, you may have met with another\r\n" + //
                                "whom you may love; and considering yourself as bound in honour to\r\n" + //
                                "Elizabeth, this struggle may occasion the poignant misery which you appear\r\n" + //
                                "to feel.”\r\n" + //
                                "\r\n" + //
                                "“My dear father, reassure yourself. I love my cousin tenderly and\r\n" + //
                                "sincerely. I never saw any woman who excited, as Elizabeth does, my\r\n" + //
                                "warmest admiration and affection. My future hopes and prospects are\r\n" + //
                                "entirely bound up in the expectation of our union.”\r\n" + //
                                "\r\n" + //
                                "“The expression of your sentiments of this subject, my dear Victor,\r\n" + //
                                "gives me more pleasure than I have for some time experienced. If you\r\n" + //
                                "feel thus, we shall assuredly be happy, however present events may cast\r\n" + //
                                "a gloom over us. But it is this gloom which appears to have taken so\r\n" + //
                                "strong a hold of your mind that I wish to dissipate. Tell me,\r\n" + //
                                "therefore, whether you object to an immediate solemnisation of the\r\n" + //
                                "marriage. We have been unfortunate, and recent events have drawn us\r\n" + //
                                "from that everyday tranquillity befitting my years and infirmities. You\r\n" + //
                                "are younger; yet I do not suppose, possessed as you are of a competent\r\n" + //
                                "fortune, that an early marriage would at all interfere with any future\r\n" + //
                                "plans of honour and utility that you may have formed. Do not suppose,\r\n" + //
                                "however, that I wish to dictate happiness to you or that a delay on\r\n" + //
                                "your part would cause me any serious uneasiness. Interpret my words\r\n" + //
                                "with candour and answer me, I conjure you, with confidence and\r\n" + //
                                "sincerity.”\r\n" + //
                                "\r\n" + //
                                "I listened to my father in silence and remained for some time incapable\r\n" + //
                                "of offering any reply. I revolved rapidly in my mind a multitude of\r\n" + //
                                "thoughts and endeavoured to arrive at some conclusion. Alas! To me\r\n" + //
                                "the idea of an immediate union with my Elizabeth was one of horror and\r\n" + //
                                "dismay. I was bound by a solemn promise which I had not yet fulfilled\r\n" + //
                                "and dared not break, or if I did, what manifold miseries might not\r\n" + //
                                "impend over me and my devoted family! Could I enter into a festival\r\n" + //
                                "with this deadly weight yet hanging round my neck and bowing me to the\r\n" + //
                                "ground? I must perform my engagement and let the monster depart with\r\n" + //
                                "his mate before I allowed myself to enjoy the delight of a union from\r\n" + //
                                "which I expected peace.\r\n" + //
                                "\r\n" + //
                                "I remembered also the necessity imposed upon me of either journeying to\r\n" + //
                                "England or entering into a long correspondence with those philosophers\r\n" + //
                                "of that country whose knowledge and discoveries were of indispensable\r\n" + //
                                "use to me in my present undertaking. The latter method of obtaining\r\n" + //
                                "the desired intelligence was dilatory and unsatisfactory; besides, I\r\n" + //
                                "had an insurmountable aversion to the idea of engaging myself in my\r\n" + //
                                "loathsome task in my father’s house while in habits of familiar\r\n" + //
                                "intercourse with those I loved. I knew that a thousand fearful\r\n" + //
                                "accidents might occur, the slightest of which would disclose a tale to\r\n" + //
                                "thrill all connected with me with horror. I was aware also that I\r\n" + //
                                "should often lose all self-command, all capacity of hiding the\r\n" + //
                                "harrowing sensations that would possess me during the progress of my\r\n" + //
                                "unearthly occupation. I must absent myself from all I loved while thus\r\n" + //
                                "employed. Once commenced, it would quickly be achieved, and I might be\r\n" + //
                                "restored to my family in peace and happiness. My promise fulfilled,\r\n" + //
                                "the monster would depart for ever. Or (so my fond fancy imaged) some\r\n" + //
                                "accident might meanwhile occur to destroy him and put an end to my\r\n" + //
                                "slavery for ever.\r\n" + //
                                "\r\n" + //
                                "These feelings dictated my answer to my father. I expressed a wish to\r\n" + //
                                "visit England, but concealing the true reasons of this request, I\r\n" + //
                                "clothed my desires under a guise which excited no suspicion, while I\r\n" + //
                                "urged my desire with an earnestness that easily induced my father to\r\n" + //
                                "comply. After so long a period of an absorbing melancholy that\r\n" + //
                                "resembled madness in its intensity and effects, he was glad to find\r\n" + //
                                "that I was capable of taking pleasure in the idea of such a journey,\r\n" + //
                                "and he hoped that change of scene and varied amusement would, before my\r\n" + //
                                "return, have restored me entirely to myself.\r\n" + //
                                "\r\n" + //
                                "The duration of my absence was left to my own choice; a few months, or\r\n" + //
                                "at most a year, was the period contemplated. One paternal kind\r\n" + //
                                "precaution he had taken to ensure my having a companion. Without\r\n" + //
                                "previously communicating with me, he had, in concert with Elizabeth,\r\n" + //
                                "arranged that Clerval should join me at Strasburgh. This interfered\r\n" + //
                                "with the solitude I coveted for the prosecution of my task; yet at the\r\n" + //
                                "commencement of my journey the presence of my friend could in no way be\r\n" + //
                                "an impediment, and truly I rejoiced that thus I should be saved many\r\n" + //
                                "hours of lonely, maddening reflection. Nay, Henry might stand between\r\n" + //
                                "me and the intrusion of my foe. If I were alone, would he not at times\r\n" + //
                                "force his abhorred presence on me to remind me of my task or to\r\n" + //
                                "contemplate its progress?\r\n" + //
                                "\r\n" + //
                                "To England, therefore, I was bound, and it was understood that my union\r\n" + //
                                "with Elizabeth should take place immediately on my return. My father’s\r\n" + //
                                "age rendered him extremely averse to delay. For myself, there was one\r\n" + //
                                "reward I promised myself from my detested toils—one consolation for my\r\n" + //
                                "unparalleled sufferings; it was the prospect of that day when,\r\n" + //
                                "enfranchised from my miserable slavery, I might claim Elizabeth and\r\n" + //
                                "forget the past in my union with her.\r\n" + //
                                "\r\n" + //
                                "I now made arrangements for my journey, but one feeling haunted me\r\n" + //
                                "which filled me with fear and agitation. During my absence I should\r\n" + //
                                "leave my friends unconscious of the existence of their enemy and\r\n" + //
                                "unprotected from his attacks, exasperated as he might be by my\r\n" + //
                                "departure. But he had promised to follow me wherever I might go, and\r\n" + //
                                "would he not accompany me to England? This imagination was dreadful in\r\n" + //
                                "itself, but soothing inasmuch as it supposed the safety of my friends.\r\n" + //
                                "I was agonised with the idea of the possibility that the reverse of\r\n" + //
                                "this might happen. But through the whole period during which I was the\r\n" + //
                                "slave of my creature I allowed myself to be governed by the impulses of\r\n" + //
                                "the moment; and my present sensations strongly intimated that the fiend\r\n" + //
                                "would follow me and exempt my family from the danger of his\r\n" + //
                                "machinations.\r\n" + //
                                "\r\n" + //
                                "It was in the latter end of September that I again quitted my native\r\n" + //
                                "country. My journey had been my own suggestion, and Elizabeth\r\n" + //
                                "therefore acquiesced, but she was filled with disquiet at the idea of\r\n" + //
                                "my suffering, away from her, the inroads of misery and grief. It had\r\n" + //
                                "been her care which provided me a companion in Clerval—and yet a man\r\n" + //
                                "is blind to a thousand minute circumstances which call forth a woman’s\r\n" + //
                                "sedulous attention. She longed to bid me hasten my return; a thousand\r\n" + //
                                "conflicting emotions rendered her mute as she bade me a tearful, silent\r\n" + //
                                "farewell.\r\n" + //
                                "\r\n" + //
                                "I threw myself into the carriage that was to convey me away, hardly\r\n" + //
                                "knowing whither I was going, and careless of what was passing around.\r\n" + //
                                "I remembered only, and it was with a bitter anguish that I reflected on\r\n" + //
                                "it, to order that my chemical instruments should be packed to go with\r\n" + //
                                "me. Filled with dreary imaginations, I passed through many beautiful\r\n" + //
                                "and majestic scenes, but my eyes were fixed and unobserving. I could\r\n" + //
                                "only think of the bourne of my travels and the work which was to occupy\r\n" + //
                                "me whilst they endured.\r\n" + //
                                "\r\n" + //
                                "After some days spent in listless indolence, during which I traversed\r\n" + //
                                "many leagues, I arrived at Strasburgh, where I waited two days for\r\n" + //
                                "Clerval. He came. Alas, how great was the contrast between us! He\r\n" + //
                                "was alive to every new scene, joyful when he saw the beauties of the\r\n" + //
                                "setting sun, and more happy when he beheld it rise and recommence a new\r\n" + //
                                "day. He pointed out to me the shifting colours of the landscape and\r\n" + //
                                "the appearances of the sky. “This is what it is to live,” he cried;\r\n" + //
                                "“now I enjoy existence! But you, my dear Frankenstein, wherefore are\r\n" + //
                                "you desponding and sorrowful!” In truth, I was occupied by gloomy\r\n" + //
                                "thoughts and neither saw the descent of the evening star nor the golden\r\n" + //
                                "sunrise reflected in the Rhine. And you, my friend, would be far more\r\n" + //
                                "amused with the journal of Clerval, who observed the scenery with an\r\n" + //
                                "eye of feeling and delight, than in listening to my reflections. I, a\r\n" + //
                                "miserable wretch, haunted by a curse that shut up every avenue to\r\n" + //
                                "enjoyment.\r\n" + //
                                "\r\n" + //
                                "We had agreed to descend the Rhine in a boat from Strasburgh to\r\n" + //
                                "Rotterdam, whence we might take shipping for London. During this\r\n" + //
                                "voyage we passed many willowy islands and saw several beautiful towns.\r\n" + //
                                "We stayed a day at Mannheim, and on the fifth from our departure from\r\n" + //
                                "Strasburgh, arrived at Mainz. The course of the Rhine below Mainz\r\n" + //
                                "becomes much more picturesque. The river descends rapidly and winds\r\n" + //
                                "between hills, not high, but steep, and of beautiful forms. We saw\r\n" + //
                                "many ruined castles standing on the edges of precipices, surrounded by\r\n" + //
                                "black woods, high and inaccessible. This part of the Rhine, indeed,\r\n" + //
                                "presents a singularly variegated landscape. In one spot you view\r\n" + //
                                "rugged hills, ruined castles overlooking tremendous precipices, with\r\n" + //
                                "the dark Rhine rushing beneath; and on the sudden turn of a promontory,\r\n" + //
                                "flourishing vineyards with green sloping banks and a meandering river\r\n" + //
                                "and populous towns occupy the scene.\r\n" + //
                                "\r\n" + //
                                "We travelled at the time of the vintage and heard the song of the labourers\r\n" + //
                                "as we glided down the stream. Even I, depressed in mind, and my spirits\r\n" + //
                                "continually agitated by gloomy feelings, even I was pleased. I lay at the\r\n" + //
                                "bottom of the boat, and as I gazed on the cloudless blue sky, I seemed to\r\n" + //
                                "drink in a tranquillity to which I had long been a stranger. And if these\r\n" + //
                                "were my sensations, who can describe those of Henry? He felt as if he had\r\n" + //
                                "been transported to Fairy-land and enjoyed a happiness seldom tasted by\r\n" + //
                                "man. “I have seen,” he said, “the most beautiful scenes\r\n" + //
                                "of my own country; I have visited the lakes of Lucerne and Uri, where the\r\n" + //
                                "snowy mountains descend almost perpendicularly to the water, casting black\r\n" + //
                                "and impenetrable shades, which would cause a gloomy and mournful appearance\r\n" + //
                                "were it not for the most verdant islands that relieve the eye by their gay\r\n" + //
                                "appearance; I have seen this lake agitated by a tempest, when the wind tore\r\n" + //
                                "up whirlwinds of water and gave you an idea of what the water-spout must be\r\n" + //
                                "on the great ocean; and the waves dash with fury the base of the mountain,\r\n" + //
                                "where the priest and his mistress were overwhelmed by an avalanche and\r\n" + //
                                "where their dying voices are still said to be heard amid the pauses of the\r\n" + //
                                "nightly wind; I have seen the mountains of La Valais, and the Pays de Vaud;\r\n" + //
                                "but this country, Victor, pleases me more than all those wonders. The\r\n" + //
                                "mountains of Switzerland are more majestic and strange, but there is a\r\n" + //
                                "charm in the banks of this divine river that I never before saw equalled.\r\n" + //
                                "Look at that castle which overhangs yon precipice; and that also on the\r\n" + //
                                "island, almost concealed amongst the foliage of those lovely trees; and now\r\n" + //
                                "that group of labourers coming from among their vines; and that village\r\n" + //
                                "half hid in the recess of the mountain. Oh, surely the spirit that inhabits\r\n" + //
                                "and guards this place has a soul more in harmony with man than those who\r\n" + //
                                "pile the glacier or retire to the inaccessible peaks of the mountains of\r\n" + //
                                "our own country.”\r\n" + //
                                "\r\n" + //
                                "Clerval! Beloved friend! Even now it delights me to record your words and\r\n" + //
                                "to dwell on the praise of which you are so eminently deserving. He was a\r\n" + //
                                "being formed in the “very poetry of nature.” His wild and\r\n" + //
                                "enthusiastic imagination was chastened by the sensibility of his heart. His\r\n" + //
                                "soul overflowed with ardent affections, and his friendship was of that\r\n" + //
                                "devoted and wondrous nature that the worldly-minded teach us to look for only\r\n" + //
                                "in the imagination. But even human sympathies were not sufficient to\r\n" + //
                                "satisfy his eager mind. The scenery of external nature, which others regard\r\n" + //
                                "only with admiration, he loved with ardour:—\r\n" + //
                                "\r\n" + //
                                "    ——The sounding cataract\r\n" + //
                                "    Haunted him like a passion: the tall rock,\r\n" + //
                                "    The mountain, and the deep and gloomy wood,\r\n" + //
                                "    Their colours and their forms, were then to him\r\n" + //
                                "    An appetite; a feeling, and a love,\r\n" + //
                                "    That had no need of a remoter charm,\r\n" + //
                                "    By thought supplied, or any interest\r\n" + //
                                "    Unborrow’d from the eye.\r\n" + //
                                "\r\n" + //
                                "          [Wordsworth’s “Tintern Abbey”.]\r\n" + //
                                "\r\n" + //
                                "And where does he now exist? Is this gentle and lovely being lost\r\n" + //
                                "for ever? Has this mind, so replete with ideas, imaginations fanciful\r\n" + //
                                "and magnificent, which formed a world, whose existence depended on the\r\n" + //
                                "life of its creator;—has this mind perished? Does it now only exist\r\n" + //
                                "in my memory? No, it is not thus; your form so divinely wrought, and\r\n" + //
                                "beaming with beauty, has decayed, but your spirit still visits and\r\n" + //
                                "consoles your unhappy friend.\r\n" + //
                                "\r\n" + //
                                "Pardon this gush of sorrow; these ineffectual words are but a slight\r\n" + //
                                "tribute to the unexampled worth of Henry, but they soothe my heart,\r\n" + //
                                "overflowing with the anguish which his remembrance creates. I will\r\n" + //
                                "proceed with my tale.\r\n" + //
                                "\r\n" + //
                                "Beyond Cologne we descended to the plains of Holland; and we resolved to\r\n" + //
                                "post the remainder of our way, for the wind was contrary and the stream of\r\n" + //
                                "the river was too gentle to aid us.\r\n" + //
                                "\r\n" + //
                                "Our journey here lost the interest arising from beautiful scenery, but we\r\n" + //
                                "arrived in a few days at Rotterdam, whence we proceeded by sea to England.\r\n" + //
                                "It was on a clear morning, in the latter days of December, that I first saw\r\n" + //
                                "the white cliffs of Britain. The banks of the Thames presented a new scene;\r\n" + //
                                "they were flat but fertile, and almost every town was marked by the\r\n" + //
                                "remembrance of some story. We saw Tilbury Fort and remembered the Spanish\r\n" + //
                                "Armada, Gravesend, Woolwich, and Greenwich—places which I had heard\r\n" + //
                                "of even in my country.\r\n" + //
                                "\r\n" + //
                                "At length we saw the numerous steeples of London, St. Paul’s towering\r\n" + //
                                "above all, and the Tower famed in English history.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 19\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "London was our present point of rest; we determined to remain several\r\n" + //
                                "months in this wonderful and celebrated city. Clerval desired the\r\n" + //
                                "intercourse of the men of genius and talent who flourished at this\r\n" + //
                                "time, but this was with me a secondary object; I was principally\r\n" + //
                                "occupied with the means of obtaining the information necessary for the\r\n" + //
                                "completion of my promise and quickly availed myself of the letters of\r\n" + //
                                "introduction that I had brought with me, addressed to the most\r\n" + //
                                "distinguished natural philosophers.\r\n" + //
                                "\r\n" + //
                                "If this journey had taken place during my days of study and happiness,\r\n" + //
                                "it would have afforded me inexpressible pleasure. But a blight had\r\n" + //
                                "come over my existence, and I only visited these people for the sake of\r\n" + //
                                "the information they might give me on the subject in which my interest\r\n" + //
                                "was so terribly profound. Company was irksome to me; when alone, I\r\n" + //
                                "could fill my mind with the sights of heaven and earth; the voice of\r\n" + //
                                "Henry soothed me, and I could thus cheat myself into a transitory\r\n" + //
                                "peace. But busy, uninteresting, joyous faces brought back despair to\r\n" + //
                                "my heart. I saw an insurmountable barrier placed between me and my\r\n" + //
                                "fellow men; this barrier was sealed with the blood of William and\r\n" + //
                                "Justine, and to reflect on the events connected with those names filled\r\n" + //
                                "my soul with anguish.\r\n" + //
                                "\r\n" + //
                                "But in Clerval I saw the image of my former self; he was inquisitive\r\n" + //
                                "and anxious to gain experience and instruction. The difference of\r\n" + //
                                "manners which he observed was to him an inexhaustible source of\r\n" + //
                                "instruction and amusement. He was also pursuing an object he had long\r\n" + //
                                "had in view. His design was to visit India, in the belief that he had\r\n" + //
                                "in his knowledge of its various languages, and in the views he had\r\n" + //
                                "taken of its society, the means of materially assisting the progress of\r\n" + //
                                "European colonization and trade. In Britain only could he further the\r\n" + //
                                "execution of his plan. He was for ever busy, and the only check to his\r\n" + //
                                "enjoyments was my sorrowful and dejected mind. I tried to conceal this\r\n" + //
                                "as much as possible, that I might not debar him from the pleasures\r\n" + //
                                "natural to one who was entering on a new scene of life, undisturbed by\r\n" + //
                                "any care or bitter recollection. I often refused to accompany him,\r\n" + //
                                "alleging another engagement, that I might remain alone. I now also\r\n" + //
                                "began to collect the materials necessary for my new creation, and this\r\n" + //
                                "was to me like the torture of single drops of water continually falling\r\n" + //
                                "on the head. Every thought that was devoted to it was an extreme\r\n" + //
                                "anguish, and every word that I spoke in allusion to it caused my lips\r\n" + //
                                "to quiver, and my heart to palpitate.\r\n" + //
                                "\r\n" + //
                                "After passing some months in London, we received a letter from a person in\r\n" + //
                                "Scotland who had formerly been our visitor at Geneva. He mentioned the\r\n" + //
                                "beauties of his native country and asked us if those were not sufficient\r\n" + //
                                "allurements to induce us to prolong our journey as far north as Perth,\r\n" + //
                                "where he resided. Clerval eagerly desired to accept this invitation, and I,\r\n" + //
                                "although I abhorred society, wished to view again mountains and streams and\r\n" + //
                                "all the wondrous works with which Nature adorns her chosen dwelling-places.\r\n" + //
                                "\r\n" + //
                                "We had arrived in England at the beginning of October, and it was now\r\n" + //
                                "February. We accordingly determined to commence our journey towards the\r\n" + //
                                "north at the expiration of another month. In this expedition we did not\r\n" + //
                                "intend to follow the great road to Edinburgh, but to visit Windsor, Oxford,\r\n" + //
                                "Matlock, and the Cumberland lakes, resolving to arrive at the completion of\r\n" + //
                                "this tour about the end of July. I packed up my chemical instruments and\r\n" + //
                                "the materials I had collected, resolving to finish my labours in some\r\n" + //
                                "obscure nook in the northern highlands of Scotland.\r\n" + //
                                "\r\n" + //
                                "We quitted London on the 27th of March and remained a few days at\r\n" + //
                                "Windsor, rambling in its beautiful forest. This was a new scene to us\r\n" + //
                                "mountaineers; the majestic oaks, the quantity of game, and the herds of\r\n" + //
                                "stately deer were all novelties to us.\r\n" + //
                                "\r\n" + //
                                "From thence we proceeded to Oxford. As we entered this city, our minds\r\n" + //
                                "were filled with the remembrance of the events that had been transacted\r\n" + //
                                "there more than a century and a half before. It was here that Charles\r\n" + //
                                "I. had collected his forces. This city had remained faithful to him,\r\n" + //
                                "after the whole nation had forsaken his cause to join the standard of\r\n" + //
                                "Parliament and liberty. The memory of that unfortunate king and his\r\n" + //
                                "companions, the amiable Falkland, the insolent Goring, his queen, and\r\n" + //
                                "son, gave a peculiar interest to every part of the city which they\r\n" + //
                                "might be supposed to have inhabited. The spirit of elder days found a\r\n" + //
                                "dwelling here, and we delighted to trace its footsteps. If these\r\n" + //
                                "feelings had not found an imaginary gratification, the appearance of\r\n" + //
                                "the city had yet in itself sufficient beauty to obtain our admiration.\r\n" + //
                                "The colleges are ancient and picturesque; the streets are almost\r\n" + //
                                "magnificent; and the lovely Isis, which flows beside it through meadows\r\n" + //
                                "of exquisite verdure, is spread forth into a placid expanse of waters,\r\n" + //
                                "which reflects its majestic assemblage of towers, and spires, and\r\n" + //
                                "domes, embosomed among aged trees.\r\n" + //
                                "\r\n" + //
                                "I enjoyed this scene, and yet my enjoyment was embittered both by the\r\n" + //
                                "memory of the past and the anticipation of the future. I was formed\r\n" + //
                                "for peaceful happiness. During my youthful days discontent never\r\n" + //
                                "visited my mind, and if I was ever overcome by _ennui_, the sight of what\r\n" + //
                                "is beautiful in nature or the study of what is excellent and sublime in\r\n" + //
                                "the productions of man could always interest my heart and communicate\r\n" + //
                                "elasticity to my spirits. But I am a blasted tree; the bolt has\r\n" + //
                                "entered my soul; and I felt then that I should survive to exhibit what\r\n" + //
                                "I shall soon cease to be—a miserable spectacle of wrecked humanity,\r\n" + //
                                "pitiable to others and intolerable to myself.\r\n" + //
                                "\r\n" + //
                                "We passed a considerable period at Oxford, rambling among its environs\r\n" + //
                                "and endeavouring to identify every spot which might relate to the most\r\n" + //
                                "animating epoch of English history. Our little voyages of discovery\r\n" + //
                                "were often prolonged by the successive objects that presented\r\n" + //
                                "themselves. We visited the tomb of the illustrious Hampden and the\r\n" + //
                                "field on which that patriot fell. For a moment my soul was elevated\r\n" + //
                                "from its debasing and miserable fears to contemplate the divine ideas\r\n" + //
                                "of liberty and self-sacrifice of which these sights were the monuments\r\n" + //
                                "and the remembrancers. For an instant I dared to shake off my chains\r\n" + //
                                "and look around me with a free and lofty spirit, but the iron had eaten\r\n" + //
                                "into my flesh, and I sank again, trembling and hopeless, into my\r\n" + //
                                "miserable self.\r\n" + //
                                "\r\n" + //
                                "We left Oxford with regret and proceeded to Matlock, which was our next\r\n" + //
                                "place of rest. The country in the neighbourhood of this village\r\n" + //
                                "resembled, to a greater degree, the scenery of Switzerland; but\r\n" + //
                                "everything is on a lower scale, and the green hills want the crown of\r\n" + //
                                "distant white Alps which always attend on the piny mountains of my\r\n" + //
                                "native country. We visited the wondrous cave and the little cabinets\r\n" + //
                                "of natural history, where the curiosities are disposed in the same\r\n" + //
                                "manner as in the collections at Servox and Chamounix. The latter name\r\n" + //
                                "made me tremble when pronounced by Henry, and I hastened to quit\r\n" + //
                                "Matlock, with which that terrible scene was thus associated.\r\n" + //
                                "\r\n" + //
                                "From Derby, still journeying northwards, we passed two months in\r\n" + //
                                "Cumberland and Westmorland. I could now almost fancy myself among the\r\n" + //
                                "Swiss mountains. The little patches of snow which yet lingered on the\r\n" + //
                                "northern sides of the mountains, the lakes, and the dashing of the\r\n" + //
                                "rocky streams were all familiar and dear sights to me. Here also we\r\n" + //
                                "made some acquaintances, who almost contrived to cheat me into\r\n" + //
                                "happiness. The delight of Clerval was proportionably greater than\r\n" + //
                                "mine; his mind expanded in the company of men of talent, and he found\r\n" + //
                                "in his own nature greater capacities and resources than he could have\r\n" + //
                                "imagined himself to have possessed while he associated with his\r\n" + //
                                "inferiors. “I could pass my life here,” said he to me; “and among\r\n" + //
                                "these mountains I should scarcely regret Switzerland and the Rhine.”\r\n" + //
                                "\r\n" + //
                                "But he found that a traveller’s life is one that includes much pain\r\n" + //
                                "amidst its enjoyments. His feelings are for ever on the stretch; and\r\n" + //
                                "when he begins to sink into repose, he finds himself obliged to quit\r\n" + //
                                "that on which he rests in pleasure for something new, which again\r\n" + //
                                "engages his attention, and which also he forsakes for other novelties.\r\n" + //
                                "\r\n" + //
                                "We had scarcely visited the various lakes of Cumberland and Westmorland\r\n" + //
                                "and conceived an affection for some of the inhabitants when the period\r\n" + //
                                "of our appointment with our Scotch friend approached, and we left them\r\n" + //
                                "to travel on. For my own part I was not sorry. I had now neglected my\r\n" + //
                                "promise for some time, and I feared the effects of the dæmon’s\r\n" + //
                                "disappointment. He might remain in Switzerland and wreak his vengeance\r\n" + //
                                "on my relatives. This idea pursued me and tormented me at every moment\r\n" + //
                                "from which I might otherwise have snatched repose and peace. I waited\r\n" + //
                                "for my letters with feverish impatience; if they were delayed I was\r\n" + //
                                "miserable and overcome by a thousand fears; and when they arrived and I\r\n" + //
                                "saw the superscription of Elizabeth or my father, I hardly dared to\r\n" + //
                                "read and ascertain my fate. Sometimes I thought that the fiend\r\n" + //
                                "followed me and might expedite my remissness by murdering my companion.\r\n" + //
                                "When these thoughts possessed me, I would not quit Henry for a moment,\r\n" + //
                                "but followed him as his shadow, to protect him from the fancied rage of\r\n" + //
                                "his destroyer. I felt as if I had committed some great crime, the\r\n" + //
                                "consciousness of which haunted me. I was guiltless, but I had indeed\r\n" + //
                                "drawn down a horrible curse upon my head, as mortal as that of crime.\r\n" + //
                                "\r\n" + //
                                "I visited Edinburgh with languid eyes and mind; and yet that city might\r\n" + //
                                "have interested the most unfortunate being. Clerval did not like it so well\r\n" + //
                                "as Oxford, for the antiquity of the latter city was more pleasing to him.\r\n" + //
                                "But the beauty and regularity of the new town of Edinburgh, its romantic\r\n" + //
                                "castle and its environs, the most delightful in the world, Arthur’s\r\n" + //
                                "Seat, St. Bernard’s Well, and the Pentland Hills, compensated him for\r\n" + //
                                "the change and filled him with cheerfulness and admiration. But I was\r\n" + //
                                "impatient to arrive at the termination of my journey.\r\n" + //
                                "\r\n" + //
                                "We left Edinburgh in a week, passing through Coupar, St. Andrew’s, and\r\n" + //
                                "along the banks of the Tay, to Perth, where our friend expected us.\r\n" + //
                                "But I was in no mood to laugh and talk with strangers or enter into\r\n" + //
                                "their feelings or plans with the good humour expected from a guest; and\r\n" + //
                                "accordingly I told Clerval that I wished to make the tour of Scotland\r\n" + //
                                "alone. “Do you,” said I, “enjoy yourself, and let this be our\r\n" + //
                                "rendezvous. I may be absent a month or two; but do not interfere with\r\n" + //
                                "my motions, I entreat you; leave me to peace and solitude for a short\r\n" + //
                                "time; and when I return, I hope it will be with a lighter heart, more\r\n" + //
                                "congenial to your own temper.”\r\n" + //
                                "\r\n" + //
                                "Henry wished to dissuade me, but seeing me bent on this plan, ceased to\r\n" + //
                                "remonstrate. He entreated me to write often. “I had rather be with\r\n" + //
                                "you,” he said, “in your solitary rambles, than with these Scotch\r\n" + //
                                "people, whom I do not know; hasten, then, my dear friend, to return,\r\n" + //
                                "that I may again feel myself somewhat at home, which I cannot do in\r\n" + //
                                "your absence.”\r\n" + //
                                "\r\n" + //
                                "Having parted from my friend, I determined to visit some remote spot of\r\n" + //
                                "Scotland and finish my work in solitude. I did not doubt but that the\r\n" + //
                                "monster followed me and would discover himself to me when I should have\r\n" + //
                                "finished, that he might receive his companion.\r\n" + //
                                "\r\n" + //
                                "With this resolution I traversed the northern highlands and fixed on one of\r\n" + //
                                "the remotest of the Orkneys as the scene of my labours. It was a place\r\n" + //
                                "fitted for such a work, being hardly more than a rock whose high sides were\r\n" + //
                                "continually beaten upon by the waves. The soil was barren, scarcely\r\n" + //
                                "affording pasture for a few miserable cows, and oatmeal for its\r\n" + //
                                "inhabitants, which consisted of five persons, whose gaunt and scraggy limbs\r\n" + //
                                "gave tokens of their miserable fare. Vegetables and bread, when they\r\n" + //
                                "indulged in such luxuries, and even fresh water, was to be procured from\r\n" + //
                                "the mainland, which was about five miles distant.\r\n" + //
                                "\r\n" + //
                                "On the whole island there were but three miserable huts, and one of\r\n" + //
                                "these was vacant when I arrived. This I hired. It contained but two\r\n" + //
                                "rooms, and these exhibited all the squalidness of the most miserable\r\n" + //
                                "penury. The thatch had fallen in, the walls were unplastered, and the\r\n" + //
                                "door was off its hinges. I ordered it to be repaired, bought some\r\n" + //
                                "furniture, and took possession, an incident which would doubtless have\r\n" + //
                                "occasioned some surprise had not all the senses of the cottagers been\r\n" + //
                                "benumbed by want and squalid poverty. As it was, I lived ungazed at\r\n" + //
                                "and unmolested, hardly thanked for the pittance of food and clothes\r\n" + //
                                "which I gave, so much does suffering blunt even the coarsest sensations\r\n" + //
                                "of men.\r\n" + //
                                "\r\n" + //
                                "In this retreat I devoted the morning to labour; but in the evening,\r\n" + //
                                "when the weather permitted, I walked on the stony beach of the sea to\r\n" + //
                                "listen to the waves as they roared and dashed at my feet. It was a\r\n" + //
                                "monotonous yet ever-changing scene. I thought of Switzerland; it was\r\n" + //
                                "far different from this desolate and appalling landscape. Its hills\r\n" + //
                                "are covered with vines, and its cottages are scattered thickly in the\r\n" + //
                                "plains. Its fair lakes reflect a blue and gentle sky, and when\r\n" + //
                                "troubled by the winds, their tumult is but as the play of a lively\r\n" + //
                                "infant when compared to the roarings of the giant ocean.\r\n" + //
                                "\r\n" + //
                                "In this manner I distributed my occupations when I first arrived, but\r\n" + //
                                "as I proceeded in my labour, it became every day more horrible and\r\n" + //
                                "irksome to me. Sometimes I could not prevail on myself to enter my\r\n" + //
                                "laboratory for several days, and at other times I toiled day and night\r\n" + //
                                "in order to complete my work. It was, indeed, a filthy process in\r\n" + //
                                "which I was engaged. During my first experiment, a kind of\r\n" + //
                                "enthusiastic frenzy had blinded me to the horror of my employment; my\r\n" + //
                                "mind was intently fixed on the consummation of my labour, and my eyes\r\n" + //
                                "were shut to the horror of my proceedings. But now I went to it in\r\n" + //
                                "cold blood, and my heart often sickened at the work of my hands.\r\n" + //
                                "\r\n" + //
                                "Thus situated, employed in the most detestable occupation, immersed in\r\n" + //
                                "a solitude where nothing could for an instant call my attention from\r\n" + //
                                "the actual scene in which I was engaged, my spirits became unequal; I\r\n" + //
                                "grew restless and nervous. Every moment I feared to meet my\r\n" + //
                                "persecutor. Sometimes I sat with my eyes fixed on the ground, fearing\r\n" + //
                                "to raise them lest they should encounter the object which I so much\r\n" + //
                                "dreaded to behold. I feared to wander from the sight of my fellow\r\n" + //
                                "creatures lest when alone he should come to claim his companion.\r\n" + //
                                "\r\n" + //
                                "In the mean time I worked on, and my labour was already considerably\r\n" + //
                                "advanced. I looked towards its completion with a tremulous and eager\r\n" + //
                                "hope, which I dared not trust myself to question but which was\r\n" + //
                                "intermixed with obscure forebodings of evil that made my heart sicken\r\n" + //
                                "in my bosom.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 20\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "I sat one evening in my laboratory; the sun had set, and the moon was just\r\n" + //
                                "rising from the sea; I had not sufficient light for my employment, and I\r\n" + //
                                "remained idle, in a pause of consideration of whether I should leave my\r\n" + //
                                "labour for the night or hasten its conclusion by an unremitting attention\r\n" + //
                                "to it. As I sat, a train of reflection occurred to me which led me to\r\n" + //
                                "consider the effects of what I was now doing. Three years before, I was\r\n" + //
                                "engaged in the same manner and had created a fiend whose unparalleled\r\n" + //
                                "barbarity had desolated my heart and filled it for ever with the bitterest\r\n" + //
                                "remorse. I was now about to form another being of whose dispositions I was\r\n" + //
                                "alike ignorant; she might become ten thousand times more malignant than her\r\n" + //
                                "mate and delight, for its own sake, in murder and wretchedness. He had\r\n" + //
                                "sworn to quit the neighbourhood of man and hide himself in deserts, but she\r\n" + //
                                "had not; and she, who in all probability was to become a thinking and\r\n" + //
                                "reasoning animal, might refuse to comply with a compact made before her\r\n" + //
                                "creation. They might even hate each other; the creature who already lived\r\n" + //
                                "loathed his own deformity, and might he not conceive a greater abhorrence\r\n" + //
                                "for it when it came before his eyes in the female form? She also might turn\r\n" + //
                                "with disgust from him to the superior beauty of man; she might quit him,\r\n" + //
                                "and he be again alone, exasperated by the fresh provocation of being\r\n" + //
                                "deserted by one of his own species.\r\n" + //
                                "\r\n" + //
                                "Even if they were to leave Europe and inhabit the deserts of the new world,\r\n" + //
                                "yet one of the first results of those sympathies for which the dæmon\r\n" + //
                                "thirsted would be children, and a race of devils would be propagated upon\r\n" + //
                                "the earth who might make the very existence of the species of man a\r\n" + //
                                "condition precarious and full of terror. Had I right, for my own benefit,\r\n" + //
                                "to inflict this curse upon everlasting generations? I had before been moved\r\n" + //
                                "by the sophisms of the being I had created; I had been struck senseless by\r\n" + //
                                "his fiendish threats; but now, for the first time, the wickedness of my\r\n" + //
                                "promise burst upon me; I shuddered to think that future ages might curse me\r\n" + //
                                "as their pest, whose selfishness had not hesitated to buy its own peace at\r\n" + //
                                "the price, perhaps, of the existence of the whole human race.\r\n" + //
                                "\r\n" + //
                                "I trembled and my heart failed within me, when, on looking up, I saw by\r\n" + //
                                "the light of the moon the dæmon at the casement. A ghastly grin\r\n" + //
                                "wrinkled his lips as he gazed on me, where I sat fulfilling the task\r\n" + //
                                "which he had allotted to me. Yes, he had followed me in my travels; he\r\n" + //
                                "had loitered in forests, hid himself in caves, or taken refuge in wide\r\n" + //
                                "and desert heaths; and he now came to mark my progress and claim the\r\n" + //
                                "fulfilment of my promise.\r\n" + //
                                "\r\n" + //
                                "As I looked on him, his countenance expressed the utmost extent of\r\n" + //
                                "malice and treachery. I thought with a sensation of madness on my\r\n" + //
                                "promise of creating another like to him, and trembling with passion,\r\n" + //
                                "tore to pieces the thing on which I was engaged. The wretch saw me\r\n" + //
                                "destroy the creature on whose future existence he depended for\r\n" + //
                                "happiness, and with a howl of devilish despair and revenge, withdrew.\r\n" + //
                                "\r\n" + //
                                "I left the room, and locking the door, made a solemn vow in my own\r\n" + //
                                "heart never to resume my labours; and then, with trembling steps, I\r\n" + //
                                "sought my own apartment. I was alone; none were near me to dissipate\r\n" + //
                                "the gloom and relieve me from the sickening oppression of the most\r\n" + //
                                "terrible reveries.\r\n" + //
                                "\r\n" + //
                                "Several hours passed, and I remained near my window gazing on the sea;\r\n" + //
                                "it was almost motionless, for the winds were hushed, and all nature\r\n" + //
                                "reposed under the eye of the quiet moon. A few fishing vessels alone\r\n" + //
                                "specked the water, and now and then the gentle breeze wafted the sound\r\n" + //
                                "of voices as the fishermen called to one another. I felt the silence,\r\n" + //
                                "although I was hardly conscious of its extreme profundity, until my ear\r\n" + //
                                "was suddenly arrested by the paddling of oars near the shore, and a\r\n" + //
                                "person landed close to my house.\r\n" + //
                                "\r\n" + //
                                "In a few minutes after, I heard the creaking of my door, as if some one\r\n" + //
                                "endeavoured to open it softly. I trembled from head to foot; I felt a\r\n" + //
                                "presentiment of who it was and wished to rouse one of the peasants who\r\n" + //
                                "dwelt in a cottage not far from mine; but I was overcome by the sensation\r\n" + //
                                "of helplessness, so often felt in frightful dreams, when you in vain\r\n" + //
                                "endeavour to fly from an impending danger, and was rooted to the spot.\r\n" + //
                                "\r\n" + //
                                "Presently I heard the sound of footsteps along the passage; the door\r\n" + //
                                "opened, and the wretch whom I dreaded appeared. Shutting the door, he\r\n" + //
                                "approached me and said in a smothered voice,\r\n" + //
                                "\r\n" + //
                                "“You have destroyed the work which you began; what is it that you\r\n" + //
                                "intend? Do you dare to break your promise? I have endured toil and misery;\r\n" + //
                                "I left Switzerland with you; I crept along the shores of the Rhine, among\r\n" + //
                                "its willow islands and over the summits of its hills. I have dwelt many\r\n" + //
                                "months in the heaths of England and among the deserts of Scotland. I have\r\n" + //
                                "endured incalculable fatigue, and cold, and hunger; do you dare destroy my\r\n" + //
                                "hopes?”\r\n" + //
                                "\r\n" + //
                                "“Begone! I do break my promise; never will I create another like\r\n" + //
                                "yourself, equal in deformity and wickedness.”\r\n" + //
                                "\r\n" + //
                                "“Slave, I before reasoned with you, but you have proved yourself\r\n" + //
                                "unworthy of my condescension. Remember that I have power; you believe\r\n" + //
                                "yourself miserable, but I can make you so wretched that the light of\r\n" + //
                                "day will be hateful to you. You are my creator, but I am your master;\r\n" + //
                                "obey!”\r\n" + //
                                "\r\n" + //
                                "“The hour of my irresolution is past, and the period of your power is\r\n" + //
                                "arrived. Your threats cannot move me to do an act of wickedness; but\r\n" + //
                                "they confirm me in a determination of not creating you a companion in\r\n" + //
                                "vice. Shall I, in cool blood, set loose upon the earth a dæmon whose\r\n" + //
                                "delight is in death and wretchedness? Begone! I am firm, and your\r\n" + //
                                "words will only exasperate my rage.”\r\n" + //
                                "\r\n" + //
                                "The monster saw my determination in my face and gnashed his teeth in the\r\n" + //
                                "impotence of anger. “Shall each man,” cried he, “find a\r\n" + //
                                "wife for his bosom, and each beast have his mate, and I be alone? I had\r\n" + //
                                "feelings of affection, and they were requited by detestation and scorn.\r\n" + //
                                "Man! You may hate, but beware! Your hours will pass in dread and misery,\r\n" + //
                                "and soon the bolt will fall which must ravish from you your happiness for\r\n" + //
                                "ever. Are you to be happy while I grovel in the intensity of my\r\n" + //
                                "wretchedness? You can blast my other passions, but revenge\r\n" + //
                                "remains—revenge, henceforth dearer than light or food! I may die, but\r\n" + //
                                "first you, my tyrant and tormentor, shall curse the sun that gazes on your\r\n" + //
                                "misery. Beware, for I am fearless and therefore powerful. I will watch with\r\n" + //
                                "the wiliness of a snake, that I may sting with its venom. Man, you shall\r\n" + //
                                "repent of the injuries you inflict.”\r\n" + //
                                "\r\n" + //
                                "“Devil, cease; and do not poison the air with these sounds of malice.\r\n" + //
                                "I have declared my resolution to you, and I am no coward to bend\r\n" + //
                                "beneath words. Leave me; I am inexorable.”\r\n" + //
                                "\r\n" + //
                                "“It is well. I go; but remember, I shall be with you on your\r\n" + //
                                "wedding-night.”\r\n" + //
                                "\r\n" + //
                                "I started forward and exclaimed, “Villain! Before you sign my\r\n" + //
                                "death-warrant, be sure that you are yourself safe.”\r\n" + //
                                "\r\n" + //
                                "I would have seized him, but he eluded me and quitted the house with\r\n" + //
                                "precipitation. In a few moments I saw him in his boat, which shot\r\n" + //
                                "across the waters with an arrowy swiftness and was soon lost amidst the\r\n" + //
                                "waves.\r\n" + //
                                "\r\n" + //
                                "All was again silent, but his words rang in my ears. I burned with rage to\r\n" + //
                                "pursue the murderer of my peace and precipitate him into the ocean. I\r\n" + //
                                "walked up and down my room hastily and perturbed, while my imagination\r\n" + //
                                "conjured up a thousand images to torment and sting me. Why had I not\r\n" + //
                                "followed him and closed with him in mortal strife? But I had suffered him\r\n" + //
                                "to depart, and he had directed his course towards the mainland. I shuddered\r\n" + //
                                "to think who might be the next victim sacrificed to his insatiate revenge.\r\n" + //
                                "And then I thought again of his words—“_I will be with you on\r\n" + //
                                "your wedding-night._” That, then, was the period fixed for the\r\n" + //
                                "fulfilment of my destiny. In that hour I should die and at once satisfy and\r\n" + //
                                "extinguish his malice. The prospect did not move me to fear; yet when I\r\n" + //
                                "thought of my beloved Elizabeth, of her tears and endless sorrow, when she\r\n" + //
                                "should find her lover so barbarously snatched from her, tears, the first I\r\n" + //
                                "had shed for many months, streamed from my eyes, and I resolved not to fall\r\n" + //
                                "before my enemy without a bitter struggle.\r\n" + //
                                "\r\n" + //
                                "The night passed away, and the sun rose from the ocean; my feelings became\r\n" + //
                                "calmer, if it may be called calmness when the violence of rage sinks into\r\n" + //
                                "the depths of despair. I left the house, the horrid scene of the last\r\n" + //
                                "night’s contention, and walked on the beach of the sea, which I\r\n" + //
                                "almost regarded as an insuperable barrier between me and my fellow\r\n" + //
                                "creatures; nay, a wish that such should prove the fact stole across me. I\r\n" + //
                                "desired that I might pass my life on that barren rock, wearily, it is true,\r\n" + //
                                "but uninterrupted by any sudden shock of misery. If I returned, it was to\r\n" + //
                                "be sacrificed or to see those whom I most loved die under the grasp of a\r\n" + //
                                "dæmon whom I had myself created.\r\n" + //
                                "\r\n" + //
                                "I walked about the isle like a restless spectre, separated from all it\r\n" + //
                                "loved and miserable in the separation. When it became noon, and the\r\n" + //
                                "sun rose higher, I lay down on the grass and was overpowered by a deep\r\n" + //
                                "sleep. I had been awake the whole of the preceding night, my nerves\r\n" + //
                                "were agitated, and my eyes inflamed by watching and misery. The sleep\r\n" + //
                                "into which I now sank refreshed me; and when I awoke, I again felt as\r\n" + //
                                "if I belonged to a race of human beings like myself, and I began to\r\n" + //
                                "reflect upon what had passed with greater composure; yet still the\r\n" + //
                                "words of the fiend rang in my ears like a death-knell; they appeared\r\n" + //
                                "like a dream, yet distinct and oppressive as a reality.\r\n" + //
                                "\r\n" + //
                                "The sun had far descended, and I still sat on the shore, satisfying my\r\n" + //
                                "appetite, which had become ravenous, with an oaten cake, when I saw a\r\n" + //
                                "fishing-boat land close to me, and one of the men brought me a packet;\r\n" + //
                                "it contained letters from Geneva, and one from Clerval entreating me to\r\n" + //
                                "join him. He said that he was wearing away his time fruitlessly where\r\n" + //
                                "he was, that letters from the friends he had formed in London desired\r\n" + //
                                "his return to complete the negotiation they had entered into for his\r\n" + //
                                "Indian enterprise. He could not any longer delay his departure; but as\r\n" + //
                                "his journey to London might be followed, even sooner than he now\r\n" + //
                                "conjectured, by his longer voyage, he entreated me to bestow as much of\r\n" + //
                                "my society on him as I could spare. He besought me, therefore, to\r\n" + //
                                "leave my solitary isle and to meet him at Perth, that we might proceed\r\n" + //
                                "southwards together. This letter in a degree recalled me to life, and\r\n" + //
                                "I determined to quit my island at the expiration of two days.\r\n" + //
                                "\r\n" + //
                                "Yet, before I departed, there was a task to perform, on which I shuddered\r\n" + //
                                "to reflect; I must pack up my chemical instruments, and for that purpose I\r\n" + //
                                "must enter the room which had been the scene of my odious work, and I must\r\n" + //
                                "handle those utensils the sight of which was sickening to me. The next\r\n" + //
                                "morning, at daybreak, I summoned sufficient courage and unlocked the door\r\n" + //
                                "of my laboratory. The remains of the half-finished creature, whom I had\r\n" + //
                                "destroyed, lay scattered on the floor, and I almost felt as if I had\r\n" + //
                                "mangled the living flesh of a human being. I paused to collect myself and\r\n" + //
                                "then entered the chamber. With trembling hand I conveyed the instruments\r\n" + //
                                "out of the room, but I reflected that I ought not to leave the relics of my\r\n" + //
                                "work to excite the horror and suspicion of the peasants; and I accordingly\r\n" + //
                                "put them into a basket, with a great quantity of stones, and laying them\r\n" + //
                                "up, determined to throw them into the sea that very night; and in the\r\n" + //
                                "meantime I sat upon the beach, employed in cleaning and arranging my\r\n" + //
                                "chemical apparatus.\r\n" + //
                                "\r\n" + //
                                "Nothing could be more complete than the alteration that had taken place\r\n" + //
                                "in my feelings since the night of the appearance of the dæmon. I had\r\n" + //
                                "before regarded my promise with a gloomy despair as a thing that, with\r\n" + //
                                "whatever consequences, must be fulfilled; but I now felt as if a film\r\n" + //
                                "had been taken from before my eyes and that I for the first time saw\r\n" + //
                                "clearly. The idea of renewing my labours did not for one instant occur\r\n" + //
                                "to me; the threat I had heard weighed on my thoughts, but I did not\r\n" + //
                                "reflect that a voluntary act of mine could avert it. I had resolved in\r\n" + //
                                "my own mind that to create another like the fiend I had first made\r\n" + //
                                "would be an act of the basest and most atrocious selfishness, and I\r\n" + //
                                "banished from my mind every thought that could lead to a different\r\n" + //
                                "conclusion.\r\n" + //
                                "\r\n" + //
                                "Between two and three in the morning the moon rose; and I then, putting my\r\n" + //
                                "basket aboard a little skiff, sailed out about four miles from the shore.\r\n" + //
                                "The scene was perfectly solitary; a few boats were returning towards land,\r\n" + //
                                "but I sailed away from them. I felt as if I was about the commission of a\r\n" + //
                                "dreadful crime and avoided with shuddering anxiety any encounter with my\r\n" + //
                                "fellow creatures. At one time the moon, which had before been clear, was\r\n" + //
                                "suddenly overspread by a thick cloud, and I took advantage of the moment of\r\n" + //
                                "darkness and cast my basket into the sea; I listened to the gurgling sound\r\n" + //
                                "as it sank and then sailed away from the spot. The sky became clouded, but\r\n" + //
                                "the air was pure, although chilled by the northeast breeze that was then\r\n" + //
                                "rising. But it refreshed me and filled me with such agreeable sensations\r\n" + //
                                "that I resolved to prolong my stay on the water, and fixing the rudder in a\r\n" + //
                                "direct position, stretched myself at the bottom of the boat. Clouds hid the\r\n" + //
                                "moon, everything was obscure, and I heard only the sound of the boat as its\r\n" + //
                                "keel cut through the waves; the murmur lulled me, and in a short time I\r\n" + //
                                "slept soundly.\r\n" + //
                                "\r\n" + //
                                "I do not know how long I remained in this situation, but when I awoke I\r\n" + //
                                "found that the sun had already mounted considerably. The wind was high, and\r\n" + //
                                "the waves continually threatened the safety of my little skiff. I found\r\n" + //
                                "that the wind was northeast and must have driven me far from the coast from\r\n" + //
                                "which I had embarked. I endeavoured to change my course but quickly found\r\n" + //
                                "that if I again made the attempt the boat would be instantly filled with\r\n" + //
                                "water. Thus situated, my only resource was to drive before the wind. I\r\n" + //
                                "confess that I felt a few sensations of terror. I had no compass with me\r\n" + //
                                "and was so slenderly acquainted with the geography of this part of the\r\n" + //
                                "world that the sun was of little benefit to me. I might be driven into the\r\n" + //
                                "wide Atlantic and feel all the tortures of starvation or be swallowed up in\r\n" + //
                                "the immeasurable waters that roared and buffeted around me. I had already\r\n" + //
                                "been out many hours and felt the torment of a burning thirst, a prelude to\r\n" + //
                                "my other sufferings. I looked on the heavens, which were covered by clouds\r\n" + //
                                "that flew before the wind, only to be replaced by others; I looked upon the\r\n" + //
                                "sea; it was to be my grave. “Fiend,” I exclaimed, “your\r\n" + //
                                "task is already fulfilled!” I thought of Elizabeth, of my father, and\r\n" + //
                                "of Clerval—all left behind, on whom the monster might satisfy his\r\n" + //
                                "sanguinary and merciless passions. This idea plunged me into a reverie so\r\n" + //
                                "despairing and frightful that even now, when the scene is on the point of\r\n" + //
                                "closing before me for ever, I shudder to reflect on it.\r\n" + //
                                "\r\n" + //
                                "Some hours passed thus; but by degrees, as the sun declined towards the\r\n" + //
                                "horizon, the wind died away into a gentle breeze and the sea became\r\n" + //
                                "free from breakers. But these gave place to a heavy swell; I felt sick\r\n" + //
                                "and hardly able to hold the rudder, when suddenly I saw a line of high\r\n" + //
                                "land towards the south.\r\n" + //
                                "\r\n" + //
                                "Almost spent, as I was, by fatigue and the dreadful suspense I endured\r\n" + //
                                "for several hours, this sudden certainty of life rushed like a flood of\r\n" + //
                                "warm joy to my heart, and tears gushed from my eyes.\r\n" + //
                                "\r\n" + //
                                "How mutable are our feelings, and how strange is that clinging love we have\r\n" + //
                                "of life even in the excess of misery! I constructed another sail with a\r\n" + //
                                "part of my dress and eagerly steered my course towards the land. It had a\r\n" + //
                                "wild and rocky appearance, but as I approached nearer I easily perceived\r\n" + //
                                "the traces of cultivation. I saw vessels near the shore and found myself\r\n" + //
                                "suddenly transported back to the neighbourhood of civilised man. I\r\n" + //
                                "carefully traced the windings of the land and hailed a steeple which I at\r\n" + //
                                "length saw issuing from behind a small promontory. As I was in a state of\r\n" + //
                                "extreme debility, I resolved to sail directly towards the town, as a place\r\n" + //
                                "where I could most easily procure nourishment. Fortunately I had money with\r\n" + //
                                "me. As I turned the promontory I perceived a small neat town and a good\r\n" + //
                                "harbour, which I entered, my heart bounding with joy at my unexpected\r\n" + //
                                "escape.\r\n" + //
                                "\r\n" + //
                                "As I was occupied in fixing the boat and arranging the sails, several\r\n" + //
                                "people crowded towards the spot. They seemed much surprised at my\r\n" + //
                                "appearance, but instead of offering me any assistance, whispered\r\n" + //
                                "together with gestures that at any other time might have produced in me\r\n" + //
                                "a slight sensation of alarm. As it was, I merely remarked that they\r\n" + //
                                "spoke English, and I therefore addressed them in that language. “My\r\n" + //
                                "good friends,” said I, “will you be so kind as to tell me the name of\r\n" + //
                                "this town and inform me where I am?”\r\n" + //
                                "\r\n" + //
                                "“You will know that soon enough,” replied a man with a hoarse voice.\r\n" + //
                                "“Maybe you are come to a place that will not prove much to your taste,\r\n" + //
                                "but you will not be consulted as to your quarters, I promise you.”\r\n" + //
                                "\r\n" + //
                                "I was exceedingly surprised on receiving so rude an answer from a\r\n" + //
                                "stranger, and I was also disconcerted on perceiving the frowning and\r\n" + //
                                "angry countenances of his companions. “Why do you answer me so\r\n" + //
                                "roughly?” I replied. “Surely it is not the custom of Englishmen to\r\n" + //
                                "receive strangers so inhospitably.”\r\n" + //
                                "\r\n" + //
                                "“I do not know,” said the man, “what the custom of the\r\n" + //
                                "English may be, but it is the custom of the Irish to hate villains.”\r\n" + //
                                "\r\n" + //
                                "While this strange dialogue continued, I perceived the crowd rapidly\r\n" + //
                                "increase. Their faces expressed a mixture of curiosity and anger, which\r\n" + //
                                "annoyed and in some degree alarmed me. I inquired the way to the inn, but\r\n" + //
                                "no one replied. I then moved forward, and a murmuring sound arose from the\r\n" + //
                                "crowd as they followed and surrounded me, when an ill-looking man\r\n" + //
                                "approaching tapped me on the shoulder and said, “Come, sir, you must\r\n" + //
                                "follow me to Mr. Kirwin’s to give an account of yourself.”\r\n" + //
                                "\r\n" + //
                                "“Who is Mr. Kirwin? Why am I to give an account of myself? Is not\r\n" + //
                                "this a free country?”\r\n" + //
                                "\r\n" + //
                                "“Ay, sir, free enough for honest folks. Mr. Kirwin is a magistrate,\r\n" + //
                                "and you are to give an account of the death of a gentleman who was\r\n" + //
                                "found murdered here last night.”\r\n" + //
                                "\r\n" + //
                                "This answer startled me, but I presently recovered myself. I was innocent;\r\n" + //
                                "that could easily be proved; accordingly I followed my conductor in silence\r\n" + //
                                "and was led to one of the best houses in the town. I was ready to sink from\r\n" + //
                                "fatigue and hunger, but being surrounded by a crowd, I thought it politic\r\n" + //
                                "to rouse all my strength, that no physical debility might be construed into\r\n" + //
                                "apprehension or conscious guilt. Little did I then expect the calamity that\r\n" + //
                                "was in a few moments to overwhelm me and extinguish in horror and despair\r\n" + //
                                "all fear of ignominy or death.\r\n" + //
                                "\r\n" + //
                                "I must pause here, for it requires all my fortitude to recall the memory of\r\n" + //
                                "the frightful events which I am about to relate, in proper detail, to my\r\n" + //
                                "recollection.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 21\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "I was soon introduced into the presence of the magistrate, an old\r\n" + //
                                "benevolent man with calm and mild manners. He looked upon me, however,\r\n" + //
                                "with some degree of severity, and then, turning towards my conductors,\r\n" + //
                                "he asked who appeared as witnesses on this occasion.\r\n" + //
                                "\r\n" + //
                                "About half a dozen men came forward; and, one being selected by the\r\n" + //
                                "magistrate, he deposed that he had been out fishing the night before with\r\n" + //
                                "his son and brother-in-law, Daniel Nugent, when, about ten o’clock,\r\n" + //
                                "they observed a strong northerly blast rising, and they accordingly put in\r\n" + //
                                "for port. It was a very dark night, as the moon had not yet risen; they did\r\n" + //
                                "not land at the harbour, but, as they had been accustomed, at a creek about\r\n" + //
                                "two miles below. He walked on first, carrying a part of the fishing tackle,\r\n" + //
                                "and his companions followed him at some distance. As he was proceeding\r\n" + //
                                "along the sands, he struck his foot against something and fell at his\r\n" + //
                                "length on the ground. His companions came up to assist him, and by the\r\n" + //
                                "light of their lantern they found that he had fallen on the body of a man,\r\n" + //
                                "who was to all appearance dead. Their first supposition was that it was the\r\n" + //
                                "corpse of some person who had been drowned and was thrown on shore by the\r\n" + //
                                "waves, but on examination they found that the clothes were not wet and even\r\n" + //
                                "that the body was not then cold. They instantly carried it to the cottage\r\n" + //
                                "of an old woman near the spot and endeavoured, but in vain, to restore it\r\n" + //
                                "to life. It appeared to be a handsome young man, about five and twenty\r\n" + //
                                "years of age. He had apparently been strangled, for there was no sign of\r\n" + //
                                "any violence except the black mark of fingers on his neck.\r\n" + //
                                "\r\n" + //
                                "The first part of this deposition did not in the least interest me, but\r\n" + //
                                "when the mark of the fingers was mentioned I remembered the murder of\r\n" + //
                                "my brother and felt myself extremely agitated; my limbs trembled, and a\r\n" + //
                                "mist came over my eyes, which obliged me to lean on a chair for\r\n" + //
                                "support. The magistrate observed me with a keen eye and of course drew\r\n" + //
                                "an unfavourable augury from my manner.\r\n" + //
                                "\r\n" + //
                                "The son confirmed his father’s account, but when Daniel Nugent was\r\n" + //
                                "called he swore positively that just before the fall of his companion, he\r\n" + //
                                "saw a boat, with a single man in it, at a short distance from the shore;\r\n" + //
                                "and as far as he could judge by the light of a few stars, it was the same\r\n" + //
                                "boat in which I had just landed.\r\n" + //
                                "\r\n" + //
                                "A woman deposed that she lived near the beach and was standing at the door\r\n" + //
                                "of her cottage, waiting for the return of the fishermen, about an hour\r\n" + //
                                "before she heard of the discovery of the body, when she saw a boat with\r\n" + //
                                "only one man in it push off from that part of the shore where the corpse\r\n" + //
                                "was afterwards found.\r\n" + //
                                "\r\n" + //
                                "Another woman confirmed the account of the fishermen having brought the\r\n" + //
                                "body into her house; it was not cold. They put it into a bed and\r\n" + //
                                "rubbed it, and Daniel went to the town for an apothecary, but life was\r\n" + //
                                "quite gone.\r\n" + //
                                "\r\n" + //
                                "Several other men were examined concerning my landing, and they agreed\r\n" + //
                                "that, with the strong north wind that had arisen during the night, it\r\n" + //
                                "was very probable that I had beaten about for many hours and had been\r\n" + //
                                "obliged to return nearly to the same spot from which I had departed.\r\n" + //
                                "Besides, they observed that it appeared that I had brought the body\r\n" + //
                                "from another place, and it was likely that as I did not appear to know\r\n" + //
                                "the shore, I might have put into the harbour ignorant of the distance\r\n" + //
                                "of the town of —— from the place where I had deposited the corpse.\r\n" + //
                                "\r\n" + //
                                "Mr. Kirwin, on hearing this evidence, desired that I should be taken into\r\n" + //
                                "the room where the body lay for interment, that it might be observed what\r\n" + //
                                "effect the sight of it would produce upon me. This idea was probably\r\n" + //
                                "suggested by the extreme agitation I had exhibited when the mode of the\r\n" + //
                                "murder had been described. I was accordingly conducted, by the magistrate\r\n" + //
                                "and several other persons, to the inn. I could not help being struck by the\r\n" + //
                                "strange coincidences that had taken place during this eventful night; but,\r\n" + //
                                "knowing that I had been conversing with several persons in the island I had\r\n" + //
                                "inhabited about the time that the body had been found, I was perfectly\r\n" + //
                                "tranquil as to the consequences of the affair.\r\n" + //
                                "\r\n" + //
                                "I entered the room where the corpse lay and was led up to the coffin. How\r\n" + //
                                "can I describe my sensations on beholding it? I feel yet parched with\r\n" + //
                                "horror, nor can I reflect on that terrible moment without shuddering and\r\n" + //
                                "agony. The examination, the presence of the magistrate and witnesses,\r\n" + //
                                "passed like a dream from my memory when I saw the lifeless form of Henry\r\n" + //
                                "Clerval stretched before me. I gasped for breath, and throwing myself on\r\n" + //
                                "the body, I exclaimed, “Have my murderous machinations deprived you\r\n" + //
                                "also, my dearest Henry, of life? Two I have already destroyed; other\r\n" + //
                                "victims await their destiny; but you, Clerval, my friend, my\r\n" + //
                                "benefactor—”\r\n" + //
                                "\r\n" + //
                                "The human frame could no longer support the agonies that I endured, and\r\n" + //
                                "I was carried out of the room in strong convulsions.\r\n" + //
                                "\r\n" + //
                                "A fever succeeded to this. I lay for two months on the point of death; my\r\n" + //
                                "ravings, as I afterwards heard, were frightful; I called myself the\r\n" + //
                                "murderer of William, of Justine, and of Clerval. Sometimes I entreated my\r\n" + //
                                "attendants to assist me in the destruction of the fiend by whom I was\r\n" + //
                                "tormented; and at others I felt the fingers of the monster already grasping\r\n" + //
                                "my neck, and screamed aloud with agony and terror. Fortunately, as I spoke\r\n" + //
                                "my native language, Mr. Kirwin alone understood me; but my gestures and\r\n" + //
                                "bitter cries were sufficient to affright the other witnesses.\r\n" + //
                                "\r\n" + //
                                "Why did I not die? More miserable than man ever was before, why did I not\r\n" + //
                                "sink into forgetfulness and rest? Death snatches away many blooming\r\n" + //
                                "children, the only hopes of their doting parents; how many brides and\r\n" + //
                                "youthful lovers have been one day in the bloom of health and hope, and the\r\n" + //
                                "next a prey for worms and the decay of the tomb! Of what materials was I\r\n" + //
                                "made that I could thus resist so many shocks, which, like the turning of\r\n" + //
                                "the wheel, continually renewed the torture?\r\n" + //
                                "\r\n" + //
                                "But I was doomed to live and in two months found myself as awaking from\r\n" + //
                                "a dream, in a prison, stretched on a wretched bed, surrounded by\r\n" + //
                                "gaolers, turnkeys, bolts, and all the miserable apparatus of a dungeon.\r\n" + //
                                "It was morning, I remember, when I thus awoke to understanding; I had\r\n" + //
                                "forgotten the particulars of what had happened and only felt as if some\r\n" + //
                                "great misfortune had suddenly overwhelmed me; but when I looked around\r\n" + //
                                "and saw the barred windows and the squalidness of the room in which I\r\n" + //
                                "was, all flashed across my memory and I groaned bitterly.\r\n" + //
                                "\r\n" + //
                                "This sound disturbed an old woman who was sleeping in a chair beside\r\n" + //
                                "me. She was a hired nurse, the wife of one of the turnkeys, and her\r\n" + //
                                "countenance expressed all those bad qualities which often characterise\r\n" + //
                                "that class. The lines of her face were hard and rude, like that of\r\n" + //
                                "persons accustomed to see without sympathising in sights of misery. Her\r\n" + //
                                "tone expressed her entire indifference; she addressed me in English,\r\n" + //
                                "and the voice struck me as one that I had heard during my sufferings.\r\n" + //
                                "\r\n" + //
                                "“Are you better now, sir?” said she.\r\n" + //
                                "\r\n" + //
                                "I replied in the same language, with a feeble voice, “I believe I am;\r\n" + //
                                "but if it be all true, if indeed I did not dream, I am sorry that I am\r\n" + //
                                "still alive to feel this misery and horror.”\r\n" + //
                                "\r\n" + //
                                "“For that matter,” replied the old woman, “if you mean about the\r\n" + //
                                "gentleman you murdered, I believe that it were better for you if you\r\n" + //
                                "were dead, for I fancy it will go hard with you! However, that’s none\r\n" + //
                                "of my business; I am sent to nurse you and get you well; I do my duty\r\n" + //
                                "with a safe conscience; it were well if everybody did the same.”\r\n" + //
                                "\r\n" + //
                                "I turned with loathing from the woman who could utter so unfeeling a\r\n" + //
                                "speech to a person just saved, on the very edge of death; but I felt\r\n" + //
                                "languid and unable to reflect on all that had passed. The whole series\r\n" + //
                                "of my life appeared to me as a dream; I sometimes doubted if indeed it\r\n" + //
                                "were all true, for it never presented itself to my mind with the force\r\n" + //
                                "of reality.\r\n" + //
                                "\r\n" + //
                                "As the images that floated before me became more distinct, I grew\r\n" + //
                                "feverish; a darkness pressed around me; no one was near me who soothed\r\n" + //
                                "me with the gentle voice of love; no dear hand supported me. The\r\n" + //
                                "physician came and prescribed medicines, and the old woman prepared\r\n" + //
                                "them for me; but utter carelessness was visible in the first, and the\r\n" + //
                                "expression of brutality was strongly marked in the visage of the\r\n" + //
                                "second. Who could be interested in the fate of a murderer but the\r\n" + //
                                "hangman who would gain his fee?\r\n" + //
                                "\r\n" + //
                                "These were my first reflections, but I soon learned that Mr. Kirwin had\r\n" + //
                                "shown me extreme kindness. He had caused the best room in the prison\r\n" + //
                                "to be prepared for me (wretched indeed was the best); and it was he who\r\n" + //
                                "had provided a physician and a nurse. It is true, he seldom came to\r\n" + //
                                "see me, for although he ardently desired to relieve the sufferings of\r\n" + //
                                "every human creature, he did not wish to be present at the agonies and\r\n" + //
                                "miserable ravings of a murderer. He came, therefore, sometimes to see\r\n" + //
                                "that I was not neglected, but his visits were short and with long\r\n" + //
                                "intervals.\r\n" + //
                                "\r\n" + //
                                "One day, while I was gradually recovering, I was seated in a chair, my eyes\r\n" + //
                                "half open and my cheeks livid like those in death. I was overcome by gloom\r\n" + //
                                "and misery and often reflected I had better seek death than desire to\r\n" + //
                                "remain in a world which to me was replete with wretchedness. At one time I\r\n" + //
                                "considered whether I should not declare myself guilty and suffer the\r\n" + //
                                "penalty of the law, less innocent than poor Justine had been. Such were my\r\n" + //
                                "thoughts when the door of my apartment was opened and Mr. Kirwin entered.\r\n" + //
                                "His countenance expressed sympathy and compassion; he drew a chair close to\r\n" + //
                                "mine and addressed me in French,\r\n" + //
                                "\r\n" + //
                                "“I fear that this place is very shocking to you; can I do anything to\r\n" + //
                                "make you more comfortable?”\r\n" + //
                                "\r\n" + //
                                "“I thank you, but all that you mention is nothing to me; on the whole\r\n" + //
                                "earth there is no comfort which I am capable of receiving.”\r\n" + //
                                "\r\n" + //
                                "“I know that the sympathy of a stranger can be but of little relief to\r\n" + //
                                "one borne down as you are by so strange a misfortune. But you will, I\r\n" + //
                                "hope, soon quit this melancholy abode, for doubtless evidence can\r\n" + //
                                "easily be brought to free you from the criminal charge.”\r\n" + //
                                "\r\n" + //
                                "“That is my least concern; I am, by a course of strange events, become\r\n" + //
                                "the most miserable of mortals. Persecuted and tortured as I am and\r\n" + //
                                "have been, can death be any evil to me?”\r\n" + //
                                "\r\n" + //
                                "“Nothing indeed could be more unfortunate and agonising than the\r\n" + //
                                "strange chances that have lately occurred. You were thrown, by some\r\n" + //
                                "surprising accident, on this shore, renowned for its hospitality,\r\n" + //
                                "seized immediately, and charged with murder. The first sight that was\r\n" + //
                                "presented to your eyes was the body of your friend, murdered in so\r\n" + //
                                "unaccountable a manner and placed, as it were, by some fiend across\r\n" + //
                                "your path.”\r\n" + //
                                "\r\n" + //
                                "As Mr. Kirwin said this, notwithstanding the agitation I endured on\r\n" + //
                                "this retrospect of my sufferings, I also felt considerable surprise at\r\n" + //
                                "the knowledge he seemed to possess concerning me. I suppose some\r\n" + //
                                "astonishment was exhibited in my countenance, for Mr. Kirwin hastened\r\n" + //
                                "to say,\r\n" + //
                                "\r\n" + //
                                "“Immediately upon your being taken ill, all the papers that were on\r\n" + //
                                "your person were brought me, and I examined them that I might discover some\r\n" + //
                                "trace by which I could send to your relations an account of your misfortune\r\n" + //
                                "and illness. I found several letters, and, among others, one which I\r\n" + //
                                "discovered from its commencement to be from your father. I instantly wrote\r\n" + //
                                "to Geneva; nearly two months have elapsed since the departure of my letter.\r\n" + //
                                "But you are ill; even now you tremble; you are unfit for agitation of any\r\n" + //
                                "kind.”\r\n" + //
                                "\r\n" + //
                                "“This suspense is a thousand times worse than the most horrible event;\r\n" + //
                                "tell me what new scene of death has been acted, and whose murder I am\r\n" + //
                                "now to lament?”\r\n" + //
                                "\r\n" + //
                                "“Your family is perfectly well,” said Mr. Kirwin with\r\n" + //
                                "gentleness; “and someone, a friend, is come to visit you.”\r\n" + //
                                "\r\n" + //
                                "I know not by what chain of thought the idea presented itself, but it\r\n" + //
                                "instantly darted into my mind that the murderer had come to mock at my\r\n" + //
                                "misery and taunt me with the death of Clerval, as a new incitement for\r\n" + //
                                "me to comply with his hellish desires. I put my hand before my eyes,\r\n" + //
                                "and cried out in agony,\r\n" + //
                                "\r\n" + //
                                "“Oh! Take him away! I cannot see him; for God’s sake, do not\r\n" + //
                                "let him enter!”\r\n" + //
                                "\r\n" + //
                                "Mr. Kirwin regarded me with a troubled countenance. He could not help\r\n" + //
                                "regarding my exclamation as a presumption of my guilt and said in\r\n" + //
                                "rather a severe tone,\r\n" + //
                                "\r\n" + //
                                "“I should have thought, young man, that the presence of your father\r\n" + //
                                "would have been welcome instead of inspiring such violent repugnance.”\r\n" + //
                                "\r\n" + //
                                "“My father!” cried I, while every feature and every muscle was relaxed\r\n" + //
                                "from anguish to pleasure. “Is my father indeed come? How kind, how\r\n" + //
                                "very kind! But where is he, why does he not hasten to me?”\r\n" + //
                                "\r\n" + //
                                "My change of manner surprised and pleased the magistrate; perhaps he\r\n" + //
                                "thought that my former exclamation was a momentary return of delirium,\r\n" + //
                                "and now he instantly resumed his former benevolence. He rose and\r\n" + //
                                "quitted the room with my nurse, and in a moment my father entered it.\r\n" + //
                                "\r\n" + //
                                "Nothing, at this moment, could have given me greater pleasure than the\r\n" + //
                                "arrival of my father. I stretched out my hand to him and cried,\r\n" + //
                                "\r\n" + //
                                "“Are you then safe—and Elizabeth—and Ernest?”\r\n" + //
                                "\r\n" + //
                                "My father calmed me with assurances of their welfare and endeavoured, by\r\n" + //
                                "dwelling on these subjects so interesting to my heart, to raise my\r\n" + //
                                "desponding spirits; but he soon felt that a prison cannot be the abode of\r\n" + //
                                "cheerfulness. “What a place is this that you inhabit, my son!”\r\n" + //
                                "said he, looking mournfully at the barred windows and wretched appearance\r\n" + //
                                "of the room. “You travelled to seek happiness, but a fatality seems\r\n" + //
                                "to pursue you. And poor Clerval—”\r\n" + //
                                "\r\n" + //
                                "The name of my unfortunate and murdered friend was an agitation too\r\n" + //
                                "great to be endured in my weak state; I shed tears.\r\n" + //
                                "\r\n" + //
                                "“Alas! Yes, my father,” replied I; “some destiny of the\r\n" + //
                                "most horrible kind hangs over me, and I must live to fulfil it, or surely I\r\n" + //
                                "should have died on the coffin of Henry.”\r\n" + //
                                "\r\n" + //
                                "We were not allowed to converse for any length of time, for the\r\n" + //
                                "precarious state of my health rendered every precaution necessary that\r\n" + //
                                "could ensure tranquillity. Mr. Kirwin came in and insisted that my\r\n" + //
                                "strength should not be exhausted by too much exertion. But the\r\n" + //
                                "appearance of my father was to me like that of my good angel, and I\r\n" + //
                                "gradually recovered my health.\r\n" + //
                                "\r\n" + //
                                "As my sickness quitted me, I was absorbed by a gloomy and black\r\n" + //
                                "melancholy that nothing could dissipate. The image of Clerval was\r\n" + //
                                "for ever before me, ghastly and murdered. More than once the agitation\r\n" + //
                                "into which these reflections threw me made my friends dread a dangerous\r\n" + //
                                "relapse. Alas! Why did they preserve so miserable and detested a\r\n" + //
                                "life? It was surely that I might fulfil my destiny, which is now\r\n" + //
                                "drawing to a close. Soon, oh, very soon, will death extinguish these\r\n" + //
                                "throbbings and relieve me from the mighty weight of anguish that bears\r\n" + //
                                "me to the dust; and, in executing the award of justice, I shall also\r\n" + //
                                "sink to rest. Then the appearance of death was distant, although the\r\n" + //
                                "wish was ever present to my thoughts; and I often sat for hours\r\n" + //
                                "motionless and speechless, wishing for some mighty revolution that\r\n" + //
                                "might bury me and my destroyer in its ruins.\r\n" + //
                                "\r\n" + //
                                "The season of the assizes approached. I had already been three months\r\n" + //
                                "in prison, and although I was still weak and in continual danger of a\r\n" + //
                                "relapse, I was obliged to travel nearly a hundred miles to the country\r\n" + //
                                "town where the court was held. Mr. Kirwin charged himself with every\r\n" + //
                                "care of collecting witnesses and arranging my defence. I was spared\r\n" + //
                                "the disgrace of appearing publicly as a criminal, as the case was not\r\n" + //
                                "brought before the court that decides on life and death. The grand\r\n" + //
                                "jury rejected the bill, on its being proved that I was on the Orkney\r\n" + //
                                "Islands at the hour the body of my friend was found; and a fortnight\r\n" + //
                                "after my removal I was liberated from prison.\r\n" + //
                                "\r\n" + //
                                "My father was enraptured on finding me freed from the vexations of a\r\n" + //
                                "criminal charge, that I was again allowed to breathe the fresh\r\n" + //
                                "atmosphere and permitted to return to my native country. I did not\r\n" + //
                                "participate in these feelings, for to me the walls of a dungeon or a\r\n" + //
                                "palace were alike hateful. The cup of life was poisoned for ever, and\r\n" + //
                                "although the sun shone upon me, as upon the happy and gay of heart, I\r\n" + //
                                "saw around me nothing but a dense and frightful darkness, penetrated by\r\n" + //
                                "no light but the glimmer of two eyes that glared upon me. Sometimes\r\n" + //
                                "they were the expressive eyes of Henry, languishing in death, the dark\r\n" + //
                                "orbs nearly covered by the lids and the long black lashes that fringed\r\n" + //
                                "them; sometimes it was the watery, clouded eyes of the monster, as I\r\n" + //
                                "first saw them in my chamber at Ingolstadt.\r\n" + //
                                "\r\n" + //
                                "My father tried to awaken in me the feelings of affection. He talked\r\n" + //
                                "of Geneva, which I should soon visit, of Elizabeth and Ernest; but\r\n" + //
                                "these words only drew deep groans from me. Sometimes, indeed, I felt a\r\n" + //
                                "wish for happiness and thought with melancholy delight of my beloved\r\n" + //
                                "cousin or longed, with a devouring _maladie du pays_, to see once more\r\n" + //
                                "the blue lake and rapid Rhone, that had been so dear to me in early\r\n" + //
                                "childhood; but my general state of feeling was a torpor in which a\r\n" + //
                                "prison was as welcome a residence as the divinest scene in nature; and\r\n" + //
                                "these fits were seldom interrupted but by paroxysms of anguish and\r\n" + //
                                "despair. At these moments I often endeavoured to put an end to the\r\n" + //
                                "existence I loathed, and it required unceasing attendance and vigilance\r\n" + //
                                "to restrain me from committing some dreadful act of violence.\r\n" + //
                                "\r\n" + //
                                "Yet one duty remained to me, the recollection of which finally\r\n" + //
                                "triumphed over my selfish despair. It was necessary that I should\r\n" + //
                                "return without delay to Geneva, there to watch over the lives of those\r\n" + //
                                "I so fondly loved and to lie in wait for the murderer, that if any\r\n" + //
                                "chance led me to the place of his concealment, or if he dared again to\r\n" + //
                                "blast me by his presence, I might, with unfailing aim, put an end to\r\n" + //
                                "the existence of the monstrous image which I had endued with the\r\n" + //
                                "mockery of a soul still more monstrous. My father still desired to\r\n" + //
                                "delay our departure, fearful that I could not sustain the fatigues of a\r\n" + //
                                "journey, for I was a shattered wreck—the shadow of a human being. My\r\n" + //
                                "strength was gone. I was a mere skeleton, and fever night and day\r\n" + //
                                "preyed upon my wasted frame.\r\n" + //
                                "\r\n" + //
                                "Still, as I urged our leaving Ireland with such inquietude and impatience,\r\n" + //
                                "my father thought it best to yield. We took our passage on board a vessel\r\n" + //
                                "bound for Havre-de-Grace and sailed with a fair wind from the Irish shores.\r\n" + //
                                "It was midnight. I lay on the deck looking at the stars and listening to\r\n" + //
                                "the dashing of the waves. I hailed the darkness that shut Ireland from my\r\n" + //
                                "sight, and my pulse beat with a feverish joy when I reflected that I should\r\n" + //
                                "soon see Geneva. The past appeared to me in the light of a frightful dream;\r\n" + //
                                "yet the vessel in which I was, the wind that blew me from the detested\r\n" + //
                                "shore of Ireland, and the sea which surrounded me, told me too forcibly\r\n" + //
                                "that I was deceived by no vision and that Clerval, my friend and dearest\r\n" + //
                                "companion, had fallen a victim to me and the monster of my creation. I\r\n" + //
                                "repassed, in my memory, my whole life; my quiet happiness while residing\r\n" + //
                                "with my family in Geneva, the death of my mother, and my departure for\r\n" + //
                                "Ingolstadt. I remembered, shuddering, the mad enthusiasm that hurried me on\r\n" + //
                                "to the creation of my hideous enemy, and I called to mind the night in\r\n" + //
                                "which he first lived. I was unable to pursue the train of thought; a\r\n" + //
                                "thousand feelings pressed upon me, and I wept bitterly.\r\n" + //
                                "\r\n" + //
                                "Ever since my recovery from the fever, I had been in the custom of taking\r\n" + //
                                "every night a small quantity of laudanum, for it was by means of this drug\r\n" + //
                                "only that I was enabled to gain the rest necessary for the preservation of\r\n" + //
                                "life. Oppressed by the recollection of my various misfortunes, I now\r\n" + //
                                "swallowed double my usual quantity and soon slept profoundly. But sleep did\r\n" + //
                                "not afford me respite from thought and misery; my dreams presented a\r\n" + //
                                "thousand objects that scared me. Towards morning I was possessed by a kind\r\n" + //
                                "of nightmare; I felt the fiend’s grasp in my neck and could not free\r\n" + //
                                "myself from it; groans and cries rang in my ears. My father, who was\r\n" + //
                                "watching over me, perceiving my restlessness, awoke me; the dashing waves\r\n" + //
                                "were around, the cloudy sky above, the fiend was not here: a sense of\r\n" + //
                                "security, a feeling that a truce was established between the present hour\r\n" + //
                                "and the irresistible, disastrous future imparted to me a kind of calm\r\n" + //
                                "forgetfulness, of which the human mind is by its structure peculiarly\r\n" + //
                                "susceptible.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 22\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "The voyage came to an end. We landed, and proceeded to Paris. I soon\r\n" + //
                                "found that I had overtaxed my strength and that I must repose before I\r\n" + //
                                "could continue my journey. My father’s care and attentions were\r\n" + //
                                "indefatigable, but he did not know the origin of my sufferings and\r\n" + //
                                "sought erroneous methods to remedy the incurable ill. He wished me to\r\n" + //
                                "seek amusement in society. I abhorred the face of man. Oh, not\r\n" + //
                                "abhorred! They were my brethren, my fellow beings, and I felt\r\n" + //
                                "attracted even to the most repulsive among them, as to creatures of an\r\n" + //
                                "angelic nature and celestial mechanism. But I felt that I had no right\r\n" + //
                                "to share their intercourse. I had unchained an enemy among them whose\r\n" + //
                                "joy it was to shed their blood and to revel in their groans. How they\r\n" + //
                                "would, each and all, abhor me and hunt me from the world, did they know\r\n" + //
                                "my unhallowed acts and the crimes which had their source in me!\r\n" + //
                                "\r\n" + //
                                "My father yielded at length to my desire to avoid society and strove by\r\n" + //
                                "various arguments to banish my despair. Sometimes he thought that I\r\n" + //
                                "felt deeply the degradation of being obliged to answer a charge of\r\n" + //
                                "murder, and he endeavoured to prove to me the futility of pride.\r\n" + //
                                "\r\n" + //
                                "“Alas! My father,” said I, “how little do you know me. \r\n" + //
                                "Human beings, their feelings and passions, would indeed be degraded if such\r\n" + //
                                "a wretch as I felt pride. Justine, poor unhappy Justine, was as innocent\r\n" + //
                                "as I, and she suffered the same charge; she died for it; and I am the cause\r\n" + //
                                "of this—I murdered her. William, Justine, and Henry—they all\r\n" + //
                                "died by my hands.”\r\n" + //
                                "\r\n" + //
                                "My father had often, during my imprisonment, heard me make the same\r\n" + //
                                "assertion; when I thus accused myself, he sometimes seemed to desire an\r\n" + //
                                "explanation, and at others he appeared to consider it as the offspring of\r\n" + //
                                "delirium, and that, during my illness, some idea of this kind had presented\r\n" + //
                                "itself to my imagination, the remembrance of which I preserved in my\r\n" + //
                                "convalescence. I avoided explanation and maintained a continual silence\r\n" + //
                                "concerning the wretch I had created. I had a persuasion that I should be\r\n" + //
                                "supposed mad, and this in itself would for ever have chained my tongue. But,\r\n" + //
                                "besides, I could not bring myself to disclose a secret which would fill my\r\n" + //
                                "hearer with consternation and make fear and unnatural horror the inmates of\r\n" + //
                                "his breast. I checked, therefore, my impatient thirst for sympathy and was\r\n" + //
                                "silent when I would have given the world to have confided the fatal secret.\r\n" + //
                                "Yet, still, words like those I have recorded would burst uncontrollably\r\n" + //
                                "from me. I could offer no explanation of them, but their truth in part\r\n" + //
                                "relieved the burden of my mysterious woe.\r\n" + //
                                "\r\n" + //
                                "Upon this occasion my father said, with an expression of unbounded wonder,\r\n" + //
                                "“My dearest Victor, what infatuation is this? My dear son, I entreat\r\n" + //
                                "you never to make such an assertion again.”\r\n" + //
                                "\r\n" + //
                                "“I am not mad,” I cried energetically; “the sun and the heavens, who\r\n" + //
                                "have viewed my operations, can bear witness of my truth. I am the\r\n" + //
                                "assassin of those most innocent victims; they died by my machinations.\r\n" + //
                                "A thousand times would I have shed my own blood, drop by drop, to have\r\n" + //
                                "saved their lives; but I could not, my father, indeed I could not\r\n" + //
                                "sacrifice the whole human race.”\r\n" + //
                                "\r\n" + //
                                "The conclusion of this speech convinced my father that my ideas were\r\n" + //
                                "deranged, and he instantly changed the subject of our conversation and\r\n" + //
                                "endeavoured to alter the course of my thoughts. He wished as much as\r\n" + //
                                "possible to obliterate the memory of the scenes that had taken place in\r\n" + //
                                "Ireland and never alluded to them or suffered me to speak of my\r\n" + //
                                "misfortunes.\r\n" + //
                                "\r\n" + //
                                "As time passed away I became more calm; misery had her dwelling in my\r\n" + //
                                "heart, but I no longer talked in the same incoherent manner of my own\r\n" + //
                                "crimes; sufficient for me was the consciousness of them. By the utmost\r\n" + //
                                "self-violence I curbed the imperious voice of wretchedness, which\r\n" + //
                                "sometimes desired to declare itself to the whole world, and my manners\r\n" + //
                                "were calmer and more composed than they had ever been since my journey\r\n" + //
                                "to the sea of ice.\r\n" + //
                                "\r\n" + //
                                "A few days before we left Paris on our way to Switzerland, I received the\r\n" + //
                                "following letter from Elizabeth:\r\n" + //
                                "\r\n" + //
                                "“My dear Friend,\r\n" + //
                                "\r\n" + //
                                "“It gave me the greatest pleasure to receive a letter from my uncle\r\n" + //
                                "dated at Paris; you are no longer at a formidable distance, and I may\r\n" + //
                                "hope to see you in less than a fortnight. My poor cousin, how much you\r\n" + //
                                "must have suffered! I expect to see you looking even more ill than\r\n" + //
                                "when you quitted Geneva. This winter has been passed most miserably,\r\n" + //
                                "tortured as I have been by anxious suspense; yet I hope to see peace in\r\n" + //
                                "your countenance and to find that your heart is not totally void of\r\n" + //
                                "comfort and tranquillity.\r\n" + //
                                "\r\n" + //
                                "“Yet I fear that the same feelings now exist that made you so miserable\r\n" + //
                                "a year ago, even perhaps augmented by time. I would not disturb you at\r\n" + //
                                "this period, when so many misfortunes weigh upon you, but a\r\n" + //
                                "conversation that I had with my uncle previous to his departure renders\r\n" + //
                                "some explanation necessary before we meet.\r\n" + //
                                "\r\n" + //
                                "Explanation! You may possibly say, What can Elizabeth have to explain? If\r\n" + //
                                "you really say this, my questions are answered and all my doubts satisfied.\r\n" + //
                                "But you are distant from me, and it is possible that you may dread and yet\r\n" + //
                                "be pleased with this explanation; and in a probability of this being the\r\n" + //
                                "case, I dare not any longer postpone writing what, during your absence, I\r\n" + //
                                "have often wished to express to you but have never had the courage to begin.\r\n" + //
                                "\r\n" + //
                                "“You well know, Victor, that our union had been the favourite plan of\r\n" + //
                                "your parents ever since our infancy. We were told this when young, and\r\n" + //
                                "taught to look forward to it as an event that would certainly take\r\n" + //
                                "place. We were affectionate playfellows during childhood, and, I\r\n" + //
                                "believe, dear and valued friends to one another as we grew older. But\r\n" + //
                                "as brother and sister often entertain a lively affection towards each\r\n" + //
                                "other without desiring a more intimate union, may not such also be our\r\n" + //
                                "case? Tell me, dearest Victor. Answer me, I conjure you by our mutual\r\n" + //
                                "happiness, with simple truth—Do you not love another?\r\n" + //
                                "\r\n" + //
                                "“You have travelled; you have spent several years of your life at\r\n" + //
                                "Ingolstadt; and I confess to you, my friend, that when I saw you last\r\n" + //
                                "autumn so unhappy, flying to solitude from the society of every\r\n" + //
                                "creature, I could not help supposing that you might regret our\r\n" + //
                                "connection and believe yourself bound in honour to fulfil the wishes of\r\n" + //
                                "your parents, although they opposed themselves to your inclinations.\r\n" + //
                                "But this is false reasoning. I confess to you, my friend, that I love\r\n" + //
                                "you and that in my airy dreams of futurity you have been my constant\r\n" + //
                                "friend and companion. But it is your happiness I desire as well as my\r\n" + //
                                "own when I declare to you that our marriage would render me eternally\r\n" + //
                                "miserable unless it were the dictate of your own free choice. Even now\r\n" + //
                                "I weep to think that, borne down as you are by the cruellest\r\n" + //
                                "misfortunes, you may stifle, by the word _honour_, all hope of that\r\n" + //
                                "love and happiness which would alone restore you to yourself. I, who\r\n" + //
                                "have so disinterested an affection for you, may increase your miseries\r\n" + //
                                "tenfold by being an obstacle to your wishes. Ah! Victor, be assured\r\n" + //
                                "that your cousin and playmate has too sincere a love for you not to be\r\n" + //
                                "made miserable by this supposition. Be happy, my friend; and if you\r\n" + //
                                "obey me in this one request, remain satisfied that nothing on earth\r\n" + //
                                "will have the power to interrupt my tranquillity.\r\n" + //
                                "\r\n" + //
                                "“Do not let this letter disturb you; do not answer tomorrow, or the\r\n" + //
                                "next day, or even until you come, if it will give you pain. My uncle\r\n" + //
                                "will send me news of your health, and if I see but one smile on your\r\n" + //
                                "lips when we meet, occasioned by this or any other exertion of mine, I\r\n" + //
                                "shall need no other happiness.\r\n" + //
                                "\r\n" + //
                                "“Elizabeth Lavenza.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "“Geneva, May 18th, 17—”\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "This letter revived in my memory what I had before forgotten, the threat of\r\n" + //
                                "the fiend—“_I will be with you on your\r\n" + //
                                "wedding-night!_” Such was my sentence, and on that night would the\r\n" + //
                                "dæmon employ every art to destroy me and tear me from the glimpse of\r\n" + //
                                "happiness which promised partly to console my sufferings. On that night he\r\n" + //
                                "had determined to consummate his crimes by my death. Well, be it so; a\r\n" + //
                                "deadly struggle would then assuredly take place, in which if he were\r\n" + //
                                "victorious I should be at peace and his power over me be at an end. If he\r\n" + //
                                "were vanquished, I should be a free man. Alas! What freedom? Such as the\r\n" + //
                                "peasant enjoys when his family have been massacred before his eyes, his\r\n" + //
                                "cottage burnt, his lands laid waste, and he is turned adrift, homeless,\r\n" + //
                                "penniless, and alone, but free. Such would be my liberty except that in my\r\n" + //
                                "Elizabeth I possessed a treasure, alas, balanced by those horrors of\r\n" + //
                                "remorse and guilt which would pursue me until death.\r\n" + //
                                "\r\n" + //
                                "Sweet and beloved Elizabeth! I read and reread her letter, and some\r\n" + //
                                "softened feelings stole into my heart and dared to whisper paradisiacal\r\n" + //
                                "dreams of love and joy; but the apple was already eaten, and the\r\n" + //
                                "angel’s arm bared to drive me from all hope. Yet I would die to make\r\n" + //
                                "her happy. If the monster executed his threat, death was inevitable; yet,\r\n" + //
                                "again, I considered whether my marriage would hasten my fate. My\r\n" + //
                                "destruction might indeed arrive a few months sooner, but if my torturer\r\n" + //
                                "should suspect that I postponed it, influenced by his menaces, he would\r\n" + //
                                "surely find other and perhaps more dreadful means of revenge. He had vowed\r\n" + //
                                "_to be with me on my wedding-night_, yet he did not consider that\r\n" + //
                                "threat as binding him to peace in the meantime, for as if to show me that\r\n" + //
                                "he was not yet satiated with blood, he had murdered Clerval immediately\r\n" + //
                                "after the enunciation of his threats. I resolved, therefore, that if my\r\n" + //
                                "immediate union with my cousin would conduce either to hers or my\r\n" + //
                                "father’s happiness, my adversary’s designs against my life\r\n" + //
                                "should not retard it a single hour.\r\n" + //
                                "\r\n" + //
                                "In this state of mind I wrote to Elizabeth. My letter was calm and\r\n" + //
                                "affectionate. “I fear, my beloved girl,” I said, “little happiness\r\n" + //
                                "remains for us on earth; yet all that I may one day enjoy is centred in\r\n" + //
                                "you. Chase away your idle fears; to you alone do I consecrate my life\r\n" + //
                                "and my endeavours for contentment. I have one secret, Elizabeth, a\r\n" + //
                                "dreadful one; when revealed to you, it will chill your frame with\r\n" + //
                                "horror, and then, far from being surprised at my misery, you will only\r\n" + //
                                "wonder that I survive what I have endured. I will confide this tale of\r\n" + //
                                "misery and terror to you the day after our marriage shall take place,\r\n" + //
                                "for, my sweet cousin, there must be perfect confidence between us. But\r\n" + //
                                "until then, I conjure you, do not mention or allude to it. This I most\r\n" + //
                                "earnestly entreat, and I know you will comply.”\r\n" + //
                                "\r\n" + //
                                "In about a week after the arrival of Elizabeth’s letter we returned\r\n" + //
                                "to Geneva. The sweet girl welcomed me with warm affection, yet tears were\r\n" + //
                                "in her eyes as she beheld my emaciated frame and feverish cheeks. I saw a\r\n" + //
                                "change in her also. She was thinner and had lost much of that heavenly\r\n" + //
                                "vivacity that had before charmed me; but her gentleness and soft looks of\r\n" + //
                                "compassion made her a more fit companion for one blasted and miserable as I\r\n" + //
                                "was.\r\n" + //
                                "\r\n" + //
                                "The tranquillity which I now enjoyed did not endure. Memory brought madness\r\n" + //
                                "with it, and when I thought of what had passed, a real insanity possessed\r\n" + //
                                "me; sometimes I was furious and burnt with rage, sometimes low and\r\n" + //
                                "despondent. I neither spoke nor looked at anyone, but sat motionless,\r\n" + //
                                "bewildered by the multitude of miseries that overcame me.\r\n" + //
                                "\r\n" + //
                                "Elizabeth alone had the power to draw me from these fits; her gentle voice\r\n" + //
                                "would soothe me when transported by passion and inspire me with human\r\n" + //
                                "feelings when sunk in torpor. She wept with me and for me. When reason\r\n" + //
                                "returned, she would remonstrate and endeavour to inspire me with\r\n" + //
                                "resignation. Ah! It is well for the unfortunate to be resigned, but for the\r\n" + //
                                "guilty there is no peace. The agonies of remorse poison the luxury there is\r\n" + //
                                "otherwise sometimes found in indulging the excess of grief.\r\n" + //
                                "\r\n" + //
                                "Soon after my arrival my father spoke of my immediate marriage with\r\n" + //
                                "Elizabeth. I remained silent.\r\n" + //
                                "\r\n" + //
                                "“Have you, then, some other attachment?”\r\n" + //
                                "\r\n" + //
                                "“None on earth. I love Elizabeth and look forward to our union with\r\n" + //
                                "delight. Let the day therefore be fixed; and on it I will consecrate\r\n" + //
                                "myself, in life or death, to the happiness of my cousin.”\r\n" + //
                                "\r\n" + //
                                "“My dear Victor, do not speak thus. Heavy misfortunes have befallen\r\n" + //
                                "us, but let us only cling closer to what remains and transfer our love\r\n" + //
                                "for those whom we have lost to those who yet live. Our circle will be\r\n" + //
                                "small but bound close by the ties of affection and mutual misfortune.\r\n" + //
                                "And when time shall have softened your despair, new and dear objects of\r\n" + //
                                "care will be born to replace those of whom we have been so cruelly\r\n" + //
                                "deprived.”\r\n" + //
                                "\r\n" + //
                                "Such were the lessons of my father. But to me the remembrance of the\r\n" + //
                                "threat returned; nor can you wonder that, omnipotent as the fiend had\r\n" + //
                                "yet been in his deeds of blood, I should almost regard him as\r\n" + //
                                "invincible, and that when he had pronounced the words “_I shall be with\r\n" + //
                                "you on your wedding-night_,” I should regard the threatened fate as\r\n" + //
                                "unavoidable. But death was no evil to me if the loss of Elizabeth were\r\n" + //
                                "balanced with it, and I therefore, with a contented and even cheerful\r\n" + //
                                "countenance, agreed with my father that if my cousin would consent, the\r\n" + //
                                "ceremony should take place in ten days, and thus put, as I imagined,\r\n" + //
                                "the seal to my fate.\r\n" + //
                                "\r\n" + //
                                "Great God! If for one instant I had thought what might be the hellish\r\n" + //
                                "intention of my fiendish adversary, I would rather have banished myself\r\n" + //
                                "for ever from my native country and wandered a friendless outcast over\r\n" + //
                                "the earth than have consented to this miserable marriage. But, as if\r\n" + //
                                "possessed of magic powers, the monster had blinded me to his real\r\n" + //
                                "intentions; and when I thought that I had prepared only my own death, I\r\n" + //
                                "hastened that of a far dearer victim.\r\n" + //
                                "\r\n" + //
                                "As the period fixed for our marriage drew nearer, whether from cowardice or\r\n" + //
                                "a prophetic feeling, I felt my heart sink within me. But I concealed my\r\n" + //
                                "feelings by an appearance of hilarity that brought smiles and joy to the\r\n" + //
                                "countenance of my father, but hardly deceived the ever-watchful and nicer\r\n" + //
                                "eye of Elizabeth. She looked forward to our union with placid contentment,\r\n" + //
                                "not unmingled with a little fear, which past misfortunes had impressed,\r\n" + //
                                "that what now appeared certain and tangible happiness might soon dissipate\r\n" + //
                                "into an airy dream and leave no trace but deep and everlasting regret.\r\n" + //
                                "\r\n" + //
                                "Preparations were made for the event, congratulatory visits were received,\r\n" + //
                                "and all wore a smiling appearance. I shut up, as well as I could, in my own\r\n" + //
                                "heart the anxiety that preyed there and entered with seeming earnestness\r\n" + //
                                "into the plans of my father, although they might only serve as the\r\n" + //
                                "decorations of my tragedy. Through my father’s exertions a part of\r\n" + //
                                "the inheritance of Elizabeth had been restored to her by the Austrian\r\n" + //
                                "government. A small possession on the shores of Como belonged to her. It\r\n" + //
                                "was agreed that, immediately after our union, we should proceed to Villa\r\n" + //
                                "Lavenza and spend our first days of happiness beside the beautiful lake\r\n" + //
                                "near which it stood.\r\n" + //
                                "\r\n" + //
                                "In the meantime I took every precaution to defend my person in case the\r\n" + //
                                "fiend should openly attack me. I carried pistols and a dagger\r\n" + //
                                "constantly about me and was ever on the watch to prevent artifice, and\r\n" + //
                                "by these means gained a greater degree of tranquillity. Indeed, as the\r\n" + //
                                "period approached, the threat appeared more as a delusion, not to be\r\n" + //
                                "regarded as worthy to disturb my peace, while the happiness I hoped for\r\n" + //
                                "in my marriage wore a greater appearance of certainty as the day fixed\r\n" + //
                                "for its solemnisation drew nearer and I heard it continually spoken of\r\n" + //
                                "as an occurrence which no accident could possibly prevent.\r\n" + //
                                "\r\n" + //
                                "Elizabeth seemed happy; my tranquil demeanour contributed greatly to\r\n" + //
                                "calm her mind. But on the day that was to fulfil my wishes and my\r\n" + //
                                "destiny, she was melancholy, and a presentiment of evil pervaded her;\r\n" + //
                                "and perhaps also she thought of the dreadful secret which I had\r\n" + //
                                "promised to reveal to her on the following day. My father was in the\r\n" + //
                                "meantime overjoyed, and, in the bustle of preparation, only recognised in\r\n" + //
                                "the melancholy of his niece the diffidence of a bride.\r\n" + //
                                "\r\n" + //
                                "After the ceremony was performed a large party assembled at my\r\n" + //
                                "father’s, but it was agreed that Elizabeth and I should commence our\r\n" + //
                                "journey by water, sleeping that night at Evian and continuing our\r\n" + //
                                "voyage on the following day. The day was fair, the wind favourable;\r\n" + //
                                "all smiled on our nuptial embarkation.\r\n" + //
                                "\r\n" + //
                                "Those were the last moments of my life during which I enjoyed the\r\n" + //
                                "feeling of happiness. We passed rapidly along; the sun was hot, but we\r\n" + //
                                "were sheltered from its rays by a kind of canopy while we enjoyed the\r\n" + //
                                "beauty of the scene, sometimes on one side of the lake, where we saw\r\n" + //
                                "Mont Salêve, the pleasant banks of Montalègre, and at a distance,\r\n" + //
                                "surmounting all, the beautiful Mont Blanc, and the assemblage of snowy\r\n" + //
                                "mountains that in vain endeavour to emulate her; sometimes coasting the\r\n" + //
                                "opposite banks, we saw the mighty Jura opposing its dark side to the\r\n" + //
                                "ambition that would quit its native country, and an almost\r\n" + //
                                "insurmountable barrier to the invader who should wish to enslave it.\r\n" + //
                                "\r\n" + //
                                "I took the hand of Elizabeth. “You are sorrowful, my love. Ah! If\r\n" + //
                                "you knew what I have suffered and what I may yet endure, you would\r\n" + //
                                "endeavour to let me taste the quiet and freedom from despair that this\r\n" + //
                                "one day at least permits me to enjoy.”\r\n" + //
                                "\r\n" + //
                                "“Be happy, my dear Victor,” replied Elizabeth; “there is, I hope,\r\n" + //
                                "nothing to distress you; and be assured that if a lively joy is not\r\n" + //
                                "painted in my face, my heart is contented. Something whispers to me\r\n" + //
                                "not to depend too much on the prospect that is opened before us, but I\r\n" + //
                                "will not listen to such a sinister voice. Observe how fast we move\r\n" + //
                                "along and how the clouds, which sometimes obscure and sometimes rise\r\n" + //
                                "above the dome of Mont Blanc, render this scene of beauty still more\r\n" + //
                                "interesting. Look also at the innumerable fish that are swimming in\r\n" + //
                                "the clear waters, where we can distinguish every pebble that lies at\r\n" + //
                                "the bottom. What a divine day! How happy and serene all nature\r\n" + //
                                "appears!”\r\n" + //
                                "\r\n" + //
                                "Thus Elizabeth endeavoured to divert her thoughts and mine from all\r\n" + //
                                "reflection upon melancholy subjects. But her temper was fluctuating;\r\n" + //
                                "joy for a few instants shone in her eyes, but it continually gave place\r\n" + //
                                "to distraction and reverie.\r\n" + //
                                "\r\n" + //
                                "The sun sank lower in the heavens; we passed the river Drance and\r\n" + //
                                "observed its path through the chasms of the higher and the glens of the\r\n" + //
                                "lower hills. The Alps here come closer to the lake, and we approached\r\n" + //
                                "the amphitheatre of mountains which forms its eastern boundary. The\r\n" + //
                                "spire of Evian shone under the woods that surrounded it and the range\r\n" + //
                                "of mountain above mountain by which it was overhung.\r\n" + //
                                "\r\n" + //
                                "The wind, which had hitherto carried us along with amazing rapidity,\r\n" + //
                                "sank at sunset to a light breeze; the soft air just ruffled the water\r\n" + //
                                "and caused a pleasant motion among the trees as we approached the\r\n" + //
                                "shore, from which it wafted the most delightful scent of flowers and\r\n" + //
                                "hay. The sun sank beneath the horizon as we landed, and as I touched\r\n" + //
                                "the shore I felt those cares and fears revive which soon were to clasp\r\n" + //
                                "me and cling to me for ever.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 23\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "It was eight o’clock when we landed; we walked for a short time on the\r\n" + //
                                "shore, enjoying the transitory light, and then retired to the inn and\r\n" + //
                                "contemplated the lovely scene of waters, woods, and mountains, obscured\r\n" + //
                                "in darkness, yet still displaying their black outlines.\r\n" + //
                                "\r\n" + //
                                "The wind, which had fallen in the south, now rose with great violence\r\n" + //
                                "in the west. The moon had reached her summit in the heavens and was\r\n" + //
                                "beginning to descend; the clouds swept across it swifter than the\r\n" + //
                                "flight of the vulture and dimmed her rays, while the lake reflected the\r\n" + //
                                "scene of the busy heavens, rendered still busier by the restless waves\r\n" + //
                                "that were beginning to rise. Suddenly a heavy storm of rain descended.\r\n" + //
                                "\r\n" + //
                                "I had been calm during the day, but so soon as night obscured the\r\n" + //
                                "shapes of objects, a thousand fears arose in my mind. I was anxious\r\n" + //
                                "and watchful, while my right hand grasped a pistol which was hidden in\r\n" + //
                                "my bosom; every sound terrified me, but I resolved that I would sell my\r\n" + //
                                "life dearly and not shrink from the conflict until my own life or that\r\n" + //
                                "of my adversary was extinguished.\r\n" + //
                                "\r\n" + //
                                "Elizabeth observed my agitation for some time in timid and fearful silence,\r\n" + //
                                "but there was something in my glance which communicated terror to her, and\r\n" + //
                                "trembling, she asked, “What is it that agitates you, my dear Victor?\r\n" + //
                                "What is it you fear?”\r\n" + //
                                "\r\n" + //
                                "“Oh! Peace, peace, my love,” replied I; “this night, and\r\n" + //
                                "all will be safe; but this night is dreadful, very dreadful.”\r\n" + //
                                "\r\n" + //
                                "I passed an hour in this state of mind, when suddenly I reflected how\r\n" + //
                                "fearful the combat which I momentarily expected would be to my wife,\r\n" + //
                                "and I earnestly entreated her to retire, resolving not to join her\r\n" + //
                                "until I had obtained some knowledge as to the situation of my enemy.\r\n" + //
                                "\r\n" + //
                                "She left me, and I continued some time walking up and down the passages\r\n" + //
                                "of the house and inspecting every corner that might afford a retreat to\r\n" + //
                                "my adversary. But I discovered no trace of him and was beginning to\r\n" + //
                                "conjecture that some fortunate chance had intervened to prevent the\r\n" + //
                                "execution of his menaces when suddenly I heard a shrill and dreadful\r\n" + //
                                "scream. It came from the room into which Elizabeth had retired. As I\r\n" + //
                                "heard it, the whole truth rushed into my mind, my arms dropped, the\r\n" + //
                                "motion of every muscle and fibre was suspended; I could feel the blood\r\n" + //
                                "trickling in my veins and tingling in the extremities of my limbs. This\r\n" + //
                                "state lasted but for an instant; the scream was repeated, and I rushed\r\n" + //
                                "into the room.\r\n" + //
                                "\r\n" + //
                                "Great God! Why did I not then expire! Why am I here to relate the\r\n" + //
                                "destruction of the best hope and the purest creature on earth? She was\r\n" + //
                                "there, lifeless and inanimate, thrown across the bed, her head hanging down\r\n" + //
                                "and her pale and distorted features half covered by her hair. Everywhere I\r\n" + //
                                "turn I see the same figure—her bloodless arms and relaxed form flung\r\n" + //
                                "by the murderer on its bridal bier. Could I behold this and live? Alas!\r\n" + //
                                "Life is obstinate and clings closest where it is most hated. For a moment\r\n" + //
                                "only did I lose recollection; I fell senseless on the ground.\r\n" + //
                                "\r\n" + //
                                "When I recovered I found myself surrounded by the people of the inn; their\r\n" + //
                                "countenances expressed a breathless terror, but the horror of others\r\n" + //
                                "appeared only as a mockery, a shadow of the feelings that oppressed me. I\r\n" + //
                                "escaped from them to the room where lay the body of Elizabeth, my love, my\r\n" + //
                                "wife, so lately living, so dear, so worthy. She had been moved from the\r\n" + //
                                "posture in which I had first beheld her, and now, as she lay, her head upon\r\n" + //
                                "her arm and a handkerchief thrown across her face and neck, I might have\r\n" + //
                                "supposed her asleep. I rushed towards her and embraced her with ardour, but\r\n" + //
                                "the deadly languor and coldness of the limbs told me that what I now held\r\n" + //
                                "in my arms had ceased to be the Elizabeth whom I had loved and cherished.\r\n" + //
                                "The murderous mark of the fiend’s grasp was on her neck, and the\r\n" + //
                                "breath had ceased to issue from her lips.\r\n" + //
                                "\r\n" + //
                                "While I still hung over her in the agony of despair, I happened to look up.\r\n" + //
                                "The windows of the room had before been darkened, and I felt a kind of\r\n" + //
                                "panic on seeing the pale yellow light of the moon illuminate the chamber.\r\n" + //
                                "The shutters had been thrown back, and with a sensation of horror not to be\r\n" + //
                                "described, I saw at the open window a figure the most hideous and abhorred.\r\n" + //
                                "A grin was on the face of the monster; he seemed to jeer, as with his\r\n" + //
                                "fiendish finger he pointed towards the corpse of my wife. I rushed towards\r\n" + //
                                "the window, and drawing a pistol from my bosom, fired; but he eluded me,\r\n" + //
                                "leaped from his station, and running with the swiftness of lightning,\r\n" + //
                                "plunged into the lake.\r\n" + //
                                "\r\n" + //
                                "The report of the pistol brought a crowd into the room. I pointed to\r\n" + //
                                "the spot where he had disappeared, and we followed the track with\r\n" + //
                                "boats; nets were cast, but in vain. After passing several hours, we\r\n" + //
                                "returned hopeless, most of my companions believing it to have been a\r\n" + //
                                "form conjured up by my fancy. After having landed, they proceeded to\r\n" + //
                                "search the country, parties going in different directions among the\r\n" + //
                                "woods and vines.\r\n" + //
                                "\r\n" + //
                                "I attempted to accompany them and proceeded a short distance from the\r\n" + //
                                "house, but my head whirled round, my steps were like those of a drunken\r\n" + //
                                "man, I fell at last in a state of utter exhaustion; a film covered my\r\n" + //
                                "eyes, and my skin was parched with the heat of fever. In this state I\r\n" + //
                                "was carried back and placed on a bed, hardly conscious of what had\r\n" + //
                                "happened; my eyes wandered round the room as if to seek something that\r\n" + //
                                "I had lost.\r\n" + //
                                "\r\n" + //
                                "After an interval I arose, and as if by instinct, crawled into the room\r\n" + //
                                "where the corpse of my beloved lay. There were women weeping around; I\r\n" + //
                                "hung over it and joined my sad tears to theirs; all this time no\r\n" + //
                                "distinct idea presented itself to my mind, but my thoughts rambled to\r\n" + //
                                "various subjects, reflecting confusedly on my misfortunes and their\r\n" + //
                                "cause. I was bewildered, in a cloud of wonder and horror. The death\r\n" + //
                                "of William, the execution of Justine, the murder of Clerval, and lastly\r\n" + //
                                "of my wife; even at that moment I knew not that my only remaining\r\n" + //
                                "friends were safe from the malignity of the fiend; my father even now\r\n" + //
                                "might be writhing under his grasp, and Ernest might be dead at his\r\n" + //
                                "feet. This idea made me shudder and recalled me to action. I started\r\n" + //
                                "up and resolved to return to Geneva with all possible speed.\r\n" + //
                                "\r\n" + //
                                "There were no horses to be procured, and I must return by the lake; but the\r\n" + //
                                "wind was unfavourable, and the rain fell in torrents. However, it was\r\n" + //
                                "hardly morning, and I might reasonably hope to arrive by night. I hired men\r\n" + //
                                "to row and took an oar myself, for I had always experienced relief from\r\n" + //
                                "mental torment in bodily exercise. But the overflowing misery I now felt,\r\n" + //
                                "and the excess of agitation that I endured rendered me incapable of any\r\n" + //
                                "exertion. I threw down the oar, and leaning my head upon my hands, gave way\r\n" + //
                                "to every gloomy idea that arose. If I looked up, I saw scenes which were\r\n" + //
                                "familiar to me in my happier time and which I had contemplated but the day\r\n" + //
                                "before in the company of her who was now but a shadow and a recollection.\r\n" + //
                                "Tears streamed from my eyes. The rain had ceased for a moment, and I saw\r\n" + //
                                "the fish play in the waters as they had done a few hours before; they had\r\n" + //
                                "then been observed by Elizabeth. Nothing is so painful to the human mind as\r\n" + //
                                "a great and sudden change. The sun might shine or the clouds might lower,\r\n" + //
                                "but nothing could appear to me as it had done the day before. A fiend had\r\n" + //
                                "snatched from me every hope of future happiness; no creature had ever been\r\n" + //
                                "so miserable as I was; so frightful an event is single in the history of\r\n" + //
                                "man.\r\n" + //
                                "\r\n" + //
                                "But why should I dwell upon the incidents that followed this last\r\n" + //
                                "overwhelming event? Mine has been a tale of horrors; I have reached their\r\n" + //
                                "_acme_, and what I must now relate can but be tedious to you. Know\r\n" + //
                                "that, one by one, my friends were snatched away; I was left desolate. My\r\n" + //
                                "own strength is exhausted, and I must tell, in a few words, what remains of\r\n" + //
                                "my hideous narration.\r\n" + //
                                "\r\n" + //
                                "I arrived at Geneva. My father and Ernest yet lived, but the former sunk\r\n" + //
                                "under the tidings that I bore. I see him now, excellent and venerable old\r\n" + //
                                "man! His eyes wandered in vacancy, for they had lost their charm and their\r\n" + //
                                "delight—his Elizabeth, his more than daughter, whom he doted on with\r\n" + //
                                "all that affection which a man feels, who in the decline of life, having\r\n" + //
                                "few affections, clings more earnestly to those that remain. Cursed, cursed\r\n" + //
                                "be the fiend that brought misery on his grey hairs and doomed him to waste\r\n" + //
                                "in wretchedness! He could not live under the horrors that were accumulated\r\n" + //
                                "around him; the springs of existence suddenly gave way; he was unable to\r\n" + //
                                "rise from his bed, and in a few days he died in my arms.\r\n" + //
                                "\r\n" + //
                                "What then became of me? I know not; I lost sensation, and chains and\r\n" + //
                                "darkness were the only objects that pressed upon me. Sometimes,\r\n" + //
                                "indeed, I dreamt that I wandered in flowery meadows and pleasant vales\r\n" + //
                                "with the friends of my youth, but I awoke and found myself in a\r\n" + //
                                "dungeon. Melancholy followed, but by degrees I gained a clear\r\n" + //
                                "conception of my miseries and situation and was then released from my\r\n" + //
                                "prison. For they had called me mad, and during many months, as I\r\n" + //
                                "understood, a solitary cell had been my habitation.\r\n" + //
                                "\r\n" + //
                                "Liberty, however, had been a useless gift to me, had I not, as I\r\n" + //
                                "awakened to reason, at the same time awakened to revenge. As the\r\n" + //
                                "memory of past misfortunes pressed upon me, I began to reflect on their\r\n" + //
                                "cause—the monster whom I had created, the miserable dæmon whom I had\r\n" + //
                                "sent abroad into the world for my destruction. I was possessed by a\r\n" + //
                                "maddening rage when I thought of him, and desired and ardently prayed\r\n" + //
                                "that I might have him within my grasp to wreak a great and signal\r\n" + //
                                "revenge on his cursed head.\r\n" + //
                                "\r\n" + //
                                "Nor did my hate long confine itself to useless wishes; I began to\r\n" + //
                                "reflect on the best means of securing him; and for this purpose, about\r\n" + //
                                "a month after my release, I repaired to a criminal judge in the town\r\n" + //
                                "and told him that I had an accusation to make, that I knew the\r\n" + //
                                "destroyer of my family, and that I required him to exert his whole\r\n" + //
                                "authority for the apprehension of the murderer.\r\n" + //
                                "\r\n" + //
                                "The magistrate listened to me with attention and kindness. “Be\r\n" + //
                                "assured, sir,” said he, “no pains or exertions on my part shall\r\n" + //
                                "be spared to discover the villain.”\r\n" + //
                                "\r\n" + //
                                "“I thank you,” replied I; “listen, therefore, to the\r\n" + //
                                "deposition that I have to make. It is indeed a tale so strange that I\r\n" + //
                                "should fear you would not credit it were there not something in truth\r\n" + //
                                "which, however wonderful, forces conviction. The story is too connected to\r\n" + //
                                "be mistaken for a dream, and I have no motive for falsehood.” My\r\n" + //
                                "manner as I thus addressed him was impressive but calm; I had formed in my\r\n" + //
                                "own heart a resolution to pursue my destroyer to death, and this purpose\r\n" + //
                                "quieted my agony and for an interval reconciled me to life. I now related\r\n" + //
                                "my history briefly but with firmness and precision, marking the dates with\r\n" + //
                                "accuracy and never deviating into invective or exclamation.\r\n" + //
                                "\r\n" + //
                                "The magistrate appeared at first perfectly incredulous, but as I continued\r\n" + //
                                "he became more attentive and interested; I saw him sometimes shudder with\r\n" + //
                                "horror; at others a lively surprise, unmingled with disbelief, was painted\r\n" + //
                                "on his countenance.\r\n" + //
                                "\r\n" + //
                                "When I had concluded my narration, I said, “This is the being whom I\r\n" + //
                                "accuse and for whose seizure and punishment I call upon you to exert your\r\n" + //
                                "whole power. It is your duty as a magistrate, and I believe and hope that\r\n" + //
                                "your feelings as a man will not revolt from the execution of those\r\n" + //
                                "functions on this occasion.”\r\n" + //
                                "\r\n" + //
                                "This address caused a considerable change in the physiognomy of my own\r\n" + //
                                "auditor. He had heard my story with that half kind of belief that is given\r\n" + //
                                "to a tale of spirits and supernatural events; but when he was called upon\r\n" + //
                                "to act officially in consequence, the whole tide of his incredulity\r\n" + //
                                "returned. He, however, answered mildly, “I would willingly afford you\r\n" + //
                                "every aid in your pursuit, but the creature of whom you speak appears to\r\n" + //
                                "have powers which would put all my exertions to defiance. Who can follow an\r\n" + //
                                "animal which can traverse the sea of ice and inhabit caves and dens where\r\n" + //
                                "no man would venture to intrude? Besides, some months have elapsed since\r\n" + //
                                "the commission of his crimes, and no one can conjecture to what place he\r\n" + //
                                "has wandered or what region he may now inhabit.”\r\n" + //
                                "\r\n" + //
                                "“I do not doubt that he hovers near the spot which I inhabit, and if\r\n" + //
                                "he has indeed taken refuge in the Alps, he may be hunted like the chamois\r\n" + //
                                "and destroyed as a beast of prey. But I perceive your thoughts; you do not\r\n" + //
                                "credit my narrative and do not intend to pursue my enemy with the\r\n" + //
                                "punishment which is his desert.”\r\n" + //
                                "\r\n" + //
                                "As I spoke, rage sparkled in my eyes; the magistrate was intimidated.\r\n" + //
                                "“You are mistaken,” said he. “I will exert myself, and if\r\n" + //
                                "it is in my power to seize the monster, be assured that he shall suffer\r\n" + //
                                "punishment proportionate to his crimes. But I fear, from what you have\r\n" + //
                                "yourself described to be his properties, that this will prove\r\n" + //
                                "impracticable; and thus, while every proper measure is pursued, you should\r\n" + //
                                "make up your mind to disappointment.”\r\n" + //
                                "\r\n" + //
                                "“That cannot be; but all that I can say will be of little avail. My\r\n" + //
                                "revenge is of no moment to you; yet, while I allow it to be a vice, I\r\n" + //
                                "confess that it is the devouring and only passion of my soul. My rage\r\n" + //
                                "is unspeakable when I reflect that the murderer, whom I have turned\r\n" + //
                                "loose upon society, still exists. You refuse my just demand; I have\r\n" + //
                                "but one resource, and I devote myself, either in my life or death, to\r\n" + //
                                "his destruction.”\r\n" + //
                                "\r\n" + //
                                "I trembled with excess of agitation as I said this; there was a frenzy\r\n" + //
                                "in my manner, and something, I doubt not, of that haughty fierceness\r\n" + //
                                "which the martyrs of old are said to have possessed. But to a Genevan\r\n" + //
                                "magistrate, whose mind was occupied by far other ideas than those of\r\n" + //
                                "devotion and heroism, this elevation of mind had much the appearance of\r\n" + //
                                "madness. He endeavoured to soothe me as a nurse does a child and\r\n" + //
                                "reverted to my tale as the effects of delirium.\r\n" + //
                                "\r\n" + //
                                "“Man,” I cried, “how ignorant art thou in thy pride of\r\n" + //
                                "wisdom! Cease; you know not what it is you say.”\r\n" + //
                                "\r\n" + //
                                "I broke from the house angry and disturbed and retired to meditate on\r\n" + //
                                "some other mode of action.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "Chapter 24\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "My present situation was one in which all voluntary thought was\r\n" + //
                                "swallowed up and lost. I was hurried away by fury; revenge alone\r\n" + //
                                "endowed me with strength and composure; it moulded my feelings and\r\n" + //
                                "allowed me to be calculating and calm at periods when otherwise\r\n" + //
                                "delirium or death would have been my portion.\r\n" + //
                                "\r\n" + //
                                "My first resolution was to quit Geneva for ever; my country, which, when I\r\n" + //
                                "was happy and beloved, was dear to me, now, in my adversity, became\r\n" + //
                                "hateful. I provided myself with a sum of money, together with a few jewels\r\n" + //
                                "which had belonged to my mother, and departed.\r\n" + //
                                "\r\n" + //
                                "And now my wanderings began which are to cease but with life. I have\r\n" + //
                                "traversed a vast portion of the earth and have endured all the hardships\r\n" + //
                                "which travellers in deserts and barbarous countries are wont to meet. How I\r\n" + //
                                "have lived I hardly know; many times have I stretched my failing limbs upon\r\n" + //
                                "the sandy plain and prayed for death. But revenge kept me alive; I dared\r\n" + //
                                "not die and leave my adversary in being.\r\n" + //
                                "\r\n" + //
                                "When I quitted Geneva my first labour was to gain some clue by which I\r\n" + //
                                "might trace the steps of my fiendish enemy. But my plan was unsettled,\r\n" + //
                                "and I wandered many hours round the confines of the town, uncertain\r\n" + //
                                "what path I should pursue. As night approached I found myself at the\r\n" + //
                                "entrance of the cemetery where William, Elizabeth, and my father\r\n" + //
                                "reposed. I entered it and approached the tomb which marked their\r\n" + //
                                "graves. Everything was silent except the leaves of the trees, which\r\n" + //
                                "were gently agitated by the wind; the night was nearly dark, and the\r\n" + //
                                "scene would have been solemn and affecting even to an uninterested\r\n" + //
                                "observer. The spirits of the departed seemed to flit around and to\r\n" + //
                                "cast a shadow, which was felt but not seen, around the head of the\r\n" + //
                                "mourner.\r\n" + //
                                "\r\n" + //
                                "The deep grief which this scene had at first excited quickly gave way to\r\n" + //
                                "rage and despair. They were dead, and I lived; their murderer also lived,\r\n" + //
                                "and to destroy him I must drag out my weary existence. I knelt on the grass\r\n" + //
                                "and kissed the earth and with quivering lips exclaimed, “By the\r\n" + //
                                "sacred earth on which I kneel, by the shades that wander near me, by the\r\n" + //
                                "deep and eternal grief that I feel, I swear; and by thee, O Night, and the\r\n" + //
                                "spirits that preside over thee, to pursue the dæmon who caused this misery,\r\n" + //
                                "until he or I shall perish in mortal conflict. For this purpose I will\r\n" + //
                                "preserve my life; to execute this dear revenge will I again behold the sun\r\n" + //
                                "and tread the green herbage of earth, which otherwise should vanish from my\r\n" + //
                                "eyes for ever. And I call on you, spirits of the dead, and on you, wandering\r\n" + //
                                "ministers of vengeance, to aid and conduct me in my work. Let the cursed\r\n" + //
                                "and hellish monster drink deep of agony; let him feel the despair that now\r\n" + //
                                "torments me.”\r\n" + //
                                "\r\n" + //
                                "I had begun my adjuration with solemnity and an awe which almost assured me\r\n" + //
                                "that the shades of my murdered friends heard and approved my devotion, but\r\n" + //
                                "the furies possessed me as I concluded, and rage choked my utterance.\r\n" + //
                                "\r\n" + //
                                "I was answered through the stillness of night by a loud and fiendish\r\n" + //
                                "laugh. It rang on my ears long and heavily; the mountains re-echoed\r\n" + //
                                "it, and I felt as if all hell surrounded me with mockery and laughter.\r\n" + //
                                "Surely in that moment I should have been possessed by frenzy and have\r\n" + //
                                "destroyed my miserable existence but that my vow was heard and that I\r\n" + //
                                "was reserved for vengeance. The laughter died away, when a well-known\r\n" + //
                                "and abhorred voice, apparently close to my ear, addressed me in an\r\n" + //
                                "audible whisper, “I am satisfied, miserable wretch! You have\r\n" + //
                                "determined to live, and I am satisfied.”\r\n" + //
                                "\r\n" + //
                                "I darted towards the spot from which the sound proceeded, but the devil\r\n" + //
                                "eluded my grasp. Suddenly the broad disk of the moon arose and shone\r\n" + //
                                "full upon his ghastly and distorted shape as he fled with more than\r\n" + //
                                "mortal speed.\r\n" + //
                                "\r\n" + //
                                "I pursued him, and for many months this has been my task. Guided by a\r\n" + //
                                "slight clue, I followed the windings of the Rhone, but vainly. The\r\n" + //
                                "blue Mediterranean appeared, and by a strange chance, I saw the fiend\r\n" + //
                                "enter by night and hide himself in a vessel bound for the Black Sea. I\r\n" + //
                                "took my passage in the same ship, but he escaped, I know not how.\r\n" + //
                                "\r\n" + //
                                "Amidst the wilds of Tartary and Russia, although he still evaded me, I\r\n" + //
                                "have ever followed in his track. Sometimes the peasants, scared by\r\n" + //
                                "this horrid apparition, informed me of his path; sometimes he himself,\r\n" + //
                                "who feared that if I lost all trace of him I should despair and die,\r\n" + //
                                "left some mark to guide me. The snows descended on my head, and I saw\r\n" + //
                                "the print of his huge step on the white plain. To you first entering\r\n" + //
                                "on life, to whom care is new and agony unknown, how can you understand\r\n" + //
                                "what I have felt and still feel? Cold, want, and fatigue were the\r\n" + //
                                "least pains which I was destined to endure; I was cursed by some devil\r\n" + //
                                "and carried about with me my eternal hell; yet still a spirit of good\r\n" + //
                                "followed and directed my steps and when I most murmured would suddenly\r\n" + //
                                "extricate me from seemingly insurmountable difficulties. Sometimes,\r\n" + //
                                "when nature, overcome by hunger, sank under the exhaustion, a repast\r\n" + //
                                "was prepared for me in the desert that restored and inspirited me. The\r\n" + //
                                "fare was, indeed, coarse, such as the peasants of the country ate, but\r\n" + //
                                "I will not doubt that it was set there by the spirits that I had\r\n" + //
                                "invoked to aid me. Often, when all was dry, the heavens cloudless, and\r\n" + //
                                "I was parched by thirst, a slight cloud would bedim the sky, shed the\r\n" + //
                                "few drops that revived me, and vanish.\r\n" + //
                                "\r\n" + //
                                "I followed, when I could, the courses of the rivers; but the dæmon\r\n" + //
                                "generally avoided these, as it was here that the population of the\r\n" + //
                                "country chiefly collected. In other places human beings were seldom\r\n" + //
                                "seen, and I generally subsisted on the wild animals that crossed my\r\n" + //
                                "path. I had money with me and gained the friendship of the villagers\r\n" + //
                                "by distributing it; or I brought with me some food that I had killed,\r\n" + //
                                "which, after taking a small part, I always presented to those who had\r\n" + //
                                "provided me with fire and utensils for cooking.\r\n" + //
                                "\r\n" + //
                                "My life, as it passed thus, was indeed hateful to me, and it was during\r\n" + //
                                "sleep alone that I could taste joy. O blessed sleep! Often, when most\r\n" + //
                                "miserable, I sank to repose, and my dreams lulled me even to rapture. The\r\n" + //
                                "spirits that guarded me had provided these moments, or rather hours, of\r\n" + //
                                "happiness that I might retain strength to fulfil my pilgrimage. Deprived of\r\n" + //
                                "this respite, I should have sunk under my hardships. During the day I was\r\n" + //
                                "sustained and inspirited by the hope of night, for in sleep I saw my\r\n" + //
                                "friends, my wife, and my beloved country; again I saw the benevolent\r\n" + //
                                "countenance of my father, heard the silver tones of my Elizabeth’s\r\n" + //
                                "voice, and beheld Clerval enjoying health and youth. Often, when wearied by\r\n" + //
                                "a toilsome march, I persuaded myself that I was dreaming until night should\r\n" + //
                                "come and that I should then enjoy reality in the arms of my dearest\r\n" + //
                                "friends. What agonising fondness did I feel for them! How did I cling to\r\n" + //
                                "their dear forms, as sometimes they haunted even my waking hours, and\r\n" + //
                                "persuade myself that they still lived! At such moments vengeance, that\r\n" + //
                                "burned within me, died in my heart, and I pursued my path towards the\r\n" + //
                                "destruction of the dæmon more as a task enjoined by heaven, as the\r\n" + //
                                "mechanical impulse of some power of which I was unconscious, than as the\r\n" + //
                                "ardent desire of my soul.\r\n" + //
                                "\r\n" + //
                                "What his feelings were whom I pursued I cannot know. Sometimes, indeed, he\r\n" + //
                                "left marks in writing on the barks of the trees or cut in stone that guided\r\n" + //
                                "me and instigated my fury. “My reign is not yet\r\n" + //
                                "over”—these words were legible in one of these\r\n" + //
                                "inscriptions—“you live, and my power is complete. Follow me; I\r\n" + //
                                "seek the everlasting ices of the north, where you will feel the misery of\r\n" + //
                                "cold and frost, to which I am impassive. You will find near this place, if\r\n" + //
                                "you follow not too tardily, a dead hare; eat and be refreshed. Come on, my\r\n" + //
                                "enemy; we have yet to wrestle for our lives, but many hard and miserable\r\n" + //
                                "hours must you endure until that period shall arrive.”\r\n" + //
                                "\r\n" + //
                                "Scoffing devil! Again do I vow vengeance; again do I devote thee,\r\n" + //
                                "miserable fiend, to torture and death. Never will I give up my search\r\n" + //
                                "until he or I perish; and then with what ecstasy shall I join my\r\n" + //
                                "Elizabeth and my departed friends, who even now prepare for me the\r\n" + //
                                "reward of my tedious toil and horrible pilgrimage!\r\n" + //
                                "\r\n" + //
                                "As I still pursued my journey to the northward, the snows thickened and the\r\n" + //
                                "cold increased in a degree almost too severe to support. The peasants were\r\n" + //
                                "shut up in their hovels, and only a few of the most hardy ventured forth to\r\n" + //
                                "seize the animals whom starvation had forced from their hiding-places to\r\n" + //
                                "seek for prey. The rivers were covered with ice, and no fish could be\r\n" + //
                                "procured; and thus I was cut off from my chief article of maintenance.\r\n" + //
                                "\r\n" + //
                                "The triumph of my enemy increased with the difficulty of my labours. One\r\n" + //
                                "inscription that he left was in these words: “Prepare! Your toils\r\n" + //
                                "only begin; wrap yourself in furs and provide food, for we shall soon enter\r\n" + //
                                "upon a journey where your sufferings will satisfy my everlasting\r\n" + //
                                "hatred.”\r\n" + //
                                "\r\n" + //
                                "My courage and perseverance were invigorated by these scoffing words; I\r\n" + //
                                "resolved not to fail in my purpose, and calling on Heaven to support\r\n" + //
                                "me, I continued with unabated fervour to traverse immense deserts,\r\n" + //
                                "until the ocean appeared at a distance and formed the utmost boundary\r\n" + //
                                "of the horizon. Oh! How unlike it was to the blue seasons of the\r\n" + //
                                "south! Covered with ice, it was only to be distinguished from land by\r\n" + //
                                "its superior wildness and ruggedness. The Greeks wept for joy when\r\n" + //
                                "they beheld the Mediterranean from the hills of Asia, and hailed with\r\n" + //
                                "rapture the boundary of their toils. I did not weep, but I knelt down\r\n" + //
                                "and with a full heart thanked my guiding spirit for conducting me in\r\n" + //
                                "safety to the place where I hoped, notwithstanding my adversary’s gibe,\r\n" + //
                                "to meet and grapple with him.\r\n" + //
                                "\r\n" + //
                                "Some weeks before this period I had procured a sledge and dogs and thus\r\n" + //
                                "traversed the snows with inconceivable speed. I know not whether the\r\n" + //
                                "fiend possessed the same advantages, but I found that, as before I had\r\n" + //
                                "daily lost ground in the pursuit, I now gained on him, so much so that\r\n" + //
                                "when I first saw the ocean he was but one day’s journey in advance, and\r\n" + //
                                "I hoped to intercept him before he should reach the beach. With new\r\n" + //
                                "courage, therefore, I pressed on, and in two days arrived at a wretched\r\n" + //
                                "hamlet on the seashore. I inquired of the inhabitants concerning the\r\n" + //
                                "fiend and gained accurate information. A gigantic monster, they said,\r\n" + //
                                "had arrived the night before, armed with a gun and many pistols,\r\n" + //
                                "putting to flight the inhabitants of a solitary cottage through fear of\r\n" + //
                                "his terrific appearance. He had carried off their store of winter\r\n" + //
                                "food, and placing it in a sledge, to draw which he had seized on a\r\n" + //
                                "numerous drove of trained dogs, he had harnessed them, and the same\r\n" + //
                                "night, to the joy of the horror-struck villagers, had pursued his\r\n" + //
                                "journey across the sea in a direction that led to no land; and they\r\n" + //
                                "conjectured that he must speedily be destroyed by the breaking of the\r\n" + //
                                "ice or frozen by the eternal frosts.\r\n" + //
                                "\r\n" + //
                                "On hearing this information I suffered a temporary access of despair.\r\n" + //
                                "He had escaped me, and I must commence a destructive and almost endless\r\n" + //
                                "journey across the mountainous ices of the ocean, amidst cold that few\r\n" + //
                                "of the inhabitants could long endure and which I, the native of a\r\n" + //
                                "genial and sunny climate, could not hope to survive. Yet at the idea\r\n" + //
                                "that the fiend should live and be triumphant, my rage and vengeance\r\n" + //
                                "returned, and like a mighty tide, overwhelmed every other feeling.\r\n" + //
                                "After a slight repose, during which the spirits of the dead hovered\r\n" + //
                                "round and instigated me to toil and revenge, I prepared for my journey.\r\n" + //
                                "\r\n" + //
                                "I exchanged my land-sledge for one fashioned for the inequalities of\r\n" + //
                                "the Frozen Ocean, and purchasing a plentiful stock of provisions, I\r\n" + //
                                "departed from land.\r\n" + //
                                "\r\n" + //
                                "I cannot guess how many days have passed since then, but I have endured\r\n" + //
                                "misery which nothing but the eternal sentiment of a just retribution\r\n" + //
                                "burning within my heart could have enabled me to support. Immense and\r\n" + //
                                "rugged mountains of ice often barred up my passage, and I often heard\r\n" + //
                                "the thunder of the ground sea, which threatened my destruction. But\r\n" + //
                                "again the frost came and made the paths of the sea secure.\r\n" + //
                                "\r\n" + //
                                "By the quantity of provision which I had consumed, I should guess that\r\n" + //
                                "I had passed three weeks in this journey; and the continual protraction\r\n" + //
                                "of hope, returning back upon the heart, often wrung bitter drops of\r\n" + //
                                "despondency and grief from my eyes. Despair had indeed almost secured\r\n" + //
                                "her prey, and I should soon have sunk beneath this misery. Once, after\r\n" + //
                                "the poor animals that conveyed me had with incredible toil gained the\r\n" + //
                                "summit of a sloping ice mountain, and one, sinking under his fatigue,\r\n" + //
                                "died, I viewed the expanse before me with anguish, when suddenly my eye\r\n" + //
                                "caught a dark speck upon the dusky plain. I strained my sight to\r\n" + //
                                "discover what it could be and uttered a wild cry of ecstasy when I\r\n" + //
                                "distinguished a sledge and the distorted proportions of a well-known\r\n" + //
                                "form within. Oh! With what a burning gush did hope revisit my heart!\r\n" + //
                                "Warm tears filled my eyes, which I hastily wiped away, that they might\r\n" + //
                                "not intercept the view I had of the dæmon; but still my sight was\r\n" + //
                                "dimmed by the burning drops, until, giving way to the emotions that\r\n" + //
                                "oppressed me, I wept aloud.\r\n" + //
                                "\r\n" + //
                                "But this was not the time for delay; I disencumbered the dogs of their\r\n" + //
                                "dead companion, gave them a plentiful portion of food, and after an\r\n" + //
                                "hour’s rest, which was absolutely necessary, and yet which was bitterly\r\n" + //
                                "irksome to me, I continued my route. The sledge was still visible, nor\r\n" + //
                                "did I again lose sight of it except at the moments when for a short\r\n" + //
                                "time some ice-rock concealed it with its intervening crags. I indeed\r\n" + //
                                "perceptibly gained on it, and when, after nearly two days’ journey, I\r\n" + //
                                "beheld my enemy at no more than a mile distant, my heart bounded within\r\n" + //
                                "me.\r\n" + //
                                "\r\n" + //
                                "But now, when I appeared almost within grasp of my foe, my hopes were\r\n" + //
                                "suddenly extinguished, and I lost all trace of him more utterly than I had\r\n" + //
                                "ever done before. A ground sea was heard; the thunder of its progress, as\r\n" + //
                                "the waters rolled and swelled beneath me, became every moment more ominous\r\n" + //
                                "and terrific. I pressed on, but in vain. The wind arose; the sea roared;\r\n" + //
                                "and, as with the mighty shock of an earthquake, it split and cracked with a\r\n" + //
                                "tremendous and overwhelming sound. The work was soon finished; in a few\r\n" + //
                                "minutes a tumultuous sea rolled between me and my enemy, and I was left\r\n" + //
                                "drifting on a scattered piece of ice that was continually lessening and\r\n" + //
                                "thus preparing for me a hideous death.\r\n" + //
                                "\r\n" + //
                                "In this manner many appalling hours passed; several of my dogs died, and I\r\n" + //
                                "myself was about to sink under the accumulation of distress when I saw your\r\n" + //
                                "vessel riding at anchor and holding forth to me hopes of succour and life.\r\n" + //
                                "I had no conception that vessels ever came so far north and was astounded\r\n" + //
                                "at the sight. I quickly destroyed part of my sledge to construct oars, and\r\n" + //
                                "by these means was enabled, with infinite fatigue, to move my ice raft in\r\n" + //
                                "the direction of your ship. I had determined, if you were going southwards,\r\n" + //
                                "still to trust myself to the mercy of the seas rather than abandon my\r\n" + //
                                "purpose. I hoped to induce you to grant me a boat with which I could pursue\r\n" + //
                                "my enemy. But your direction was northwards. You took me on board when my\r\n" + //
                                "vigour was exhausted, and I should soon have sunk under my multiplied\r\n" + //
                                "hardships into a death which I still dread, for my task is unfulfilled.\r\n" + //
                                "\r\n" + //
                                "Oh! When will my guiding spirit, in conducting me to the dæmon, allow\r\n" + //
                                "me the rest I so much desire; or must I die, and he yet live? If I do,\r\n" + //
                                "swear to me, Walton, that he shall not escape, that you will seek him\r\n" + //
                                "and satisfy my vengeance in his death. And do I dare to ask of you to\r\n" + //
                                "undertake my pilgrimage, to endure the hardships that I have undergone?\r\n" + //
                                "No; I am not so selfish. Yet, when I am dead, if he should appear, if\r\n" + //
                                "the ministers of vengeance should conduct him to you, swear that he\r\n" + //
                                "shall not live—swear that he shall not triumph over my accumulated\r\n" + //
                                "woes and survive to add to the list of his dark crimes. He is eloquent\r\n" + //
                                "and persuasive, and once his words had even power over my heart; but\r\n" + //
                                "trust him not. His soul is as hellish as his form, full of treachery\r\n" + //
                                "and fiend-like malice. Hear him not; call on the names of William,\r\n" + //
                                "Justine, Clerval, Elizabeth, my father, and of the wretched Victor, and\r\n" + //
                                "thrust your sword into his heart. I will hover near and direct the\r\n" + //
                                "steel aright.\r\n" + //
                                "\r\n" + //
                                "Walton, _in continuation._\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "August 26th, 17—.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "You have read this strange and terrific story, Margaret; and do you not\r\n" + //
                                "feel your blood congeal with horror, like that which even now curdles\r\n" + //
                                "mine? Sometimes, seized with sudden agony, he could not continue his\r\n" + //
                                "tale; at others, his voice broken, yet piercing, uttered with\r\n" + //
                                "difficulty the words so replete with anguish. His fine and lovely eyes\r\n" + //
                                "were now lighted up with indignation, now subdued to downcast sorrow\r\n" + //
                                "and quenched in infinite wretchedness. Sometimes he commanded his\r\n" + //
                                "countenance and tones and related the most horrible incidents with a\r\n" + //
                                "tranquil voice, suppressing every mark of agitation; then, like a\r\n" + //
                                "volcano bursting forth, his face would suddenly change to an expression\r\n" + //
                                "of the wildest rage as he shrieked out imprecations on his persecutor.\r\n" + //
                                "\r\n" + //
                                "His tale is connected and told with an appearance of the simplest truth,\r\n" + //
                                "yet I own to you that the letters of Felix and Safie, which he showed me,\r\n" + //
                                "and the apparition of the monster seen from our ship, brought to me a\r\n" + //
                                "greater conviction of the truth of his narrative than his asseverations,\r\n" + //
                                "however earnest and connected. Such a monster has, then, really existence!\r\n" + //
                                "I cannot doubt it, yet I am lost in surprise and admiration. Sometimes I\r\n" + //
                                "endeavoured to gain from Frankenstein the particulars of his\r\n" + //
                                "creature’s formation, but on this point he was impenetrable.\r\n" + //
                                "\r\n" + //
                                "“Are you mad, my friend?” said he. “Or whither does your\r\n" + //
                                "senseless curiosity lead you? Would you also create for yourself and the\r\n" + //
                                "world a demoniacal enemy? Peace, peace! Learn my miseries and do not seek\r\n" + //
                                "to increase your own.”\r\n" + //
                                "\r\n" + //
                                "Frankenstein discovered that I made notes concerning his history; he asked\r\n" + //
                                "to see them and then himself corrected and augmented them in many places,\r\n" + //
                                "but principally in giving the life and spirit to the conversations he held\r\n" + //
                                "with his enemy. “Since you have preserved my narration,” said\r\n" + //
                                "he, “I would not that a mutilated one should go down to\r\n" + //
                                "posterity.”\r\n" + //
                                "\r\n" + //
                                "Thus has a week passed away, while I have listened to the strangest\r\n" + //
                                "tale that ever imagination formed. My thoughts and every feeling of my\r\n" + //
                                "soul have been drunk up by the interest for my guest which this tale\r\n" + //
                                "and his own elevated and gentle manners have created. I wish to soothe\r\n" + //
                                "him, yet can I counsel one so infinitely miserable, so destitute of\r\n" + //
                                "every hope of consolation, to live? Oh, no! The only joy that he can\r\n" + //
                                "now know will be when he composes his shattered spirit to peace and\r\n" + //
                                "death. Yet he enjoys one comfort, the offspring of solitude and\r\n" + //
                                "delirium; he believes that when in dreams he holds converse with his\r\n" + //
                                "friends and derives from that communion consolation for his miseries or\r\n" + //
                                "excitements to his vengeance, that they are not the creations of his\r\n" + //
                                "fancy, but the beings themselves who visit him from the regions of a\r\n" + //
                                "remote world. This faith gives a solemnity to his reveries that render\r\n" + //
                                "them to me almost as imposing and interesting as truth.\r\n" + //
                                "\r\n" + //
                                "Our conversations are not always confined to his own history and\r\n" + //
                                "misfortunes. On every point of general literature he displays\r\n" + //
                                "unbounded knowledge and a quick and piercing apprehension. His\r\n" + //
                                "eloquence is forcible and touching; nor can I hear him, when he relates\r\n" + //
                                "a pathetic incident or endeavours to move the passions of pity or love,\r\n" + //
                                "without tears. What a glorious creature must he have been in the days\r\n" + //
                                "of his prosperity, when he is thus noble and godlike in ruin! He seems\r\n" + //
                                "to feel his own worth and the greatness of his fall.\r\n" + //
                                "\r\n" + //
                                "“When younger,” said he, “I believed myself destined for\r\n" + //
                                "some great enterprise. My feelings are profound, but I possessed a coolness\r\n" + //
                                "of judgment that fitted me for illustrious achievements. This sentiment of\r\n" + //
                                "the worth of my nature supported me when others would have been oppressed,\r\n" + //
                                "for I deemed it criminal to throw away in useless grief those talents that\r\n" + //
                                "might be useful to my fellow creatures. When I reflected on the work I had\r\n" + //
                                "completed, no less a one than the creation of a sensitive and rational\r\n" + //
                                "animal, I could not rank myself with the herd of common projectors. But\r\n" + //
                                "this thought, which supported me in the commencement of my career, now\r\n" + //
                                "serves only to plunge me lower in the dust. All my speculations and hopes\r\n" + //
                                "are as nothing, and like the archangel who aspired to omnipotence, I am\r\n" + //
                                "chained in an eternal hell. My imagination was vivid, yet my powers of\r\n" + //
                                "analysis and application were intense; by the union of these qualities I\r\n" + //
                                "conceived the idea and executed the creation of a man. Even now I cannot\r\n" + //
                                "recollect without passion my reveries while the work was incomplete. I trod\r\n" + //
                                "heaven in my thoughts, now exulting in my powers, now burning with the idea\r\n" + //
                                "of their effects. From my infancy I was imbued with high hopes and a lofty\r\n" + //
                                "ambition; but how am I sunk! Oh! My friend, if you had known me as I once\r\n" + //
                                "was, you would not recognise me in this state of degradation. Despondency\r\n" + //
                                "rarely visited my heart; a high destiny seemed to bear me on, until I fell,\r\n" + //
                                "never, never again to rise.”\r\n" + //
                                "\r\n" + //
                                "Must I then lose this admirable being? I have longed for a friend; I have\r\n" + //
                                "sought one who would sympathise with and love me. Behold, on these desert\r\n" + //
                                "seas I have found such a one, but I fear I have gained him only to know his\r\n" + //
                                "value and lose him. I would reconcile him to life, but he repulses the idea.\r\n" + //
                                "\r\n" + //
                                "“I thank you, Walton,” he said, “for your kind intentions towards so\r\n" + //
                                "miserable a wretch; but when you speak of new ties and fresh\r\n" + //
                                "affections, think you that any can replace those who are gone? Can any\r\n" + //
                                "man be to me as Clerval was, or any woman another Elizabeth? Even\r\n" + //
                                "where the affections are not strongly moved by any superior excellence,\r\n" + //
                                "the companions of our childhood always possess a certain power over our\r\n" + //
                                "minds which hardly any later friend can obtain. They know our\r\n" + //
                                "infantine dispositions, which, however they may be afterwards modified,\r\n" + //
                                "are never eradicated; and they can judge of our actions with more\r\n" + //
                                "certain conclusions as to the integrity of our motives. A sister or a\r\n" + //
                                "brother can never, unless indeed such symptoms have been shown early,\r\n" + //
                                "suspect the other of fraud or false dealing, when another friend,\r\n" + //
                                "however strongly he may be attached, may, in spite of himself, be\r\n" + //
                                "contemplated with suspicion. But I enjoyed friends, dear not only\r\n" + //
                                "through habit and association, but from their own merits; and wherever\r\n" + //
                                "I am, the soothing voice of my Elizabeth and the conversation of\r\n" + //
                                "Clerval will be ever whispered in my ear. They are dead, and but one\r\n" + //
                                "feeling in such a solitude can persuade me to preserve my life. If I\r\n" + //
                                "were engaged in any high undertaking or design, fraught with extensive\r\n" + //
                                "utility to my fellow creatures, then could I live to fulfil it. But\r\n" + //
                                "such is not my destiny; I must pursue and destroy the being to whom I\r\n" + //
                                "gave existence; then my lot on earth will be fulfilled and I may die.”\r\n" + //
                                "\r\n" + //
                                "My beloved Sister,\r\n" + //
                                "\r\n" + //
                                "September 2d.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "I write to you, encompassed by peril and ignorant whether I am ever\r\n" + //
                                "doomed to see again dear England and the dearer friends that inhabit\r\n" + //
                                "it. I am surrounded by mountains of ice which admit of no escape and\r\n" + //
                                "threaten every moment to crush my vessel. The brave fellows whom I\r\n" + //
                                "have persuaded to be my companions look towards me for aid, but I have\r\n" + //
                                "none to bestow. There is something terribly appalling in our\r\n" + //
                                "situation, yet my courage and hopes do not desert me. Yet it is\r\n" + //
                                "terrible to reflect that the lives of all these men are endangered\r\n" + //
                                "through me. If we are lost, my mad schemes are the cause.\r\n" + //
                                "\r\n" + //
                                "And what, Margaret, will be the state of your mind? You will not hear of my\r\n" + //
                                "destruction, and you will anxiously await my return. Years will pass, and\r\n" + //
                                "you will have visitings of despair and yet be tortured by hope. Oh! My\r\n" + //
                                "beloved sister, the sickening failing of your heart-felt expectations is,\r\n" + //
                                "in prospect, more terrible to me than my own death. But you have a husband\r\n" + //
                                "and lovely children; you may be happy. Heaven bless you and make you so!\r\n" + //
                                "\r\n" + //
                                "My unfortunate guest regards me with the tenderest compassion. He\r\n" + //
                                "endeavours to fill me with hope and talks as if life were a possession\r\n" + //
                                "which he valued. He reminds me how often the same accidents have\r\n" + //
                                "happened to other navigators who have attempted this sea, and in spite\r\n" + //
                                "of myself, he fills me with cheerful auguries. Even the sailors feel\r\n" + //
                                "the power of his eloquence; when he speaks, they no longer despair; he\r\n" + //
                                "rouses their energies, and while they hear his voice they believe these\r\n" + //
                                "vast mountains of ice are mole-hills which will vanish before the\r\n" + //
                                "resolutions of man. These feelings are transitory; each day of\r\n" + //
                                "expectation delayed fills them with fear, and I almost dread a mutiny\r\n" + //
                                "caused by this despair.\r\n" + //
                                "\r\n" + //
                                "September 5th.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "A scene has just passed of such uncommon interest that, although it is\r\n" + //
                                "highly probable that these papers may never reach you, yet I cannot\r\n" + //
                                "forbear recording it.\r\n" + //
                                "\r\n" + //
                                "We are still surrounded by mountains of ice, still in imminent danger\r\n" + //
                                "of being crushed in their conflict. The cold is excessive, and many of\r\n" + //
                                "my unfortunate comrades have already found a grave amidst this scene of\r\n" + //
                                "desolation. Frankenstein has daily declined in health; a feverish fire\r\n" + //
                                "still glimmers in his eyes, but he is exhausted, and when suddenly\r\n" + //
                                "roused to any exertion, he speedily sinks again into apparent\r\n" + //
                                "lifelessness.\r\n" + //
                                "\r\n" + //
                                "I mentioned in my last letter the fears I entertained of a mutiny.\r\n" + //
                                "This morning, as I sat watching the wan countenance of my friend—his\r\n" + //
                                "eyes half closed and his limbs hanging listlessly—I was roused by half\r\n" + //
                                "a dozen of the sailors, who demanded admission into the cabin. They\r\n" + //
                                "entered, and their leader addressed me. He told me that he and his\r\n" + //
                                "companions had been chosen by the other sailors to come in deputation\r\n" + //
                                "to me to make me a requisition which, in justice, I could not refuse.\r\n" + //
                                "We were immured in ice and should probably never escape, but they\r\n" + //
                                "feared that if, as was possible, the ice should dissipate and a free\r\n" + //
                                "passage be opened, I should be rash enough to continue my voyage and\r\n" + //
                                "lead them into fresh dangers, after they might happily have surmounted\r\n" + //
                                "this. They insisted, therefore, that I should engage with a solemn\r\n" + //
                                "promise that if the vessel should be freed I would instantly direct my\r\n" + //
                                "course southwards.\r\n" + //
                                "\r\n" + //
                                "This speech troubled me. I had not despaired, nor had I yet conceived\r\n" + //
                                "the idea of returning if set free. Yet could I, in justice, or even in\r\n" + //
                                "possibility, refuse this demand? I hesitated before I answered, when\r\n" + //
                                "Frankenstein, who had at first been silent, and indeed appeared hardly\r\n" + //
                                "to have force enough to attend, now roused himself; his eyes sparkled,\r\n" + //
                                "and his cheeks flushed with momentary vigour. Turning towards the men,\r\n" + //
                                "he said,\r\n" + //
                                "\r\n" + //
                                "“What do you mean? What do you demand of your captain? Are you, then,\r\n" + //
                                "so easily turned from your design? Did you not call this a glorious\r\n" + //
                                "expedition? “And wherefore was it glorious? Not because the way was\r\n" + //
                                "smooth and placid as a southern sea, but because it was full of dangers and\r\n" + //
                                "terror, because at every new incident your fortitude was to be called forth\r\n" + //
                                "and your courage exhibited, because danger and death surrounded it, and\r\n" + //
                                "these you were to brave and overcome. For this was it a glorious, for this\r\n" + //
                                "was it an honourable undertaking. You were hereafter to be hailed as the\r\n" + //
                                "benefactors of your species, your names adored as belonging to brave men\r\n" + //
                                "who encountered death for honour and the benefit of mankind. And now,\r\n" + //
                                "behold, with the first imagination of danger, or, if you will, the first\r\n" + //
                                "mighty and terrific trial of your courage, you shrink away and are content\r\n" + //
                                "to be handed down as men who had not strength enough to endure cold and\r\n" + //
                                "peril; and so, poor souls, they were chilly and returned to their warm\r\n" + //
                                "firesides. Why, that requires not this preparation; ye need not have come\r\n" + //
                                "thus far and dragged your captain to the shame of a defeat merely to prove\r\n" + //
                                "yourselves cowards. Oh! Be men, or be more than men. Be steady to your\r\n" + //
                                "purposes and firm as a rock. This ice is not made of such stuff as your\r\n" + //
                                "hearts may be; it is mutable and cannot withstand you if you say that it\r\n" + //
                                "shall not. Do not return to your families with the stigma of disgrace\r\n" + //
                                "marked on your brows. Return as heroes who have fought and conquered and\r\n" + //
                                "who know not what it is to turn their backs on the foe.”\r\n" + //
                                "\r\n" + //
                                "He spoke this with a voice so modulated to the different feelings expressed\r\n" + //
                                "in his speech, with an eye so full of lofty design and heroism, that can\r\n" + //
                                "you wonder that these men were moved? They looked at one another and were\r\n" + //
                                "unable to reply. I spoke; I told them to retire and consider of what had\r\n" + //
                                "been said, that I would not lead them farther north if they strenuously\r\n" + //
                                "desired the contrary, but that I hoped that, with reflection, their courage\r\n" + //
                                "would return.\r\n" + //
                                "\r\n" + //
                                "They retired and I turned towards my friend, but he was sunk in languor and\r\n" + //
                                "almost deprived of life.\r\n" + //
                                "\r\n" + //
                                "How all this will terminate, I know not, but I had rather die than\r\n" + //
                                "return shamefully, my purpose unfulfilled. Yet I fear such will be my\r\n" + //
                                "fate; the men, unsupported by ideas of glory and honour, can never\r\n" + //
                                "willingly continue to endure their present hardships.\r\n" + //
                                "\r\n" + //
                                "September 7th.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "The die is cast; I have consented to return if we are not destroyed.\r\n" + //
                                "Thus are my hopes blasted by cowardice and indecision; I come back\r\n" + //
                                "ignorant and disappointed. It requires more philosophy than I possess\r\n" + //
                                "to bear this injustice with patience.\r\n" + //
                                "\r\n" + //
                                "September 12th.\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "It is past; I am returning to England. I have lost my hopes of utility\r\n" + //
                                "and glory; I have lost my friend. But I will endeavour to detail these\r\n" + //
                                "bitter circumstances to you, my dear sister; and while I am wafted\r\n" + //
                                "towards England and towards you, I will not despond.\r\n" + //
                                "\r\n" + //
                                "September 9th, the ice began to move, and roarings like thunder were heard\r\n" + //
                                "at a distance as the islands split and cracked in every direction. We were\r\n" + //
                                "in the most imminent peril, but as we could only remain passive, my chief\r\n" + //
                                "attention was occupied by my unfortunate guest whose illness increased in\r\n" + //
                                "such a degree that he was entirely confined to his bed. The ice cracked\r\n" + //
                                "behind us and was driven with force towards the north; a breeze sprang from\r\n" + //
                                "the west, and on the 11th the passage towards the south became perfectly\r\n" + //
                                "free. When the sailors saw this and that their return to their native\r\n" + //
                                "country was apparently assured, a shout of tumultuous joy broke from them,\r\n" + //
                                "loud and long-continued. Frankenstein, who was dozing, awoke and asked the\r\n" + //
                                "cause of the tumult. “They shout,” I said, “because they\r\n" + //
                                "will soon return to England.”\r\n" + //
                                "\r\n" + //
                                "“Do you, then, really return?”\r\n" + //
                                "\r\n" + //
                                "“Alas! Yes; I cannot withstand their demands. I cannot lead them\r\n" + //
                                "unwillingly to danger, and I must return.”\r\n" + //
                                "\r\n" + //
                                "“Do so, if you will; but I will not. You may give up your purpose, but\r\n" + //
                                "mine is assigned to me by Heaven, and I dare not. I am weak, but\r\n" + //
                                "surely the spirits who assist my vengeance will endow me with\r\n" + //
                                "sufficient strength.” Saying this, he endeavoured to spring from the\r\n" + //
                                "bed, but the exertion was too great for him; he fell back and fainted.\r\n" + //
                                "\r\n" + //
                                "It was long before he was restored, and I often thought that life was\r\n" + //
                                "entirely extinct. At length he opened his eyes; he breathed with\r\n" + //
                                "difficulty and was unable to speak. The surgeon gave him a composing\r\n" + //
                                "draught and ordered us to leave him undisturbed. In the meantime he\r\n" + //
                                "told me that my friend had certainly not many hours to live.\r\n" + //
                                "\r\n" + //
                                "His sentence was pronounced, and I could only grieve and be patient. I sat\r\n" + //
                                "by his bed, watching him; his eyes were closed, and I thought he slept; but\r\n" + //
                                "presently he called to me in a feeble voice, and bidding me come near,\r\n" + //
                                "said, “Alas! The strength I relied on is gone; I feel that I shall\r\n" + //
                                "soon die, and he, my enemy and persecutor, may still be in being. Think\r\n" + //
                                "not, Walton, that in the last moments of my existence I feel that burning\r\n" + //
                                "hatred and ardent desire of revenge I once expressed; but I feel myself\r\n" + //
                                "justified in desiring the death of my adversary. During these last days I\r\n" + //
                                "have been occupied in examining my past conduct; nor do I find it blamable.\r\n" + //
                                "In a fit of enthusiastic madness I created a rational creature and was\r\n" + //
                                "bound towards him to assure, as far as was in my power, his happiness and\r\n" + //
                                "well-being. This was my duty, but there was another still paramount to\r\n" + //
                                "that. My duties towards the beings of my own species had greater claims to\r\n" + //
                                "my attention because they included a greater proportion of happiness or\r\n" + //
                                "misery. Urged by this view, I refused, and I did right in refusing, to\r\n" + //
                                "create a companion for the first creature. He showed unparalleled malignity\r\n" + //
                                "and selfishness in evil; he destroyed my friends; he devoted to destruction\r\n" + //
                                "beings who possessed exquisite sensations, happiness, and wisdom; nor do I\r\n" + //
                                "know where this thirst for vengeance may end. Miserable himself that he may\r\n" + //
                                "render no other wretched, he ought to die. The task of his destruction was\r\n" + //
                                "mine, but I have failed. When actuated by selfish and vicious motives, I\r\n" + //
                                "asked you to undertake my unfinished work, and I renew this request now,\r\n" + //
                                "when I am only induced by reason and virtue.\r\n" + //
                                "\r\n" + //
                                "“Yet I cannot ask you to renounce your country and friends to fulfil\r\n" + //
                                "this task; and now that you are returning to England, you will have\r\n" + //
                                "little chance of meeting with him. But the consideration of these\r\n" + //
                                "points, and the well balancing of what you may esteem your duties, I\r\n" + //
                                "leave to you; my judgment and ideas are already disturbed by the near\r\n" + //
                                "approach of death. I dare not ask you to do what I think right, for I\r\n" + //
                                "may still be misled by passion.\r\n" + //
                                "\r\n" + //
                                "“That he should live to be an instrument of mischief disturbs me; in\r\n" + //
                                "other respects, this hour, when I momentarily expect my release, is the\r\n" + //
                                "only happy one which I have enjoyed for several years. The forms of\r\n" + //
                                "the beloved dead flit before me, and I hasten to their arms. Farewell,\r\n" + //
                                "Walton! Seek happiness in tranquillity and avoid ambition, even if it\r\n" + //
                                "be only the apparently innocent one of distinguishing yourself in\r\n" + //
                                "science and discoveries. Yet why do I say this? I have myself been\r\n" + //
                                "blasted in these hopes, yet another may succeed.”\r\n" + //
                                "\r\n" + //
                                "His voice became fainter as he spoke, and at length, exhausted by his\r\n" + //
                                "effort, he sank into silence. About half an hour afterwards he\r\n" + //
                                "attempted again to speak but was unable; he pressed my hand feebly, and\r\n" + //
                                "his eyes closed for ever, while the irradiation of a gentle smile passed\r\n" + //
                                "away from his lips.\r\n" + //
                                "\r\n" + //
                                "Margaret, what comment can I make on the untimely extinction of this\r\n" + //
                                "glorious spirit? What can I say that will enable you to understand the\r\n" + //
                                "depth of my sorrow? All that I should express would be inadequate and\r\n" + //
                                "feeble. My tears flow; my mind is overshadowed by a cloud of\r\n" + //
                                "disappointment. But I journey towards England, and I may there find\r\n" + //
                                "consolation.\r\n" + //
                                "\r\n" + //
                                "I am interrupted. What do these sounds portend? It is midnight; the\r\n" + //
                                "breeze blows fairly, and the watch on deck scarcely stir. Again there\r\n" + //
                                "is a sound as of a human voice, but hoarser; it comes from the cabin\r\n" + //
                                "where the remains of Frankenstein still lie. I must arise and examine.\r\n" + //
                                "Good night, my sister.\r\n" + //
                                "\r\n" + //
                                "Great God! what a scene has just taken place! I am yet dizzy with the\r\n" + //
                                "remembrance of it. I hardly know whether I shall have the power to detail\r\n" + //
                                "it; yet the tale which I have recorded would be incomplete without this\r\n" + //
                                "final and wonderful catastrophe.\r\n" + //
                                "\r\n" + //
                                "I entered the cabin where lay the remains of my ill-fated and admirable\r\n" + //
                                "friend. Over him hung a form which I cannot find words to\r\n" + //
                                "describe—gigantic in stature, yet uncouth and distorted in its\r\n" + //
                                "proportions. As he hung over the coffin, his face was concealed by long\r\n" + //
                                "locks of ragged hair; but one vast hand was extended, in colour and\r\n" + //
                                "apparent texture like that of a mummy. When he heard the sound of my\r\n" + //
                                "approach, he ceased to utter exclamations of grief and horror and sprung\r\n" + //
                                "towards the window. Never did I behold a vision so horrible as his face, of\r\n" + //
                                "such loathsome yet appalling hideousness. I shut my eyes involuntarily and\r\n" + //
                                "endeavoured to recollect what were my duties with regard to this destroyer.\r\n" + //
                                "I called on him to stay.\r\n" + //
                                "\r\n" + //
                                "He paused, looking on me with wonder, and again turning towards the\r\n" + //
                                "lifeless form of his creator, he seemed to forget my presence, and\r\n" + //
                                "every feature and gesture seemed instigated by the wildest rage of some\r\n" + //
                                "uncontrollable passion.\r\n" + //
                                "\r\n" + //
                                "“That is also my victim!” he exclaimed. “In his murder my\r\n" + //
                                "crimes are consummated; the miserable series of my being is wound to its\r\n" + //
                                "close! Oh, Frankenstein! Generous and self-devoted being! What does it\r\n" + //
                                "avail that I now ask thee to pardon me? I, who irretrievably destroyed thee\r\n" + //
                                "by destroying all thou lovedst. Alas! He is cold, he cannot answer\r\n" + //
                                "me.”\r\n" + //
                                "\r\n" + //
                                "His voice seemed suffocated, and my first impulses, which had suggested to\r\n" + //
                                "me the duty of obeying the dying request of my friend in destroying his\r\n" + //
                                "enemy, were now suspended by a mixture of curiosity and compassion. I\r\n" + //
                                "approached this tremendous being; I dared not again raise my eyes to his\r\n" + //
                                "face, there was something so scaring and unearthly in his ugliness. I\r\n" + //
                                "attempted to speak, but the words died away on my lips. The monster\r\n" + //
                                "continued to utter wild and incoherent self-reproaches. At length I\r\n" + //
                                "gathered resolution to address him in a pause of the tempest of his passion.\r\n" + //
                                "\r\n" + //
                                "“Your repentance,” I said, “is now superfluous. If you\r\n" + //
                                "had listened to the voice of conscience and heeded the stings of remorse\r\n" + //
                                "before you had urged your diabolical vengeance to this extremity,\r\n" + //
                                "Frankenstein would yet have lived.”\r\n" + //
                                "\r\n" + //
                                "“And do you dream?” said the dæmon. “Do you think that I was then\r\n" + //
                                "dead to agony and remorse? He,” he continued, pointing to the corpse,\r\n" + //
                                "“he suffered not in the consummation of the deed. Oh! Not the\r\n" + //
                                "ten-thousandth portion of the anguish that was mine during the\r\n" + //
                                "lingering detail of its execution. A frightful selfishness hurried me\r\n" + //
                                "on, while my heart was poisoned with remorse. Think you that the\r\n" + //
                                "groans of Clerval were music to my ears? My heart was fashioned to be\r\n" + //
                                "susceptible of love and sympathy, and when wrenched by misery to vice\r\n" + //
                                "and hatred, it did not endure the violence of the change without\r\n" + //
                                "torture such as you cannot even imagine.\r\n" + //
                                "\r\n" + //
                                "“After the murder of Clerval I returned to Switzerland, heart-broken\r\n" + //
                                "and overcome. I pitied Frankenstein; my pity amounted to horror; I\r\n" + //
                                "abhorred myself. But when I discovered that he, the author at once of\r\n" + //
                                "my existence and of its unspeakable torments, dared to hope for\r\n" + //
                                "happiness, that while he accumulated wretchedness and despair upon me\r\n" + //
                                "he sought his own enjoyment in feelings and passions from the\r\n" + //
                                "indulgence of which I was for ever barred, then impotent envy and bitter\r\n" + //
                                "indignation filled me with an insatiable thirst for vengeance. I\r\n" + //
                                "recollected my threat and resolved that it should be accomplished. I\r\n" + //
                                "knew that I was preparing for myself a deadly torture, but I was the\r\n" + //
                                "slave, not the master, of an impulse which I detested yet could not\r\n" + //
                                "disobey. Yet when she died! Nay, then I was not miserable. I had\r\n" + //
                                "cast off all feeling, subdued all anguish, to riot in the excess of my\r\n" + //
                                "despair. Evil thenceforth became my good. Urged thus far, I had no\r\n" + //
                                "choice but to adapt my nature to an element which I had willingly\r\n" + //
                                "chosen. The completion of my demoniacal design became an insatiable\r\n" + //
                                "passion. And now it is ended; there is my last victim!”\r\n" + //
                                "\r\n" + //
                                "I was at first touched by the expressions of his misery; yet, when I called\r\n" + //
                                "to mind what Frankenstein had said of his powers of eloquence and\r\n" + //
                                "persuasion, and when I again cast my eyes on the lifeless form of my\r\n" + //
                                "friend, indignation was rekindled within me. “Wretch!” I said.\r\n" + //
                                "“It is well that you come here to whine over the desolation that you\r\n" + //
                                "have made. You throw a torch into a pile of buildings, and when they are\r\n" + //
                                "consumed, you sit among the ruins and lament the fall. Hypocritical fiend!\r\n" + //
                                "If he whom you mourn still lived, still would he be the object, again would\r\n" + //
                                "he become the prey, of your accursed vengeance. It is not pity that you\r\n" + //
                                "feel; you lament only because the victim of your malignity is withdrawn\r\n" + //
                                "from your power.”\r\n" + //
                                "\r\n" + //
                                "“Oh, it is not thus—not thus,” interrupted the being.\r\n" + //
                                "“Yet such must be the impression conveyed to you by what appears to\r\n" + //
                                "be the purport of my actions. Yet I seek not a fellow feeling in my misery.\r\n" + //
                                "No sympathy may I ever find. When I first sought it, it was the love of\r\n" + //
                                "virtue, the feelings of happiness and affection with which my whole being\r\n" + //
                                "overflowed, that I wished to be participated. But now that virtue has\r\n" + //
                                "become to me a shadow, and that happiness and affection are turned into\r\n" + //
                                "bitter and loathing despair, in what should I seek for sympathy? I am\r\n" + //
                                "content to suffer alone while my sufferings shall endure; when I die, I am\r\n" + //
                                "well satisfied that abhorrence and opprobrium should load my memory. Once\r\n" + //
                                "my fancy was soothed with dreams of virtue, of fame, and of enjoyment. Once\r\n" + //
                                "I falsely hoped to meet with beings who, pardoning my outward form, would\r\n" + //
                                "love me for the excellent qualities which I was capable of unfolding. I was\r\n" + //
                                "nourished with high thoughts of honour and devotion. But now crime has\r\n" + //
                                "degraded me beneath the meanest animal. No guilt, no mischief, no\r\n" + //
                                "malignity, no misery, can be found comparable to mine. When I run over the\r\n" + //
                                "frightful catalogue of my sins, I cannot believe that I am the same\r\n" + //
                                "creature whose thoughts were once filled with sublime and transcendent\r\n" + //
                                "visions of the beauty and the majesty of goodness. But it is even so; the\r\n" + //
                                "fallen angel becomes a malignant devil. Yet even that enemy of God and man\r\n" + //
                                "had friends and associates in his desolation; I am alone.\r\n" + //
                                "\r\n" + //
                                "“You, who call Frankenstein your friend, seem to have a knowledge of my\r\n" + //
                                "crimes and his misfortunes. But in the detail which he gave you of them\r\n" + //
                                "he could not sum up the hours and months of misery which I endured\r\n" + //
                                "wasting in impotent passions. For while I destroyed his hopes, I did\r\n" + //
                                "not satisfy my own desires. They were for ever ardent and craving; still\r\n" + //
                                "I desired love and fellowship, and I was still spurned. Was there no\r\n" + //
                                "injustice in this? Am I to be thought the only criminal, when all\r\n" + //
                                "humankind sinned against me? Why do you not hate Felix, who drove his\r\n" + //
                                "friend from his door with contumely? Why do you not execrate the rustic\r\n" + //
                                "who sought to destroy the saviour of his child? Nay, these are virtuous\r\n" + //
                                "and immaculate beings! I, the miserable and the abandoned, am an\r\n" + //
                                "abortion, to be spurned at, and kicked, and trampled on. Even now my\r\n" + //
                                "blood boils at the recollection of this injustice.\r\n" + //
                                "\r\n" + //
                                "“But it is true that I am a wretch. I have murdered the lovely and\r\n" + //
                                "the helpless; I have strangled the innocent as they slept and grasped to\r\n" + //
                                "death his throat who never injured me or any other living thing. I have\r\n" + //
                                "devoted my creator, the select specimen of all that is worthy of love and\r\n" + //
                                "admiration among men, to misery; I have pursued him even to that\r\n" + //
                                "irremediable ruin. There he lies, white and cold in death. You hate me, but\r\n" + //
                                "your abhorrence cannot equal that with which I regard myself. I look on the\r\n" + //
                                "hands which executed the deed; I think on the heart in which the\r\n" + //
                                "imagination of it was conceived and long for the moment when these hands\r\n" + //
                                "will meet my eyes, when that imagination will haunt my thoughts no more.\r\n" + //
                                "\r\n" + //
                                "“Fear not that I shall be the instrument of future mischief. My work\r\n" + //
                                "is nearly complete. Neither yours nor any man’s death is needed to\r\n" + //
                                "consummate the series of my being and accomplish that which must be done,\r\n" + //
                                "but it requires my own. Do not think that I shall be slow to perform this\r\n" + //
                                "sacrifice. I shall quit your vessel on the ice raft which brought me\r\n" + //
                                "thither and shall seek the most northern extremity of the globe; I shall\r\n" + //
                                "collect my funeral pile and consume to ashes this miserable frame, that its\r\n" + //
                                "remains may afford no light to any curious and unhallowed wretch who would\r\n" + //
                                "create such another as I have been. I shall die. I shall no longer feel the\r\n" + //
                                "agonies which now consume me or be the prey of feelings unsatisfied, yet\r\n" + //
                                "unquenched. He is dead who called me into being; and when I shall be no\r\n" + //
                                "more, the very remembrance of us both will speedily vanish. I shall no\r\n" + //
                                "longer see the sun or stars or feel the winds play on my cheeks. Light,\r\n" + //
                                "feeling, and sense will pass away; and in this condition must I find my\r\n" + //
                                "happiness. Some years ago, when the images which this world affords first\r\n" + //
                                "opened upon me, when I felt the cheering warmth of summer and heard the\r\n" + //
                                "rustling of the leaves and the warbling of the birds, and these were all to\r\n" + //
                                "me, I should have wept to die; now it is my only consolation. Polluted by\r\n" + //
                                "crimes and torn by the bitterest remorse, where can I find rest but in\r\n" + //
                                "death?\r\n" + //
                                "\r\n" + //
                                "“Farewell! I leave you, and in you the last of humankind whom these\r\n" + //
                                "eyes will ever behold. Farewell, Frankenstein! If thou wert yet alive\r\n" + //
                                "and yet cherished a desire of revenge against me, it would be better\r\n" + //
                                "satiated in my life than in my destruction. But it was not so; thou\r\n" + //
                                "didst seek my extinction, that I might not cause greater wretchedness;\r\n" + //
                                "and if yet, in some mode unknown to me, thou hadst not ceased to think\r\n" + //
                                "and feel, thou wouldst not desire against me a vengeance greater than\r\n" + //
                                "that which I feel. Blasted as thou wert, my agony was still superior to\r\n" + //
                                "thine, for the bitter sting of remorse will not cease to rankle in my\r\n" + //
                                "wounds until death shall close them for ever.\r\n" + //
                                "\r\n" + //
                                "“But soon,” he cried with sad and solemn enthusiasm, “I\r\n" + //
                                "shall die, and what I now feel be no longer felt. Soon these burning\r\n" + //
                                "miseries will be extinct. I shall ascend my funeral pile triumphantly and\r\n" + //
                                "exult in the agony of the torturing flames. The light of that conflagration\r\n" + //
                                "will fade away; my ashes will be swept into the sea by the winds. My spirit\r\n" + //
                                "will sleep in peace, or if it thinks, it will not surely think thus.\r\n" + //
                                "Farewell.”\r\n" + //
                                "\r\n" + //
                                "He sprang from the cabin-window as he said this, upon the ice raft\r\n" + //
                                "which lay close to the vessel. He was soon borne away by the waves and\r\n" + //
                                "lost in darkness and distance.\r\n";
    
      



            //Starts the timer for how long it takes to find indexed word and create index
            double startIndexTime = System.currentTimeMillis();

            // This piece of code sperate all the text by white space 
            String[] tokens = text.split("\\s+"); 
            for (int i = 0; i < tokens.length; i++) {
                textIndexer.addToken(tokens[i], i);
            }
    

          //Hard coded word that is being searched to save time for testing
          String searchToken = "darkness";
            
            double startTime = System.currentTimeMillis();

            // Search for tokens in the index
            List<Integer> positions = textIndexer.searchToken(searchToken);
            if (!positions.isEmpty()) {
                int count = 0;
                for (int position : positions) {
                    count++;
                }
                System.out.println("There are " + count + " occurences of " + searchToken + " in the Text" );
            } else {
                System.out.println("'" + searchToken + "' not found in the text.");
            }

            //End time
        double endTime = System.currentTimeMillis();
        double runningIndexTime = (endTime - startIndexTime);
        double runningTime = (endTime - startTime);
        System.out.println("Program execution time with creation of Index: " + runningIndexTime + "milliseconds");
        System.out.println("Program execution time after creating Index: " + runningTime + "milliseconds");
        //    }
        }
    }

