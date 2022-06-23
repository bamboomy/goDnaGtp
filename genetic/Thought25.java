package genetic;
import java.util.ArrayList;
class Thought25 extends Thought{
private static ArrayList<Thought25> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 185.7803711763471;
private double fd1 = 221.59675801201487;
private Thought fo0 = null;
private Thought fo1 = null;
Thought25 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought25 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought25 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought25 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought25 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought25 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought25 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought25 instance = new Thought25 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 524.265232096781;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 = ld0 + fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 - fd0;
        Output.points[0][6] += fd1;
        if (fb0) {
            fb1 = fb0 && fb1;
            ld0 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            boolean lb1 = false;
            Output.points[0][7] -= fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
            ld0 *= -1;
            fb0 = fb1 && lb1;
            fd0 *= -1;
            double ld2 = 40.24309028464167;
            Thought lo3 = Thought23.getInstance();
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought42.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[0][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    ab4 = !fb0;
    fb1 = lb2 && lb3;
    ab1 = ab2 || ab3;
    double ld4 = 396.6221377727812;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, ab4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 115.84002913182313;
    ld0 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[1][0] += ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought90.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4();
}
    double ld2 = 877.4104681777945;
    Output.points[1][1] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
    double ld3 = 382.41748527144625;
    fb1 = ld3 > ad1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = fb1 && fb0;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    Thought lo4 = Thought43.getInstance(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    boolean lb5 = false;
    double ld6 = 398.84447532326453;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb5);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    boolean lb0 = false;
    ab2 = ad3 > ad4;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb1 = fd1 < ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb0, ab1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought30.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 256.4088404825484;
    double ld1 = 670.6876133720616;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 *= -1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m2(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;
    Output.points[1][2] -= ld0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    ld1 = fd0 - fd1;
    ld0 = ld1 + fd0;
    fb1 = fd1 < ld0;
    ld1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(ao4 != null){
      fd1 = ao4.m3(ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = ld1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}
    fb0 = ld0 < ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = ad1 < ad2;
    double ld1 = 71.88951985806167;
    ad2 *= -1;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ld1 *= -1;
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb3 = false;
    boolean lb4 = true;
    lb3 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1);
}
    lb4 = ad1 < ad2;
    fb0 = fb1 && lb0;
    Thought lo5 = Thought79.getInstance(lb2, lb3, lb4, fb0);
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
    Thought lo6 = Thought11.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb1, lb0, lb2, lb3);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought46.getInstance(fd1, fd0, fd1, fd0);
    lb0 = ab1 && ab2;
    fd1 *= -1;
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
        Output.points[1][3] += ad4;
    fd0 *= -1;
    Output.points[1][4] -= fd1;
    ab4 = !fb0;
    Output.points[1][5] += ad1;
    Thought lo0 = Thought85.getInstance(fb1, ab1, ab2, ab3);
    Thought lo1 = Thought12.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    boolean lb2 = false;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought19.getInstance(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought67.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought66.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    Thought lo3 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
        double ld4 = 518.146703515279;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb5);
}
    ld4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][6] -= fd0;
    Thought lo0 = Thought50.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought35.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    double ld2 = 547.7038307724831;
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo1.m2();
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
          fd0 = fo1.m3(fb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld2;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld1 = 814.0920669514367;
        fd0 *= -1;
        if (fb0) {
            fd1 = ld1 - ad1;
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
            fd1 *= -1;
            ld1 = ad1 - ad2;
            ad3 = ad4 + fd0;
            boolean lb2 = false;
            Thought lo3 = Thought37.getInstance(fb0, fb1, lb2, lb0);
            fb0 = fb1 || lb2;
            double ld4 = 422.4405349135512;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld1);
}
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    ab3 = fd0 > fd1;
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 935.2142431943896;
    boolean lb1 = false;
    Output.points[1][7] -= fd0;
    Output.points[1][8] += fd1;
    boolean lb2 = false;
        double ld3 = 348.6730146235466;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    ld0 = ld3 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb2 = fo0.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao2 != null){
      fd1 = ao2.m3();
}
    if (fb0) {
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought31.getInstance();
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
        Output.points[2][0] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || fb0;
        Output.points[2][1] -= fd0;
        fd1 *= -1;
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    double ld1 = 709.0468045159195;
    fb0 = !fb1;
    boolean lb2 = true;
    if (lb0) {
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
        lb2 = !fb0;
if(ao3 != null){
          ao3.m2();
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 488.60214608418346;
    Thought lo1 = Thought65.getInstance(ld0, fd0, fd1, ld0);
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    Output.points[2][2] += fd0;
    fb1 = ab1 && ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Output.points[2][3] -= ld0;
    fb1 = ab1 && ab2;
    Output.points[2][4] -= fd0;
    if (ab3) {
        boolean lb2 = false;
        ab3 = ab4 || fb0;
        Thought lo3 = Thought63.getInstance(ao2, ao3, ao4, fo0);
        boolean lb4 = false;
        fd1 = ld0 - fd0;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld0, fd0, fd1, fb1, lb2, lb4, ab1);
}
if(ao1 != null){
          ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Output.points[2][5] += ad1;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
    ab3 = ab4 && fb0;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    ab4 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
        Output.points[2][6] -= ad4;
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb0 = true;
    double ld1 = 944.153709256153;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[2][7] += ld1;
    fb0 = fd0 < fd1;
    ld1 = fd0 - fd1;
    double ld3 = 918.6239819862434;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    double ld1 = 875.2378741002477;
    Output.points[2][8] -= ld1;
    ab4 = fb0 || fb1;
    fd0 *= -1;
    lb0 = fd1 < ld1;
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    fb1 = lb0 && lb2;
    ab1 = !ab2;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld1;
        Thought lo3 = Thought69.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb2, ab1);
    ab2 = fd0 < fd1;
    ld1 *= -1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, lb2, ab1, ab2, ab3);
}
    double ld4 = 331.7972702722522;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    double ld0 = 546.7614121338636;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    Thought lo1 = Thought5.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    double ld3 = 624.285609062605;
    ld0 = ld3 - ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld3, ad1, fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought92.getInstance();
    fb1 = lb2 && fb0;
    fb1 = lb2 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    if (lb2) {
        fb0 = !fb1;
if(fo1 != null){
          lb2 = fo1.m2(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3);
}
        fb1 = lb2 && fb0;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
    double ld0 = 228.74952848991876;
if(fo0 != null){
      fo0.m2(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    double ld1 = 905.2896831339784;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ad4 < fd0;
    fd1 = ld0 - ld1;
    ad1 *= -1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fd0 *= -1;
    Thought lo0 = Thought6.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    boolean lb2 = true;
if(ao2 != null){
      fd1 = ao2.m3();
}
    Output.points[3][0] += fd0;
    double ld3 = 429.4880964167345;
    boolean lb4 = false;
    double ld5 = 874.8834631383374;
if(ao4 != null){
      ao3 = ao4.m4(ld5, fd0, fd1, ld3);
}

Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad1 *= -1;
    Thought lo0 = Thought7.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    Output.points[3][1] -= ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb1);
}
if(ao1 != null){
      lb2 = ao1.m2();
}
    lb3 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought14.getInstance(lb1, lb2, lb3, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb1, lb2, lb3);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    double ld5 = 270.771852333994;
    boolean lb6 = false;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    double ld0 = 633.4416028146244;
    fb0 = fb1 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
    Thought lo1 = Thought86.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
    fb1 = !ab1;
    Thought lo2 = Thought46.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    double ld3 = 458.96542249058456;
    ld0 = ld3 - fd0;
    fd1 *= -1;
    fb1 = ld0 < ld3;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought92.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought59.getInstance(fb0, fb1, ab1, ab2);
    ad3 = ad4 + fd0;
    if (ab3) {
        ab4 = fb0 && fb1;
        fd1 = ad1 - ad2;
        boolean lb2 = false;
        lb2 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
        ab1 = ab2 && ab3;
        boolean lb3 = false;
        ab3 = ad3 > ad4;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        lb2 = !lb3;
        lb4 = ad3 > ad4;
        boolean lb5 = true;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Output.points[3][2] += fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb0 = fd1 > fd0;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[3][3] += fd0;
    Output.points[3][4] -= fd1;
    fb0 = fb1 && ab1;
    fd0 *= -1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld0 = 953.6501808742801;
    Output.points[3][5] -= ld0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
    fd1 = ld0 - fd0;
    Thought lo1 = Thought33.getInstance(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    double ld2 = 946.9591381085021;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 504.5392266717258;
    boolean lb1 = true;
    boolean lb2 = false;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    lb1 = ld0 > ad1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    double ld4 = 930.9514604513356;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ld4;
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2();
}
    boolean lb1 = true;
    Output.points[3][6] += ad2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
          fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb1 = ao2.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    fb1 = lb0 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
        fb1 = !lb0;
    boolean lb1 = true;
    Thought lo2 = Thought36.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    Output.points[3][7] += fd1;
    boolean lb3 = false;
    lb1 = lb3 && fb0;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    lb0 = fb0 || fb1;
    Output.points[3][8] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    fb1 = ad4 > fd0;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Output.points[4][0] -= fd1;
    double ld0 = 116.64208923091556;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    double ld1 = 649.2085213549657;
    fb1 = !ab1;
if(fo0 != null){
          ao4 = fo0.m4();
}
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought54.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
    double ld1 = 301.3565802967075;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}
    double ld3 = 655.2778994055985;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb2;
    if (ab1) {
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    double ld0 = 352.779668149918;
    double ld1 = 686.1431111352703;
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = true;
    lb3 = ld0 > ld1;
    double ld5 = 962.4457545389564;
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb2);
}
    lb3 = ld5 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld5);
}
    boolean lb6 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, lb4, lb6, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, lb4, lb6);
}
    Thought lo7 = Thought57.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld5, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
    Thought lo8 = Thought35.getInstance();
    boolean lb9 = false;
    boolean lb10 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld5, fd0, fd1);
}
if(fo1 != null){
      lb4 = fo1.m2(lb6, lb9, lb10, fb0);
}
    fb1 = lb2 && lb3;
    Output.points[4][1] -= ld0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
        fd0 *= -1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought50.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb1 = !fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fb0 = fd1 > fd0;
    boolean lb3 = false;
    fd1 = fd0 - fd1;
    boolean lb4 = false;
    boolean lb5 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, lb5, fb0, fb1);
}
    boolean lb6 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb2 = !lb3;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb4, lb5, lb6, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, lb4, lb5);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought58.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][2] += fd1;
    fb0 = fd0 > fd1;
    Output.points[4][3] += fd0;
    fb1 = lb1 && fb0;
        fb1 = lb1 || fb0;
    fb1 = fd1 < fd0;
    Thought lo2 = Thought48.getInstance(fd1, fd0, fd1, fd0);
    lb1 = fb0 || fb1;
    lb1 = fd1 < fd0;
    fb0 = fb1 && lb1;
    Output.points[4][4] -= fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
