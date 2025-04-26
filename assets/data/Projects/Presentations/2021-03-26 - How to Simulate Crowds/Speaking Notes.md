# Speaking Notes

## Title

- Hi and welcome everybody. It is nice to meet you.
- The meeting today should give you and me the opportunity to get to know each other:
  - What are your expectations?
  - What is my background and what are my expectations?
- I prepared some slides to introduce myself and to build a base for further dicussions.
- This should give you a clue of my strengths and also weaknesses. This is very important to judge if I fit for the written position or not.

## TOC

- I prepared some slides about me and about my current project
- which is a PhD in crowd modeling and simulation

## Who am I

- First of all, I would like to state that I am a computer scientist.
- With experience in firmware development and application development.
- That means, I have a strong focus on software engineering, TDD, CI/CD to obtain a well-structured and well-tested software.
- I am NOT a physicist or EE which means that I don't bring in knowledge in analog design.
- Jonas Bächer, informed me about the job, because he knew that I am doing a PhD with simulation background.
- I am interested in hardware and how to interact with it from a software perspective.
- The interest in simulation and in hardware motivated me to write an application.

## Curriculum

- My past experiences give you insights into my skillset and my interests.

### 2018-2014

- I studied CS at Munich's Uni of Applied Sciences
  * I joined IFX as working student and I summarized my work in a BA's thesis:
  * I developed firmwares for different MCUs to acquire data from pressure sensors and a GUI to visualize the data. For the FW, I used C and for the frontend part C# and .NET.
  * For my MA's thesis, I joined Fraunhofer ESK, where I developed a Linux software driver to acquire data from a GPS sensor with a special focus on low latencies.
  * This required to get familiar with the Linux' kernel architecture and Linux' driver architecture --- which is pretty clever (because each device has a unique interface: read(), write() ioctl())

### 2015-2017

- After my studies, I joind IFX as firmware developer
  * I developed a BSL, i.e. the very first software component that starts which loads an application into RAM or Flash, restart the MCU and start the application.
  * I.e., I am familiar with reading MCU user manuals and developing drivers for different MCU components
  * Later on, I developed the Aurix 2G FW together with Veit Kleeberger.
  * For this, it was also necessary to set up and establish an environment for TDD based on the Ceedling framework. This was necessary because the actual HW was developed in parallel to the software. I.e., we didn't had a HW to test.

### Since 2017

- In Dec 2017, I joined the pedestrian dynamics research group of Gerta Köster
- She asked me to model and simulate behavioral changes of humans

## Motivation: Pedestrian dynamics

- So, why it's useful to simulate crowds and pedestrian dynamics?
- We have seen numerous crowd disasters in the past.
- For example, the Love Parade music festival in Germany, 2017 where 21 festivalgoers were killed.
- The goal of our RG is to reduce risks whereever crowds gather.
- And simulations can help to get insigts into pedestrian streams.

## How to simulate crowds

- The main question is how can we simulate pedestrian streams.
- There are two main problems to solve.
- The 1st one, is the navigation and wayfinding aspect for which several approaches have been proposed in the past.
  * I visualized a simple simulation setup where (blue) agents walk from a (green) source area to a brown target area. Agents are repelled by (gray) obstacles and other agents. This is the basic assumption.
  * We will see on the next slide how to let agents walk from a source to a target.
  * I based my work on this existing locomotion strategy.
- The 2nd one is how to obtain agents that can change their behavior.

## Questions to the team

- How does your simulator work?
- How do you develop reliable software?
- How do you interact with your users and how do you collect user requirements?
- Do you have a concrete roadmap? E.g. in two years, we want half the computational time for a simulation.
