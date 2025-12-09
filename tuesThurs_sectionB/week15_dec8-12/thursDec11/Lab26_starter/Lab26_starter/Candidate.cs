using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab26
{
    public class Candidate
    {
        public int Votes { get; private set; } = 0;

        public string Name { get; init; }

        public void CastVote()
        {
            Votes++;
        }

        //YOU DO THIS
        //Override ToString to get the name and number of votes
    }
}
